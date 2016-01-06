package com.brooke.sher.restaurantmanger.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.brooke.sher.restaurantmanger.R;
import com.brooke.sher.restaurantmanger.activitys.MainActivity;
import com.brooke.sher.restaurantmanger.beans.Bill;
import com.brooke.sher.restaurantmanger.beans.Customer;
import com.brooke.sher.restaurantmanger.beans.PayMode;
import com.brooke.sher.restaurantmanger.beans.TableORRoom;
import com.brooke.sher.restaurantmanger.beans.Waiter;
import com.brooke.sher.restaurantmanger.db.DBHelper;

import org.xutils.DbManager;
import org.xutils.ex.DbException;
import org.xutils.x;

import java.util.List;
import java.util.Random;

/**
 * Created by Sher on 2016/1/5.
 * 由桌子号码查询数据库
 * 在这里添加bill表的付款人、付款人联系方式以及付款方式
 * 将付款人、付款人联系方式添加到customer表中
 * 将桌子的状态设置为未用
 */
public class BillPay extends Fragment {

    private TextView textViewShowFood;
    private TextView textViewShowFoodNum;
    private EditText addCustomerName;
    private EditText addCustomerTel;
    private Spinner spinner;
    private Button button;

    private DbManager db;
    private List<PayMode> payModeList;//存放付款方式类的列表
    private String[] payModeNameList;//存放付款方式名的列表
    private List<Customer> customerList;
    private List<TableORRoom> tOrList;
    private List<Bill> billList;
    private List<Waiter> waiterList;
    private MainActivity main = new MainActivity();
    private Bill bill;
    private Customer customer;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bill_pay, container, false);
        textViewShowFood = (TextView) view.findViewById(R.id.textViewShowFood);
        textViewShowFoodNum = (TextView) view.findViewById(R.id.textViewShowFoodNum);
        addCustomerName = (EditText) view.findViewById(R.id.addCustomerName);
        addCustomerTel = (EditText) view.findViewById(R.id.addCustomerTel);
        spinner = (Spinner) view.findViewById(R.id.spinner);
        button = (Button) view.findViewById(R.id.button_pay);


        DbManager.DaoConfig daoConfig = DBHelper.dbOperation();
        db = x.getDb(daoConfig);

        try {
            billList = db.selector(Bill.class).where("billTOrRNum","=",main.getTabNum()).findAll();
            waiterList = db.findAll(Waiter.class);
            bill = billList.get(0);
            payModeList = db.findAll(PayMode.class);
            payModeNameList = new String[payModeList.size()];
        } catch (DbException e) {
            e.printStackTrace();
        }
        for (int i=0;i<payModeList.size();i++){
            payModeNameList[i]=payModeList.get(i).getPayModeName();
        }


        textViewShowFood.setText(new OrderFood().getAllFood().toString());
        textViewShowFoodNum.setText(new OrderFood().getAllFoodNum().toString());

        spinner.setAdapter(new ArrayAdapter<String>(getActivity().getApplicationContext(),android.R.layout.simple_spinner_item,payModeNameList));
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //付款方式
                bill.setBillPayModeName(payModeNameList[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        //保存客户资料到数据库
        //保存客户名到账单表
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //付款人
                bill.setPayMan(addCustomerName.getText().toString());
                try {
                    bill.setBillState("已付账");
                    //随机一个服务员
                    bill.setBillWaiterName(waiterList.get((Integer)new Random().nextInt(4)).getWaiterName());
                    db.update(bill);
                    customerList = db.findAll(Customer.class);
                    customer = new Customer();
                    customer.setCustomerNum(customerList.size()+1);
                    customer.setCustomerName(addCustomerName.getText().toString());
                    customer.setCustomerTel(addCustomerTel.getText().toString());
                    db.save(customer);
                    //将当前付账的桌子设置为未用
//                    tOrList = db.selector(TableORRoom.class).where("tOrRNum","=",new OrderAndCashier().getTabNum()).findAll();
//                    tOrList.get(0).settOrRState("未用");

//                    db.update(tOrList.get(0));
                    //结账成功跳转
                    getFragmentManager().beginTransaction().replace(R.id.frame_content,new Reservation()).commit();
                    Toast.makeText(getActivity().getApplicationContext(),"success",Toast.LENGTH_SHORT).show();

                } catch (DbException e) {
                    e.printStackTrace();
                }
            }
        });

        return view;
    }
}

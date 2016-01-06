package com.brooke.sher.restaurantmanger.db;

import com.brooke.sher.restaurantmanger.beans.Customer;
import com.brooke.sher.restaurantmanger.beans.Food;
import com.brooke.sher.restaurantmanger.beans.PayMode;
import com.brooke.sher.restaurantmanger.beans.TableORRoom;
import com.brooke.sher.restaurantmanger.beans.Waiter;

import org.xutils.DbManager;
import org.xutils.ex.DbException;
import org.xutils.x;

/**
 * Created by Sher on 2016/1/5.
 */
public class DBExec {
    public static DbManager db;

    public static void dbOperation(){
        DbManager.DaoConfig daoConfig = DBHelper.dbOperation();
        db = x.getDb(daoConfig);
        waiterOperation();
        customerOperation();
        foodOperation();
        payModeOperation();
        tableOrRoomOperation();

    }
    private static void tableOrRoomOperation() {
        TableORRoom tableOrRoom = new TableORRoom();
        tableOrRoom.settOrRNum(0);
        tableOrRoom.settOrRType("包房");
        tableOrRoom.settOrRState("未用");
        TableORRoom tableOrRoom1 = new TableORRoom();
        tableOrRoom1.settOrRNum(1);
        tableOrRoom1.settOrRType("包房");
        tableOrRoom1.settOrRState("未用");
        TableORRoom tableOrRoom2 = new TableORRoom();
        tableOrRoom2.settOrRNum(2);
        tableOrRoom2.settOrRType("包房");
        tableOrRoom2.settOrRState("未用");
        TableORRoom tableOrRoom3 = new TableORRoom();
        tableOrRoom3.settOrRNum(3);
        tableOrRoom3.settOrRType("包房");
        tableOrRoom3.settOrRState("未用");
        TableORRoom tableOrRoom4 = new TableORRoom();
        tableOrRoom4.settOrRNum(4);
        tableOrRoom4.settOrRType("包房");
        tableOrRoom4.settOrRState("未用");
        TableORRoom tableOrRoom5 = new TableORRoom();
        tableOrRoom5.settOrRNum(5);
        tableOrRoom5.settOrRType("包房");
        tableOrRoom5.settOrRState("未用");
        TableORRoom tableOrRoom6 = new TableORRoom();
        tableOrRoom6.settOrRNum(6);
        tableOrRoom6.settOrRType("包房");
        tableOrRoom6.settOrRState("未用");
        TableORRoom tableOrRoom7 = new TableORRoom();
        tableOrRoom7.settOrRNum(7);
        tableOrRoom7.settOrRType("包房");
        tableOrRoom7.settOrRState("未用");
        TableORRoom tableOrRoom8 = new TableORRoom();
        tableOrRoom8.settOrRNum(8);
        tableOrRoom8.settOrRType("包房");
        tableOrRoom8.settOrRState("未用");
        TableORRoom tableOrRoom9= new TableORRoom();
        tableOrRoom9.settOrRNum(9);
        tableOrRoom9.settOrRType("包房");
        tableOrRoom9.settOrRState("未用");
        TableORRoom tableOrRoom10= new TableORRoom();
        tableOrRoom10.settOrRNum(10);
        tableOrRoom10.settOrRType("大堂");
        tableOrRoom10.settOrRState("未用");
        TableORRoom tableOrRoom11= new TableORRoom();
        tableOrRoom11.settOrRNum(11);
        tableOrRoom11.settOrRType("大堂");
        tableOrRoom11.settOrRState("未用");
        TableORRoom tableOrRoom12= new TableORRoom();
        tableOrRoom12.settOrRNum(12);
        tableOrRoom12.settOrRType("大堂");
        tableOrRoom12.settOrRState("未用");
        TableORRoom tableOrRoom13= new TableORRoom();
        tableOrRoom13.settOrRNum(13);
        tableOrRoom13.settOrRType("大堂");
        tableOrRoom13.settOrRState("未用");
        TableORRoom tableOrRoom14= new TableORRoom();
        tableOrRoom14.settOrRNum(14);
        tableOrRoom14.settOrRType("大堂");
        tableOrRoom14.settOrRState("未用");

        try {
            db.save(tableOrRoom14);
            db.save(tableOrRoom13);
            db.save(tableOrRoom12);
            db.save(tableOrRoom11);
            db.save(tableOrRoom10);
            db.save(tableOrRoom9);
            db.save(tableOrRoom8);
            db.save(tableOrRoom7);
            db.save(tableOrRoom6);
            db.save(tableOrRoom5);
            db.save(tableOrRoom4);
            db.save(tableOrRoom3);
            db.save(tableOrRoom2);
            db.save(tableOrRoom1);
            db.save(tableOrRoom);
        } catch (DbException e) {
            e.printStackTrace();
        }

    }

    private static void payModeOperation() {
        PayMode paymode = new PayMode();
        paymode.setPayModeNum(1);
        paymode.setPayModeName("现金");
        PayMode paymode1 = new PayMode();
        paymode1.setPayModeNum(2);
        paymode1.setPayModeName("银行卡");
        PayMode paymode2 = new PayMode();
        paymode2.setPayModeNum(3);
        paymode2.setPayModeName("赠券");
        PayMode paymode3 = new PayMode();
        paymode3.setPayModeNum(4);
        paymode3.setPayModeName("挂账");
        PayMode paymode4 = new PayMode();
        paymode4.setPayModeNum(5);
        paymode4.setPayModeName("免单");
        try {
            db.save(paymode);
            db.save(paymode1);
            db.save(paymode2);
            db.save(paymode3);
            db.save(paymode4);
        } catch (DbException e) {
            e.printStackTrace();
        }
    }

    private static void foodOperation() {
        Food food = new Food();
        food.setFoodNum(1);
        food.setFoodName("二锅头");
        food.setFoodType("酒水饮料");
        food.setChengBen(100);
        food.setFoodSalePrice(1000);
        Food food1 = new Food();
        food1.setFoodNum(2);
        food1.setFoodName("雪碧");
        food1.setFoodType("酒水饮料");
        food1.setChengBen(5);
        food1.setFoodSalePrice(10);
        Food food2 = new Food();
        food2.setFoodNum(3);
        food2.setFoodName("啤酒");
        food2.setFoodType("酒水饮料");
        food2.setChengBen(4);
        food2.setFoodSalePrice(8);
        Food food3 = new Food();
        food3.setFoodNum(4);
        food3.setFoodName("凉拌墨鱼丝");
        food3.setFoodType("凉菜");
        food3.setChengBen(20);
        food3.setFoodSalePrice(100);
        Food food4 = new Food();
        food4.setFoodNum(5);
        food4.setFoodName("毛蛤拌菠菜");
        food4.setFoodType("凉菜");
        food4.setChengBen(20);
        food4.setFoodSalePrice(80);
        Food food5 = new Food();
        food5.setFoodNum(6);
        food5.setFoodName("油泼螺片");
        food5.setFoodType("凉菜");
        food5.setChengBen(30);
        food5.setFoodSalePrice(100);
        Food food6 = new Food();
        food6.setFoodNum(7);
        food6.setFoodName("夫妻肺片");
        food6.setFoodType("热菜");
        food6.setChengBen(20);
        food6.setFoodSalePrice(100);
        Food food7 = new Food();
        food7.setFoodNum(8);
        food7.setFoodName("麻辣耳丝");
        food7.setFoodType("热菜");
        food7.setChengBen(15);
        food7.setFoodSalePrice(100);
        Food food8 = new Food();
        food8.setFoodNum(9);
        food8.setFoodName("叉烧肉");
        food8.setFoodType("热菜");
        food8.setChengBen(30);
        food8.setFoodSalePrice(100);
        Food food9 = new Food();
        food9.setFoodNum(10);
        food9.setFoodName("米饭");
        food9.setFoodType("主食");
        food9.setChengBen(1);
        food9.setFoodSalePrice(5);
        Food food10 = new Food();
        food10.setFoodNum(11);
        food10.setFoodName("面");
        food10.setFoodType("主食");
        food10.setChengBen(1);
        food10.setFoodSalePrice(5);
        Food food11 = new Food();
        food11.setFoodNum(12);
        food11.setFoodName("馒头");
        food11.setFoodType("主食");
        food11.setChengBen(1);
        food11.setFoodSalePrice(5);
        Food food12 = new Food();
        food12.setFoodNum(1);
        food12.setFoodName("满汉全席");
        food12.setFoodType("包桌");
        food12.setChengBen(100);
        food12.setFoodSalePrice(1000);
        try {
            db.save(food);
            db.save(food1);
            db.save(food2);
            db.save(food3);
            db.save(food4);
            db.save(food5);
            db.save(food6);
            db.save(food7);
            db.save(food8);
            db.save(food9);
            db.save(food10);
            db.save(food11);
            db.save(food12);
//            db.saveBindingId(food);
//            db.saveBindingId(food1);
//            db.saveBindingId(food2);
//            db.saveBindingId(food3);
//            db.saveBindingId(food4);
//            db.saveBindingId(food5);
//            db.saveBindingId(food6);
//            db.saveBindingId(food7);
//            db.saveBindingId(food8);
//            db.saveBindingId(food9);
//            db.saveBindingId(food10);
//            db.saveBindingId(food11);
//            db.saveBindingId(food12);
        } catch (DbException e) {
            e.printStackTrace();
        }

    }

    private static void customerOperation() {
        Customer customer = new Customer();
        customer.setCustomerNum(1);
        customer.setCustomerName("顾客1");
        customer.setCustomerTel("15888888882");
        Customer customer1 = new Customer();
        customer1.setCustomerNum(2);
        customer1.setCustomerName("顾客2");
        customer1.setCustomerTel("15888888882");
        Customer customer2 = new Customer();
        customer2.setCustomerNum(3);
        customer2.setCustomerName("顾客3");
        customer2.setCustomerTel("15888888883");
        Customer customer3 = new Customer();
        customer3.setCustomerNum(4);
        customer3.setCustomerName("顾客4");
        customer3.setCustomerTel("15888888884");
        Customer customer4 = new Customer();
        customer4.setCustomerNum(5);
        customer4.setCustomerName("顾客5");
        customer4.setCustomerTel("15888888885");
        try {
            db.save(customer);
            db.save(customer1);
            db.save(customer2);
            db.save(customer3);
            db.save(customer4);
        } catch (DbException e) {
            e.printStackTrace();
        }
    }

    private static void waiterOperation() {
        Waiter waiter = new Waiter();
        waiter.setWaiterNum(1);
        waiter.setWaiterName("一号");
        waiter.setBasicSales(3000);
        waiter.setTiCheng(1500);
        Waiter waiter1 = new Waiter();
        waiter1.setWaiterNum(2);
        waiter1.setWaiterName("二号");
        waiter1.setBasicSales(3000);
        waiter1.setTiCheng(1500);
        Waiter waiter2 = new Waiter();
        waiter2.setWaiterNum(3);
        waiter2.setWaiterName("三号");
        waiter2.setBasicSales(3000);
        waiter2.setTiCheng(1500);
        Waiter waiter3 = new Waiter();
        waiter3.setWaiterNum(4);
        waiter3.setWaiterName("四号");
        waiter3.setBasicSales(3000);
        waiter3.setTiCheng(1500);

        try {
            db.save(waiter);
            db.save(waiter1);
            db.save(waiter2);
            db.save(waiter3);

        } catch (DbException e) {
            e.printStackTrace();
        }
}
}

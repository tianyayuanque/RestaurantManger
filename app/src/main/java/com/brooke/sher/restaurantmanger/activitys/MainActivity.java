package com.brooke.sher.restaurantmanger.activitys;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.brooke.sher.restaurantmanger.R;
import com.brooke.sher.restaurantmanger.fragments.SettingOfFoodAndDrink;
import com.brooke.sher.restaurantmanger.fragments.AnalyzeOfOperatioin;
import com.brooke.sher.restaurantmanger.fragments.AnalyzeOfResult;
import com.brooke.sher.restaurantmanger.fragments.AnalyzeOfRoomTable;
import com.brooke.sher.restaurantmanger.fragments.AnalyzeOfsales;
import com.brooke.sher.restaurantmanger.fragments.BillQuiry;
import com.brooke.sher.restaurantmanger.fragments.OperatorManger;
import com.brooke.sher.restaurantmanger.fragments.OrderAndCashier;
import com.brooke.sher.restaurantmanger.fragments.OrderQuery;
import com.brooke.sher.restaurantmanger.fragments.OthersSetting;
import com.brooke.sher.restaurantmanger.fragments.PayManger;
import com.brooke.sher.restaurantmanger.fragments.PayQuery;
import com.brooke.sher.restaurantmanger.fragments.Reservation;
import com.brooke.sher.restaurantmanger.fragments.AnalyzeOfFoodandFrink;
import com.brooke.sher.restaurantmanger.fragments.StartTimeAndEndTime;
import com.brooke.sher.restaurantmanger.fragments.TableOrRoom;

import org.xutils.DbManager;

public class MainActivity extends AppCompatActivity {


    private int tabNum;
    private String allFood;
    private String allFoodNum;
    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;
    private Toolbar toolbar;
    DbManager db;

    public String getAllFoodNum() {
        return allFoodNum;
    }

    public void setAllFoodNum(String allFoodNum) {
        this.allFoodNum = allFoodNum;
    }

    public String getAllFood() {
        return allFood;
    }

    public void setAllFood(String allFood) {
        this.allFood = allFood;
    }

    public int getTabNum() {
        return tabNum;
    }

    public void setTabNum(int tabNum) {
        this.tabNum = tabNum;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(Color.WHITE);
        setSupportActionBar(toolbar);
//        数据库添加操作
//        DBExec.dbOperation();



        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mNavigationView = (NavigationView) findViewById(R.id.nv_menu);
        final ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(R.drawable.ic_menu);
        ab.setDisplayHomeAsUpEnabled(true);

        //设置导航栏NavigationView的点击事件
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                                                              @Override
                                                              public boolean onNavigationItemSelected(MenuItem menuItem) {
                                                                  switch (menuItem.getItemId()) {
                                                                      case R.id.navigation_sub_item1_1:
                                                                          getFragmentManager().beginTransaction().replace(R.id.frame_content, new StartTimeAndEndTime()).commit();
                                                                          toolbar.setTitle("前台营业");
                                                                          break;
                                                                      case R.id.navigation_sub_item1_2:
                                                                          getFragmentManager().beginTransaction().replace(R.id.frame_content, new Reservation()).commit();
                                                                          toolbar.setTitle("前台营业");
                                                                          break;
                                                                      case R.id.navigation_sub_item1_3:
                                                                          getFragmentManager().beginTransaction().replace(R.id.frame_content, new OrderAndCashier()).commit();
                                                                          toolbar.setTitle("前台营业");
                                                                          break;
                                                                      case R.id.navigation_sub_item2_1:
                                                                          getFragmentManager().beginTransaction().replace(R.id.frame_content, new AnalyzeOfsales()).commit();
                                                                          toolbar.setTitle("营业分析");
                                                                          break;
                                                                      case R.id.navigation_sub_item2_2:
                                                                          getFragmentManager().beginTransaction().replace(R.id.frame_content, new AnalyzeOfRoomTable()).commit();
                                                                          toolbar.setTitle("营业分析");
                                                                          break;
                                                                      case R.id.navigation_sub_item2_3:
                                                                          getFragmentManager().beginTransaction().replace(R.id.frame_content, new SettingOfFoodAndDrink()).commit();
                                                                          toolbar.setTitle("营业分析");
                                                                          break;
                                                                      case R.id.navigation_sub_item2_4:
                                                                          getFragmentManager().beginTransaction().replace(R.id.frame_content, new AnalyzeOfOperatioin()).commit();
                                                                          toolbar.setTitle("营业分析");
                                                                          break;
                                                                      case R.id.navigation_sub_item2_5:
                                                                          getFragmentManager().beginTransaction().replace(R.id.frame_content, new AnalyzeOfResult()).commit();
                                                                          toolbar.setTitle("营业分析");
                                                                          break;
                                                                      case R.id.navigation_sub_item3_1:
                                                                          getFragmentManager().beginTransaction().replace(R.id.frame_content, new BillQuiry()).commit();
                                                                          toolbar.setTitle("财务机构");
                                                                          break;
                                                                      case R.id.navigation_sub_item3_2:
                                                                          getFragmentManager().beginTransaction().replace(R.id.frame_content, new OrderQuery()).commit();
                                                                          toolbar.setTitle("财务机构");
                                                                          break;
                                                                      case R.id.navigation_sub_item3_3:
                                                                          getFragmentManager().beginTransaction().replace(R.id.frame_content, new PayQuery()).commit();
                                                                          toolbar.setTitle("财务机构");
                                                                          break;
                                                                      case R.id.navigation_sub_item4_1:
                                                                          getFragmentManager().beginTransaction().replace(R.id.frame_content, new OperatorManger()).commit();
                                                                          toolbar.setTitle("辅助管理");
                                                                          break;
                                                                      case R.id.navigation_sub_item4_2:
                                                                          getFragmentManager().beginTransaction().replace(R.id.frame_content, new PayManger()).commit();
                                                                          toolbar.setTitle("辅助管理");
                                                                          break;
                                                                      case R.id.navigation_sub_item5_1:
                                                                          getFragmentManager().beginTransaction().replace(R.id.frame_content, new AnalyzeOfFoodandFrink()).commit();
                                                                          toolbar.setTitle("营业设置");
                                                                          break;
                                                                      case R.id.navigation_sub_item5_2:
                                                                          getFragmentManager().beginTransaction().replace(R.id.frame_content, new TableOrRoom()).commit();
                                                                          toolbar.setTitle("营业设置");
                                                                          break;
                                                                      case R.id.navigation_sub_item5_3:
                                                                          getFragmentManager().beginTransaction().replace(R.id.frame_content, new OthersSetting()).commit();
                                                                          toolbar.setTitle("营业设置");
                                                                          break;
                                                                  }
                                                                  menuItem.setChecked(true);//点击了把它设为选中状态
                                                                  mDrawerLayout.closeDrawers();//关闭抽屉
                                                                  return true;
                                                              }
                                                          }
        );
        getFragmentManager().beginTransaction().replace(R.id.frame_content, new StartTimeAndEndTime()).commit();
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            mDrawerLayout.openDrawer(GravityCompat.START);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}









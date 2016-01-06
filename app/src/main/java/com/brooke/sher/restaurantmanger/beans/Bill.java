package com.brooke.sher.restaurantmanger.beans;


import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

import java.util.Date;

/**
 * Created by Sher on 2015/12/23.
 */
@Table(name = "Bill")
public class Bill {

    @Column(name = "billNum", isId = true)
    private Date billNum;
    @Column(name = "billFoodName")
    private String billFoodName;//消费的食物
    @Column(name = "billFoodCount")
    private String billFoodCount;
//    @Column(name = "getBillFoodPrice")
//    private int getBillFoodPrice;
    @Column(name = "billTOrRNum")
    private int billTOrRNum;//所在的房间号
    @Column(name = "billPayModeName")
    private String billPayModeName;
    @Column(name = "payMan")
    private String payMan;//付账的人
    @Column(name = "billState")
    private String billState;//已结账或未结账
    @Column(name = "billWaiterName")
    private String billWaiterName;

    public String getBillWaiterName() {
        return billWaiterName;
    }
    public void setBillWaiterName(String billWaiterName) {
        this.billWaiterName = billWaiterName;
    }


    public String getBillState() {
        return billState;
    }

    public void setBillState(String billState) {
        this.billState = billState;
    }

    public String getBillPayModeName() {
        return billPayModeName;
    }

    public void setBillPayModeName(String billPayModeName) {
        this.billPayModeName = billPayModeName;
    }


    public Date getBillNum() {
        return billNum;
    }

    public void setBillNum(Date billNum) {
        this.billNum = billNum;
    }

    public String getPayMan() {
        return payMan;
    }

    public void setPayMan(String payMan) {
        this.payMan = payMan;
    }

    public String getBillFoodName() {
        return billFoodName;
    }

    public void setBillFoodName(String billFoodName) {
        this.billFoodName = billFoodName;
    }

    public String getBillFoodCount() {
        return billFoodCount;
    }

    public void setBillFoodCount(String billFoodCount) {
        this.billFoodCount = billFoodCount;
    }


    public int getBillTOrRNum() {
        return billTOrRNum;
    }

    public void setBillTOrRNum(int billTOrRNum) {
        this.billTOrRNum = billTOrRNum;
    }



}

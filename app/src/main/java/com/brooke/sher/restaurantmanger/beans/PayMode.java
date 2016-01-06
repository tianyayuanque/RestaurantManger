package com.brooke.sher.restaurantmanger.beans;


import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

/**
 * Created by Sher on 2015/12/23.
 */
@Table(name = "Pay")
public class PayMode {
    @Column(name = "payModeNum", isId = true)
    private int payModeNum;

    @Column(name = "payModeName")
    private String payModeName;

    public String getPayModeName() {
        return payModeName;
    }

    public void setPayModeName(String payModeName) {
        this.payModeName = payModeName;
    }

    public int getPayModeNum() {
        return payModeNum;
    }

    public void setPayModeNum(int payModeNum) {
        this.payModeNum = payModeNum;
    }


}

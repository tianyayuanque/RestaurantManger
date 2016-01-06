package com.brooke.sher.restaurantmanger.beans;


import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

/**
 * Created by Sher on 2015/12/23.
 */
@Table(name = "Customer")
public class Customer {
    @Column(name = "customerNum", isId = true)
    private int customerNum;
    @Column(name = "customerName")
    private String customerName;
    @Column(name = "customerTel")
    private String customerTel;

    public int getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(int customerNum) {
        this.customerNum = customerNum;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }
}

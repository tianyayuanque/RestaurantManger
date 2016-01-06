package com.brooke.sher.restaurantmanger.beans;


import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

/**
 * Created by Sher on 2015/12/23.
 */
@Table(name = "Waiter")
public class Waiter {

    @Column(name = "waiterNum", isId = true)
    private int waiterNum;
    @Column(name = "waiterName")
    private String waiterName;
    @Column(name = "basicSales")
    private int basicSales;
    @Column(name = "tiCheng")
    private int tiCheng;

    public int getWaiterNum() {
        return waiterNum;
    }

    public void setWaiterNum(int waiterNum) {
        this.waiterNum = waiterNum;
    }

    public String getWaiterName() {
        return waiterName;
    }

    public void setWaiterName(String waiterName) {
        this.waiterName = waiterName;
    }

    public int getBasicSales() {
        return basicSales;
    }

    public void setBasicSales(int basicSales) {
        this.basicSales = basicSales;
    }

    public int getTiCheng() {
        return tiCheng;
    }

    public void setTiCheng(int tiCheng) {
        this.tiCheng = tiCheng;
    }
}

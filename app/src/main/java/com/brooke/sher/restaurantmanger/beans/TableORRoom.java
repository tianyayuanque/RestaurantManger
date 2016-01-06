package com.brooke.sher.restaurantmanger.beans;

import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

/**
 * Created by Sher on 2015/12/21.
 */
@Table(name = "RoomORTable")
public class TableORRoom {
    @Column(name = "tOrRNum", isId = true)
    private int tOrRNum;
    @Column(name = "tOrRType")
    private String tOrRType;
    @Column(name = "tOrRState")
    private String tOrRState;

    public int gettOrRNum() {
        return tOrRNum;
    }

    public void settOrRNum(int tOrRNum) {
        this.tOrRNum = tOrRNum;
    }

    public String gettOrRType() {
        return tOrRType;
    }

    public void settOrRType(String tOrRType) {
        this.tOrRType = tOrRType;
    }

    public String gettOrRState() {
        return tOrRState;
    }

    public void settOrRState(String tOrRState) {
        this.tOrRState = tOrRState;
    }
}

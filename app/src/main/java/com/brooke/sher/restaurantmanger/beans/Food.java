package com.brooke.sher.restaurantmanger.beans;


import org.xutils.db.annotation.Column;
import org.xutils.db.annotation.Table;

/**
 * Created by Sher on 2015/12/23.
 */
@Table(name = "Food")
public class Food {
    @Column(name = "foodNum", isId = true)
    private int foodNum;
    @Column(name = "foodName")
    private String foodName;
    @Column(name = "foodSalePrice")
    private int foodSalePrice;
    @Column(name = "chengBen")
    private int chengBen;

    public String getFoodType() {
        return foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    @Column(name = "foodType")
    private String foodType;

    public int getFoodNum() {
        return foodNum;
    }

    public void setFoodNum(int foodNum) {
        this.foodNum = foodNum;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodSalePrice() {
        return foodSalePrice;
    }

    public void setFoodSalePrice(int foodSalePrice) {
        this.foodSalePrice = foodSalePrice;
    }

    public int getChengBen() {
        return chengBen;
    }

    public void setChengBen(int chengBen) {
        this.chengBen = chengBen;
    }
}

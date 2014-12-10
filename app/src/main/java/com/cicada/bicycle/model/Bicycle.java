package com.cicada.bicycle.model;

/**
 * Created by test on 2014/12/10.
 */
public class Bicycle {
    private long id;
    private String title;
    private String catalog;  //种类
    private String brand;   //品牌
    private String deposit; //押金
    private String rentPrice; //租金
    private String originPrice; //原价
    private String address;
    private int quality; // 几成新
    private String photo1 = "";
    private String photo2 = "";
    private String photo3 = "";
    private String bicycleStatus;
    private String description;
    private long userId;
    private long createTime;
    private long lastAccess;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title == null ? "" : title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCatalog() {
        return catalog == null ? "" : catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public String getBrand() {
        return brand == null ? "" : brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDeposit() {
        return deposit == null ? "" : deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getRentPrice() {
        return rentPrice == null ? "" : rentPrice;
    }

    public void setRentPrice(String rentPrice) {
        this.rentPrice = rentPrice;
    }

    public String getOriginPrice() {
        return originPrice == null ? "" : originPrice;
    }

    public void setOriginPrice(String originPrice) {
        this.originPrice = originPrice;
    }

    public String getAddress() {
        return address == null ? "" : address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getPhoto1() {
        return photo1;
    }

    public void setPhoto1(String photo1) {
        this.photo1 = photo1;
    }

    public String getPhoto2() {
        return photo2;
    }

    public void setPhoto2(String photo2) {
        this.photo2 = photo2;
    }

    public String getPhoto3() {
        return photo3;
    }

    public void setPhoto3(String photo3) {
        this.photo3 = photo3;
    }

    public String getBicycleStatus() {
        return bicycleStatus;
    }

    public void setBicycleStatus(String bicycleStatus) {
        this.bicycleStatus = bicycleStatus;
    }

    public String getDescription() {
        return description == null ? "" : description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(long createTime) {
        this.createTime = createTime;
    }

    public long getLastAccess() {
        return lastAccess;
    }

    public void setLastAccess(long lastAccess) {
        this.lastAccess = lastAccess;
    }
}

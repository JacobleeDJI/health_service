package com.model;

import java.sql.Date;

/**
 * Created by jacob on 2017/9/18.
 */
public class HistoryMid {
    private String uid;
    private String mid;
    private String mid1;
    private String mid2;
    private String mid3;
    private double comfortA;
    private double comfortB;
    private double comfortC;
    private double comfortD;
    private String calibtime;
    private User user;


    public double getComfortA() {
        return comfortA;
    }

    public void setComfortA(double comfortA) {
        this.comfortA = comfortA;
    }

    public double getComfortB() {
        return comfortB;
    }

    public void setComfortB(double comfortB) {
        this.comfortB = comfortB;
    }

    public double getComfortC() {
        return comfortC;
    }

    public void setComfortC(double comfortC) {
        this.comfortC = comfortC;
    }

    public double getComfortD() {
        return comfortD;
    }

    public void setComfortD(double comfortD) {
        this.comfortD = comfortD;
    }

    public String getCalibtime() {
        return calibtime;
    }

    public void setCalibtime(String calibtime) {
        this.calibtime = calibtime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getMid1() {
        return mid1;
    }

    public void setMid1(String mid1) {
        this.mid1 = mid1;
    }

    public String getMid2() {
        return mid2;
    }

    public void setMid2(String mid2) {
        this.mid2 = mid2;
    }

    public String getMid3() {
        return mid3;
    }

    public void setMid3(String mid3) {
        this.mid3 = mid3;
    }

}

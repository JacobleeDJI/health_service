package com.model;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.sql.Date;

/**
 * Created by jacob on 2017/7/25.
 * JSON序列化和反序列化使用的data类
 */
public class Data {
    private Integer id;
    private String mid;
    private Integer sequence;
    private double aa;
    private double bb;
    private double cc;
    private double dd;
    private String time;
    private String startTime;
    private String endTime;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public double getAa() {
        return aa;
    }

    public void setAa(double aa) {
        this.aa = aa;
    }

    public double getBb() {
        return bb;
    }

    public void setBb(double bb) {
        this.bb = bb;
    }

    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }

    public double getDd() {
        return dd;
    }

    public void setDd(double dd) {
        this.dd = dd;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

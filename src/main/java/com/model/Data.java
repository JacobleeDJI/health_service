package com.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.sql.Date;

/**
 * Created by jacob on 2017/7/25.
 * JSON序列化和反序列化使用的data类
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
    private Integer id;
    private String mid;
    private Integer sequence;
    private String aa;
    private String bb;
    private String cc;
    private String dd;
    private String time;
    private Integer sync;
    private String startTime;
    private String endTime;


//    public String getStartTime() {
//        return startTime;
//    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

//    public String getEndTime() {
//        return endTime;
//    }

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

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }

    public String getBb() {
        return bb;
    }

    public void setBb(String bb) {
        this.bb = bb;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getDd() {
        return dd;
    }

    public void setDd(String dd) {
        this.dd = dd;
    }

    public Integer getSync() {
        return sync;
    }

    public void setSync(Integer sync) {
        this.sync = sync;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

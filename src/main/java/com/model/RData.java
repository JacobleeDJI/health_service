package com.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Date;

/**
 * Created by jacob on 2017/8/22.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RData {
    private String aa;
    private String bb;
    private String cc;
    private String dd;
    private String mid;
    private int sequence;
    private int sync;
    private String time;


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

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }

    public int getSync() {
        return sync;
    }

    public void setSync(int sync) {
        this.sync = sync;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

package com.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * Created by jacob on 2017/8/22.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class JsonData {
    private int count;
    private List<RData> data;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<RData> getData() {
        return data;
    }

    public void setData(List<RData> data) {
        this.data = data;
    }
}

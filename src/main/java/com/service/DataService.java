package com.service;

import com.model.Data;

import java.util.List;

/**
 * Created by jacob on 2017/7/25.
 */
public interface DataService {
    int getupLoadData(Data data);
    List<String> getqueryData(Integer id);
}

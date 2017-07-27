package com.service;

import com.model.Data;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by jacob on 2017/7/25.
 */
public interface DataService {
    int upLoadData(Data data);
    List<Data> getqueryData(@Param("id") Integer id, @Param("startTime") String startTime, @Param("endTime") String endTime);
}

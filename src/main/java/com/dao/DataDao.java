package com.dao;

import com.model.Data;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by jacob on 2017/7/25.
 */
@Repository
public interface DataDao {
    int upLoadData(Data data);
    List<String> queryData(Integer id);
}

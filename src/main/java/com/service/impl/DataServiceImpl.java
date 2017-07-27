package com.service.impl;

import com.dao.DataDao;
import com.model.Data;
import com.service.DataService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by jacob on 2017/7/25.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class DataServiceImpl implements DataService {

    @Resource
    private DataDao dataDao;

    public int upLoadData(Data data) { return dataDao.upLoadData(data); }

    public List<Data> getqueryData(@Param("id") Integer id, @Param("startTime") String startTime, @Param("endTime") String endTime) { return dataDao.queryData(id, startTime, endTime);}
}

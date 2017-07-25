package com.service.impl;

import com.dao.DataDao;
import com.model.Data;
import com.service.DataService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jacob on 2017/7/25.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class DataServiceImpl implements DataService {

    @Resource
    private DataDao dataDao;

    public int getupLoadData(Data data) { return dataDao.upLoadData(data); }

    public List<String> getqueryData(Integer id) { return dataDao.queryData(id); }
}

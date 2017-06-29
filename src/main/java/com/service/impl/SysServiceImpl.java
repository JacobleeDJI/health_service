package com.service.impl;

import com.dao.SysDao;
import com.dao.UserDao;
import com.model.Sys;
import com.service.SysService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by jacob on 2017/6/28.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class SysServiceImpl implements SysService {
    @Resource
    private SysDao sysDao;

    public Sys getIsCorrectCode(String s_value) {return sysDao.isCorrectCode(s_value); }
}

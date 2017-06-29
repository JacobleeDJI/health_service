package com.service;

import com.dao.SysDao;
import com.model.Sys;

/**
 * Created by jacob on 2017/6/28.
 */
public interface SysService {
    Sys getIsCorrectCode(String s_value);
}

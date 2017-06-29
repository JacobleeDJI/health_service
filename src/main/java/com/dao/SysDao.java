package com.dao;

import com.model.Sys;
import org.springframework.stereotype.Repository;

/**
 * Created by jacob on 2017/6/28.
 */
@Repository
public interface SysDao {
    Sys isCorrectCode(String s_value);
}

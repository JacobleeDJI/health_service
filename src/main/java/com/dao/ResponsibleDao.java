package com.dao;

import com.model.Responsible;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jacob on 2017/7/23.
 */
@Repository
public interface ResponsibleDao {
    List<Responsible> selectPatFromUser(Integer docId);
    Responsible selectBoundDocter(Integer patId);
}

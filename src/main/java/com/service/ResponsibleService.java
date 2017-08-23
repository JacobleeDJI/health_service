package com.service;

import com.model.Responsible;

import java.util.List;

/**
 * Created by jacob on 2017/7/23.
 */
public interface ResponsibleService {
    List<Responsible> getselectPatFromUser(Integer docId);
    Responsible getselectBoundDocter(Integer patId);
}

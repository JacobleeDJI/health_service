package com.service.impl;

import com.dao.ResponsibleDao;
import com.model.Responsible;
import com.service.ResponsibleService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jacob on 2017/7/23.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class ResponsibleServiceImpl implements ResponsibleService {

    @Resource
    private ResponsibleDao responsibleDao;

    public List<Responsible>  getselectPatFromUser(Integer docId) { return responsibleDao.selectPatFromUser(docId); };
}

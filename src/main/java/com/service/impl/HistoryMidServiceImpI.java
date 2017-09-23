package com.service.impl;

import com.dao.HistoryMidDao;
import com.model.HistoryMid;
import com.service.HistoryMidService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by jacob on 2017/9/18.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class HistoryMidServiceImpI implements HistoryMidService {

    @Resource
    private HistoryMidDao historyMidDao;

    public  int getsetMid(HistoryMid historyMid) { return historyMidDao.setMid(historyMid); };

    public HistoryMid getselectOldMid(String userUid) { return historyMidDao.selectOldMid(userUid); };

    public int getinsertHistoryMid(HistoryMid historyMid) { return historyMidDao.insertHistoryMid(historyMid); };
}

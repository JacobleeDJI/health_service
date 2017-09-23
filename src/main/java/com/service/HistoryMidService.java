package com.service;

import com.model.HistoryMid;

/**
 * Created by jacob on 2017/9/18.
 */
public interface HistoryMidService {
    int getinsertHistoryMid(HistoryMid historyMid);
    HistoryMid getselectOldMid(String userUid);
}

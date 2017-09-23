package com.dao;

import com.model.HistoryMid;
import org.springframework.stereotype.Repository;

/**
 * Created by jacob on 2017/9/18.
 */
@Repository
public interface HistoryMidDao {
    int insertHistoryMid(HistoryMid historyMid);
    HistoryMid selectOldMid(String userUid);
}

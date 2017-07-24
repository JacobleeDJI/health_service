package com.dao;

import com.model.Message;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jacob on 2017/7/24.
 */
@Repository
public interface MessageDao {
    int sendMessage(Message message);//发送消息
    List<String> selectPatList(String patId, String docId);
}

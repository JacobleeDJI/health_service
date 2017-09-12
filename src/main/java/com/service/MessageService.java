package com.service;

import com.model.Message;

import java.util.List;

/**
 * Created by jacob on 2017/7/24.
 */
public interface MessageService {
    int getsendMessage(Message message);
    int getsendGroupMessage(Message message);
    List<String> selectPatList(String toId, String fromId);
    List<String> selectDocList(String fromId, String toId);
}

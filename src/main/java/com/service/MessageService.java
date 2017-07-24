package com.service;

import com.model.Message;

import java.util.List;

/**
 * Created by jacob on 2017/7/24.
 */
public interface MessageService {
    int getsendMessage(Message message);
    Message selectDocList(String docId);
    List<String> selectPatList(String patId);
}

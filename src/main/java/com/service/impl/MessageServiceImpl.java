package com.service.impl;

import com.dao.MessageDao;
import com.model.Message;
import com.service.MessageService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jacob on 2017/7/24.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class MessageServiceImpl implements MessageService {

    @Resource
    private MessageDao messageDao;

    public int getsendMessage(Message message) { return messageDao.sendMessage(message); }

    public Message selectDocList(String docId) { return messageDao.selectDocList(docId); }

    public List<String> selectPatList(String patId) { return messageDao.selectPatList(patId); }
}

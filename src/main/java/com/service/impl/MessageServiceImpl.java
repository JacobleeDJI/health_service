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

    public List<String> selectPatList(String patId, String docId) { return messageDao.selectPatList(patId, docId); }

    public List<String> selectDocList(String fromId, String toId) { return messageDao.selectDocList(fromId, toId); }
}

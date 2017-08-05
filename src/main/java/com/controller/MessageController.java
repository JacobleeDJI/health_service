package com.controller;

import com.model.Message;
import com.service.MessageService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by jacob on 2017/7/24.
 */
@RestController
@RequestMapping("/message")
public class MessageController {
    private Logger log = Logger.getLogger(UserController.class);

    @Resource
    private MessageService messageService;

    @RequestMapping(value = "/sendMessage", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String, String> sendMessage(@ModelAttribute Message message) {
        log.info("发送消息");
        int message1 = messageService.getsendMessage(message);
        Map<String, String> result = new HashMap<String, String>();
        if (message1 != 0) {
            result.put("status", "200");
            return result;
        }
        result.put("status", "400");
        return result;
    }

    @RequestMapping(value = "/getMessageList", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String,List<String>> getPatMessage(String PatId, String DocId) {
        log.info("查询患者消息列表");
        int count = 0;
        List<String> contents = messageService.selectPatList(DocId, PatId);
        List<String> contents1 = messageService.selectDocList(PatId, DocId);
        Map<String, List<String>> map = new HashMap<>();
        Map<String, String> map1 = new HashMap<>();
        for (int i = 0; i <contents.size(); i++) {
            count++;
        }

        if (contents != null) {
//            contents.add("status: 200");
//            contents.add("count: " + String.valueOf(count));
            map.put("PatientList", contents);
            map.put("PatientsList_reverse", contents1);
            return map;
        }
        map1.put("status", "400");
        return map;
    }
}

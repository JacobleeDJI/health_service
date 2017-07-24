package com.controller;

import com.model.Message;
import com.service.MessageService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
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
}

package com.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.model.Message;
import com.service.MessageService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date = df.format(new Date());// new Date()为获取当前系统时间，也可使用当前时间戳
        message.setTime(date);
        int message1 = messageService.getsendMessage(message);
        Map<String, String> result = new HashMap<String, String>();
        if (message1 != 0) {
            result.put("status", "200");
            return result;
        }
        result.put("status", "400");
        return result;
    }

    @RequestMapping(value = "/sendGroupMessage", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String, String> sendGroupMessage(String groupMessage) throws IOException {
        log.info("群发消息");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = df.format(new Date());
        java.net.URLDecoder.decode(groupMessage, groupMessage);
        Map<String, String> map = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        JSONObject jsonObject = JSONObject.fromObject(groupMessage);
        int temp = 0;
        JSONArray GroupMessage = jsonObject.getJSONArray("GroupMessage");
        for (int i = 0; i < GroupMessage.size(); i++) {
            String json = GroupMessage.getJSONObject(i).toString();
            Message message = mapper.readValue(json, Message.class);
            message.setTime(date);
            messageService.getsendGroupMessage(message);
            temp++;
        }
        if (temp == GroupMessage.size()) {
            map.put("status", "200");
        }
        else
            map.put("status", "400");

        return map;
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
            return map;
        }
        map1.put("status", "400");
        return map;
    }
}

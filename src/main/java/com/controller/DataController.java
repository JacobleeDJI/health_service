package com.controller;


import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.model.Data;
import com.model.Posts;
import com.model.Sys;
import com.service.DataService;
import org.apache.log4j.Logger;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.ls.LSInput;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.annotation.Resource;
import javax.print.DocFlavor;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by jacob on 2017/7/25.
 */
@RestController
@RequestMapping("/data")
public class DataController extends SimpleDateFormat {
    private Logger log = Logger.getLogger(UserController.class);

    @Resource
    private DataService dataService;

    @RequestMapping(value = "/upLoadData", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    public void uploadData(String upLoadData) throws IOException {

//      String json = "{\"id\":3,\"mid\":\"qweasdzxc\",\"sequence\":20,\"aa\":8440992,\"bb\":8440992,\"cc\":8440992,\"dd\":8440992,\"time\":\"1995-06-10\"}";
        String json = upLoadData;
        ObjectMapper mapper = new ObjectMapper();
        List<LinkedHashMap<String, Object>> list = mapper.readValue(json, List.class);
        Data data = mapper.readValue(json, Data.class);
        dataService.upLoadData(data);
        System.out.println(data);
    }

    @RequestMapping(value = "/queryData", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String,List<Data>> getQuery(Integer id, String startTime, String endTime) {
        log.info("获取帖子列表");
        List<Data> dataList = dataService.getqueryData(id, startTime, endTime);
        Map<String, List<Data>> map = new HashMap<String, List<Data>>();
        map.put("HistoryData", dataList);
        return map;
    }
}

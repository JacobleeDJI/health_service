package com.controller;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.model.*;
import com.service.DataService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.annotation.Resource;
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



    @RequestMapping(value = "/upLoadData", method = RequestMethod.POST, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String, String> uploadData(String upLoad) throws IOException {
        Map<String, String> map = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        java.net.URLDecoder.decode(upLoad, upLoad);
        JSONObject jsonObject = JSONObject.fromObject(upLoad);
        int temp = 0;
        //提取出count
        int count = jsonObject.getInt("count");
//        System.out.println(count);
        //[]json列表数据要转换为JSONArray类型的对象
        JSONArray data = jsonObject.getJSONArray("data");
        for (int i = 0; i < data.size(); i++) {
            String json =  data.getJSONObject(i).toString();
            Data data1 = mapper.readValue(json, Data.class);
            Data data2 = dataService.selectTime(data1.getTime());
            if (data2 == null){
                dataService.upLoadData(data1);
                temp++;
            }
        }

        if (temp != 0) {
            map.put("Result", "All Loaded");
            map.put("status", "200");
        }


        else {
            map.put("Result", "Load Failed");
            map.put("status", "400");
            int t = count - temp;
        }

        return map;
    }

    @RequestMapping(value = "/queryData", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String,Object> getQuery(String mid, String startTime, String endTime) {
        log.info("获取帖子列表");
        int count = 0;
        List<Data> dataList = dataService.getqueryData(mid, startTime, endTime);
        Map<String, Object> map = new LinkedHashMap<>();
        for (int i=0; i < dataList.size(); i++)
        {
            count++;
        }
        map.put("count", count);
        map.put("HistoryData", dataList);
        return map;
    }
}

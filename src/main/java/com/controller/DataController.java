package com.controller;


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
    public void uploadData(String upLoad) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        java.net.URLDecoder.decode(upLoad, upLoad);
        JsonData jsonData = mapper.readValue(upLoad, JsonData.class);
        int count = jsonData.getCount();
        String json = mapper.writeValueAsString(jsonData);
        List<RData> dataList = jsonData.getData();
        int temp = 0;
//        for (int i = 0; i < count; i++){
//            dataList = jsonData.getDataList(i);
//            Data data = mapper.readValue(, Data.class);
//            System.out.println(dataList);
//            Data data = mapper.readValue(Rdata, Data[].class)[i];
//            temp++;
//        }

        System.out.println(json);
        System.out.println(count);
        System.out.println(temp);

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

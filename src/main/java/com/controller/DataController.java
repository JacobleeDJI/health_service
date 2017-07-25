package com.controller;


import com.google.gson.Gson;
import com.model.Data;
import com.model.Sys;
import com.service.DataService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.ls.LSInput;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jacob on 2017/7/25.
 */
@RestController
@RequestMapping("/data")
public class DataController {
    private Logger log = Logger.getLogger(UserController.class);

    @Resource
    private DataService dataService;

    @RequestMapping(value = "/upLoadData", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public void upLoadData(Data data)
    {
        Gson gson = new Gson();
        String a = gson.toJson(data);
        System.out.println(a);
    }

    @RequestMapping(value = "/queryData", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public List<String> queryData(Integer id) {
        log.info("查询历史数据");
        int count = 0;
        List<String> data = dataService.getqueryData(id);
        List<String> result = new ArrayList<>();
        for (int i = 0; i <data.size(); i++) {
            count++;
        }
        if (data != null) {
            data.add("status: 200");
            data.add("count: " + String.valueOf(count));
            return data;
        }
        result.add("status: 400");
        return result;
    }
}

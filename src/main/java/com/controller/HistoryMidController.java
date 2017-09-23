package com.controller;

import com.model.HistoryMid;
import com.service.HistoryMidService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jacob on 2017/9/18.
 */
@RestController
@RequestMapping("/HistoryMid")
public class HistoryMidController {
    private Logger log = Logger.getLogger(UserController.class);

    @Resource
    private HistoryMidService historyMidService;

//  RESTFUL API
//  模块：用户模块
//  接口名：bondMid
//  返回值：String
    @RequestMapping(value = "/memoryHistMid", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String, String> memoryHistMid(String userUid) {
        log.info("存储历史MID");
        HistoryMid historyMid= historyMidService.getselectOldMid(userUid);
        Map<String, String> result = new HashMap<String, String>();
        if (historyMid != null) {
            if (historyMid.getUser().getUserMid() != null){
                historyMid.setUid(historyMid.getUser().getUserUid());
                historyMid.setMid(historyMid.getUser().getUserMid());
                historyMid.setComfortA(historyMid.getUser().getUserComfortA());
                historyMid.setComfortB(historyMid.getUser().getUserComfortB());
                historyMid.setComfortC(historyMid.getUser().getUserComfortC());
                historyMid.setComfortD(historyMid.getUser().getUserComfortD());
                historyMid.setCalibtime(historyMid.getUser().getUserCalibtime());
                historyMidService.getinsertHistoryMid(historyMid);
            }
            result.put("status", "200");
            return result;
        }
        result.put("status", "400");
        return result;
    }
}

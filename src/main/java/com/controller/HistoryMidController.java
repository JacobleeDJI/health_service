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
        if (historyMid != null && historyMid.getUser().getUserMid() != null) {
                historyMid.setUid(historyMid.getUser().getUserUid());
                historyMid.setMid(historyMid.getUser().getUserMid());
                historyMid.setUserComfortA1(historyMid.getUser().getUserComfortA1());
                historyMid.setUserComfortA2(historyMid.getUser().getUserComfortA2());
                historyMid.setUserComfortA3(historyMid.getUser().getUserComfortA3());
                historyMid.setUserComfortA4(historyMid.getUser().getUserComfortA4());
                historyMid.setUserComfortB1(historyMid.getUser().getUserComfortB1());
                historyMid.setUserComfortB2(historyMid.getUser().getUserComfortB2());
                historyMid.setUserComfortB3(historyMid.getUser().getUserComfortB3());
                historyMid.setUserComfortB4(historyMid.getUser().getUserComfortB4());
                historyMid.setUserComfortC1(historyMid.getUser().getUserComfortC1());
                historyMid.setUserComfortC2(historyMid.getUser().getUserComfortC2());
                historyMid.setUserComfortC3(historyMid.getUser().getUserComfortC3());
                historyMid.setUserComfortC4(historyMid.getUser().getUserComfortC4());
                historyMid.setUserComfortD1(historyMid.getUser().getUserComfortD1());
                historyMid.setUserComfortD2(historyMid.getUser().getUserComfortD2());
                historyMid.setUserComfortD3(historyMid.getUser().getUserComfortD3());
                historyMid.setUserComfortD4(historyMid.getUser().getUserComfortD4());
                historyMid.setCalibtime(historyMid.getUser().getUserCalibtime());
                historyMidService.getinsertHistoryMid(historyMid);
                result.put("status", "200");
            return result;
        }
        result.put("status", "400");
        return result;
    }
}

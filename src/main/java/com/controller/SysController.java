package com.controller;

import com.model.Sys;
import com.model.User;
import com.service.SysService;
import org.apache.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jacob on 2017/6/28.
 */
@RestController
@RequestMapping("/sys")
public class SysController {
    private Logger log = Logger.getLogger(UserController.class);

    @Resource
    private SysService sysService;

    //  RESTFUL API
//  模块:用户模块
//  接口名:getIdByPhone
//  返回值:String
    @RequestMapping(value = "/isCorrectCode", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String, String> isCorrect(Model model, String svalue) {
        log.info("判断验证码是否正确");
        Sys sysIsCorrect = sysService.getIsCorrectCode(svalue);
        Map<String, String> map = new HashMap<String, String>();
        if (sysIsCorrect != null) {
            map.put("status", "200");
            return map;
        }
        map.put("status", "400");
        return map;
    }
}


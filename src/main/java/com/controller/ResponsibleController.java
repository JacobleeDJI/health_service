package com.controller;

import com.model.Responsible;
import com.model.User;
import com.service.ResponsibleService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.swing.text.html.HTMLDocument;
import java.util.*;

/**
 * Created by jacob on 2017/7/23.
 */
@RestController
@RequestMapping("/res")
public class ResponsibleController {
    private Logger log = Logger.getLogger(UserController.class);

    @Resource
    private ResponsibleService responsibleService;

    //  RESTFUL API
//  模块：用户模块
//  接口名：getBoundUser
//  返回值：状态码
    @RequestMapping(value = "/getBoundUser", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String,List<Responsible>> getbounduser(Integer docId) {
        log.info("查询医生负责的病人");
        List<Responsible> responsible = responsibleService.getselectPatFromUser(docId);
        Map<String, List<Responsible>> map = new HashMap<String, List<Responsible>>();
        map.put("BondUser", responsible);
        return map;
    }

//  RESTFUL API
//  模块：用户模块
//  接口名：getBoundDoctor
//  返回值：json
    @RequestMapping(value = "/getBoundDoctor", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String, String> getbounddoctor(Integer patId) {
        log.info("查询患者对应的医生");
        Responsible responsible = responsibleService.getselectBoundDocter(patId);
        Map<String, String> map = new HashMap<>();
        if (responsible == null) {
            map.put("DoctorId", "null");
            return map;
        }
        map.put("DoctorId", String.valueOf(responsible.getDocId()));
        return map;
    }
}

package com.controller;

import com.alibaba.fastjson.JSONArray;
import com.model.Responsible;
import com.model.Sys;
import com.model.User;
import com.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    private Logger log = Logger.getLogger(UserController.class);

    @Resource
    private UserService userService;

//    @RequestMapping("/showUser")
//    public String showUser(HttpServletRequest request, Model model) {
//        log.info("查询所有用户信息");
//        List<User> list = userService.getAllUser();
//        model.addAttribute("list", list);
//        return "showUser";
//    }
//
//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public String showId(HttpServletRequest request, Model model, @PathVariable Long id) {
//        log.info("通过ID查询");
//        User users = userService.getUserById(id);
//        model.addAttribute("users",users);
//        return "showUser";
//    }
//
//    @RequestMapping(value = "/name/{user_name}", method = RequestMethod.GET)
//    public String showName(HttpServletRequest request, Model model, @PathVariable String user_name) {
//        log.info("通过姓名查询");
//        User userN = userService.getUserByname(user_name);
//        model.addAttribute("userN", userN);
//        return "showUser";
//    }
//
//    @RequestMapping(value = "/phone/{userPhone}", method = RequestMethod.GET)
//    public String showPhone(HttpServletRequest request, Model modelm, @PathVariable String userPhone) {
//        log.info("通过电话号码查询");
//        User userP = userService.getUserByPhone(userPhone);
//        modelm.addAttribute("userP", userP);
//        return "showUser";
//    }

//  --------------------------Health App 接口-----------------------------

   /*
    RESTFUL API
    模块：用户模块
    接口名：isRepeatLoginName
    返回值：boolean/status都为String
   */
    @RequestMapping(value = "/isRepeatLoginName", method = RequestMethod.GET, produces = {"application/jason; charset=UTF-8"})
    @ResponseBody
    public Map<String, String> isRepeatLoginName(Model model, String userPhone) {
        log.info("检查用户名是否重复");
        User userByPhone = userService.getUserByPhone(userPhone);
        Map<String, String> map = new HashMap<String, String>();
        if (userByPhone == null) {
            map.put("status", "200");
            map.put("result", "false");
            return map;
        }
        map.put("status", "400");
        map.put("result", "true");
        return map;
    }


//  RESTFUL API
//  模块：用户模块
//  接口名：doSignUp
//  返回值：String
    @RequestMapping(value = "/doSignUp", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String, String> insertUser(@ModelAttribute User user) {
        log.info("注册");
        Long loginUser  =userService.getinsertUser(user);
        Map<String, String> result = new HashMap<String, String>();
        if (loginUser != null) {
//            result.put("userUid", user.getUserUid());
            result.put("userId", user.getId().toString());
            result.put("status", "200");
            return result;
        }
        result.put("status", "400");
        return result;
    }

//  RESTFUL API
//  模块：用户模块
//  接口名：doSignIn
//  返回值：status状态码为String
    @RequestMapping(value = "/doSignIn", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String, String> login(Model model,String userPhone, String userPwd) {
        log.info("登录");
        User u = userService.queryForLogin(userPhone, userPwd);
        Map<String,String> map = new HashMap<String, String>();
        if (u != null) {
            model.addAttribute("Login_user", u);
            map.put("userId", u.getId().toString());
            map.put("typeId", String.valueOf(u.getT_id()));
            map.put("userMac", u.getUserMac());
            map.put("userUid", u.getUserUid());
            map.put("status", "200");
            return map;
        }
        map.put("status", "400");
        return map;
    }

//  RESTFUL API
//  模块：用户模块
//  接口名：getProfile
//  返回值：tb_user除密码外的全部字段
    @RequestMapping(value = "/getProfile", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String, String> showUser(Model model, Long id) {
        log.info("通过ID查询");
        User users = userService.getUserById(id);
        Map<String, String> map = new HashMap<>();
        model.addAttribute("users",users);
        if(users != null) {
            map.put("status", "200");
            map.put("id", users.getId().toString());
            map.put("t_id", String.valueOf(users.getT_id()));
            map.put("userName", users.getUserName());
            map.put("userGender", String.valueOf(users.getUserGender()));
            map.put("userEmail", users.getUserEmail());
            map.put("userPhone", users.getUserPhone());
            map.put("userAddress", users.getUserAddress());
            map.put("time", String.valueOf(users.getTime()));
            map.put("comfort", String.valueOf(users.getComfort()));
            return map;
        }
        map.put("status", "400");
        return map;
    }


//  RESTFUL API
//  模块：用户模块
//  接口名：changeProfileName
//  返回值：状态码
    @RequestMapping(value = "/changeProfileName", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String, String> changeProfiles(Long userId, String userName) {
        log.info("修改信息userName");
        User u = userService.getUserById(userId);
        u.setUserName(userName);
        userService.setChangeProfile(u);
        Map<String,String> map = new HashMap<String, String>();
        if (u != null) {
        map.put("status", "200");
        return map;
        }
        map.put("status", "400");
        return map;
}

//  RESTFUL API
//  模块：用户模块
//  接口名：changeProfileGender
//  返回值：状态码
    @RequestMapping(value = "/changeProfileGender", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String, String> changeProfilesGender(Long userId, String userGender) {
        log.info("修改信息Gender");
        User u = userService.getUserById(userId);
        u.setUserGender(userGender);
        userService.setChangeProfileGender(u);
        Map<String,String> map = new HashMap<String, String>();
        if (u != null) {
            map.put("status", "200");
            return map;
        }
        map.put("status", "400");
        return map;
    }


//  RESTFUL API
//  模块：用户模块
//  接口名：changeProfileEmail
//  返回值：状态码
    @RequestMapping(value = "/changeProfileEmail", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String, String> changeProfileEmail(Long userId, String userEmail) {
        log.info("修改信息Email");
        User u = userService.getUserById(userId);
        u.setUserEmail(userEmail);
        userService.setChangeProfileEmail(u);
        Map<String,String> map = new HashMap<String, String>();
        if (u != null) {
            map.put("status", "200");
            return map;
        }
        map.put("status", "400");
        return map;
    }

//  RESTFUL API
//  模块：用户模块
//  接口名：changeProfilePhone
//  返回值：状态码
    @RequestMapping(value = "/changeProfilePhone", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String, String> changeProfilePhone(Long userId, String userPhone) {
        log.info("修改信息Phone");
        User u = userService.getUserById(userId);
        u.setUserPhone(userPhone);
        userService.setChangeProfilePhone(u);
        Map<String,String> map = new HashMap<String, String>();
        if (u != null) {
            map.put("status", "200");
            return map;
        }
        map.put("status", "400");
        return map;
}

//  RESTFUL API
//  模块：用户模块
//  接口名：changeProfileAddress
//  返回值：状态码
    @RequestMapping(value = "/changeProfileAddress", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String, String> changeProfileAddress(Long userId, String userAddress) {
        log.info("修改信息Address");
        User u = userService.getUserById(userId);
        u.setUserAddress(userAddress);
        userService.setChangeProfileAddress(u);
        Map<String, String> map = new HashMap<>();
        if (u != null) {
            map.put("status", "200");
            return map;
        }
        map.put("status", "400");
        return map;
    }

//  RESTFUL API
//  模块：用户模块
//  接口名：changeProfilePassword
//  返回值：状态码
    @RequestMapping(value = "/changeProfilePassword", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String, String> changeProfilePassword(Long userId, String oldPassWord, String newPassWord) {
        log.info("修改信息Password");
        User u = userService.getUserById(userId);

        Map<String, String> map = new HashMap<>();
        if (u.getUserPwd().equals(oldPassWord)) {
            u.setUserPwd(newPassWord);
            userService.setChangeProfilePassword(u);
            map.put("status", "200");
            return map;
        }
        map.put("status", "400");
        return map;
    }


//  RESTFUL API
//  模块：用户模块
//  接口名：bindMachine
//  返回值：状态码
    @RequestMapping(value = "/bindMachine", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String, String> bindMachineToUser(Long userId, String userMid) {
        log.info("绑定机器号");
        User u = userService.getUserById(userId);
        u.setUserMid(userMid);
        userService.getMid(u);
        Map<String, String> map = new HashMap<>();
        if (u != null) {
            map.put("status", "200");
            return map;
        }
        map.put("status", "400");
        return map;
    }

//  RESTFUL API
//  模块：用户模块
//  接口名：getBoundUser
//  返回值：状态码
    @RequestMapping(value = "/getBoundUser", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public List<String> getbounduser(Integer docId) {
        log.info("查询医生负责的病人");

        int count = 0;
        User users = userService.getselectDocPatient(docId);
        for (int i=0; i < users.getResponsible().size(); ++i) {
            ++count;
        }
        List<String> list = new ArrayList<>();
        list.add("BondUser");
        list.add(String.valueOf(users.getResponsible()));
        return list;
    }

}

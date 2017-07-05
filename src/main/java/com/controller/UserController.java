package com.controller;

import com.model.Sys;
import com.model.User;
import com.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
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
//  返回值：userID/Status都为Long
    @RequestMapping(value = "/doSignUp", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String, String> insertUser(@ModelAttribute User user) {
        log.info("注册");
        Long loginUser  =userService.getinsertUser(user);
        Map<String, String> result = new HashMap<String, String>();
        result.put("status", "200");
        result.put("userId", user.getId().toString());
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
            map.put("id", u.getId().toString());
            map.put("typeId", String.valueOf(u.getT_id()));
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
        map.put("userId", users.getId().toString());
        map.put("typeId", String.valueOf(users.getT_id()));
        map.put("name", users.getUserName());
        map.put("gender", String.valueOf(users.getUserGender()));
        map.put("email", users.getUserEmail());
        map.put("phone", users.getUserPhone());
        map.put("address", users.getUserAddress());
        map.put("time", String.valueOf(users.getTime()));
        map.put("comfort", String.valueOf(users.getComfort()));
        return map;
    }

}

//  RESTFUL API
//  模块：用户模块
//  接口名：changeProfile
//  返回值：状态码

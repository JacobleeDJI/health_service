package com.controller;

import com.model.User;
import com.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Abdullah
 * @Description:
 * @Version 1.0
 * @Date: Create in 下午1:51 2017/2/8
 * @Modified by
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private Logger log = Logger.getLogger(UserController.class);

    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model) {
        log.info("查询所有用户信息");
        List<User> list = userService.getAllUser();
        model.addAttribute("list", list);
        return "showUser";
    }

}

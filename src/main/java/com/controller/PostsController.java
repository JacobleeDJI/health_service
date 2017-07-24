package com.controller;

import com.dao.PostsDao;
import com.model.Posts;
import com.model.Sys;
import com.service.PostsService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by jacob on 2017/7/24.
 */
@RestController
@RequestMapping("/post")
public class PostsController {
    private Logger log = Logger.getLogger(UserController.class);

    @Resource
    private PostsService postsService;

    @RequestMapping(value = "/sendPosts", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String, String> getSendPosts(@ModelAttribute Posts posts) {
        log.info("发帖");
        int post = postsService.getsendPost(posts);
        Map<String, String> map = new HashMap<>();
        if (post != 0) {

                map.put("status", "200");
                return map;
        }
        map.put("status", "400");
        return map;
    }

}

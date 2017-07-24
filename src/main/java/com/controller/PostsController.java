package com.controller;

import com.dao.PostsDao;
import com.model.Posts;
import com.model.Sys;
import com.service.PostsService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;
import sun.java2d.pipe.SolidTextRenderer;

import javax.annotation.Resource;
import javax.print.DocFlavor;
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

    @RequestMapping(value = "/getPostDetail", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String, String> getPostDetail(Integer id) {
        Posts posts = postsService.sgetPostDetail(id);
        Map<String, String> map = new HashMap<>();
        map.put("status:", "200");
        map.put("id: ", String.valueOf(posts.getId()));
        map.put("title: ", posts.getTitle());
        map.put("author_id", String.valueOf(posts.getAuthor_id()));
        map.put("content", posts.getContent());
        map.put("image", posts.getImage());
        map.put("target_id", String.valueOf(posts.getTarget_id()));
        map.put("time", String.valueOf(posts.getTime()));
        map.put("type_id", String.valueOf(posts.getType_id()));
        return map;
    }
}

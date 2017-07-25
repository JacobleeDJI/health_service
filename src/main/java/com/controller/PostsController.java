package com.controller;

import com.dao.PostsDao;
import com.model.Posts;
import com.model.Responsible;
import com.model.Sys;
import com.service.PostsService;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.*;
import sun.java2d.pipe.SolidTextRenderer;

import javax.annotation.Resource;
import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    public  Map<String,List<Posts>> getPostDetail(Integer id) {
        List<Posts> posts = postsService.sgetPostDetail(id);
        Map<String, List<Posts>> map = new HashMap<String, List<Posts>>();
        map.put("PostsDetail", posts);
        return map;
    }

    @RequestMapping(value = "/getCommentList", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String,List<Posts>> getCommentList(Integer id, Integer startNumber, Integer limitNumber) {
        List<Posts> posts = postsService.sgetCommentList(id, startNumber, limitNumber);
        Map<String, List<Posts>> map = new HashMap<String, List<Posts>>();
        map.put("commentList", posts);
        return map;
    }

    @RequestMapping(value = "/getPostList", method = RequestMethod.GET, produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public Map<String,List<Posts>> getPostList(Integer startNumber, Integer limitNumber) {
        log.info("获取帖子列表");
        List<Posts> posts = postsService.sgetPostList(startNumber, limitNumber);
        Map<String, List<Posts>> map = new HashMap<String, List<Posts>>();
        map.put("PostsList", posts);
        return map;
    }
}

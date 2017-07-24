package com.controller;

import com.dao.PostsDao;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by jacob on 2017/7/24.
 */
@RestController
@RequestMapping("/message")
public class PostsController {
    private Logger log = Logger.getLogger(UserController.class);

    @Resource
    private PostsDao postsDao;
}

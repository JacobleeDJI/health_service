package com.service.impl;

import com.dao.PostsDao;
import com.model.Posts;
import com.service.PostsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by jacob on 2017/7/24.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PostsServiceImpl implements PostsService{

    @Resource
    private PostsDao postsDao;

    public int getsendPost(Posts posts) { return postsDao.sendPost(posts);}

    public Posts sgetPostDetail(Integer id) { return postsDao.getPostDetail(id); }
}

package com.service.impl;

import com.dao.PostsDao;
import com.model.Posts;
import com.service.PostsService;
import javafx.geometry.Pos;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jacob on 2017/7/24.
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class PostsServiceImpl implements PostsService{

    @Resource
    private PostsDao postsDao;

    public int getsendPost(Posts posts) { return postsDao.sendPost(posts);}

    public List<Posts> sgetPostDetail(Integer id) { return postsDao.getPostDetail(id); }

    public List<Posts> sgetCommentList(Integer id, Integer startNumber, Integer limitNumber) { return  postsDao.getCommentList(id, startNumber, limitNumber) ; }

    public List<Posts> sgetPostList(Integer startNumber, Integer limitNumber) { return postsDao.getPostList(startNumber, limitNumber); }
}

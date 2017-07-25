package com.service;

import com.model.Posts;
import javafx.geometry.Pos;

import java.util.List;

/**
 * Created by jacob on 2017/7/24.
 */
public interface PostsService {
    int getsendPost(Posts posts);
    List<Posts> sgetPostDetail(Integer id);
    List<Posts> sgetCommentList(Integer id, Integer startNumber, Integer limitNumber);
    List<Posts> sgetPostList(Integer startNumber, Integer limitNumber);
}

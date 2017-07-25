package com.dao;

import com.model.Posts;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jacob on 2017/7/24.
 */
@Repository
public interface PostsDao {
    int sendPost(Posts posts);//发帖
    List<Posts> getPostDetail(Integer id);
    List<Posts> getCommentList(@Param("target_id") Integer id, @Param("startNumber") Integer startNumber, @Param("limitNumber") Integer limitNumber);
    List<Posts> getPostList(@Param("startNumber") Integer startNumber, @Param("limitNumber") Integer limitNumber);
}

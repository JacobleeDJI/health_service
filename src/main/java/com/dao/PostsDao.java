package com.dao;

import com.model.Posts;
import org.springframework.stereotype.Repository;

/**
 * Created by jacob on 2017/7/24.
 */
@Repository
public interface PostsDao {
    int sendPost(Posts posts);//发帖
    Posts getPostDetail(Integer id);
}

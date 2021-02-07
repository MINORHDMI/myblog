package com.star.service;

import com.star.entity.Comment;

import java.util.List;

/**
 * @description: 博客评论业务层接口
 */
public interface CommentService {

    // 查询评论
    List<Comment> listCommentByBlogId(Long blogId);

    // 保存评论
    int saveComment(Comment comment);

    // 删除评论
    void deleteComment(Comment comment,Long id);

}
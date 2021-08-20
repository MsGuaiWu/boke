package com.chen.service;

import com.chen.model.domain.Article;
import com.github.pagehelper.PageInfo;
import com.chen.model.domain.Comment;

public interface ICommentService {
    // 获取文章下的评论
    public PageInfo<Comment> getComments(Integer aid, int page, int count);

    // 用户发表评论
    public void pushComment(Comment comment);
    // 根据主键删除文章
    public void deleteCommentWithId(int id);
}


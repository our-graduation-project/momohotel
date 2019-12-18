package com.xqr.momohotel.service;


import com.github.pagehelper.PageInfo;
import com.xqr.momohotel.model.Comments;

import java.util.List;

/**
 * @author whg
 * @date 2019/12/18 19:11
 **/
public interface CommentService {

    /**
     * 通过页码和每页大小查询评论
     * @param pageNum
     * @param limit
     * @return
     */
    PageInfo<Comments> searchComments(int pageNum, int limit);

    /**
     * 通过id查询评论
     * @param commentId
     * @return
     */
    Comments selectCommentById(int commentId);

    /**
     * 通过id删除评论
     * @param commentId
     * @return
     */
    int deleteComment(int commentId);

    /**
     * 添加评论
     * @param comment
     * @return
     */
    int addComment(Comments comment);

    /**
     * 搜寻
     * @return
     */
    List<Comments> selectCommentByUserName(String userName);
}

package com.xqr.momohotel.service.Impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xqr.momohotel.dao.CommentsMapper;
import com.xqr.momohotel.model.Comments;
import com.xqr.momohotel.model.CommentsExample;
import com.xqr.momohotel.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author whg
 * @date 2019/12/18 19:40
 **/
@Service
public class CommentServiceImpl implements CommentService {


    @Autowired
    private CommentsMapper commentsMapper;

    /**
     * 通过页码和每页大小查询评论
     *
     * @param pageNum
     * @param limit
     * @return
     */
    @Override
    public PageInfo<Comments> searchComments(int pageNum, int limit) {
        PageHelper.startPage(pageNum,limit);
        CommentsExample commentsExample = new CommentsExample();
        commentsExample.setOrderByClause("`comment_time` DESC");
        List<Comments> comments = commentsMapper.selectByExample(commentsExample);
        PageInfo<Comments> pageInfo = new PageInfo(comments,5);
        return pageInfo;
    }

    /**
     * 通过id查询评论
     *
     * @param commentId
     * @return
     */
    @Override
    public Comments selectCommentById(int commentId) {

        return commentsMapper.selectByPrimaryKey(commentId);
    }

    /**
     * 通过id删除评论
     *
     * @param commentId
     * @return
     */
    @Override
    public int deleteComment(int commentId) {
        return commentsMapper.deleteByPrimaryKey(commentId);
    }

    /**
     * 添加评论
     *
     * @param comment
     * @return
     */
    @Override
    public int addComment(Comments comment) {

        return commentsMapper.insert(comment);
    }

    /**
     * 搜寻评论(按时间降序)
     *
     * @param userName
     * @return
     */
    @Override
    public List<Comments> selectCommentByUserName(String userName) {
        CommentsExample commentsExample = new CommentsExample();
        commentsExample.setOrderByClause("`comment_time` DESC");
        commentsExample.or().andUserNameEqualTo(userName);
        List<Comments> comments = commentsMapper.selectByExample(commentsExample);
        return comments;
    }
}

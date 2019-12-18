package com.xqr.momohotel.service.Impl;

import com.xqr.momohotel.MomohotelApplication;
import com.xqr.momohotel.model.Comments;
import com.xqr.momohotel.service.CommentService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author whg
 * @date 2019/12/18 20:13
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = MomohotelApplication.class)
class CommentServiceImplTest {

    @Autowired
    private CommentService commentService;

    @Test
    void searchComments() {
        System.out.println(commentService.searchComments(0, 5).getList());
    }

    @Test
    void selectCommentById() {

        System.out.println(commentService.selectCommentById(16));
    }

    @Test
    void deleteComment() {

        System.out.println(commentService.deleteComment(16));
    }

    @Test
    void addComment() {

        for (int i = 0; i < 10; i++) {
            commentService.addComment(new Comments(i,"asdf"+i,"asdas"+i,i,"sdasdf"+i,"adf"+i ,new Date()));
        }

    }

    @Test
    void selectCommentByUserName() {
        System.out.println(commentService.selectCommentByUserName("sdasdf1"));
    }

    @Test
    void searchComments1() {

        List<Comments> list = commentService.searchComments(0, 5).getList();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }


}
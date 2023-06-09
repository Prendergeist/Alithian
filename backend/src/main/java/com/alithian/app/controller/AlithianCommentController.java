package com.alithian.app.controller;


import com.alithian.app.model.AlithianArticle;
import com.alithian.app.model.AlithianComment;
import com.alithian.app.service.IAlithianArticleService;
import com.alithian.app.service.IAlithianCommentService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api/comment/list")
public class AlithianCommentController {
    @Autowired
    private IAlithianCommentService  iAlithianCommentService;

    @PostMapping("/add")
    public Boolean addSysAttachment(@RequestBody AlithianComment body) {
        return iAlithianCommentService.add(body);
    }

}

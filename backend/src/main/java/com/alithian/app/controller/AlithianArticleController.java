package com.alithian.app.controller;


import com.alithian.app.model.AlithianArticle;
import com.alithian.app.service.IAlithianArticleService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;


@CrossOrigin
@RestController
@RequestMapping("/api/us/list")
public class AlithianArticleController {
    @Autowired
    private IAlithianArticleService sysAttachmentService;

    @PostMapping("/add")
    public Boolean addSysAttachment(@RequestBody AlithianArticle body) {
        return sysAttachmentService.add(body);
    }

    @GetMapping("/pages")
    public List<Map> pagesList(AlithianArticle body) {
        return sysAttachmentService.pagesList(body);
    }
    @GetMapping("/rand")
    public List<AlithianArticle> randQuery(AlithianArticle body) {
        return sysAttachmentService.randQuery(body);
    }
    @GetMapping("/lookup/{id}")
    public AlithianArticle lookupById(@PathVariable("id")String id) {
        return sysAttachmentService.lookupById(id);
    }
    @PostMapping("/upload")
    public String upload(@RequestPart("file") MultipartFile file) {
        return sysAttachmentService.upload(file);
    }

    @GetMapping("/show/{fileName}")
    public void show(@PathVariable("fileName") String fileName, HttpServletResponse response) throws FileNotFoundException {
        sysAttachmentService.show(response, fileName);
    }
}

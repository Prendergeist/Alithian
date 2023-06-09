package com.alithian.app.service;


import com.alithian.app.model.AlithianArticle;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

public interface IAlithianArticleService extends IService<AlithianArticle> {


    Boolean add(AlithianArticle body);


    List<Map> pagesList(AlithianArticle body);


    List<AlithianArticle> randQuery(AlithianArticle body);

    String upload(MultipartFile file);

    void show(HttpServletResponse response, String fileName) throws FileNotFoundException;

    AlithianArticle lookupById(String id);

}

package com.alithian.app.service;


import com.alithian.app.model.AlithianArticle;
import com.alithian.app.model.AlithianUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


public interface IAlithianUserService extends IService<AlithianUser> {


    Boolean add(AlithianUser body);

    AlithianUser login(AlithianUser body);
}

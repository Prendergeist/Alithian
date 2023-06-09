package com.alithian.app.service.impl;


import com.alithian.app.config.SimpleIdGenerator;
import com.alithian.app.mapper.AlithianArticleMapper;
import com.alithian.app.mapper.AlithianCommentMapper;
import com.alithian.app.model.AlithianArticle;
import com.alithian.app.service.IAlithianArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Calendar;
import java.util.List;
import java.util.Map;


@Service
public class AlithianArticleServiceImpl extends ServiceImpl<AlithianArticleMapper, AlithianArticle> implements IAlithianArticleService {

    @Value("${filepath}")
    private String filepath;
    @Autowired
    private SimpleIdGenerator simpleIdGenerator;
    @Autowired
    private AlithianCommentMapper alithianCommentMapper;


    @Override
    public Boolean add(AlithianArticle body) {
        body.setId(simpleIdGenerator.objectId());
        body.setTime(Calendar.getInstance().getTime());
        return baseMapper.insert(body) > 0;
    }


    @Override
    public List<Map> pagesList(AlithianArticle body) {
        List<Map> entityList = baseMapper.pagesList(body);
        return entityList;
    }

    @Override
    public List<AlithianArticle> randQuery(AlithianArticle body) {
        List<AlithianArticle> entityList = baseMapper.randQuery(body);
        return entityList;
    }

    @Override
    public String upload(MultipartFile file) {
        try {
            String id = simpleIdGenerator.objectId();
            String fName = id + "." + file.getOriginalFilename().split("\\.")[1];
            File f = new File(filepath + fName);
            file.transferTo(f);
            return fName;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    @Override
    public void show(HttpServletResponse response, String fileName) throws FileNotFoundException {

        File file = new File(filepath + fileName);
        if (!file.exists()) {
         return;
        }
        InputStream is = new FileInputStream(file);
        try {

            ServletOutputStream os = response.getOutputStream();
            byte[] buf = new byte[8 * 1024];
            int length = -1;
            while ((length = is.read(buf)) != -1) {
                os.write(buf, 0, length);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if (is!=null) {
                try {
                    is.close();
                } catch (IOException e) {
                }
            }
            }
        }


    @Override
    public AlithianArticle lookupById(String id) {
        AlithianArticle alithianArticle = baseMapper.selectById(id);
        alithianArticle.setComments(alithianCommentMapper.getListByArtId(alithianArticle.getId()));
        return alithianArticle;
    }
}

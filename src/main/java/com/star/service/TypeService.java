package com.star.service;

import com.star.entity.Type;
import com.star.queryvo.FirstPageBlog;

import java.util.List;


/**
 * @description: 文章分类业务层接口
 */
public interface TypeService {

    Type getType(Long id);

    List<Type>getAllType();

    List<Type>getAllTypeAndBlog();

    Type getTypeByName(String name);

    int saveType(Type type);

    int updateType(Type type);

    void deleteType(Long id);




}
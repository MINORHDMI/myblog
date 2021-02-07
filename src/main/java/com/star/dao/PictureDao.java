package com.star.dao;

import com.star.entity.Picture;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description: 照片墙持久层接口
 */
@Mapper
@Repository
public interface PictureDao {

    // 查询照片
    List<Picture> listPicture();

    // 获取照片
    Picture getPicture(Long id);

    // 添加照片
    int savePicture(Picture picture);

    // 修改照片
    int updatePicture(Picture picture);

    // 删除照片
    void deletePicture(Long id);

}
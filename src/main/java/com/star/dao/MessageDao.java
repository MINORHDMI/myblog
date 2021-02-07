package com.star.dao;

import com.star.entity.Message;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description: 留言持久层接口
 */
@Mapper
@Repository
public interface MessageDao {

    //查询父级留言
    List<Message> findByParentIdNull(@Param("ParentId") Long ParentId);

    //查询一级留言
    List<Message> findByParentIdNotNull(@Param("id") Long id);

    //查询二级以及所有子集留言
    List<Message> findByReplayId(@Param("childId") Long childId);

    //添加一个留言
    int saveMessage(Message message);

    //删除留言
    void deleteMessage(Long id);

}
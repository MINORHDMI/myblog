package com.star.dao;

import com.star.entity.FriendLink;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description: 友链持久层接口
 */
@Mapper
@Repository
public interface FriendLinkDao {

    // 查询所有友链
    List<FriendLink> listFriendLink();

    // 根据id查询友链
    FriendLink getFriendLink(Long id);

    // 根据网址查询友链
    FriendLink getFriendLinkByBlogaddress(String blogaddress);

    // 添加友链
    int saveFriendLink(FriendLink friendLink);

    // 编辑修改友链
    int updateFriendLink(FriendLink friendLink);

    // 删除友链
    void deleteFriendLink(Long id);

}
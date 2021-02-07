package com.star.service;

import com.star.entity.FriendLink;

import java.util.List;

/**
 * @description: 友链业务层接口
 */
public interface FriendLinkService {

    //查询所有友链
    List<FriendLink> listFriendLink();

    //根据id查询友链
    FriendLink getFriendLink(Long id);

    //根据网址查询友链
    FriendLink getFriendLinkByBlogaddress(String blogaddress);

    //友链新增
    int saveFriendLink(FriendLink friendLink);

    //编辑修改友链
    int updateFriendLink(FriendLink friendLink);

    //删除友链
    void deleteFriendLink(Long id);


}
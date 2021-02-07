package com.star.dao;

import com.star.entity.Blog;
import com.star.queryvo.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description: 博客持久层接口
 */
@Mapper
@Repository
public interface BlogDao {

    // 根据id获取博客
    ShowBlog getBlogById(Long id);

    // 获取所有博客
    List<BlogQuery> getAllBlogQuery();

    // 新增博客
    int saveBlog(Blog blog);

    // TODO: 2021/2/7
    // 修改博客  和数据库打交道  按理不能用VO
    int updateBlog(ShowBlog showBlog);

    // 删除博客
    void deleteBlog(Long id);

    // TODO: 2021/2/7
    // 根据标题、类型查找博客   Recommend没用上，修改方法名称
    List<BlogQuery> searchByTitleOrTypeOrRecommend(SearchBlog searchBlog);

    // 获取首页展示博客
    List<FirstPageBlog> getFirstPageBlog();

    // 获取首页推荐文章（4）设置t_blog.recommend = true
    List<RecommendBlog> getAllRecommendBlog();

    // 根据标题和内容搜索博客
    List<FirstPageBlog> getSearchBlog(String query);

    // 博客详情
    DetailedBlog getDetailedBlog(Long id);

    // 更新阅读数
    int updateViews(Long id);

    // 根据博客id查询出评论数量
    int getCommentCountById(Long id);

    // 根据分类查找博客
    List<FirstPageBlog> getByTypeId(Long typeId);

    // 统计博客总数
    Integer getBlogTotal();

    // 博客浏览总数
    Integer getBlogViewTotal();

    // 博客评论总数
    Integer getBlogCommentTotal();

    // 博客留言总数
    Integer getBlogMessageTotal();
}
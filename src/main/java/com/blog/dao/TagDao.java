package com.blog.dao;

import com.blog.entity.Tag;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author darren
 * TODO Test
 */
@Repository
public interface TagDao {
    /**
     * 查找标签
     */
    Tag findTag(@Param("name") String name);

    /**
     * 根据标签id查找标签
     */
    Tag findTagById(@Param("id") Integer id);

    /**
     * 查找所有标签
     */
    List<Tag> findAllTag();

    /**
     * 修改标签
     */
    void editTag(Tag tag);

    /**
     * 删除标签
     */
    void deleteTag(Integer id);

    /**
     * 新标签
     */
    void newTag(Tag tag);
}

package com.blog.dao;

import com.blog.entity.Tag;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author darren
 */
@Repository
public interface TagDao {
    /**
     * 查找标签
     */
    Tag findTag(String name);

    /**
     * 根据标签id查找标签
     */
    Tag findTagById(int id);

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
    void deleteTag(int id);

    /**
     * 新标签
     */
    void newTag(Tag tag);
}

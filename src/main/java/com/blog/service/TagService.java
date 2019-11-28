package com.blog.service;

import com.blog.entity.Tag;

import java.util.List;

public interface TagService {
    /**
     * 查找标签
     */
    Tag findTag(String name);

    /**
     * 根据标签id查找标签
     */
    Tag findTagById(Integer id);

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

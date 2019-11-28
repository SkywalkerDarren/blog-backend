package com.blog.service.impl;

import com.blog.dao.TagDao;
import com.blog.entity.Tag;
import com.blog.service.TagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TagService")
public class TagServiceImpl implements TagService {

    @Autowired
    private TagDao tagDao;

    @Override
    public Tag findTag(String name) {
        return tagDao.findTag(name);
    }

    @Override
    public Tag findTagById(Integer id) {
        return tagDao.findTagById(id);
    }

    @Override
    public List<Tag> findAllTag() {
        return tagDao.findAllTag();
    }

    @Override
    public void editTag(Tag tag) {
        tagDao.editTag(tag);
    }

    @Override
    public void deleteTag(Integer id) {
        tagDao.deleteTag(id);
    }

    @Override
    public void newTag(Tag tag) {
        tagDao.newTag(tag);
    }
}

package blog.dao;

import blog.entity.Blogger;

/**
 * @author darren
 */
public interface BloggerDao {
    /**
     * 查询博主信息
     */
    Blogger getBloggerData();
}

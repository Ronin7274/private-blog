package org.nuist.privateblogbackend.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.nuist.privateblogbackend.dao.pojo.Comment;
import org.springframework.stereotype.Repository;
@Repository
public interface CommentMapper extends BaseMapper<Comment> {
}

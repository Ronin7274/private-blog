package org.nuist.privateblogbackend.service;

import org.nuist.privateblogbackend.vo.Result;
import org.nuist.privateblogbackend.vo.TagVo;

import java.util.List;

public interface TagService {
    List<TagVo> findTagsByArticleId(Long articleId);

    Result hots(int limit);

    Result findAll();

    Result findAllDetail();

    Result findDetailById(Long id);
}

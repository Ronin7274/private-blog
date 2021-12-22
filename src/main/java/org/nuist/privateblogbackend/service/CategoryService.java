package org.nuist.privateblogbackend.service;

import org.nuist.privateblogbackend.vo.CategoryVo;
import org.nuist.privateblogbackend.vo.Result;

public interface CategoryService {
    CategoryVo findCategoryById(Long categoryId);

    Result findAll();

    Result findAllDetail();

    Result categoriesDetailById(Long id);
}

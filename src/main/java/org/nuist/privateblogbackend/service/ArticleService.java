package org.nuist.privateblogbackend.service;

import org.nuist.privateblogbackend.vo.ArticleVo;
import org.nuist.privateblogbackend.vo.Result;
import org.nuist.privateblogbackend.vo.params.ArticleParam;
import org.nuist.privateblogbackend.vo.params.PageParams;

public interface ArticleService {
    /**
     * 分页查询文章列表
     * @param pageParams
     * @return
     */
    Result listArticle(PageParams pageParams);

    /**
     * 最热文章
     * @param limit
     * @return
     */
    Result hotArticle(int limit);

    /**
     * 最新文章
     * @param limit
     * @return
     */
    Result newArticles(int limit);

    /**
     * 文章归档
     * @return
     */
    Result listArchives();

    ArticleVo findArticleById(Long id);

    Result publish(ArticleParam articleParam);
}

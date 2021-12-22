package org.nuist.privateblogbackend.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.nuist.privateblogbackend.dao.dos.Archives;
import org.nuist.privateblogbackend.dao.pojo.Article;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ArticleMapper extends BaseMapper<Article> {
    List<Archives> listArchives();

    IPage<Article> listArticle(Page<Article> page, Long categoryId, Long tagId, String year, String month);
}

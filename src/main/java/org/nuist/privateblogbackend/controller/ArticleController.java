package org.nuist.privateblogbackend.controller;

import org.nuist.privateblogbackend.service.ArticleService;
import org.nuist.privateblogbackend.vo.ArticleVo;
import org.nuist.privateblogbackend.vo.Result;
import org.nuist.privateblogbackend.vo.params.ArticleParam;
import org.nuist.privateblogbackend.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;


    @PostMapping
    public Result listArticle(@RequestBody PageParams pageParams){
      return articleService.listArticle(pageParams);
    }

    @PostMapping("hot")
    public Result hotArticle(){
        int limit=5;
        return articleService.hotArticle(limit);
    }

    @PostMapping("new")
    public Result newArticle(){
        int limit = 5;
        return articleService.newArticles(limit);
    }

    @PostMapping("listArchives")
    public Result listArchives(){
        return articleService.listArchives();
    }

    @PostMapping("view/{id}")
    public Result findArticleById(@PathVariable("id") Long id) {

        ArticleVo articleVo = articleService.findArticleById(id);
        return Result.success(articleVo);
    }

    @PostMapping("publish")
    public Result publish(@RequestBody ArticleParam articleParam){
        return articleService.publish(articleParam);
    }

}

package org.nuist.privateblogbackend.service;

import org.nuist.privateblogbackend.vo.Result;
import org.nuist.privateblogbackend.vo.params.CommentParam;

public interface CommentService {
    Result commentByArticleId(Long id);

    Result comment(CommentParam commentParam);

}

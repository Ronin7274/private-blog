package org.nuist.privateblogbackend.dao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleTag {
    private Long id;

    private Long articleId;

    private Long tagId;
}

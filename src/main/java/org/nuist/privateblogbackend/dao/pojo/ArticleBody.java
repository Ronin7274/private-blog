package org.nuist.privateblogbackend.dao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleBody {
    private Long id;
    private String content;
    private String contentHtml;
    private Long articleId;

}

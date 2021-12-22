package org.nuist.privateblogbackend.vo.params;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleBodyParam {
    private String content;

    private String contentHtml;
}

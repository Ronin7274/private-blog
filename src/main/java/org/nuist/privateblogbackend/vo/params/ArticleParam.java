package org.nuist.privateblogbackend.vo.params;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.nuist.privateblogbackend.vo.CategoryVo;
import org.nuist.privateblogbackend.vo.TagVo;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticleParam {

    private Long id;

    private ArticleBodyParam body;

    private CategoryVo category;

    private String summary;

    private List<TagVo> tags;

    private String title;

}

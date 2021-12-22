package org.nuist.privateblogbackend.vo.params;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageParams {

    private int page = 1;
    private int pageSize = 10;

    private Long categoryId;

    private Long tagId;

    private String year;

    private String month;
}

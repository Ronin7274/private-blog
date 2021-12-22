package org.nuist.privateblogbackend.dao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Category {
    private Long id;

    private String avatar;

    private String categoryName;

    private String description;
}

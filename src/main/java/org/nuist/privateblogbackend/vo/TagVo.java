package org.nuist.privateblogbackend.vo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TagVo {
    @JsonSerialize(using= ToStringSerializer.class)
    private Long id;

    private String tagName;

    private String avatar;
}

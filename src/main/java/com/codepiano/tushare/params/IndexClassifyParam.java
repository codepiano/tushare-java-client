package com.codepiano.tushare.params;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author codepiano
 * @date 2019-07-17T00:39:27.885822
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class IndexClassifyParam implements Param {

    /**
     * 可选
     * <p>
     * 指数代码
     */
    @JsonProperty(value = "index_code")
    private String indexCode;

    /**
     * 可选
     * <p>
     * 行业分级（L1/L2/L3）
     */
    @JsonProperty(value = "level")
    private String level;

    /**
     * 可选
     * <p>
     * 指数来源（SW申万）
     */
    @JsonProperty(value = "src")
    private String src;


}

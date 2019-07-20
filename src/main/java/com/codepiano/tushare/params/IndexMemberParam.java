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
 * @date 2019-07-17T00:39:27.877458
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class IndexMemberParam implements Param {

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
     * 股票代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 可选
     * <p>
     * 是否最新（默认为“Y是”）
     */
    @JsonProperty(value = "is_new")
    private String isNew;


}

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
 * @date 2019-07-17T00:39:28.018704
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ConceptDetailParam implements Param {

    /**
     * 可选
     * <p>
     * 概念分类ID （id来自概念股分类接口）
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * 可选
     * <p>
     * 股票代码 （以上参数二选一）
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;


}

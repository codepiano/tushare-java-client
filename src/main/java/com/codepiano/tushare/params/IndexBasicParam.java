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
 * @date 2019-07-17T00:39:27.887461
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class IndexBasicParam implements Param {

    /**
     * 必填
     * <p>
     * 交易所或服务商
     */
    @JsonProperty(value = "market")
    private String market;

    /**
     * 可选
     * <p>
     * 发布商
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /**
     * 可选
     * <p>
     * 指数类别
     */
    @JsonProperty(value = "category")
    private String category;


}

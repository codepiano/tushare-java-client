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
 * @date 2019-07-17T00:39:28.022380
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class FxObasicParam implements Param {

    /**
     * 可选
     * <p>
     * 交易商
     */
    @JsonProperty(value = "exchange")
    private String exchange;

    /**
     * 可选
     * <p>
     * 分类
     */
    @JsonProperty(value = "classify")
    private String classify;

    /**
     * 可选
     * <p>
     * TS代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;


}

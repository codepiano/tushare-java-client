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
 * @date 2019-07-17T00:39:27.918937
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class OptBasicParam implements Param {

    /**
     * 必填
     * <p>
     * 交易所代码 （包括上交所SSE等交易所）
     */
    @JsonProperty(value = "exchange")
    private String exchange;

    /**
     * 可选
     * <p>
     * 期权类型
     */
    @JsonProperty(value = "call_put")
    private String callPut;


}

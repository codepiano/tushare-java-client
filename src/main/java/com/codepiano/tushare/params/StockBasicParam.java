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
 * @date 2019-07-17T00:39:28.014944
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class StockBasicParam implements Param {

    /**
     * 可选
     * <p>
     * 是否沪深港通标的，N否 H沪股通 S深股通
     */
    @JsonProperty(value = "is_hs")
    private String isHs;

    /**
     * 可选
     * <p>
     * 上市状态： L上市 D退市 P暂停上市
     */
    @JsonProperty(value = "list_status")
    private String listStatus;

    /**
     * 可选
     * <p>
     * 交易所 SSE上交所 SZSE深交所 HKEX港交所(未上线)
     */
    @JsonProperty(value = "exchange")
    private String exchange;


}

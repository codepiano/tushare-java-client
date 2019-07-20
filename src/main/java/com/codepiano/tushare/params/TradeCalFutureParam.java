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
 * @date 2019-07-17T00:39:28.017931
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class TradeCalFutureParam implements Param {

    /**
     * 可选
     * <p>
     * 交易所 SSE上交所 SZSE深交所
     */
    @JsonProperty(value = "exchange")
    private String exchange;

    /**
     * 可选
     * <p>
     * 开始日期
     */
    @JsonProperty(value = "start_date")
    private String startDate;

    /**
     * 可选
     * <p>
     * 结束日期
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * 可选
     * <p>
     * 是否交易 '0'休市 '1'交易
     */
    @JsonProperty(value = "is_open")
    private Integer isOpen;


}

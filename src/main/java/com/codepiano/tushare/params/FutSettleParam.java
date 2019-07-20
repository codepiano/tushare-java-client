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
 * @date 2019-07-17T00:39:27.923824
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class FutSettleParam implements Param {

    /**
     * 可选
     * <p>
     * 交易日期 （trade_date/ts_code至少需要输入一个参数）
     */
    @JsonProperty(value = "trade_date")
    private String tradeDate;

    /**
     * 可选
     * <p>
     * 合约代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

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
     * 交易所代码
     */
    @JsonProperty(value = "exchange")
    private String exchange;


}

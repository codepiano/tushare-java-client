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
 * @date 2019-07-17T00:39:27.989141
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class StkHoldertradeParam implements Param {

    /**
     * 可选
     * <p>
     * TS股票代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 可选
     * <p>
     * 公告日期
     */
    @JsonProperty(value = "ann_date")
    private String annDate;

    /**
     * 可选
     * <p>
     * 公告开始日期
     */
    @JsonProperty(value = "start_date")
    private String startDate;

    /**
     * 可选
     * <p>
     * 公告结束日期
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * 可选
     * <p>
     * 交易类型IN增持DE减持
     */
    @JsonProperty(value = "trade_type")
    private String tradeType;

    /**
     * 可选
     * <p>
     * 股东类型C公司P个人G高管
     */
    @JsonProperty(value = "holder_type")
    private String holderType;


}

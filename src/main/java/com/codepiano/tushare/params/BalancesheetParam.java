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
 * @date 2019-07-17T00:39:27.990716
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class BalancesheetParam implements Param {

    /**
     * 必填
     * <p>
     * 股票代码
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
     * 报告期(每个季度最后一天的日期，比如20171231表示年报)
     */
    @JsonProperty(value = "period")
    private String period;

    /**
     * 可选
     * <p>
     * 报告类型：见下方详细说明
     */
    @JsonProperty(value = "report_type")
    private String reportType;

    /**
     * 可选
     * <p>
     * 公司类型：1一般工商业 2银行 3保险 4证券
     */
    @JsonProperty(value = "comp_type")
    private String compType;


}

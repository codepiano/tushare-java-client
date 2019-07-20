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
 * @date 2019-07-17T00:39:27.958941
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class FinaMainbzParam implements Param {

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
     * 报告期(每个季度最后一天的日期,比如20171231表示年报)
     */
    @JsonProperty(value = "period")
    private String period;

    /**
     * 可选
     * <p>
     * 类型：P按产品 D按地区（请输入大写字母P或者D）
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * 可选
     * <p>
     * 报告期开始日期
     */
    @JsonProperty(value = "start_date")
    private String startDate;

    /**
     * 可选
     * <p>
     * 报告期结束日期
     */
    @JsonProperty(value = "end_date")
    private String endDate;


}

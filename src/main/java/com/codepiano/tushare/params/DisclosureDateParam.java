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
 * @date 2019-07-17T00:39:28.005370
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class DisclosureDateParam implements Param {

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
     * 财报周期（比如20181231表示2018年年报，20180630表示中报)
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * 可选
     * <p>
     * 计划披露日期
     */
    @JsonProperty(value = "pre_date")
    private String preDate;

    /**
     * 可选
     * <p>
     * 实际披露日期
     */
    @JsonProperty(value = "actual_date")
    private String actualDate;


}

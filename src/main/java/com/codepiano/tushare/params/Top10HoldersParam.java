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
 * @date 2019-07-17T00:39:27.999356
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Top10HoldersParam implements Param {

    /**
     * 必填
     * <p>
     * TS代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 可选
     * <p>
     * 报告期
     */
    @JsonProperty(value = "period")
    private String period;

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

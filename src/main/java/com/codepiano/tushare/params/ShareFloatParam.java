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
 * @date 2019-07-17T00:39:27.998190
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ShareFloatParam implements Param {

    /**
     * 可选
     * <p>
     * TS股票代码（至少输入一个参数）
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 可选
     * <p>
     * 公告日期（日期格式：YYYYMMDD，下同）
     */
    @JsonProperty(value = "ann_date")
    private String annDate;

    /**
     * 可选
     * <p>
     * 解禁日期
     */
    @JsonProperty(value = "float_date")
    private String floatDate;

    /**
     * 可选
     * <p>
     * 解禁开始日期
     */
    @JsonProperty(value = "start_date")
    private String startDate;

    /**
     * 可选
     * <p>
     * 解禁结束日期
     */
    @JsonProperty(value = "end_date")
    private String endDate;


}

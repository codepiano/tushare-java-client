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
 * @date 2019-07-17T00:39:27.847855
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class TeleplayRecordParam implements Param {

    /**
     * 可选
     * <p>
     * 备案月份（YYYYMM）
     */
    @JsonProperty(value = "report_date")
    private String reportDate;

    /**
     * 可选
     * <p>
     * 备案开始月份（YYYYMM）
     */
    @JsonProperty(value = "start_date")
    private String startDate;

    /**
     * 可选
     * <p>
     * 备案结束月份（YYYYMM）
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * 可选
     * <p>
     * 备案机构
     */
    @JsonProperty(value = "org")
    private String org;

    /**
     * 可选
     * <p>
     * 电视剧名称
     */
    @JsonProperty(value = "name")
    private String name;


}

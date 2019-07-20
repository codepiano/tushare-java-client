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
 * @date 2019-07-17T00:39:28.010543
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class RepurchaseParam implements Param {

    /**
     * 可选
     * <p>
     * 公告日期（任意填参数，如果都不填，单次默认返回2000条）
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


}

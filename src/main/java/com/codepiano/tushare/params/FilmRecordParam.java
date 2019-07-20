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
 * @date 2019-07-17T00:39:27.855594
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class FilmRecordParam implements Param {

    /**
     * 可选
     * <p>
     * 公布日期 （至少输入一个参数，格式：YYYYMMDD，日期不连续，定期公布）
     */
    @JsonProperty(value = "ann_date")
    private String annDate;

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


}

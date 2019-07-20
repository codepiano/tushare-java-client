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
 * @date 2019-07-17T00:39:27.869886
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class TmtTwincomeParam implements Param {

    /**
     * 可选
     * <p>
     * 报告期
     */
    @JsonProperty(value = "date")
    private String date;

    /**
     * 必填
     * <p>
     * 产品代码
     */
    @JsonProperty(value = "item")
    private String item;

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

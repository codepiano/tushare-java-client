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
 * @date 2019-07-17T00:39:27.913846
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ShiborLprParam implements Param {

    /**
     * 可选
     * <p>
     * 日期 (日期输入格式：YYYYMMDD，下同)
     */
    @JsonProperty(value = "date")
    private String date;

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

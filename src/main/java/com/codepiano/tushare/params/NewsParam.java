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
 * @date 2019-07-17T00:39:27.844809
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class NewsParam implements Param {

    /**
     * 必填
     * <p>
     * 开始日期
     */
    @JsonProperty(value = "start_date")
    private String startDate;

    /**
     * 必填
     * <p>
     * 结束日期
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * 必填
     * <p>
     * 新闻来源 见下表
     */
    @JsonProperty(value = "src")
    private String src;


}

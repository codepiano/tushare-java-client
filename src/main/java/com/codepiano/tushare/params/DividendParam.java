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
 * @date 2019-07-17T00:39:27.968329
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class DividendParam implements Param {

    /**
     * 可选
     * <p>
     * TS代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 可选
     * <p>
     * 公告日
     */
    @JsonProperty(value = "ann_date")
    private String annDate;

    /**
     * 可选
     * <p>
     * 股权登记日期
     */
    @JsonProperty(value = "record_date")
    private String recordDate;

    /**
     * 可选
     * <p>
     * 除权除息日
     */
    @JsonProperty(value = "ex_date")
    private String exDate;

    /**
     * 可选
     * <p>
     * 实施公告日
     */
    @JsonProperty(value = "imp_ann_date")
    private String impAnnDate;


}

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
 * @date 2019-07-17T00:39:27.896174
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class FundDivParam implements Param {

    /**
     * 可选
     * <p>
     * 公告日（以下参数四选一）
     */
    @JsonProperty(value = "ann_date")
    private String annDate;

    /**
     * 可选
     * <p>
     * 除息日
     */
    @JsonProperty(value = "ex_date")
    private String exDate;

    /**
     * 可选
     * <p>
     * 派息日
     */
    @JsonProperty(value = "pay_date")
    private String payDate;

    /**
     * 可选
     * <p>
     * 基金代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;


}

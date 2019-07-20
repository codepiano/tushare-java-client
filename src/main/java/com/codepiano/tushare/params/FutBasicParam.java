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
 * @date 2019-07-17T00:39:27.928943
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class FutBasicParam implements Param {

    /**
     * 必填
     * <p>
     * 交易所代码 CFFEX-中金所 DCE-大商所 CZCE-郑商所 SHFE-上期所 INE-上海国际能源交易中心
     */
    @JsonProperty(value = "exchange")
    private String exchange;

    /**
     * 可选
     * <p>
     * 合约类型 (1 普通合约 2主力与连续合约 默认取全部)
     */
    @JsonProperty(value = "fut_type")
    private String futType;


}

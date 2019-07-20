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
 * @date 2019-07-17T00:39:27.984906
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class HsConstParam implements Param {

    /**
     * 必填
     * <p>
     * 类型SH沪股通SZ深股通
     */
    @JsonProperty(value = "hs_type")
    private String hsType;

    /**
     * 可选
     * <p>
     * 是否最新 1 是 0 否 (默认1)
     */
    @JsonProperty(value = "is_new")
    private String isNew;


}

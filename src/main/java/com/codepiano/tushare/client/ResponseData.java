package com.codepiano.tushare.client;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author codepiano
 * @date 2019-07-18 23:22
 */
@Getter
@Setter
@ToString
public class ResponseData {
    /**
     *
     */
    @JsonProperty("fields")
    private String[] fields;

    /**
     * 接口返回码，2002表示权限问题。
     */
    @JsonProperty("items")
    private Object[][] items;
}

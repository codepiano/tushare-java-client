package com.codepiano.tushare.params;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-08 01:34
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class TushareRequestParam {

    /**
     * 接口名称，比如stock_basic
     */
    @JsonProperty("api_name")
    private String apiName;

    /**
     * 用户唯一标识，可通过登录pro网站获取
     */
    private String token;

    /**
     * 接口参数，如daily接口中start_date和end_date
     */
    private Param param;

    /**
     * 字段列表，用于接口获取指定的字段，以逗号分隔，如"open,high,low,close"
     */
    private List<String> fields;
}

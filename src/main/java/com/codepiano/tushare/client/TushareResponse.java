package com.codepiano.tushare.client;

import com.codepiano.tushare.models.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-08 01:34
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class TushareResponse<T extends Model> {

    /**
     *
     */
    @JsonProperty("request_id")
    private String requestId;

    /**
     * 接口返回码，2002表示权限问题。
     */
    @JsonProperty("code")
    private int code;

    /**
     * 错误信息，比如“系统内部错误”，“没有权限”等
     */
    @JsonProperty("msg")
    private String msg;

    /**
     * 数据，data里包含fields和items字段，分别为字段和数据内容
     */
    @JsonProperty("data")
    private ResponseData data;

    /**
     * 组装对象
     */
    @JsonIgnore
    private List<T> dataList;
}

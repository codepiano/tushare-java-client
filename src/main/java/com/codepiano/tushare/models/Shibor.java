package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.814541
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Shibor implements Model {

    /**
     * date
     */
    public static final String DATE = "date";

    /**
     * on
     */
    public static final String ON = "on";

    /**
     * 1w
     */
    public static final String _1W = "1w";

    /**
     * 2w
     */
    public static final String _2W = "2w";

    /**
     * 1m
     */
    public static final String _1M = "1m";

    /**
     * 3m
     */
    public static final String _3M = "3m";

    /**
     * 6m
     */
    public static final String _6M = "6m";

    /**
     * 9m
     */
    public static final String _9M = "9m";

    /**
     * 1y
     */
    public static final String _1Y = "1y";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(DATE, ON, _1W, _2W, _1M, _3M, _6M, _9M, _1Y);

    /**
     * 日期
     */
    @JsonProperty(value = "date")
    private String date;

    /**
     * 隔夜
     */
    @JsonProperty(value = "on")
    private Float on;

    /**
     * 1周
     */
    @JsonProperty(value = "1w")
    private Float _1w;

    /**
     * 2周
     */
    @JsonProperty(value = "2w")
    private Float _2w;

    /**
     * 1个月
     */
    @JsonProperty(value = "1m")
    private Float _1m;

    /**
     * 3个月
     */
    @JsonProperty(value = "3m")
    private Float _3m;

    /**
     * 6个月
     */
    @JsonProperty(value = "6m")
    private Float _6m;

    /**
     * 9个月
     */
    @JsonProperty(value = "9m")
    private Float _9m;

    /**
     * 1年
     */
    @JsonProperty(value = "1y")
    private Float _1y;


    /**
     * init by array
     */
    public static Shibor init(String[] fields, Object[] item) {
        Shibor shibor = new Shibor();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case DATE:
                    shibor.setDate((String) item[i]);
                    break;
                case ON:
                    shibor.setOn((Float) item[i]);
                    break;
                case _1W:
                    shibor.set_1w((Float) item[i]);
                    break;
                case _2W:
                    shibor.set_2w((Float) item[i]);
                    break;
                case _1M:
                    shibor.set_1m((Float) item[i]);
                    break;
                case _3M:
                    shibor.set_3m((Float) item[i]);
                    break;
                case _6M:
                    shibor.set_6m((Float) item[i]);
                    break;
                case _9M:
                    shibor.set_9m((Float) item[i]);
                    break;
                case _1Y:
                    shibor.set_1y((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return shibor;
    }

}

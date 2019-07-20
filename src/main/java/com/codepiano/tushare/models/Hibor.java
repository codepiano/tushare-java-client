package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.811775
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Hibor implements Model {

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
     * 2m
     */
    public static final String _2M = "2m";

    /**
     * 3m
     */
    public static final String _3M = "3m";

    /**
     * 6m
     */
    public static final String _6M = "6m";

    /**
     * 12m
     */
    public static final String _12M = "12m";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(DATE, ON, _1W, _2W, _1M, _2M, _3M, _6M, _12M);

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
     * 2个月
     */
    @JsonProperty(value = "2m")
    private Float _2m;

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
     * 12个月
     */
    @JsonProperty(value = "12m")
    private Float _12m;


    /**
     * init by array
     */
    public static Hibor init(String[] fields, Object[] item) {
        Hibor hibor = new Hibor();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case DATE:
                    hibor.setDate((String) item[i]);
                    break;
                case ON:
                    hibor.setOn((Float) item[i]);
                    break;
                case _1W:
                    hibor.set_1w((Float) item[i]);
                    break;
                case _2W:
                    hibor.set_2w((Float) item[i]);
                    break;
                case _1M:
                    hibor.set_1m((Float) item[i]);
                    break;
                case _2M:
                    hibor.set_2m((Float) item[i]);
                    break;
                case _3M:
                    hibor.set_3m((Float) item[i]);
                    break;
                case _6M:
                    hibor.set_6m((Float) item[i]);
                    break;
                case _12M:
                    hibor.set_12m((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return hibor;
    }

}

package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.812760
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Libor implements Model {

    /**
     * date
     */
    public static final String DATE = "date";

    /**
     * curr_type
     */
    public static final String CURR_TYPE = "curr_type";

    /**
     * on
     */
    public static final String ON = "on";

    /**
     * 1w
     */
    public static final String _1W = "1w";

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
    public static final List<String> FIELDS = List.of(DATE, CURR_TYPE, ON, _1W, _1M, _2M, _3M, _6M, _12M);

    /**
     * 日期
     */
    @JsonProperty(value = "date")
    private String date;

    /**
     * 货币
     */
    @JsonProperty(value = "curr_type")
    private String currType;

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
    public static Libor init(String[] fields, Object[] item) {
        Libor libor = new Libor();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case DATE:
                    libor.setDate((String) item[i]);
                    break;
                case CURR_TYPE:
                    libor.setCurrType((String) item[i]);
                    break;
                case ON:
                    libor.setOn((Float) item[i]);
                    break;
                case _1W:
                    libor.set_1w((Float) item[i]);
                    break;
                case _1M:
                    libor.set_1m((Float) item[i]);
                    break;
                case _2M:
                    libor.set_2m((Float) item[i]);
                    break;
                case _3M:
                    libor.set_3m((Float) item[i]);
                    break;
                case _6M:
                    libor.set_6m((Float) item[i]);
                    break;
                case _12M:
                    libor.set_12m((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return libor;
    }

}

package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.854790
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FxObasic implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * name
     */
    public static final String NAME = "name";

    /**
     * classify
     */
    public static final String CLASSIFY = "classify";

    /**
     * exchange
     */
    public static final String EXCHANGE = "exchange";

    /**
     * min_unit
     */
    public static final String MIN_UNIT = "min_unit";

    /**
     * max_unit
     */
    public static final String MAX_UNIT = "max_unit";

    /**
     * pip
     */
    public static final String PIP = "pip";

    /**
     * pip_cost
     */
    public static final String PIP_COST = "pip_cost";

    /**
     * traget_spread
     */
    public static final String TRAGET_SPREAD = "traget_spread";

    /**
     * min_stop_distance
     */
    public static final String MIN_STOP_DISTANCE = "min_stop_distance";

    /**
     * trading_hours
     */
    public static final String TRADING_HOURS = "trading_hours";

    /**
     * break_time
     */
    public static final String BREAK_TIME = "break_time";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, NAME, CLASSIFY, EXCHANGE, MIN_UNIT, MAX_UNIT, PIP, PIP_COST, TRAGET_SPREAD, MIN_STOP_DISTANCE, TRADING_HOURS, BREAK_TIME);

    /**
     * 外汇代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 名称
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * 分类
     */
    @JsonProperty(value = "classify")
    private String classify;

    /**
     * 交易商
     */
    @JsonProperty(value = "exchange")
    private String exchange;

    /**
     * 最小交易单位
     */
    @JsonProperty(value = "min_unit")
    private Float minUnit;

    /**
     * 最大交易单位
     */
    @JsonProperty(value = "max_unit")
    private Float maxUnit;

    /**
     * 最大交易单位
     */
    @JsonProperty(value = "pip")
    private Float pip;

    /**
     * 点值
     */
    @JsonProperty(value = "pip_cost")
    private Float pipCost;

    /**
     * 目标差价
     */
    @JsonProperty(value = "traget_spread")
    private Float tragetSpread;

    /**
     * 最小止损距离（点子）
     */
    @JsonProperty(value = "min_stop_distance")
    private Float minStopDistance;

    /**
     * 交易时间
     */
    @JsonProperty(value = "trading_hours")
    private String tradingHours;

    /**
     * 休市时间
     */
    @JsonProperty(value = "break_time")
    private String breakTime;


    /**
     * init by array
     */
    public static FxObasic init(String[] fields, Object[] item) {
        FxObasic fxObasic = new FxObasic();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    fxObasic.setTsCode((String) item[i]);
                    break;
                case NAME:
                    fxObasic.setName((String) item[i]);
                    break;
                case CLASSIFY:
                    fxObasic.setClassify((String) item[i]);
                    break;
                case EXCHANGE:
                    fxObasic.setExchange((String) item[i]);
                    break;
                case MIN_UNIT:
                    fxObasic.setMinUnit((Float) item[i]);
                    break;
                case MAX_UNIT:
                    fxObasic.setMaxUnit((Float) item[i]);
                    break;
                case PIP:
                    fxObasic.setPip((Float) item[i]);
                    break;
                case PIP_COST:
                    fxObasic.setPipCost((Float) item[i]);
                    break;
                case TRAGET_SPREAD:
                    fxObasic.setTragetSpread((Float) item[i]);
                    break;
                case MIN_STOP_DISTANCE:
                    fxObasic.setMinStopDistance((Float) item[i]);
                    break;
                case TRADING_HOURS:
                    fxObasic.setTradingHours((String) item[i]);
                    break;
                case BREAK_TIME:
                    fxObasic.setBreakTime((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return fxObasic;
    }

}

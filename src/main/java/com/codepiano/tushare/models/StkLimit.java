package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.823260
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class StkLimit implements Model {

    /**
     * trade_date
     */
    public static final String TRADE_DATE = "trade_date";

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * pre_close
     */
    public static final String PRE_CLOSE = "pre_close";

    /**
     * up_limit
     */
    public static final String UP_LIMIT = "up_limit";

    /**
     * down_limit
     */
    public static final String DOWN_LIMIT = "down_limit";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TRADE_DATE, TS_CODE, PRE_CLOSE, UP_LIMIT, DOWN_LIMIT);

    /**
     * 交易日期
     */
    @JsonProperty(value = "trade_date")
    private String tradeDate;

    /**
     * TS股票代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 昨日收盘价
     */
    @JsonProperty(value = "pre_close")
    private Float preClose;

    /**
     * 涨停价
     */
    @JsonProperty(value = "up_limit")
    private Float upLimit;

    /**
     * 跌停价
     */
    @JsonProperty(value = "down_limit")
    private Float downLimit;


    /**
     * init by array
     */
    public static StkLimit init(String[] fields, Object[] item) {
        StkLimit stkLimit = new StkLimit();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TRADE_DATE:
                    stkLimit.setTradeDate((String) item[i]);
                    break;
                case TS_CODE:
                    stkLimit.setTsCode((String) item[i]);
                    break;
                case PRE_CLOSE:
                    stkLimit.setPreClose((Float) item[i]);
                    break;
                case UP_LIMIT:
                    stkLimit.setUpLimit((Float) item[i]);
                    break;
                case DOWN_LIMIT:
                    stkLimit.setDownLimit((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return stkLimit;
    }

}

package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.853203
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class TradeCalFuture implements Model {

    /**
     * exchange
     */
    public static final String EXCHANGE = "exchange";

    /**
     * cal_date
     */
    public static final String CAL_DATE = "cal_date";

    /**
     * is_open
     */
    public static final String IS_OPEN = "is_open";

    /**
     * pretrade_date
     */
    public static final String PRETRADE_DATE = "pretrade_date";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(EXCHANGE, CAL_DATE, IS_OPEN, PRETRADE_DATE);

    /**
     * 交易所 SSE上交所 SZSE深交所
     */
    @JsonProperty(value = "exchange")
    private String exchange;

    /**
     * 日历日期
     */
    @JsonProperty(value = "cal_date")
    private String calDate;

    /**
     * 是否交易 0休市 1交易
     */
    @JsonProperty(value = "is_open")
    private Integer isOpen;

    /**
     * 上一个交易日
     */
    @JsonProperty(value = "pretrade_date")
    private String pretradeDate;


    /**
     * init by array
     */
    public static TradeCalFuture init(String[] fields, Object[] item) {
        TradeCalFuture tradeCal = new TradeCalFuture();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case EXCHANGE:
                    tradeCal.setExchange((String) item[i]);
                    break;
                case CAL_DATE:
                    tradeCal.setCalDate((String) item[i]);
                    break;
                case IS_OPEN:
                    tradeCal.setIsOpen((Integer) item[i]);
                    break;
                case PRETRADE_DATE:
                    tradeCal.setPretradeDate((String) item[i]);
                    break;
                default:
            }
        }
        return tradeCal;
    }

}

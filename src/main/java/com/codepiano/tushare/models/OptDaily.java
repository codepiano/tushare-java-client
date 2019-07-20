package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.815807
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class OptDaily implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * trade_date
     */
    public static final String TRADE_DATE = "trade_date";

    /**
     * exchange
     */
    public static final String EXCHANGE = "exchange";

    /**
     * pre_settle
     */
    public static final String PRE_SETTLE = "pre_settle";

    /**
     * pre_close
     */
    public static final String PRE_CLOSE = "pre_close";

    /**
     * open
     */
    public static final String OPEN = "open";

    /**
     * high
     */
    public static final String HIGH = "high";

    /**
     * low
     */
    public static final String LOW = "low";

    /**
     * close
     */
    public static final String CLOSE = "close";

    /**
     * settle
     */
    public static final String SETTLE = "settle";

    /**
     * vol
     */
    public static final String VOL = "vol";

    /**
     * amount
     */
    public static final String AMOUNT = "amount";

    /**
     * oi
     */
    public static final String OI = "oi";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, TRADE_DATE, EXCHANGE, PRE_SETTLE, PRE_CLOSE, OPEN, HIGH, LOW, CLOSE, SETTLE, VOL, AMOUNT, OI);

    /**
     * TS代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 交易日期
     */
    @JsonProperty(value = "trade_date")
    private String tradeDate;

    /**
     * 交易市场
     */
    @JsonProperty(value = "exchange")
    private String exchange;

    /**
     * 昨结算价
     */
    @JsonProperty(value = "pre_settle")
    private Float preSettle;

    /**
     * 前收盘价
     */
    @JsonProperty(value = "pre_close")
    private Float preClose;

    /**
     * 开盘价
     */
    @JsonProperty(value = "open")
    private Float open;

    /**
     * 最高价
     */
    @JsonProperty(value = "high")
    private Float high;

    /**
     * 最低价
     */
    @JsonProperty(value = "low")
    private Float low;

    /**
     * 收盘价
     */
    @JsonProperty(value = "close")
    private Float close;

    /**
     * 结算价
     */
    @JsonProperty(value = "settle")
    private Float settle;

    /**
     * 成交量(手)
     */
    @JsonProperty(value = "vol")
    private Float vol;

    /**
     * 成交金额(万元)
     */
    @JsonProperty(value = "amount")
    private Float amount;

    /**
     * 持仓量(手)
     */
    @JsonProperty(value = "oi")
    private Float oi;


    /**
     * init by array
     */
    public static OptDaily init(String[] fields, Object[] item) {
        OptDaily optDaily = new OptDaily();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    optDaily.setTsCode((String) item[i]);
                    break;
                case TRADE_DATE:
                    optDaily.setTradeDate((String) item[i]);
                    break;
                case EXCHANGE:
                    optDaily.setExchange((String) item[i]);
                    break;
                case PRE_SETTLE:
                    optDaily.setPreSettle((Float) item[i]);
                    break;
                case PRE_CLOSE:
                    optDaily.setPreClose((Float) item[i]);
                    break;
                case OPEN:
                    optDaily.setOpen((Float) item[i]);
                    break;
                case HIGH:
                    optDaily.setHigh((Float) item[i]);
                    break;
                case LOW:
                    optDaily.setLow((Float) item[i]);
                    break;
                case CLOSE:
                    optDaily.setClose((Float) item[i]);
                    break;
                case SETTLE:
                    optDaily.setSettle((Float) item[i]);
                    break;
                case VOL:
                    optDaily.setVol((Float) item[i]);
                    break;
                case AMOUNT:
                    optDaily.setAmount((Float) item[i]);
                    break;
                case OI:
                    optDaily.setOi((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return optDaily;
    }

}

package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.854201
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FxDaily implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * trade_date
     */
    public static final String TRADE_DATE = "trade_date";

    /**
     * bid_open
     */
    public static final String BID_OPEN = "bid_open";

    /**
     * bid_close
     */
    public static final String BID_CLOSE = "bid_close";

    /**
     * bid_high
     */
    public static final String BID_HIGH = "bid_high";

    /**
     * bid_low
     */
    public static final String BID_LOW = "bid_low";

    /**
     * ask_open
     */
    public static final String ASK_OPEN = "ask_open";

    /**
     * ask_close
     */
    public static final String ASK_CLOSE = "ask_close";

    /**
     * ask_high
     */
    public static final String ASK_HIGH = "ask_high";

    /**
     * ask_low
     */
    public static final String ASK_LOW = "ask_low";

    /**
     * tick_qty
     */
    public static final String TICK_QTY = "tick_qty";

    /**
     * exchange
     */
    public static final String EXCHANGE = "exchange";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, TRADE_DATE, BID_OPEN, BID_CLOSE, BID_HIGH, BID_LOW, ASK_OPEN, ASK_CLOSE, ASK_HIGH, ASK_LOW, TICK_QTY, EXCHANGE);

    /**
     * 外汇代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 交易日期
     */
    @JsonProperty(value = "trade_date")
    private String tradeDate;

    /**
     * 买入开盘价
     */
    @JsonProperty(value = "bid_open")
    private Float bidOpen;

    /**
     * 买入收盘价
     */
    @JsonProperty(value = "bid_close")
    private Float bidClose;

    /**
     * 买入最高价
     */
    @JsonProperty(value = "bid_high")
    private Float bidHigh;

    /**
     * 买入最低价
     */
    @JsonProperty(value = "bid_low")
    private Float bidLow;

    /**
     * 卖出开盘价
     */
    @JsonProperty(value = "ask_open")
    private Float askOpen;

    /**
     * 卖出收盘价
     */
    @JsonProperty(value = "ask_close")
    private Float askClose;

    /**
     * 卖出最高价
     */
    @JsonProperty(value = "ask_high")
    private Float askHigh;

    /**
     * 卖出最低价
     */
    @JsonProperty(value = "ask_low")
    private Float askLow;

    /**
     * 报价笔数
     */
    @JsonProperty(value = "tick_qty")
    private Integer tickQty;

    /**
     * 交易商
     */
    @JsonProperty(value = "exchange")
    private String exchange;


    /**
     * init by array
     */
    public static FxDaily init(String[] fields, Object[] item) {
        FxDaily fxDaily = new FxDaily();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    fxDaily.setTsCode((String) item[i]);
                    break;
                case TRADE_DATE:
                    fxDaily.setTradeDate((String) item[i]);
                    break;
                case BID_OPEN:
                    fxDaily.setBidOpen((Float) item[i]);
                    break;
                case BID_CLOSE:
                    fxDaily.setBidClose((Float) item[i]);
                    break;
                case BID_HIGH:
                    fxDaily.setBidHigh((Float) item[i]);
                    break;
                case BID_LOW:
                    fxDaily.setBidLow((Float) item[i]);
                    break;
                case ASK_OPEN:
                    fxDaily.setAskOpen((Float) item[i]);
                    break;
                case ASK_CLOSE:
                    fxDaily.setAskClose((Float) item[i]);
                    break;
                case ASK_HIGH:
                    fxDaily.setAskHigh((Float) item[i]);
                    break;
                case ASK_LOW:
                    fxDaily.setAskLow((Float) item[i]);
                    break;
                case TICK_QTY:
                    fxDaily.setTickQty((Integer) item[i]);
                    break;
                case EXCHANGE:
                    fxDaily.setExchange((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return fxDaily;
    }

}

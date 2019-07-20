package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.828844
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class TopList implements Model {

    /**
     * trade_date
     */
    public static final String TRADE_DATE = "trade_date";

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * name
     */
    public static final String NAME = "name";

    /**
     * close
     */
    public static final String CLOSE = "close";

    /**
     * pct_change
     */
    public static final String PCT_CHANGE = "pct_change";

    /**
     * turnover_rate
     */
    public static final String TURNOVER_RATE = "turnover_rate";

    /**
     * amount
     */
    public static final String AMOUNT = "amount";

    /**
     * l_sell
     */
    public static final String L_SELL = "l_sell";

    /**
     * l_buy
     */
    public static final String L_BUY = "l_buy";

    /**
     * l_amount
     */
    public static final String L_AMOUNT = "l_amount";

    /**
     * net_amount
     */
    public static final String NET_AMOUNT = "net_amount";

    /**
     * net_rate
     */
    public static final String NET_RATE = "net_rate";

    /**
     * amount_rate
     */
    public static final String AMOUNT_RATE = "amount_rate";

    /**
     * float_values
     */
    public static final String FLOAT_VALUES = "float_values";

    /**
     * reason
     */
    public static final String REASON = "reason";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TRADE_DATE, TS_CODE, NAME, CLOSE, PCT_CHANGE, TURNOVER_RATE, AMOUNT, L_SELL, L_BUY, L_AMOUNT, NET_AMOUNT, NET_RATE, AMOUNT_RATE, FLOAT_VALUES, REASON);

    /**
     * 交易日期
     */
    @JsonProperty(value = "trade_date")
    private String tradeDate;

    /**
     * TS代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 名称
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * 收盘价
     */
    @JsonProperty(value = "close")
    private Float close;

    /**
     * 涨跌幅
     */
    @JsonProperty(value = "pct_change")
    private Float pctChange;

    /**
     * 换手率
     */
    @JsonProperty(value = "turnover_rate")
    private Float turnoverRate;

    /**
     * 总成交额
     */
    @JsonProperty(value = "amount")
    private Float amount;

    /**
     * 龙虎榜卖出额
     */
    @JsonProperty(value = "l_sell")
    private Float lSell;

    /**
     * 龙虎榜买入额
     */
    @JsonProperty(value = "l_buy")
    private Float lBuy;

    /**
     * 龙虎榜成交额
     */
    @JsonProperty(value = "l_amount")
    private Float lAmount;

    /**
     * 龙虎榜净买入额
     */
    @JsonProperty(value = "net_amount")
    private Float netAmount;

    /**
     * 龙虎榜净买额占比
     */
    @JsonProperty(value = "net_rate")
    private Float netRate;

    /**
     * 龙虎榜成交额占比
     */
    @JsonProperty(value = "amount_rate")
    private Float amountRate;

    /**
     * 当日流通市值
     */
    @JsonProperty(value = "float_values")
    private Float floatValues;

    /**
     * 上榜理由
     */
    @JsonProperty(value = "reason")
    private String reason;


    /**
     * init by array
     */
    public static TopList init(String[] fields, Object[] item) {
        TopList topList = new TopList();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TRADE_DATE:
                    topList.setTradeDate((String) item[i]);
                    break;
                case TS_CODE:
                    topList.setTsCode((String) item[i]);
                    break;
                case NAME:
                    topList.setName((String) item[i]);
                    break;
                case CLOSE:
                    topList.setClose((Float) item[i]);
                    break;
                case PCT_CHANGE:
                    topList.setPctChange((Float) item[i]);
                    break;
                case TURNOVER_RATE:
                    topList.setTurnoverRate((Float) item[i]);
                    break;
                case AMOUNT:
                    topList.setAmount((Float) item[i]);
                    break;
                case L_SELL:
                    topList.setLSell((Float) item[i]);
                    break;
                case L_BUY:
                    topList.setLBuy((Float) item[i]);
                    break;
                case L_AMOUNT:
                    topList.setLAmount((Float) item[i]);
                    break;
                case NET_AMOUNT:
                    topList.setNetAmount((Float) item[i]);
                    break;
                case NET_RATE:
                    topList.setNetRate((Float) item[i]);
                    break;
                case AMOUNT_RATE:
                    topList.setAmountRate((Float) item[i]);
                    break;
                case FLOAT_VALUES:
                    topList.setFloatValues((Float) item[i]);
                    break;
                case REASON:
                    topList.setReason((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return topList;
    }

}

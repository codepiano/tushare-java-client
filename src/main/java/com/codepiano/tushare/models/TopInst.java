package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.828037
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class TopInst implements Model {

    /**
     * trade_date
     */
    public static final String TRADE_DATE = "trade_date";

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * exalter
     */
    public static final String EXALTER = "exalter";

    /**
     * buy
     */
    public static final String BUY = "buy";

    /**
     * buy_rate
     */
    public static final String BUY_RATE = "buy_rate";

    /**
     * sell
     */
    public static final String SELL = "sell";

    /**
     * sell_rate
     */
    public static final String SELL_RATE = "sell_rate";

    /**
     * net_buy
     */
    public static final String NET_BUY = "net_buy";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TRADE_DATE, TS_CODE, EXALTER, BUY, BUY_RATE, SELL, SELL_RATE, NET_BUY);

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
     * 营业部名称
     */
    @JsonProperty(value = "exalter")
    private String exalter;

    /**
     * 买入额（万）
     */
    @JsonProperty(value = "buy")
    private Float buy;

    /**
     * 买入占总成交比例
     */
    @JsonProperty(value = "buy_rate")
    private Float buyRate;

    /**
     * 卖出额（万）
     */
    @JsonProperty(value = "sell")
    private Float sell;

    /**
     * 卖出占总成交比例
     */
    @JsonProperty(value = "sell_rate")
    private Float sellRate;

    /**
     * 净成交额（万）
     */
    @JsonProperty(value = "net_buy")
    private Float netBuy;


    /**
     * init by array
     */
    public static TopInst init(String[] fields, Object[] item) {
        TopInst topInst = new TopInst();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TRADE_DATE:
                    topInst.setTradeDate((String) item[i]);
                    break;
                case TS_CODE:
                    topInst.setTsCode((String) item[i]);
                    break;
                case EXALTER:
                    topInst.setExalter((String) item[i]);
                    break;
                case BUY:
                    topInst.setBuy((Float) item[i]);
                    break;
                case BUY_RATE:
                    topInst.setBuyRate((Float) item[i]);
                    break;
                case SELL:
                    topInst.setSell((Float) item[i]);
                    break;
                case SELL_RATE:
                    topInst.setSellRate((Float) item[i]);
                    break;
                case NET_BUY:
                    topInst.setNetBuy((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return topInst;
    }

}

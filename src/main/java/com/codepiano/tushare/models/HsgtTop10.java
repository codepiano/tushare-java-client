package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.826798
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class HsgtTop10 implements Model {

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
     * change
     */
    public static final String CHANGE = "change";

    /**
     * rank
     */
    public static final String RANK = "rank";

    /**
     * market_type
     */
    public static final String MARKET_TYPE = "market_type";

    /**
     * amount
     */
    public static final String AMOUNT = "amount";

    /**
     * net_amount
     */
    public static final String NET_AMOUNT = "net_amount";

    /**
     * buy
     */
    public static final String BUY = "buy";

    /**
     * sell
     */
    public static final String SELL = "sell";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TRADE_DATE, TS_CODE, NAME, CLOSE, CHANGE, RANK, MARKET_TYPE, AMOUNT, NET_AMOUNT, BUY, SELL);

    /**
     * 交易日期
     */
    @JsonProperty(value = "trade_date")
    private String tradeDate;

    /**
     * 股票代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 股票名称
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * 收盘价
     */
    @JsonProperty(value = "close")
    private Float close;

    /**
     * 涨跌额
     */
    @JsonProperty(value = "change")
    private Float change;

    /**
     * 资金排名
     */
    @JsonProperty(value = "rank")
    private Integer rank;

    /**
     * 市场类型（1：沪市 3：深市）
     */
    @JsonProperty(value = "market_type")
    private String marketType;

    /**
     * 成交金额（元）
     */
    @JsonProperty(value = "amount")
    private Float amount;

    /**
     * 净成交金额（元）
     */
    @JsonProperty(value = "net_amount")
    private Float netAmount;

    /**
     * 买入金额（元）
     */
    @JsonProperty(value = "buy")
    private Float buy;

    /**
     * 卖出金额（元）
     */
    @JsonProperty(value = "sell")
    private Float sell;


    /**
     * init by array
     */
    public static HsgtTop10 init(String[] fields, Object[] item) {
        HsgtTop10 hsgtTop10 = new HsgtTop10();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TRADE_DATE:
                    hsgtTop10.setTradeDate((String) item[i]);
                    break;
                case TS_CODE:
                    hsgtTop10.setTsCode((String) item[i]);
                    break;
                case NAME:
                    hsgtTop10.setName((String) item[i]);
                    break;
                case CLOSE:
                    hsgtTop10.setClose((Float) item[i]);
                    break;
                case CHANGE:
                    hsgtTop10.setChange((Float) item[i]);
                    break;
                case RANK:
                    hsgtTop10.setRank((Integer) item[i]);
                    break;
                case MARKET_TYPE:
                    hsgtTop10.setMarketType((String) item[i]);
                    break;
                case AMOUNT:
                    hsgtTop10.setAmount((Float) item[i]);
                    break;
                case NET_AMOUNT:
                    hsgtTop10.setNetAmount((Float) item[i]);
                    break;
                case BUY:
                    hsgtTop10.setBuy((Float) item[i]);
                    break;
                case SELL:
                    hsgtTop10.setSell((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return hsgtTop10;
    }

}

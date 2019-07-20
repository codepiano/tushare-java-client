package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.824551
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class GgtTop10 implements Model {

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
     * p_change
     */
    public static final String P_CHANGE = "p_change";

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
     * sh_amount
     */
    public static final String SH_AMOUNT = "sh_amount";

    /**
     * sh_net_amount
     */
    public static final String SH_NET_AMOUNT = "sh_net_amount";

    /**
     * sh_buy
     */
    public static final String SH_BUY = "sh_buy";

    /**
     * sh_sell
     */
    public static final String SH_SELL = "sh_sell";

    /**
     * sz_amount
     */
    public static final String SZ_AMOUNT = "sz_amount";

    /**
     * sz_net_amount
     */
    public static final String SZ_NET_AMOUNT = "sz_net_amount";

    /**
     * sz_buy
     */
    public static final String SZ_BUY = "sz_buy";

    /**
     * sz_sell
     */
    public static final String SZ_SELL = "sz_sell";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TRADE_DATE, TS_CODE, NAME, CLOSE, P_CHANGE, RANK, MARKET_TYPE, AMOUNT, NET_AMOUNT, SH_AMOUNT, SH_NET_AMOUNT, SH_BUY, SH_SELL, SZ_AMOUNT, SZ_NET_AMOUNT, SZ_BUY, SZ_SELL);

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
     * 涨跌幅
     */
    @JsonProperty(value = "p_change")
    private Float pChange;

    /**
     * 资金排名
     */
    @JsonProperty(value = "rank")
    private String rank;

    /**
     * 市场类型 2：港股通（沪） 4：港股通（深）
     */
    @JsonProperty(value = "market_type")
    private String marketType;

    /**
     * 累计成交金额（元）
     */
    @JsonProperty(value = "amount")
    private Float amount;

    /**
     * 净买入金额（元）
     */
    @JsonProperty(value = "net_amount")
    private Float netAmount;

    /**
     * 沪市成交金额（元）
     */
    @JsonProperty(value = "sh_amount")
    private Float shAmount;

    /**
     * 沪市净买入金额（元）
     */
    @JsonProperty(value = "sh_net_amount")
    private Float shNetAmount;

    /**
     * 沪市买入金额（元）
     */
    @JsonProperty(value = "sh_buy")
    private Float shBuy;

    /**
     * 沪市卖出金额
     */
    @JsonProperty(value = "sh_sell")
    private Float shSell;

    /**
     * 深市成交金额（元）
     */
    @JsonProperty(value = "sz_amount")
    private Float szAmount;

    /**
     * 深市净买入金额（元）
     */
    @JsonProperty(value = "sz_net_amount")
    private Float szNetAmount;

    /**
     * 深市买入金额（元）
     */
    @JsonProperty(value = "sz_buy")
    private Float szBuy;

    /**
     * 深市卖出金额（元）
     */
    @JsonProperty(value = "sz_sell")
    private Float szSell;


    /**
     * init by array
     */
    public static GgtTop10 init(String[] fields, Object[] item) {
        GgtTop10 ggtTop10 = new GgtTop10();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TRADE_DATE:
                    ggtTop10.setTradeDate((String) item[i]);
                    break;
                case TS_CODE:
                    ggtTop10.setTsCode((String) item[i]);
                    break;
                case NAME:
                    ggtTop10.setName((String) item[i]);
                    break;
                case CLOSE:
                    ggtTop10.setClose((Float) item[i]);
                    break;
                case P_CHANGE:
                    ggtTop10.setPChange((Float) item[i]);
                    break;
                case RANK:
                    ggtTop10.setRank((String) item[i]);
                    break;
                case MARKET_TYPE:
                    ggtTop10.setMarketType((String) item[i]);
                    break;
                case AMOUNT:
                    ggtTop10.setAmount((Float) item[i]);
                    break;
                case NET_AMOUNT:
                    ggtTop10.setNetAmount((Float) item[i]);
                    break;
                case SH_AMOUNT:
                    ggtTop10.setShAmount((Float) item[i]);
                    break;
                case SH_NET_AMOUNT:
                    ggtTop10.setShNetAmount((Float) item[i]);
                    break;
                case SH_BUY:
                    ggtTop10.setShBuy((Float) item[i]);
                    break;
                case SH_SELL:
                    ggtTop10.setShSell((Float) item[i]);
                    break;
                case SZ_AMOUNT:
                    ggtTop10.setSzAmount((Float) item[i]);
                    break;
                case SZ_NET_AMOUNT:
                    ggtTop10.setSzNetAmount((Float) item[i]);
                    break;
                case SZ_BUY:
                    ggtTop10.setSzBuy((Float) item[i]);
                    break;
                case SZ_SELL:
                    ggtTop10.setSzSell((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return ggtTop10;
    }

}

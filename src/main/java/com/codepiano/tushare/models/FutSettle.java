package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.816409
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FutSettle implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * trade_date
     */
    public static final String TRADE_DATE = "trade_date";

    /**
     * settle
     */
    public static final String SETTLE = "settle";

    /**
     * trading_fee_rate
     */
    public static final String TRADING_FEE_RATE = "trading_fee_rate";

    /**
     * trading_fee
     */
    public static final String TRADING_FEE = "trading_fee";

    /**
     * delivery_fee
     */
    public static final String DELIVERY_FEE = "delivery_fee";

    /**
     * b_hedging_margin_rate
     */
    public static final String B_HEDGING_MARGIN_RATE = "b_hedging_margin_rate";

    /**
     * s_hedging_margin_rate
     */
    public static final String S_HEDGING_MARGIN_RATE = "s_hedging_margin_rate";

    /**
     * long_margin_rate
     */
    public static final String LONG_MARGIN_RATE = "long_margin_rate";

    /**
     * short_margin_rate
     */
    public static final String SHORT_MARGIN_RATE = "short_margin_rate";

    /**
     * offset_today_fee
     */
    public static final String OFFSET_TODAY_FEE = "offset_today_fee";

    /**
     * exchange
     */
    public static final String EXCHANGE = "exchange";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, TRADE_DATE, SETTLE, TRADING_FEE_RATE, TRADING_FEE, DELIVERY_FEE, B_HEDGING_MARGIN_RATE, S_HEDGING_MARGIN_RATE, LONG_MARGIN_RATE, SHORT_MARGIN_RATE, OFFSET_TODAY_FEE, EXCHANGE);

    /**
     * 合约代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 交易日期
     */
    @JsonProperty(value = "trade_date")
    private String tradeDate;

    /**
     * 结算价
     */
    @JsonProperty(value = "settle")
    private Float settle;

    /**
     * 交易手续费率
     */
    @JsonProperty(value = "trading_fee_rate")
    private Float tradingFeeRate;

    /**
     * 交易手续费
     */
    @JsonProperty(value = "trading_fee")
    private Float tradingFee;

    /**
     * 交割手续费
     */
    @JsonProperty(value = "delivery_fee")
    private Float deliveryFee;

    /**
     * 买套保交易保证金率
     */
    @JsonProperty(value = "b_hedging_margin_rate")
    private Float bHedgingMarginRate;

    /**
     * 卖套保交易保证金率
     */
    @JsonProperty(value = "s_hedging_margin_rate")
    private Float sHedgingMarginRate;

    /**
     * 买投机交易保证金率
     */
    @JsonProperty(value = "long_margin_rate")
    private Float longMarginRate;

    /**
     * 卖投机交易保证金率
     */
    @JsonProperty(value = "short_margin_rate")
    private Float shortMarginRate;

    /**
     * 平今仓手续率
     */
    @JsonProperty(value = "offset_today_fee")
    private Float offsetTodayFee;

    /**
     * 交易所
     */
    @JsonProperty(value = "exchange")
    private String exchange;


    /**
     * init by array
     */
    public static FutSettle init(String[] fields, Object[] item) {
        FutSettle futSettle = new FutSettle();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    futSettle.setTsCode((String) item[i]);
                    break;
                case TRADE_DATE:
                    futSettle.setTradeDate((String) item[i]);
                    break;
                case SETTLE:
                    futSettle.setSettle((Float) item[i]);
                    break;
                case TRADING_FEE_RATE:
                    futSettle.setTradingFeeRate((Float) item[i]);
                    break;
                case TRADING_FEE:
                    futSettle.setTradingFee((Float) item[i]);
                    break;
                case DELIVERY_FEE:
                    futSettle.setDeliveryFee((Float) item[i]);
                    break;
                case B_HEDGING_MARGIN_RATE:
                    futSettle.setBHedgingMarginRate((Float) item[i]);
                    break;
                case S_HEDGING_MARGIN_RATE:
                    futSettle.setSHedgingMarginRate((Float) item[i]);
                    break;
                case LONG_MARGIN_RATE:
                    futSettle.setLongMarginRate((Float) item[i]);
                    break;
                case SHORT_MARGIN_RATE:
                    futSettle.setShortMarginRate((Float) item[i]);
                    break;
                case OFFSET_TODAY_FEE:
                    futSettle.setOffsetTodayFee((Float) item[i]);
                    break;
                case EXCHANGE:
                    futSettle.setExchange((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return futSettle;
    }

}

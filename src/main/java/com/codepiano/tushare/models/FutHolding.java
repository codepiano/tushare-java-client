package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.818927
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FutHolding implements Model {

    /**
     * trade_date
     */
    public static final String TRADE_DATE = "trade_date";

    /**
     * symbol
     */
    public static final String SYMBOL = "symbol";

    /**
     * broker
     */
    public static final String BROKER = "broker";

    /**
     * vol
     */
    public static final String VOL = "vol";

    /**
     * vol_chg
     */
    public static final String VOL_CHG = "vol_chg";

    /**
     * long_hld
     */
    public static final String LONG_HLD = "long_hld";

    /**
     * long_chg
     */
    public static final String LONG_CHG = "long_chg";

    /**
     * short_hld
     */
    public static final String SHORT_HLD = "short_hld";

    /**
     * short_chg
     */
    public static final String SHORT_CHG = "short_chg";

    /**
     * exchange
     */
    public static final String EXCHANGE = "exchange";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TRADE_DATE, SYMBOL, BROKER, VOL, VOL_CHG, LONG_HLD, LONG_CHG, SHORT_HLD, SHORT_CHG, EXCHANGE);

    /**
     * 交易日期
     */
    @JsonProperty(value = "trade_date")
    private String tradeDate;

    /**
     * 合约代码或类型
     */
    @JsonProperty(value = "symbol")
    private String symbol;

    /**
     * 期货公司会员简称
     */
    @JsonProperty(value = "broker")
    private String broker;

    /**
     * 成交量
     */
    @JsonProperty(value = "vol")
    private Integer vol;

    /**
     * 成交量变化
     */
    @JsonProperty(value = "vol_chg")
    private Integer volChg;

    /**
     * 持买仓量
     */
    @JsonProperty(value = "long_hld")
    private Integer longHld;

    /**
     * 持买仓量变化
     */
    @JsonProperty(value = "long_chg")
    private Integer longChg;

    /**
     * 持卖仓量
     */
    @JsonProperty(value = "short_hld")
    private Integer shortHld;

    /**
     * 持卖仓量变化
     */
    @JsonProperty(value = "short_chg")
    private Integer shortChg;

    /**
     * 交易所
     */
    @JsonProperty(value = "exchange")
    private String exchange;


    /**
     * init by array
     */
    public static FutHolding init(String[] fields, Object[] item) {
        FutHolding futHolding = new FutHolding();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TRADE_DATE:
                    futHolding.setTradeDate((String) item[i]);
                    break;
                case SYMBOL:
                    futHolding.setSymbol((String) item[i]);
                    break;
                case BROKER:
                    futHolding.setBroker((String) item[i]);
                    break;
                case VOL:
                    futHolding.setVol((Integer) item[i]);
                    break;
                case VOL_CHG:
                    futHolding.setVolChg((Integer) item[i]);
                    break;
                case LONG_HLD:
                    futHolding.setLongHld((Integer) item[i]);
                    break;
                case LONG_CHG:
                    futHolding.setLongChg((Integer) item[i]);
                    break;
                case SHORT_HLD:
                    futHolding.setShortHld((Integer) item[i]);
                    break;
                case SHORT_CHG:
                    futHolding.setShortChg((Integer) item[i]);
                    break;
                case EXCHANGE:
                    futHolding.setExchange((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return futHolding;
    }

}

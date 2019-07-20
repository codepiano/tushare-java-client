package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.826359
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Monthly implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * trade_date
     */
    public static final String TRADE_DATE = "trade_date";

    /**
     * close
     */
    public static final String CLOSE = "close";

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
     * pre_close
     */
    public static final String PRE_CLOSE = "pre_close";

    /**
     * change
     */
    public static final String CHANGE = "change";

    /**
     * pct_chg
     */
    public static final String PCT_CHG = "pct_chg";

    /**
     * vol
     */
    public static final String VOL = "vol";

    /**
     * amount
     */
    public static final String AMOUNT = "amount";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, TRADE_DATE, CLOSE, OPEN, HIGH, LOW, PRE_CLOSE, CHANGE, PCT_CHG, VOL, AMOUNT);

    /**
     * 股票代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 交易日期
     */
    @JsonProperty(value = "trade_date")
    private String tradeDate;

    /**
     * 月收盘价
     */
    @JsonProperty(value = "close")
    private Float close;

    /**
     * 月开盘价
     */
    @JsonProperty(value = "open")
    private Float open;

    /**
     * 月最高价
     */
    @JsonProperty(value = "high")
    private Float high;

    /**
     * 月最低价
     */
    @JsonProperty(value = "low")
    private Float low;

    /**
     * 上月收盘价
     */
    @JsonProperty(value = "pre_close")
    private Float preClose;

    /**
     * 月涨跌额
     */
    @JsonProperty(value = "change")
    private Float change;

    /**
     * 月涨跌幅 （未复权，如果是复权请用 通用行情接口 ）
     */
    @JsonProperty(value = "pct_chg")
    private Float pctChg;

    /**
     * 月成交量
     */
    @JsonProperty(value = "vol")
    private Float vol;

    /**
     * 月成交额
     */
    @JsonProperty(value = "amount")
    private Float amount;


    /**
     * init by array
     */
    public static Monthly init(String[] fields, Object[] item) {
        Monthly monthly = new Monthly();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    monthly.setTsCode((String) item[i]);
                    break;
                case TRADE_DATE:
                    monthly.setTradeDate((String) item[i]);
                    break;
                case CLOSE:
                    monthly.setClose((Float) item[i]);
                    break;
                case OPEN:
                    monthly.setOpen((Float) item[i]);
                    break;
                case HIGH:
                    monthly.setHigh((Float) item[i]);
                    break;
                case LOW:
                    monthly.setLow((Float) item[i]);
                    break;
                case PRE_CLOSE:
                    monthly.setPreClose((Float) item[i]);
                    break;
                case CHANGE:
                    monthly.setChange((Float) item[i]);
                    break;
                case PCT_CHG:
                    monthly.setPctChg((Float) item[i]);
                    break;
                case VOL:
                    monthly.setVol((Float) item[i]);
                    break;
                case AMOUNT:
                    monthly.setAmount((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return monthly;
    }

}

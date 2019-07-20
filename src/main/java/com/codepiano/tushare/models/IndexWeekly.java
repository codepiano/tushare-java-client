package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.798847
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class IndexWeekly implements Model {

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
     * TS指数代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 交易日
     */
    @JsonProperty(value = "trade_date")
    private String tradeDate;

    /**
     * 收盘点位
     */
    @JsonProperty(value = "close")
    private Float close;

    /**
     * 开盘点位
     */
    @JsonProperty(value = "open")
    private Float open;

    /**
     * 最高点位
     */
    @JsonProperty(value = "high")
    private Float high;

    /**
     * 最低点位
     */
    @JsonProperty(value = "low")
    private Float low;

    /**
     * 昨日收盘点
     */
    @JsonProperty(value = "pre_close")
    private Float preClose;

    /**
     * 涨跌点位
     */
    @JsonProperty(value = "change")
    private Float change;

    /**
     * 涨跌幅
     */
    @JsonProperty(value = "pct_chg")
    private Float pctChg;

    /**
     * 成交量
     */
    @JsonProperty(value = "vol")
    private Float vol;

    /**
     * 成交额
     */
    @JsonProperty(value = "amount")
    private Float amount;


    /**
     * init by array
     */
    public static IndexWeekly init(String[] fields, Object[] item) {
        IndexWeekly indexWeekly = new IndexWeekly();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    indexWeekly.setTsCode((String) item[i]);
                    break;
                case TRADE_DATE:
                    indexWeekly.setTradeDate((String) item[i]);
                    break;
                case CLOSE:
                    indexWeekly.setClose((Float) item[i]);
                    break;
                case OPEN:
                    indexWeekly.setOpen((Float) item[i]);
                    break;
                case HIGH:
                    indexWeekly.setHigh((Float) item[i]);
                    break;
                case LOW:
                    indexWeekly.setLow((Float) item[i]);
                    break;
                case PRE_CLOSE:
                    indexWeekly.setPreClose((Float) item[i]);
                    break;
                case CHANGE:
                    indexWeekly.setChange((Float) item[i]);
                    break;
                case PCT_CHG:
                    indexWeekly.setPctChg((Float) item[i]);
                    break;
                case VOL:
                    indexWeekly.setVol((Float) item[i]);
                    break;
                case AMOUNT:
                    indexWeekly.setAmount((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return indexWeekly;
    }

}

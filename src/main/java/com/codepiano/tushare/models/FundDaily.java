package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.810305
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FundDaily implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * trade_date
     */
    public static final String TRADE_DATE = "trade_date";

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
    public static final List<String> FIELDS = List.of(TS_CODE, TRADE_DATE, OPEN, HIGH, LOW, CLOSE, PRE_CLOSE, CHANGE, PCT_CHG, VOL, AMOUNT);

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
     * 开盘价(元)
     */
    @JsonProperty(value = "open")
    private Float open;

    /**
     * 最高价(元)
     */
    @JsonProperty(value = "high")
    private Float high;

    /**
     * 最低价(元)
     */
    @JsonProperty(value = "low")
    private Float low;

    /**
     * 收盘价(元)
     */
    @JsonProperty(value = "close")
    private Float close;

    /**
     * 昨收盘价(元)
     */
    @JsonProperty(value = "pre_close")
    private Float preClose;

    /**
     * 涨跌额(元)
     */
    @JsonProperty(value = "change")
    private Float change;

    /**
     * 涨跌幅(%)
     */
    @JsonProperty(value = "pct_chg")
    private Float pctChg;

    /**
     * 成交量(手)
     */
    @JsonProperty(value = "vol")
    private Float vol;

    /**
     * 成交额(千元)
     */
    @JsonProperty(value = "amount")
    private Float amount;


    /**
     * init by array
     */
    public static FundDaily init(String[] fields, Object[] item) {
        FundDaily fundDaily = new FundDaily();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    fundDaily.setTsCode((String) item[i]);
                    break;
                case TRADE_DATE:
                    fundDaily.setTradeDate((String) item[i]);
                    break;
                case OPEN:
                    fundDaily.setOpen((Float) item[i]);
                    break;
                case HIGH:
                    fundDaily.setHigh((Float) item[i]);
                    break;
                case LOW:
                    fundDaily.setLow((Float) item[i]);
                    break;
                case CLOSE:
                    fundDaily.setClose((Float) item[i]);
                    break;
                case PRE_CLOSE:
                    fundDaily.setPreClose((Float) item[i]);
                    break;
                case CHANGE:
                    fundDaily.setChange((Float) item[i]);
                    break;
                case PCT_CHG:
                    fundDaily.setPctChg((Float) item[i]);
                    break;
                case VOL:
                    fundDaily.setVol((Float) item[i]);
                    break;
                case AMOUNT:
                    fundDaily.setAmount((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return fundDaily;
    }

}

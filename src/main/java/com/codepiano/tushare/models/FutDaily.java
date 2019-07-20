package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.819392
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FutDaily implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * trade_date
     */
    public static final String TRADE_DATE = "trade_date";

    /**
     * pre_close
     */
    public static final String PRE_CLOSE = "pre_close";

    /**
     * pre_settle
     */
    public static final String PRE_SETTLE = "pre_settle";

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
     * settle
     */
    public static final String SETTLE = "settle";

    /**
     * change1
     */
    public static final String CHANGE1 = "change1";

    /**
     * change2
     */
    public static final String CHANGE2 = "change2";

    /**
     * vol
     */
    public static final String VOL = "vol";

    /**
     * amount
     */
    public static final String AMOUNT = "amount";

    /**
     * oi
     */
    public static final String OI = "oi";

    /**
     * oi_chg
     */
    public static final String OI_CHG = "oi_chg";

    /**
     * delv_settle
     */
    public static final String DELV_SETTLE = "delv_settle";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, TRADE_DATE, PRE_CLOSE, PRE_SETTLE, OPEN, HIGH, LOW, CLOSE, SETTLE, CHANGE1, CHANGE2, VOL, AMOUNT, OI, OI_CHG, DELV_SETTLE);

    /**
     * TS合约代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 交易日期
     */
    @JsonProperty(value = "trade_date")
    private String tradeDate;

    /**
     * 昨收盘价
     */
    @JsonProperty(value = "pre_close")
    private Float preClose;

    /**
     * 昨结算价
     */
    @JsonProperty(value = "pre_settle")
    private Float preSettle;

    /**
     * 开盘价
     */
    @JsonProperty(value = "open")
    private Float open;

    /**
     * 最高价
     */
    @JsonProperty(value = "high")
    private Float high;

    /**
     * 最低价
     */
    @JsonProperty(value = "low")
    private Float low;

    /**
     * 收盘价
     */
    @JsonProperty(value = "close")
    private Float close;

    /**
     * 结算价
     */
    @JsonProperty(value = "settle")
    private Float settle;

    /**
     * 涨跌1 收盘价-昨结算价
     */
    @JsonProperty(value = "change1")
    private Float change1;

    /**
     * 涨跌2 结算价-昨结算价
     */
    @JsonProperty(value = "change2")
    private Float change2;

    /**
     * 成交量(手)
     */
    @JsonProperty(value = "vol")
    private Float vol;

    /**
     * 成交金额(万元)
     */
    @JsonProperty(value = "amount")
    private Float amount;

    /**
     * 持仓量(手)
     */
    @JsonProperty(value = "oi")
    private Float oi;

    /**
     * 持仓量变化
     */
    @JsonProperty(value = "oi_chg")
    private Float oiChg;

    /**
     * 交割结算价
     */
    @JsonProperty(value = "delv_settle")
    private Float delvSettle;


    /**
     * init by array
     */
    public static FutDaily init(String[] fields, Object[] item) {
        FutDaily futDaily = new FutDaily();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    futDaily.setTsCode((String) item[i]);
                    break;
                case TRADE_DATE:
                    futDaily.setTradeDate((String) item[i]);
                    break;
                case PRE_CLOSE:
                    futDaily.setPreClose((Float) item[i]);
                    break;
                case PRE_SETTLE:
                    futDaily.setPreSettle((Float) item[i]);
                    break;
                case OPEN:
                    futDaily.setOpen((Float) item[i]);
                    break;
                case HIGH:
                    futDaily.setHigh((Float) item[i]);
                    break;
                case LOW:
                    futDaily.setLow((Float) item[i]);
                    break;
                case CLOSE:
                    futDaily.setClose((Float) item[i]);
                    break;
                case SETTLE:
                    futDaily.setSettle((Float) item[i]);
                    break;
                case CHANGE1:
                    futDaily.setChange1((Float) item[i]);
                    break;
                case CHANGE2:
                    futDaily.setChange2((Float) item[i]);
                    break;
                case VOL:
                    futDaily.setVol((Float) item[i]);
                    break;
                case AMOUNT:
                    futDaily.setAmount((Float) item[i]);
                    break;
                case OI:
                    futDaily.setOi((Float) item[i]);
                    break;
                case OI_CHG:
                    futDaily.setOiChg((Float) item[i]);
                    break;
                case DELV_SETTLE:
                    futDaily.setDelvSettle((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return futDaily;
    }

}

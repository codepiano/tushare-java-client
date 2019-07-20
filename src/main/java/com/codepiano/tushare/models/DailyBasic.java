package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.838876
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class DailyBasic implements Model {

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
     * turnover_rate
     */
    public static final String TURNOVER_RATE = "turnover_rate";

    /**
     * turnover_rate_f
     */
    public static final String TURNOVER_RATE_F = "turnover_rate_f";

    /**
     * volume_ratio
     */
    public static final String VOLUME_RATIO = "volume_ratio";

    /**
     * pe
     */
    public static final String PE = "pe";

    /**
     * pe_ttm
     */
    public static final String PE_TTM = "pe_ttm";

    /**
     * pb
     */
    public static final String PB = "pb";

    /**
     * ps
     */
    public static final String PS = "ps";

    /**
     * ps_ttm
     */
    public static final String PS_TTM = "ps_ttm";

    /**
     * total_share
     */
    public static final String TOTAL_SHARE = "total_share";

    /**
     * float_share
     */
    public static final String FLOAT_SHARE = "float_share";

    /**
     * free_share
     */
    public static final String FREE_SHARE = "free_share";

    /**
     * total_mv
     */
    public static final String TOTAL_MV = "total_mv";

    /**
     * circ_mv
     */
    public static final String CIRC_MV = "circ_mv";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, TRADE_DATE, CLOSE, TURNOVER_RATE, TURNOVER_RATE_F, VOLUME_RATIO, PE, PE_TTM, PB, PS, PS_TTM, TOTAL_SHARE, FLOAT_SHARE, FREE_SHARE, TOTAL_MV, CIRC_MV);

    /**
     * TS股票代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 交易日期
     */
    @JsonProperty(value = "trade_date")
    private String tradeDate;

    /**
     * 当日收盘价
     */
    @JsonProperty(value = "close")
    private Float close;

    /**
     * 换手率（%）
     */
    @JsonProperty(value = "turnover_rate")
    private Float turnoverRate;

    /**
     * 换手率（自由流通股）
     */
    @JsonProperty(value = "turnover_rate_f")
    private Float turnoverRateF;

    /**
     * 量比
     */
    @JsonProperty(value = "volume_ratio")
    private Float volumeRatio;

    /**
     * 市盈率（总市值/净利润）
     */
    @JsonProperty(value = "pe")
    private Float pe;

    /**
     * 市盈率（TTM）
     */
    @JsonProperty(value = "pe_ttm")
    private Float peTtm;

    /**
     * 市净率（总市值/净资产）
     */
    @JsonProperty(value = "pb")
    private Float pb;

    /**
     * 市销率
     */
    @JsonProperty(value = "ps")
    private Float ps;

    /**
     * 市销率（TTM）
     */
    @JsonProperty(value = "ps_ttm")
    private Float psTtm;

    /**
     * 总股本 （万股）
     */
    @JsonProperty(value = "total_share")
    private Float totalShare;

    /**
     * 流通股本 （万股）
     */
    @JsonProperty(value = "float_share")
    private Float floatShare;

    /**
     * 自由流通股本 （万）
     */
    @JsonProperty(value = "free_share")
    private Float freeShare;

    /**
     * 总市值 （万元）
     */
    @JsonProperty(value = "total_mv")
    private Float totalMv;

    /**
     * 流通市值（万元）
     */
    @JsonProperty(value = "circ_mv")
    private Float circMv;


    /**
     * init by array
     */
    public static DailyBasic init(String[] fields, Object[] item) {
        DailyBasic dailyBasic = new DailyBasic();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    dailyBasic.setTsCode((String) item[i]);
                    break;
                case TRADE_DATE:
                    dailyBasic.setTradeDate((String) item[i]);
                    break;
                case CLOSE:
                    dailyBasic.setClose((Float) item[i]);
                    break;
                case TURNOVER_RATE:
                    dailyBasic.setTurnoverRate((Float) item[i]);
                    break;
                case TURNOVER_RATE_F:
                    dailyBasic.setTurnoverRateF((Float) item[i]);
                    break;
                case VOLUME_RATIO:
                    dailyBasic.setVolumeRatio((Float) item[i]);
                    break;
                case PE:
                    dailyBasic.setPe((Float) item[i]);
                    break;
                case PE_TTM:
                    dailyBasic.setPeTtm((Float) item[i]);
                    break;
                case PB:
                    dailyBasic.setPb((Float) item[i]);
                    break;
                case PS:
                    dailyBasic.setPs((Float) item[i]);
                    break;
                case PS_TTM:
                    dailyBasic.setPsTtm((Float) item[i]);
                    break;
                case TOTAL_SHARE:
                    dailyBasic.setTotalShare((Float) item[i]);
                    break;
                case FLOAT_SHARE:
                    dailyBasic.setFloatShare((Float) item[i]);
                    break;
                case FREE_SHARE:
                    dailyBasic.setFreeShare((Float) item[i]);
                    break;
                case TOTAL_MV:
                    dailyBasic.setTotalMv((Float) item[i]);
                    break;
                case CIRC_MV:
                    dailyBasic.setCircMv((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return dailyBasic;
    }

}

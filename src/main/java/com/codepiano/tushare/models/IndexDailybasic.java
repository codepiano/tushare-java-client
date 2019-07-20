package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.806371
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class IndexDailybasic implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * trade_date
     */
    public static final String TRADE_DATE = "trade_date";

    /**
     * total_mv
     */
    public static final String TOTAL_MV = "total_mv";

    /**
     * float_mv
     */
    public static final String FLOAT_MV = "float_mv";

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
     * turnover_rate
     */
    public static final String TURNOVER_RATE = "turnover_rate";

    /**
     * turnover_rate_f
     */
    public static final String TURNOVER_RATE_F = "turnover_rate_f";

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
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, TRADE_DATE, TOTAL_MV, FLOAT_MV, TOTAL_SHARE, FLOAT_SHARE, FREE_SHARE, TURNOVER_RATE, TURNOVER_RATE_F, PE, PE_TTM, PB);

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
     * 当日总市值（元）
     */
    @JsonProperty(value = "total_mv")
    private Float totalMv;

    /**
     * 当日流通市值（元）
     */
    @JsonProperty(value = "float_mv")
    private Float floatMv;

    /**
     * 当日总股本（股）
     */
    @JsonProperty(value = "total_share")
    private Float totalShare;

    /**
     * 当日流通股本（股）
     */
    @JsonProperty(value = "float_share")
    private Float floatShare;

    /**
     * 当日自由流通股本（股）
     */
    @JsonProperty(value = "free_share")
    private Float freeShare;

    /**
     * 换手率
     */
    @JsonProperty(value = "turnover_rate")
    private Float turnoverRate;

    /**
     * 换手率(基于自由流通股本)
     */
    @JsonProperty(value = "turnover_rate_f")
    private Float turnoverRateF;

    /**
     * 市盈率
     */
    @JsonProperty(value = "pe")
    private Float pe;

    /**
     * 市盈率TTM
     */
    @JsonProperty(value = "pe_ttm")
    private Float peTtm;

    /**
     * 市净率
     */
    @JsonProperty(value = "pb")
    private Float pb;


    /**
     * init by array
     */
    public static IndexDailybasic init(String[] fields, Object[] item) {
        IndexDailybasic indexDailybasic = new IndexDailybasic();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    indexDailybasic.setTsCode((String) item[i]);
                    break;
                case TRADE_DATE:
                    indexDailybasic.setTradeDate((String) item[i]);
                    break;
                case TOTAL_MV:
                    indexDailybasic.setTotalMv((Float) item[i]);
                    break;
                case FLOAT_MV:
                    indexDailybasic.setFloatMv((Float) item[i]);
                    break;
                case TOTAL_SHARE:
                    indexDailybasic.setTotalShare((Float) item[i]);
                    break;
                case FLOAT_SHARE:
                    indexDailybasic.setFloatShare((Float) item[i]);
                    break;
                case FREE_SHARE:
                    indexDailybasic.setFreeShare((Float) item[i]);
                    break;
                case TURNOVER_RATE:
                    indexDailybasic.setTurnoverRate((Float) item[i]);
                    break;
                case TURNOVER_RATE_F:
                    indexDailybasic.setTurnoverRateF((Float) item[i]);
                    break;
                case PE:
                    indexDailybasic.setPe((Float) item[i]);
                    break;
                case PE_TTM:
                    indexDailybasic.setPeTtm((Float) item[i]);
                    break;
                case PB:
                    indexDailybasic.setPb((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return indexDailybasic;
    }

}

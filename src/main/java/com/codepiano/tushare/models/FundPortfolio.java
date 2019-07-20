package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.807732
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FundPortfolio implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * ann_date
     */
    public static final String ANN_DATE = "ann_date";

    /**
     * end_date
     */
    public static final String END_DATE = "end_date";

    /**
     * symbol
     */
    public static final String SYMBOL = "symbol";

    /**
     * mkv
     */
    public static final String MKV = "mkv";

    /**
     * amount
     */
    public static final String AMOUNT = "amount";

    /**
     * stk_mkv_ratio
     */
    public static final String STK_MKV_RATIO = "stk_mkv_ratio";

    /**
     * stk_float_ratio
     */
    public static final String STK_FLOAT_RATIO = "stk_float_ratio";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, ANN_DATE, END_DATE, SYMBOL, MKV, AMOUNT, STK_MKV_RATIO, STK_FLOAT_RATIO);

    /**
     * TS基金代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 公告日期
     */
    @JsonProperty(value = "ann_date")
    private String annDate;

    /**
     * 截止日期
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * 股票代码
     */
    @JsonProperty(value = "symbol")
    private String symbol;

    /**
     * 持有股票市值(元)
     */
    @JsonProperty(value = "mkv")
    private Float mkv;

    /**
     * 持有股票数量（股）
     */
    @JsonProperty(value = "amount")
    private Float amount;

    /**
     * 占股票市值比
     */
    @JsonProperty(value = "stk_mkv_ratio")
    private Float stkMkvRatio;

    /**
     * 占流通股本比例
     */
    @JsonProperty(value = "stk_float_ratio")
    private Float stkFloatRatio;


    /**
     * init by array
     */
    public static FundPortfolio init(String[] fields, Object[] item) {
        FundPortfolio fundPortfolio = new FundPortfolio();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    fundPortfolio.setTsCode((String) item[i]);
                    break;
                case ANN_DATE:
                    fundPortfolio.setAnnDate((String) item[i]);
                    break;
                case END_DATE:
                    fundPortfolio.setEndDate((String) item[i]);
                    break;
                case SYMBOL:
                    fundPortfolio.setSymbol((String) item[i]);
                    break;
                case MKV:
                    fundPortfolio.setMkv((Float) item[i]);
                    break;
                case AMOUNT:
                    fundPortfolio.setAmount((Float) item[i]);
                    break;
                case STK_MKV_RATIO:
                    fundPortfolio.setStkMkvRatio((Float) item[i]);
                    break;
                case STK_FLOAT_RATIO:
                    fundPortfolio.setStkFloatRatio((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return fundPortfolio;
    }

}

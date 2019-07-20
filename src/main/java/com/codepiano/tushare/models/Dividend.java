package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.825226
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Dividend implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * end_date
     */
    public static final String END_DATE = "end_date";

    /**
     * ann_date
     */
    public static final String ANN_DATE = "ann_date";

    /**
     * div_proc
     */
    public static final String DIV_PROC = "div_proc";

    /**
     * stk_div
     */
    public static final String STK_DIV = "stk_div";

    /**
     * stk_bo_rate
     */
    public static final String STK_BO_RATE = "stk_bo_rate";

    /**
     * stk_co_rate
     */
    public static final String STK_CO_RATE = "stk_co_rate";

    /**
     * cash_div
     */
    public static final String CASH_DIV = "cash_div";

    /**
     * cash_div_tax
     */
    public static final String CASH_DIV_TAX = "cash_div_tax";

    /**
     * record_date
     */
    public static final String RECORD_DATE = "record_date";

    /**
     * ex_date
     */
    public static final String EX_DATE = "ex_date";

    /**
     * pay_date
     */
    public static final String PAY_DATE = "pay_date";

    /**
     * div_listdate
     */
    public static final String DIV_LISTDATE = "div_listdate";

    /**
     * imp_ann_date
     */
    public static final String IMP_ANN_DATE = "imp_ann_date";

    /**
     * base_date
     */
    public static final String BASE_DATE = "base_date";

    /**
     * base_share
     */
    public static final String BASE_SHARE = "base_share";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, END_DATE, ANN_DATE, DIV_PROC, STK_DIV, STK_BO_RATE, STK_CO_RATE, CASH_DIV, CASH_DIV_TAX, RECORD_DATE, EX_DATE, PAY_DATE, DIV_LISTDATE, IMP_ANN_DATE, BASE_DATE, BASE_SHARE);

    /**
     * TS代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 分红年度
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * 预案公告日
     */
    @JsonProperty(value = "ann_date")
    private String annDate;

    /**
     * 实施进度
     */
    @JsonProperty(value = "div_proc")
    private String divProc;

    /**
     * 每股送转
     */
    @JsonProperty(value = "stk_div")
    private Float stkDiv;

    /**
     * 每股送股比例
     */
    @JsonProperty(value = "stk_bo_rate")
    private Float stkBoRate;

    /**
     * 每股转增比例
     */
    @JsonProperty(value = "stk_co_rate")
    private Float stkCoRate;

    /**
     * 每股分红（税后）
     */
    @JsonProperty(value = "cash_div")
    private Float cashDiv;

    /**
     * 每股分红（税前）
     */
    @JsonProperty(value = "cash_div_tax")
    private Float cashDivTax;

    /**
     * 股权登记日
     */
    @JsonProperty(value = "record_date")
    private String recordDate;

    /**
     * 除权除息日
     */
    @JsonProperty(value = "ex_date")
    private String exDate;

    /**
     * 派息日
     */
    @JsonProperty(value = "pay_date")
    private String payDate;

    /**
     * 红股上市日
     */
    @JsonProperty(value = "div_listdate")
    private String divListdate;

    /**
     * 实施公告日
     */
    @JsonProperty(value = "imp_ann_date")
    private String impAnnDate;

    /**
     * 基准日
     */
    @JsonProperty(value = "base_date")
    private String baseDate;

    /**
     * 基准股本（万）
     */
    @JsonProperty(value = "base_share")
    private Float baseShare;


    /**
     * init by array
     */
    public static Dividend init(String[] fields, Object[] item) {
        Dividend dividend = new Dividend();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    dividend.setTsCode((String) item[i]);
                    break;
                case END_DATE:
                    dividend.setEndDate((String) item[i]);
                    break;
                case ANN_DATE:
                    dividend.setAnnDate((String) item[i]);
                    break;
                case DIV_PROC:
                    dividend.setDivProc((String) item[i]);
                    break;
                case STK_DIV:
                    dividend.setStkDiv((Float) item[i]);
                    break;
                case STK_BO_RATE:
                    dividend.setStkBoRate((Float) item[i]);
                    break;
                case STK_CO_RATE:
                    dividend.setStkCoRate((Float) item[i]);
                    break;
                case CASH_DIV:
                    dividend.setCashDiv((Float) item[i]);
                    break;
                case CASH_DIV_TAX:
                    dividend.setCashDivTax((Float) item[i]);
                    break;
                case RECORD_DATE:
                    dividend.setRecordDate((String) item[i]);
                    break;
                case EX_DATE:
                    dividend.setExDate((String) item[i]);
                    break;
                case PAY_DATE:
                    dividend.setPayDate((String) item[i]);
                    break;
                case DIV_LISTDATE:
                    dividend.setDivListdate((String) item[i]);
                    break;
                case IMP_ANN_DATE:
                    dividend.setImpAnnDate((String) item[i]);
                    break;
                case BASE_DATE:
                    dividend.setBaseDate((String) item[i]);
                    break;
                case BASE_SHARE:
                    dividend.setBaseShare((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return dividend;
    }

}

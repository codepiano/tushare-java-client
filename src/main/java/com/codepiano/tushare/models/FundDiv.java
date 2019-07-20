package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.808187
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FundDiv implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * ann_date
     */
    public static final String ANN_DATE = "ann_date";

    /**
     * imp_anndate
     */
    public static final String IMP_ANNDATE = "imp_anndate";

    /**
     * base_date
     */
    public static final String BASE_DATE = "base_date";

    /**
     * div_proc
     */
    public static final String DIV_PROC = "div_proc";

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
     * earpay_date
     */
    public static final String EARPAY_DATE = "earpay_date";

    /**
     * net_ex_date
     */
    public static final String NET_EX_DATE = "net_ex_date";

    /**
     * div_cash
     */
    public static final String DIV_CASH = "div_cash";

    /**
     * base_unit
     */
    public static final String BASE_UNIT = "base_unit";

    /**
     * ear_distr
     */
    public static final String EAR_DISTR = "ear_distr";

    /**
     * ear_amount
     */
    public static final String EAR_AMOUNT = "ear_amount";

    /**
     * account_date
     */
    public static final String ACCOUNT_DATE = "account_date";

    /**
     * base_year
     */
    public static final String BASE_YEAR = "base_year";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, ANN_DATE, IMP_ANNDATE, BASE_DATE, DIV_PROC, RECORD_DATE, EX_DATE, PAY_DATE, EARPAY_DATE, NET_EX_DATE, DIV_CASH, BASE_UNIT, EAR_DISTR, EAR_AMOUNT, ACCOUNT_DATE, BASE_YEAR);

    /**
     * TS代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 公告日期
     */
    @JsonProperty(value = "ann_date")
    private String annDate;

    /**
     * 分红实施公告日
     */
    @JsonProperty(value = "imp_anndate")
    private String impAnndate;

    /**
     * 分配收益基准日
     */
    @JsonProperty(value = "base_date")
    private String baseDate;

    /**
     * 方案进度
     */
    @JsonProperty(value = "div_proc")
    private String divProc;

    /**
     * 权益登记日
     */
    @JsonProperty(value = "record_date")
    private String recordDate;

    /**
     * 除息日
     */
    @JsonProperty(value = "ex_date")
    private String exDate;

    /**
     * 派息日
     */
    @JsonProperty(value = "pay_date")
    private String payDate;

    /**
     * 收益支付日
     */
    @JsonProperty(value = "earpay_date")
    private String earpayDate;

    /**
     * 净值除权日
     */
    @JsonProperty(value = "net_ex_date")
    private String netExDate;

    /**
     * 每股派息(元)
     */
    @JsonProperty(value = "div_cash")
    private Float divCash;

    /**
     * 基准基金份额(万份)
     */
    @JsonProperty(value = "base_unit")
    private Float baseUnit;

    /**
     * 可分配收益(元)
     */
    @JsonProperty(value = "ear_distr")
    private Float earDistr;

    /**
     * 收益分配金额(元)
     */
    @JsonProperty(value = "ear_amount")
    private Float earAmount;

    /**
     * 红利再投资到账日
     */
    @JsonProperty(value = "account_date")
    private String accountDate;

    /**
     * 份额基准年度
     */
    @JsonProperty(value = "base_year")
    private String baseYear;


    /**
     * init by array
     */
    public static FundDiv init(String[] fields, Object[] item) {
        FundDiv fundDiv = new FundDiv();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    fundDiv.setTsCode((String) item[i]);
                    break;
                case ANN_DATE:
                    fundDiv.setAnnDate((String) item[i]);
                    break;
                case IMP_ANNDATE:
                    fundDiv.setImpAnndate((String) item[i]);
                    break;
                case BASE_DATE:
                    fundDiv.setBaseDate((String) item[i]);
                    break;
                case DIV_PROC:
                    fundDiv.setDivProc((String) item[i]);
                    break;
                case RECORD_DATE:
                    fundDiv.setRecordDate((String) item[i]);
                    break;
                case EX_DATE:
                    fundDiv.setExDate((String) item[i]);
                    break;
                case PAY_DATE:
                    fundDiv.setPayDate((String) item[i]);
                    break;
                case EARPAY_DATE:
                    fundDiv.setEarpayDate((String) item[i]);
                    break;
                case NET_EX_DATE:
                    fundDiv.setNetExDate((String) item[i]);
                    break;
                case DIV_CASH:
                    fundDiv.setDivCash((Float) item[i]);
                    break;
                case BASE_UNIT:
                    fundDiv.setBaseUnit((Float) item[i]);
                    break;
                case EAR_DISTR:
                    fundDiv.setEarDistr((Float) item[i]);
                    break;
                case EAR_AMOUNT:
                    fundDiv.setEarAmount((Float) item[i]);
                    break;
                case ACCOUNT_DATE:
                    fundDiv.setAccountDate((String) item[i]);
                    break;
                case BASE_YEAR:
                    fundDiv.setBaseYear((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return fundDiv;
    }

}

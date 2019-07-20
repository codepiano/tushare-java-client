package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.847771
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Repurchase implements Model {

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
     * proc
     */
    public static final String PROC = "proc";

    /**
     * exp_date
     */
    public static final String EXP_DATE = "exp_date";

    /**
     * vol
     */
    public static final String VOL = "vol";

    /**
     * amount
     */
    public static final String AMOUNT = "amount";

    /**
     * high_limit
     */
    public static final String HIGH_LIMIT = "high_limit";

    /**
     * low_limit
     */
    public static final String LOW_LIMIT = "low_limit";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, ANN_DATE, END_DATE, PROC, EXP_DATE, VOL, AMOUNT, HIGH_LIMIT, LOW_LIMIT);

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
     * 截止日期
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * 进度
     */
    @JsonProperty(value = "proc")
    private String proc;

    /**
     * 过期日期
     */
    @JsonProperty(value = "exp_date")
    private String expDate;

    /**
     * 回购数量
     */
    @JsonProperty(value = "vol")
    private Float vol;

    /**
     * 回购金额
     */
    @JsonProperty(value = "amount")
    private Float amount;

    /**
     * 回购最高价
     */
    @JsonProperty(value = "high_limit")
    private Float highLimit;

    /**
     * 回购最低价
     */
    @JsonProperty(value = "low_limit")
    private Float lowLimit;


    /**
     * init by array
     */
    public static Repurchase init(String[] fields, Object[] item) {
        Repurchase repurchase = new Repurchase();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    repurchase.setTsCode((String) item[i]);
                    break;
                case ANN_DATE:
                    repurchase.setAnnDate((String) item[i]);
                    break;
                case END_DATE:
                    repurchase.setEndDate((String) item[i]);
                    break;
                case PROC:
                    repurchase.setProc((String) item[i]);
                    break;
                case EXP_DATE:
                    repurchase.setExpDate((String) item[i]);
                    break;
                case VOL:
                    repurchase.setVol((Float) item[i]);
                    break;
                case AMOUNT:
                    repurchase.setAmount((Float) item[i]);
                    break;
                case HIGH_LIMIT:
                    repurchase.setHighLimit((Float) item[i]);
                    break;
                case LOW_LIMIT:
                    repurchase.setLowLimit((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return repurchase;
    }

}

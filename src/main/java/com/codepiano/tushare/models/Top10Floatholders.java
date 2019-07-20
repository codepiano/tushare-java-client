package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.843041
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Top10Floatholders implements Model {

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
     * holder_name
     */
    public static final String HOLDER_NAME = "holder_name";

    /**
     * hold_amount
     */
    public static final String HOLD_AMOUNT = "hold_amount";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, ANN_DATE, END_DATE, HOLDER_NAME, HOLD_AMOUNT);

    /**
     * TS股票代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 公告日期
     */
    @JsonProperty(value = "ann_date")
    private String annDate;

    /**
     * 报告期
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * 股东名称
     */
    @JsonProperty(value = "holder_name")
    private String holderName;

    /**
     * 持有数量（股）
     */
    @JsonProperty(value = "hold_amount")
    private Float holdAmount;


    /**
     * init by array
     */
    public static Top10Floatholders init(String[] fields, Object[] item) {
        Top10Floatholders top10Floatholders = new Top10Floatholders();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    top10Floatholders.setTsCode((String) item[i]);
                    break;
                case ANN_DATE:
                    top10Floatholders.setAnnDate((String) item[i]);
                    break;
                case END_DATE:
                    top10Floatholders.setEndDate((String) item[i]);
                    break;
                case HOLDER_NAME:
                    top10Floatholders.setHolderName((String) item[i]);
                    break;
                case HOLD_AMOUNT:
                    top10Floatholders.setHoldAmount((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return top10Floatholders;
    }

}

package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.812280
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class GzIndex implements Model {

    /**
     * date
     */
    public static final String DATE = "date";

    /**
     * d10_rate
     */
    public static final String D10_RATE = "d10_rate";

    /**
     * m1_rate
     */
    public static final String M1_RATE = "m1_rate";

    /**
     * m3_rate
     */
    public static final String M3_RATE = "m3_rate";

    /**
     * m6_rate
     */
    public static final String M6_RATE = "m6_rate";

    /**
     * m12_rate
     */
    public static final String M12_RATE = "m12_rate";

    /**
     * long_rate
     */
    public static final String LONG_RATE = "long_rate";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(DATE, D10_RATE, M1_RATE, M3_RATE, M6_RATE, M12_RATE, LONG_RATE);

    /**
     * 日期
     */
    @JsonProperty(value = "date")
    private String date;

    /**
     * 小额贷市场平均利率（十天） （单位：%，下同）
     */
    @JsonProperty(value = "d10_rate")
    private Float d10Rate;

    /**
     * 小额贷市场平均利率（一月期）
     */
    @JsonProperty(value = "m1_rate")
    private Float m1Rate;

    /**
     * 小额贷市场平均利率（三月期）
     */
    @JsonProperty(value = "m3_rate")
    private Float m3Rate;

    /**
     * 小额贷市场平均利率（六月期）
     */
    @JsonProperty(value = "m6_rate")
    private Float m6Rate;

    /**
     * 小额贷市场平均利率（一年期）
     */
    @JsonProperty(value = "m12_rate")
    private Float m12Rate;

    /**
     * 小额贷市场平均利率（长期）
     */
    @JsonProperty(value = "long_rate")
    private Float longRate;


    /**
     * init by array
     */
    public static GzIndex init(String[] fields, Object[] item) {
        GzIndex gzIndex = new GzIndex();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case DATE:
                    gzIndex.setDate((String) item[i]);
                    break;
                case D10_RATE:
                    gzIndex.setD10Rate((Float) item[i]);
                    break;
                case M1_RATE:
                    gzIndex.setM1Rate((Float) item[i]);
                    break;
                case M3_RATE:
                    gzIndex.setM3Rate((Float) item[i]);
                    break;
                case M6_RATE:
                    gzIndex.setM6Rate((Float) item[i]);
                    break;
                case M12_RATE:
                    gzIndex.setM12Rate((Float) item[i]);
                    break;
                case LONG_RATE:
                    gzIndex.setLongRate((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return gzIndex;
    }

}

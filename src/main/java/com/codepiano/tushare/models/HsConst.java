package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.832219
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class HsConst implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * hs_type
     */
    public static final String HS_TYPE = "hs_type";

    /**
     * in_date
     */
    public static final String IN_DATE = "in_date";

    /**
     * out_date
     */
    public static final String OUT_DATE = "out_date";

    /**
     * is_new
     */
    public static final String IS_NEW = "is_new";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, HS_TYPE, IN_DATE, OUT_DATE, IS_NEW);

    /**
     * TS代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 沪深港通类型SH沪SZ深
     */
    @JsonProperty(value = "hs_type")
    private String hsType;

    /**
     * 纳入日期
     */
    @JsonProperty(value = "in_date")
    private String inDate;

    /**
     * 剔除日期
     */
    @JsonProperty(value = "out_date")
    private String outDate;

    /**
     * 是否最新 1是 0否
     */
    @JsonProperty(value = "is_new")
    private String isNew;


    /**
     * init by array
     */
    public static HsConst init(String[] fields, Object[] item) {
        HsConst hsConst = new HsConst();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    hsConst.setTsCode((String) item[i]);
                    break;
                case HS_TYPE:
                    hsConst.setHsType((String) item[i]);
                    break;
                case IN_DATE:
                    hsConst.setInDate((String) item[i]);
                    break;
                case OUT_DATE:
                    hsConst.setOutDate((String) item[i]);
                    break;
                case IS_NEW:
                    hsConst.setIsNew((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return hsConst;
    }

}

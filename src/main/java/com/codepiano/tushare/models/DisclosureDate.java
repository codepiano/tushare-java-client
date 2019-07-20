package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.844977
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class DisclosureDate implements Model {

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
     * pre_date
     */
    public static final String PRE_DATE = "pre_date";

    /**
     * actual_date
     */
    public static final String ACTUAL_DATE = "actual_date";

    /**
     * modify_date
     */
    public static final String MODIFY_DATE = "modify_date";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, ANN_DATE, END_DATE, PRE_DATE, ACTUAL_DATE, MODIFY_DATE);

    /**
     * TS代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 最新披露公告日
     */
    @JsonProperty(value = "ann_date")
    private String annDate;

    /**
     * 报告期
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * 预计披露日期
     */
    @JsonProperty(value = "pre_date")
    private String preDate;

    /**
     * 实际披露日期
     */
    @JsonProperty(value = "actual_date")
    private String actualDate;

    /**
     * 披露日期修正记录
     */
    @JsonProperty(value = "modify_date")
    private String modifyDate;


    /**
     * init by array
     */
    public static DisclosureDate init(String[] fields, Object[] item) {
        DisclosureDate disclosureDate = new DisclosureDate();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    disclosureDate.setTsCode((String) item[i]);
                    break;
                case ANN_DATE:
                    disclosureDate.setAnnDate((String) item[i]);
                    break;
                case END_DATE:
                    disclosureDate.setEndDate((String) item[i]);
                    break;
                case PRE_DATE:
                    disclosureDate.setPreDate((String) item[i]);
                    break;
                case ACTUAL_DATE:
                    disclosureDate.setActualDate((String) item[i]);
                    break;
                case MODIFY_DATE:
                    disclosureDate.setModifyDate((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return disclosureDate;
    }

}

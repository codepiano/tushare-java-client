package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.827693
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Namechange implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * name
     */
    public static final String NAME = "name";

    /**
     * start_date
     */
    public static final String START_DATE = "start_date";

    /**
     * end_date
     */
    public static final String END_DATE = "end_date";

    /**
     * ann_date
     */
    public static final String ANN_DATE = "ann_date";

    /**
     * change_reason
     */
    public static final String CHANGE_REASON = "change_reason";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, NAME, START_DATE, END_DATE, ANN_DATE, CHANGE_REASON);

    /**
     * TS代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 证券名称
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * 开始日期
     */
    @JsonProperty(value = "start_date")
    private String startDate;

    /**
     * 结束日期
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * 公告日期
     */
    @JsonProperty(value = "ann_date")
    private String annDate;

    /**
     * 变更原因
     */
    @JsonProperty(value = "change_reason")
    private String changeReason;


    /**
     * init by array
     */
    public static Namechange init(String[] fields, Object[] item) {
        Namechange namechange = new Namechange();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    namechange.setTsCode((String) item[i]);
                    break;
                case NAME:
                    namechange.setName((String) item[i]);
                    break;
                case START_DATE:
                    namechange.setStartDate((String) item[i]);
                    break;
                case END_DATE:
                    namechange.setEndDate((String) item[i]);
                    break;
                case ANN_DATE:
                    namechange.setAnnDate((String) item[i]);
                    break;
                case CHANGE_REASON:
                    namechange.setChangeReason((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return namechange;
    }

}

package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.853738
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ConceptDetail implements Model {

    /**
     * id
     */
    public static final String ID = "id";

    /**
     * concept_name
     */
    public static final String CONCEPT_NAME = "concept_name";

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * name
     */
    public static final String NAME = "name";

    /**
     * in_date
     */
    public static final String IN_DATE = "in_date";

    /**
     * out_date
     */
    public static final String OUT_DATE = "out_date";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(ID, CONCEPT_NAME, TS_CODE, NAME, IN_DATE, OUT_DATE);

    /**
     * 概念代码
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * 概念名称
     */
    @JsonProperty(value = "concept_name")
    private String conceptName;

    /**
     * 股票代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 股票名称
     */
    @JsonProperty(value = "name")
    private String name;

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
     * init by array
     */
    public static ConceptDetail init(String[] fields, Object[] item) {
        ConceptDetail conceptDetail = new ConceptDetail();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case ID:
                    conceptDetail.setId((String) item[i]);
                    break;
                case CONCEPT_NAME:
                    conceptDetail.setConceptName((String) item[i]);
                    break;
                case TS_CODE:
                    conceptDetail.setTsCode((String) item[i]);
                    break;
                case NAME:
                    conceptDetail.setName((String) item[i]);
                    break;
                case IN_DATE:
                    conceptDetail.setInDate((String) item[i]);
                    break;
                case OUT_DATE:
                    conceptDetail.setOutDate((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return conceptDetail;
    }

}

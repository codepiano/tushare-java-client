package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.798403
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class IndexMember implements Model {

    /**
     * index_code
     */
    public static final String INDEX_CODE = "index_code";

    /**
     * index_name
     */
    public static final String INDEX_NAME = "index_name";

    /**
     * con_code
     */
    public static final String CON_CODE = "con_code";

    /**
     * con_name
     */
    public static final String CON_NAME = "con_name";

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
    public static final List<String> FIELDS = List.of(INDEX_CODE, INDEX_NAME, CON_CODE, CON_NAME, IN_DATE, OUT_DATE, IS_NEW);

    /**
     * 指数代码
     */
    @JsonProperty(value = "index_code")
    private String indexCode;

    /**
     * 指数名称
     */
    @JsonProperty(value = "index_name")
    private String indexName;

    /**
     * 成分股票代码
     */
    @JsonProperty(value = "con_code")
    private String conCode;

    /**
     * 成分股票名称
     */
    @JsonProperty(value = "con_name")
    private String conName;

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
     * 是否最新Y是N否
     */
    @JsonProperty(value = "is_new")
    private String isNew;


    /**
     * init by array
     */
    public static IndexMember init(String[] fields, Object[] item) {
        IndexMember indexMember = new IndexMember();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case INDEX_CODE:
                    indexMember.setIndexCode((String) item[i]);
                    break;
                case INDEX_NAME:
                    indexMember.setIndexName((String) item[i]);
                    break;
                case CON_CODE:
                    indexMember.setConCode((String) item[i]);
                    break;
                case CON_NAME:
                    indexMember.setConName((String) item[i]);
                    break;
                case IN_DATE:
                    indexMember.setInDate((String) item[i]);
                    break;
                case OUT_DATE:
                    indexMember.setOutDate((String) item[i]);
                    break;
                case IS_NEW:
                    indexMember.setIsNew((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return indexMember;
    }

}

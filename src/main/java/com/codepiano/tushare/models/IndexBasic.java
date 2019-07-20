package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.804770
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class IndexBasic implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * name
     */
    public static final String NAME = "name";

    /**
     * fullname
     */
    public static final String FULLNAME = "fullname";

    /**
     * market
     */
    public static final String MARKET = "market";

    /**
     * publisher
     */
    public static final String PUBLISHER = "publisher";

    /**
     * index_type
     */
    public static final String INDEX_TYPE = "index_type";

    /**
     * category
     */
    public static final String CATEGORY = "category";

    /**
     * base_date
     */
    public static final String BASE_DATE = "base_date";

    /**
     * base_point
     */
    public static final String BASE_POINT = "base_point";

    /**
     * list_date
     */
    public static final String LIST_DATE = "list_date";

    /**
     * weight_rule
     */
    public static final String WEIGHT_RULE = "weight_rule";

    /**
     * desc
     */
    public static final String DESC = "desc";

    /**
     * exp_date
     */
    public static final String EXP_DATE = "exp_date";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, NAME, FULLNAME, MARKET, PUBLISHER, INDEX_TYPE, CATEGORY, BASE_DATE, BASE_POINT, LIST_DATE, WEIGHT_RULE, DESC, EXP_DATE);

    /**
     * TS代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 简称
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * 指数全称
     */
    @JsonProperty(value = "fullname")
    private String fullname;

    /**
     * 市场
     */
    @JsonProperty(value = "market")
    private String market;

    /**
     * 发布方
     */
    @JsonProperty(value = "publisher")
    private String publisher;

    /**
     * 指数风格
     */
    @JsonProperty(value = "index_type")
    private String indexType;

    /**
     * 指数类别
     */
    @JsonProperty(value = "category")
    private String category;

    /**
     * 基期
     */
    @JsonProperty(value = "base_date")
    private String baseDate;

    /**
     * 基点
     */
    @JsonProperty(value = "base_point")
    private Float basePoint;

    /**
     * 发布日期
     */
    @JsonProperty(value = "list_date")
    private String listDate;

    /**
     * 加权方式
     */
    @JsonProperty(value = "weight_rule")
    private String weightRule;

    /**
     * 描述
     */
    @JsonProperty(value = "desc")
    private String desc;

    /**
     * 终止日期
     */
    @JsonProperty(value = "exp_date")
    private String expDate;


    /**
     * init by array
     */
    public static IndexBasic init(String[] fields, Object[] item) {
        IndexBasic indexBasic = new IndexBasic();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    indexBasic.setTsCode((String) item[i]);
                    break;
                case NAME:
                    indexBasic.setName((String) item[i]);
                    break;
                case FULLNAME:
                    indexBasic.setFullname((String) item[i]);
                    break;
                case MARKET:
                    indexBasic.setMarket((String) item[i]);
                    break;
                case PUBLISHER:
                    indexBasic.setPublisher((String) item[i]);
                    break;
                case INDEX_TYPE:
                    indexBasic.setIndexType((String) item[i]);
                    break;
                case CATEGORY:
                    indexBasic.setCategory((String) item[i]);
                    break;
                case BASE_DATE:
                    indexBasic.setBaseDate((String) item[i]);
                    break;
                case BASE_POINT:
                    indexBasic.setBasePoint((Float) item[i]);
                    break;
                case LIST_DATE:
                    indexBasic.setListDate((String) item[i]);
                    break;
                case WEIGHT_RULE:
                    indexBasic.setWeightRule((String) item[i]);
                    break;
                case DESC:
                    indexBasic.setDesc((String) item[i]);
                    break;
                case EXP_DATE:
                    indexBasic.setExpDate((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return indexBasic;
    }

}

package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.799736
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class IndexClassify implements Model {

    /**
     * index_code
     */
    public static final String INDEX_CODE = "index_code";

    /**
     * industry_name
     */
    public static final String INDUSTRY_NAME = "industry_name";

    /**
     * level
     */
    public static final String LEVEL = "level";

    /**
     * industry_code
     */
    public static final String INDUSTRY_CODE = "industry_code";

    /**
     * src
     */
    public static final String SRC = "src";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(INDEX_CODE, INDUSTRY_NAME, LEVEL, INDUSTRY_CODE, SRC);

    /**
     * 指数代码
     */
    @JsonProperty(value = "index_code")
    private String indexCode;

    /**
     * 行业名称
     */
    @JsonProperty(value = "industry_name")
    private String industryName;

    /**
     * 行业名称
     */
    @JsonProperty(value = "level")
    private String level;

    /**
     * 行业代码
     */
    @JsonProperty(value = "industry_code")
    private String industryCode;

    /**
     * 行业分类（SW申万）
     */
    @JsonProperty(value = "src")
    private String src;


    /**
     * init by array
     */
    public static IndexClassify init(String[] fields, Object[] item) {
        IndexClassify indexClassify = new IndexClassify();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case INDEX_CODE:
                    indexClassify.setIndexCode((String) item[i]);
                    break;
                case INDUSTRY_NAME:
                    indexClassify.setIndustryName((String) item[i]);
                    break;
                case LEVEL:
                    indexClassify.setLevel((String) item[i]);
                    break;
                case INDUSTRY_CODE:
                    indexClassify.setIndustryCode((String) item[i]);
                    break;
                case SRC:
                    indexClassify.setSrc((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return indexClassify;
    }

}

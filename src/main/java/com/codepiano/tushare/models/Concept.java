package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.845304
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Concept implements Model {

    /**
     * code
     */
    public static final String CODE = "code";

    /**
     * name
     */
    public static final String NAME = "name";

    /**
     * src
     */
    public static final String SRC = "src";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(CODE, NAME, SRC);

    /**
     * 概念分类ID
     */
    @JsonProperty(value = "code")
    private String code;

    /**
     * 概念分类名称
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * 来源
     */
    @JsonProperty(value = "src")
    private String src;


    /**
     * init by array
     */
    public static Concept init(String[] fields, Object[] item) {
        Concept concept = new Concept();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case CODE:
                    concept.setCode((String) item[i]);
                    break;
                case NAME:
                    concept.setName((String) item[i]);
                    break;
                case SRC:
                    concept.setSrc((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return concept;
    }

}

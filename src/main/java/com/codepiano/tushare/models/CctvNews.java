package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.785103
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class CctvNews implements Model {

    /**
     * date
     */
    public static final String DATE = "date";

    /**
     * title
     */
    public static final String TITLE = "title";

    /**
     * content
     */
    public static final String CONTENT = "content";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(DATE, TITLE, CONTENT);

    /**
     * 日期
     */
    @JsonProperty(value = "date")
    private String date;

    /**
     * 标题
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * 内容
     */
    @JsonProperty(value = "content")
    private String content;


    /**
     * init by array
     */
    public static CctvNews init(String[] fields, Object[] item) {
        CctvNews cctvNews = new CctvNews();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case DATE:
                    cctvNews.setDate((String) item[i]);
                    break;
                case TITLE:
                    cctvNews.setTitle((String) item[i]);
                    break;
                case CONTENT:
                    cctvNews.setContent((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return cctvNews;
    }

}

package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.786235
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class News implements Model {

    /**
     * datetime
     */
    public static final String DATETIME = "datetime";

    /**
     * content
     */
    public static final String CONTENT = "content";

    /**
     * title
     */
    public static final String TITLE = "title";

    /**
     * channels
     */
    public static final String CHANNELS = "channels";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(DATETIME, CONTENT, TITLE, CHANNELS);

    /**
     * 新闻时间
     */
    @JsonProperty(value = "datetime")
    private String datetime;

    /**
     * 内容
     */
    @JsonProperty(value = "content")
    private String content;

    /**
     * 标题
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * 分类
     */
    @JsonProperty(value = "channels")
    private String channels;


    /**
     * init by array
     */
    public static News init(String[] fields, Object[] item) {
        News news = new News();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case DATETIME:
                    news.setDatetime((String) item[i]);
                    break;
                case CONTENT:
                    news.setContent((String) item[i]);
                    break;
                case TITLE:
                    news.setTitle((String) item[i]);
                    break;
                case CHANNELS:
                    news.setChannels((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return news;
    }

}

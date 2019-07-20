package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.773765
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Anns implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * ann_date
     */
    public static final String ANN_DATE = "ann_date";

    /**
     * ann_type
     */
    public static final String ANN_TYPE = "ann_type";

    /**
     * title
     */
    public static final String TITLE = "title";

    /**
     * content
     */
    public static final String CONTENT = "content";

    /**
     * pub_time
     */
    public static final String PUB_TIME = "pub_time";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, ANN_DATE, ANN_TYPE, TITLE, CONTENT, PUB_TIME);

    /**
     * 股票代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 公告日期
     */
    @JsonProperty(value = "ann_date")
    private String annDate;

    /**
     * 公告类型
     */
    @JsonProperty(value = "ann_type")
    private String annType;

    /**
     * 公告标题
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * 公告内容
     */
    @JsonProperty(value = "content")
    private String content;

    /**
     * 公告发布时间
     */
    @JsonProperty(value = "pub_time")
    private String pubTime;


    /**
     * init by array
     */
    public static Anns init(String[] fields, Object[] item) {
        Anns anns = new Anns();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    anns.setTsCode((String) item[i]);
                    break;
                case ANN_DATE:
                    anns.setAnnDate((String) item[i]);
                    break;
                case ANN_TYPE:
                    anns.setAnnType((String) item[i]);
                    break;
                case TITLE:
                    anns.setTitle((String) item[i]);
                    break;
                case CONTENT:
                    anns.setContent((String) item[i]);
                    break;
                case PUB_TIME:
                    anns.setPubTime((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return anns;
    }

}

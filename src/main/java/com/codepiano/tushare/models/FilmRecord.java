package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.792473
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FilmRecord implements Model {

    /**
     * rec_no
     */
    public static final String REC_NO = "rec_no";

    /**
     * film_name
     */
    public static final String FILM_NAME = "film_name";

    /**
     * rec_org
     */
    public static final String REC_ORG = "rec_org";

    /**
     * script_writer
     */
    public static final String SCRIPT_WRITER = "script_writer";

    /**
     * rec_result
     */
    public static final String REC_RESULT = "rec_result";

    /**
     * rec_area
     */
    public static final String REC_AREA = "rec_area";

    /**
     * classified
     */
    public static final String CLASSIFIED = "classified";

    /**
     * date_range
     */
    public static final String DATE_RANGE = "date_range";

    /**
     * ann_date
     */
    public static final String ANN_DATE = "ann_date";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(REC_NO, FILM_NAME, REC_ORG, SCRIPT_WRITER, REC_RESULT, REC_AREA, CLASSIFIED, DATE_RANGE, ANN_DATE);

    /**
     * 备案号
     */
    @JsonProperty(value = "rec_no")
    private String recNo;

    /**
     * 影片名称
     */
    @JsonProperty(value = "film_name")
    private String filmName;

    /**
     * 备案单位
     */
    @JsonProperty(value = "rec_org")
    private String recOrg;

    /**
     * 编剧
     */
    @JsonProperty(value = "script_writer")
    private String scriptWriter;

    /**
     * 备案结果
     */
    @JsonProperty(value = "rec_result")
    private String recResult;

    /**
     * 备案地（备案时间）
     */
    @JsonProperty(value = "rec_area")
    private String recArea;

    /**
     * 影片分类
     */
    @JsonProperty(value = "classified")
    private String classified;

    /**
     * 备案日期区间
     */
    @JsonProperty(value = "date_range")
    private String dateRange;

    /**
     * 备案结果发布时间
     */
    @JsonProperty(value = "ann_date")
    private String annDate;


    /**
     * init by array
     */
    public static FilmRecord init(String[] fields, Object[] item) {
        FilmRecord filmRecord = new FilmRecord();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case REC_NO:
                    filmRecord.setRecNo((String) item[i]);
                    break;
                case FILM_NAME:
                    filmRecord.setFilmName((String) item[i]);
                    break;
                case REC_ORG:
                    filmRecord.setRecOrg((String) item[i]);
                    break;
                case SCRIPT_WRITER:
                    filmRecord.setScriptWriter((String) item[i]);
                    break;
                case REC_RESULT:
                    filmRecord.setRecResult((String) item[i]);
                    break;
                case REC_AREA:
                    filmRecord.setRecArea((String) item[i]);
                    break;
                case CLASSIFIED:
                    filmRecord.setClassified((String) item[i]);
                    break;
                case DATE_RANGE:
                    filmRecord.setDateRange((String) item[i]);
                    break;
                case ANN_DATE:
                    filmRecord.setAnnDate((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return filmRecord;
    }

}

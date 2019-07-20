package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.841886
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ShareFloat implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * ann_date
     */
    public static final String ANN_DATE = "ann_date";

    /**
     * float_date
     */
    public static final String FLOAT_DATE = "float_date";

    /**
     * float_share
     */
    public static final String FLOAT_SHARE = "float_share";

    /**
     * float_ratio
     */
    public static final String FLOAT_RATIO = "float_ratio";

    /**
     * holder_name
     */
    public static final String HOLDER_NAME = "holder_name";

    /**
     * share_type
     */
    public static final String SHARE_TYPE = "share_type";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, ANN_DATE, FLOAT_DATE, FLOAT_SHARE, FLOAT_RATIO, HOLDER_NAME, SHARE_TYPE);

    /**
     * TS代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 公告日期
     */
    @JsonProperty(value = "ann_date")
    private String annDate;

    /**
     * 解禁日期
     */
    @JsonProperty(value = "float_date")
    private String floatDate;

    /**
     * 流通股份
     */
    @JsonProperty(value = "float_share")
    private Float floatShare;

    /**
     * 流通股份占总股本比率
     */
    @JsonProperty(value = "float_ratio")
    private Float floatRatio;

    /**
     * 股东名称
     */
    @JsonProperty(value = "holder_name")
    private String holderName;

    /**
     * 股份类型
     */
    @JsonProperty(value = "share_type")
    private String shareType;


    /**
     * init by array
     */
    public static ShareFloat init(String[] fields, Object[] item) {
        ShareFloat shareFloat = new ShareFloat();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    shareFloat.setTsCode((String) item[i]);
                    break;
                case ANN_DATE:
                    shareFloat.setAnnDate((String) item[i]);
                    break;
                case FLOAT_DATE:
                    shareFloat.setFloatDate((String) item[i]);
                    break;
                case FLOAT_SHARE:
                    shareFloat.setFloatShare((Float) item[i]);
                    break;
                case FLOAT_RATIO:
                    shareFloat.setFloatRatio((Float) item[i]);
                    break;
                case HOLDER_NAME:
                    shareFloat.setHolderName((String) item[i]);
                    break;
                case SHARE_TYPE:
                    shareFloat.setShareType((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return shareFloat;
    }

}

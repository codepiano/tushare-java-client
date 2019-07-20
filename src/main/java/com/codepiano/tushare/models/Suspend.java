package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.832614
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Suspend implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * suspend_date
     */
    public static final String SUSPEND_DATE = "suspend_date";

    /**
     * resume_date
     */
    public static final String RESUME_DATE = "resume_date";

    /**
     * ann_date
     */
    public static final String ANN_DATE = "ann_date";

    /**
     * suspend_reason
     */
    public static final String SUSPEND_REASON = "suspend_reason";

    /**
     * reason_type
     */
    public static final String REASON_TYPE = "reason_type";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, SUSPEND_DATE, RESUME_DATE, ANN_DATE, SUSPEND_REASON, REASON_TYPE);

    /**
     * 股票代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 停牌日期
     */
    @JsonProperty(value = "suspend_date")
    private String suspendDate;

    /**
     * 复牌日期
     */
    @JsonProperty(value = "resume_date")
    private String resumeDate;

    /**
     * 公告日期
     */
    @JsonProperty(value = "ann_date")
    private String annDate;

    /**
     * 停牌原因
     */
    @JsonProperty(value = "suspend_reason")
    private String suspendReason;

    /**
     * 停牌原因类别
     */
    @JsonProperty(value = "reason_type")
    private String reasonType;


    /**
     * init by array
     */
    public static Suspend init(String[] fields, Object[] item) {
        Suspend suspend = new Suspend();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    suspend.setTsCode((String) item[i]);
                    break;
                case SUSPEND_DATE:
                    suspend.setSuspendDate((String) item[i]);
                    break;
                case RESUME_DATE:
                    suspend.setResumeDate((String) item[i]);
                    break;
                case ANN_DATE:
                    suspend.setAnnDate((String) item[i]);
                    break;
                case SUSPEND_REASON:
                    suspend.setSuspendReason((String) item[i]);
                    break;
                case REASON_TYPE:
                    suspend.setReasonType((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return suspend;
    }

}

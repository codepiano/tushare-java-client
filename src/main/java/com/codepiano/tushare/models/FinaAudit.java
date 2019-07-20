package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.824088
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FinaAudit implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * ann_date
     */
    public static final String ANN_DATE = "ann_date";

    /**
     * end_date
     */
    public static final String END_DATE = "end_date";

    /**
     * audit_result
     */
    public static final String AUDIT_RESULT = "audit_result";

    /**
     * audit_fees
     */
    public static final String AUDIT_FEES = "audit_fees";

    /**
     * audit_agency
     */
    public static final String AUDIT_AGENCY = "audit_agency";

    /**
     * audit_sign
     */
    public static final String AUDIT_SIGN = "audit_sign";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, ANN_DATE, END_DATE, AUDIT_RESULT, AUDIT_FEES, AUDIT_AGENCY, AUDIT_SIGN);

    /**
     * TS股票代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 公告日期
     */
    @JsonProperty(value = "ann_date")
    private String annDate;

    /**
     * 报告期
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * 审计结果
     */
    @JsonProperty(value = "audit_result")
    private String auditResult;

    /**
     * 审计总费用（元）
     */
    @JsonProperty(value = "audit_fees")
    private Float auditFees;

    /**
     * 会计事务所
     */
    @JsonProperty(value = "audit_agency")
    private String auditAgency;

    /**
     * 签字会计师
     */
    @JsonProperty(value = "audit_sign")
    private String auditSign;


    /**
     * init by array
     */
    public static FinaAudit init(String[] fields, Object[] item) {
        FinaAudit finaAudit = new FinaAudit();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    finaAudit.setTsCode((String) item[i]);
                    break;
                case ANN_DATE:
                    finaAudit.setAnnDate((String) item[i]);
                    break;
                case END_DATE:
                    finaAudit.setEndDate((String) item[i]);
                    break;
                case AUDIT_RESULT:
                    finaAudit.setAuditResult((String) item[i]);
                    break;
                case AUDIT_FEES:
                    finaAudit.setAuditFees((Float) item[i]);
                    break;
                case AUDIT_AGENCY:
                    finaAudit.setAuditAgency((String) item[i]);
                    break;
                case AUDIT_SIGN:
                    finaAudit.setAuditSign((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return finaAudit;
    }

}

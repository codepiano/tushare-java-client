package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.787812
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class TeleplayRecord implements Model {

    /**
     * name
     */
    public static final String NAME = "name";

    /**
     * classify
     */
    public static final String CLASSIFY = "classify";

    /**
     * types
     */
    public static final String TYPES = "types";

    /**
     * org
     */
    public static final String ORG = "org";

    /**
     * report_date
     */
    public static final String REPORT_DATE = "report_date";

    /**
     * license_key
     */
    public static final String LICENSE_KEY = "license_key";

    /**
     * episodes
     */
    public static final String EPISODES = "episodes";

    /**
     * shooting_date
     */
    public static final String SHOOTING_DATE = "shooting_date";

    /**
     * prod_cycle
     */
    public static final String PROD_CYCLE = "prod_cycle";

    /**
     * content
     */
    public static final String CONTENT = "content";

    /**
     * pro_opi
     */
    public static final String PRO_OPI = "pro_opi";

    /**
     * dept_opi
     */
    public static final String DEPT_OPI = "dept_opi";

    /**
     * remarks
     */
    public static final String REMARKS = "remarks";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(NAME, CLASSIFY, TYPES, ORG, REPORT_DATE, LICENSE_KEY, EPISODES, SHOOTING_DATE, PROD_CYCLE, CONTENT, PRO_OPI, DEPT_OPI, REMARKS);

    /**
     * 电视剧名称
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * 题材
     */
    @JsonProperty(value = "classify")
    private String classify;

    /**
     * 体裁
     */
    @JsonProperty(value = "types")
    private String types;

    /**
     * 报备机构
     */
    @JsonProperty(value = "org")
    private String org;

    /**
     * 报备时间
     */
    @JsonProperty(value = "report_date")
    private String reportDate;

    /**
     * 许可证号
     */
    @JsonProperty(value = "license_key")
    private String licenseKey;

    /**
     * 集数
     */
    @JsonProperty(value = "episodes")
    private String episodes;

    /**
     * 拍摄时间
     */
    @JsonProperty(value = "shooting_date")
    private String shootingDate;

    /**
     * 制作周期
     */
    @JsonProperty(value = "prod_cycle")
    private String prodCycle;

    /**
     * 内容提要
     */
    @JsonProperty(value = "content")
    private String content;

    /**
     * 省级管理部门备案意见
     */
    @JsonProperty(value = "pro_opi")
    private String proOpi;

    /**
     * 相关部门意见
     */
    @JsonProperty(value = "dept_opi")
    private String deptOpi;

    /**
     * 备注
     */
    @JsonProperty(value = "remarks")
    private String remarks;


    /**
     * init by array
     */
    public static TeleplayRecord init(String[] fields, Object[] item) {
        TeleplayRecord teleplayRecord = new TeleplayRecord();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case NAME:
                    teleplayRecord.setName((String) item[i]);
                    break;
                case CLASSIFY:
                    teleplayRecord.setClassify((String) item[i]);
                    break;
                case TYPES:
                    teleplayRecord.setTypes((String) item[i]);
                    break;
                case ORG:
                    teleplayRecord.setOrg((String) item[i]);
                    break;
                case REPORT_DATE:
                    teleplayRecord.setReportDate((String) item[i]);
                    break;
                case LICENSE_KEY:
                    teleplayRecord.setLicenseKey((String) item[i]);
                    break;
                case EPISODES:
                    teleplayRecord.setEpisodes((String) item[i]);
                    break;
                case SHOOTING_DATE:
                    teleplayRecord.setShootingDate((String) item[i]);
                    break;
                case PROD_CYCLE:
                    teleplayRecord.setProdCycle((String) item[i]);
                    break;
                case CONTENT:
                    teleplayRecord.setContent((String) item[i]);
                    break;
                case PRO_OPI:
                    teleplayRecord.setProOpi((String) item[i]);
                    break;
                case DEPT_OPI:
                    teleplayRecord.setDeptOpi((String) item[i]);
                    break;
                case REMARKS:
                    teleplayRecord.setRemarks((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return teleplayRecord;
    }

}

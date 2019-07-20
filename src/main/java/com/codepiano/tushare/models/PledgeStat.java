package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.820572
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class PledgeStat implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * end_date
     */
    public static final String END_DATE = "end_date";

    /**
     * pledge_count
     */
    public static final String PLEDGE_COUNT = "pledge_count";

    /**
     * unrest_pledge
     */
    public static final String UNREST_PLEDGE = "unrest_pledge";

    /**
     * rest_pledge
     */
    public static final String REST_PLEDGE = "rest_pledge";

    /**
     * total_share
     */
    public static final String TOTAL_SHARE = "total_share";

    /**
     * pledge_ratio
     */
    public static final String PLEDGE_RATIO = "pledge_ratio";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, END_DATE, PLEDGE_COUNT, UNREST_PLEDGE, REST_PLEDGE, TOTAL_SHARE, PLEDGE_RATIO);

    /**
     * TS代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 截至日期
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * 质押次数
     */
    @JsonProperty(value = "pledge_count")
    private Integer pledgeCount;

    /**
     * 无限售股质押数量（万）
     */
    @JsonProperty(value = "unrest_pledge")
    private Float unrestPledge;

    /**
     * 限售股份质押数量（万）
     */
    @JsonProperty(value = "rest_pledge")
    private Float restPledge;

    /**
     * 总股本
     */
    @JsonProperty(value = "total_share")
    private Float totalShare;

    /**
     * 质押比例
     */
    @JsonProperty(value = "pledge_ratio")
    private Float pledgeRatio;


    /**
     * init by array
     */
    public static PledgeStat init(String[] fields, Object[] item) {
        PledgeStat pledgeStat = new PledgeStat();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    pledgeStat.setTsCode((String) item[i]);
                    break;
                case END_DATE:
                    pledgeStat.setEndDate((String) item[i]);
                    break;
                case PLEDGE_COUNT:
                    pledgeStat.setPledgeCount((Integer) item[i]);
                    break;
                case UNREST_PLEDGE:
                    pledgeStat.setUnrestPledge((Float) item[i]);
                    break;
                case REST_PLEDGE:
                    pledgeStat.setRestPledge((Float) item[i]);
                    break;
                case TOTAL_SHARE:
                    pledgeStat.setTotalShare((Float) item[i]);
                    break;
                case PLEDGE_RATIO:
                    pledgeStat.setPledgeRatio((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return pledgeStat;
    }

}

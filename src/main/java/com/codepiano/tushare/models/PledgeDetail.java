package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.822258
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class PledgeDetail implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * ann_date
     */
    public static final String ANN_DATE = "ann_date";

    /**
     * holder_name
     */
    public static final String HOLDER_NAME = "holder_name";

    /**
     * pledge_amount
     */
    public static final String PLEDGE_AMOUNT = "pledge_amount";

    /**
     * start_date
     */
    public static final String START_DATE = "start_date";

    /**
     * end_date
     */
    public static final String END_DATE = "end_date";

    /**
     * is_release
     */
    public static final String IS_RELEASE = "is_release";

    /**
     * release_date
     */
    public static final String RELEASE_DATE = "release_date";

    /**
     * pledgor
     */
    public static final String PLEDGOR = "pledgor";

    /**
     * holding_amount
     */
    public static final String HOLDING_AMOUNT = "holding_amount";

    /**
     * pledged_amount
     */
    public static final String PLEDGED_AMOUNT = "pledged_amount";

    /**
     * p_total_ratio
     */
    public static final String P_TOTAL_RATIO = "p_total_ratio";

    /**
     * h_total_ratio
     */
    public static final String H_TOTAL_RATIO = "h_total_ratio";

    /**
     * is_buyback
     */
    public static final String IS_BUYBACK = "is_buyback";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, ANN_DATE, HOLDER_NAME, PLEDGE_AMOUNT, START_DATE, END_DATE, IS_RELEASE, RELEASE_DATE, PLEDGOR, HOLDING_AMOUNT, PLEDGED_AMOUNT, P_TOTAL_RATIO, H_TOTAL_RATIO, IS_BUYBACK);

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
     * 股东名称
     */
    @JsonProperty(value = "holder_name")
    private String holderName;

    /**
     * 质押数量
     */
    @JsonProperty(value = "pledge_amount")
    private Float pledgeAmount;

    /**
     * 质押开始日期
     */
    @JsonProperty(value = "start_date")
    private String startDate;

    /**
     * 质押结束日期
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * 是否已解押
     */
    @JsonProperty(value = "is_release")
    private String isRelease;

    /**
     * 解押日期
     */
    @JsonProperty(value = "release_date")
    private String releaseDate;

    /**
     * 质押方
     */
    @JsonProperty(value = "pledgor")
    private String pledgor;

    /**
     * 持股总数
     */
    @JsonProperty(value = "holding_amount")
    private Float holdingAmount;

    /**
     * 质押总数
     */
    @JsonProperty(value = "pledged_amount")
    private Float pledgedAmount;

    /**
     * 本次质押占总股本比例
     */
    @JsonProperty(value = "p_total_ratio")
    private Float pTotalRatio;

    /**
     * 持股总数占总股本比例
     */
    @JsonProperty(value = "h_total_ratio")
    private Float hTotalRatio;

    /**
     * 是否回购
     */
    @JsonProperty(value = "is_buyback")
    private String isBuyback;


    /**
     * init by array
     */
    public static PledgeDetail init(String[] fields, Object[] item) {
        PledgeDetail pledgeDetail = new PledgeDetail();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    pledgeDetail.setTsCode((String) item[i]);
                    break;
                case ANN_DATE:
                    pledgeDetail.setAnnDate((String) item[i]);
                    break;
                case HOLDER_NAME:
                    pledgeDetail.setHolderName((String) item[i]);
                    break;
                case PLEDGE_AMOUNT:
                    pledgeDetail.setPledgeAmount((Float) item[i]);
                    break;
                case START_DATE:
                    pledgeDetail.setStartDate((String) item[i]);
                    break;
                case END_DATE:
                    pledgeDetail.setEndDate((String) item[i]);
                    break;
                case IS_RELEASE:
                    pledgeDetail.setIsRelease((String) item[i]);
                    break;
                case RELEASE_DATE:
                    pledgeDetail.setReleaseDate((String) item[i]);
                    break;
                case PLEDGOR:
                    pledgeDetail.setPledgor((String) item[i]);
                    break;
                case HOLDING_AMOUNT:
                    pledgeDetail.setHoldingAmount((Float) item[i]);
                    break;
                case PLEDGED_AMOUNT:
                    pledgeDetail.setPledgedAmount((Float) item[i]);
                    break;
                case P_TOTAL_RATIO:
                    pledgeDetail.setPTotalRatio((Float) item[i]);
                    break;
                case H_TOTAL_RATIO:
                    pledgeDetail.setHTotalRatio((Float) item[i]);
                    break;
                case IS_BUYBACK:
                    pledgeDetail.setIsBuyback((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return pledgeDetail;
    }

}

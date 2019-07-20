package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.828409
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Forecast implements Model {

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
     * type
     */
    public static final String TYPE = "type";

    /**
     * p_change_min
     */
    public static final String P_CHANGE_MIN = "p_change_min";

    /**
     * p_change_max
     */
    public static final String P_CHANGE_MAX = "p_change_max";

    /**
     * net_profit_min
     */
    public static final String NET_PROFIT_MIN = "net_profit_min";

    /**
     * net_profit_max
     */
    public static final String NET_PROFIT_MAX = "net_profit_max";

    /**
     * last_parent_net
     */
    public static final String LAST_PARENT_NET = "last_parent_net";

    /**
     * first_ann_date
     */
    public static final String FIRST_ANN_DATE = "first_ann_date";

    /**
     * summary
     */
    public static final String SUMMARY = "summary";

    /**
     * change_reason
     */
    public static final String CHANGE_REASON = "change_reason";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, ANN_DATE, END_DATE, TYPE, P_CHANGE_MIN, P_CHANGE_MAX, NET_PROFIT_MIN, NET_PROFIT_MAX, LAST_PARENT_NET, FIRST_ANN_DATE, SUMMARY, CHANGE_REASON);

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
     * 业绩预告类型(预增/预减/扭亏/首亏/续亏/续盈/略增/略减)
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * 预告净利润变动幅度下限（%）
     */
    @JsonProperty(value = "p_change_min")
    private Float pChangeMin;

    /**
     * 预告净利润变动幅度上限（%）
     */
    @JsonProperty(value = "p_change_max")
    private Float pChangeMax;

    /**
     * 预告净利润下限（万元）
     */
    @JsonProperty(value = "net_profit_min")
    private Float netProfitMin;

    /**
     * 预告净利润上限（万元）
     */
    @JsonProperty(value = "net_profit_max")
    private Float netProfitMax;

    /**
     * 上年同期归属母公司净利润
     */
    @JsonProperty(value = "last_parent_net")
    private Float lastParentNet;

    /**
     * 首次公告日
     */
    @JsonProperty(value = "first_ann_date")
    private String firstAnnDate;

    /**
     * 业绩预告摘要
     */
    @JsonProperty(value = "summary")
    private String summary;

    /**
     * 业绩变动原因
     */
    @JsonProperty(value = "change_reason")
    private String changeReason;


    /**
     * init by array
     */
    public static Forecast init(String[] fields, Object[] item) {
        Forecast forecast = new Forecast();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    forecast.setTsCode((String) item[i]);
                    break;
                case ANN_DATE:
                    forecast.setAnnDate((String) item[i]);
                    break;
                case END_DATE:
                    forecast.setEndDate((String) item[i]);
                    break;
                case TYPE:
                    forecast.setType((String) item[i]);
                    break;
                case P_CHANGE_MIN:
                    forecast.setPChangeMin((Float) item[i]);
                    break;
                case P_CHANGE_MAX:
                    forecast.setPChangeMax((Float) item[i]);
                    break;
                case NET_PROFIT_MIN:
                    forecast.setNetProfitMin((Float) item[i]);
                    break;
                case NET_PROFIT_MAX:
                    forecast.setNetProfitMax((Float) item[i]);
                    break;
                case LAST_PARENT_NET:
                    forecast.setLastParentNet((Float) item[i]);
                    break;
                case FIRST_ANN_DATE:
                    forecast.setFirstAnnDate((String) item[i]);
                    break;
                case SUMMARY:
                    forecast.setSummary((String) item[i]);
                    break;
                case CHANGE_REASON:
                    forecast.setChangeReason((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return forecast;
    }

}

package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.807141
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FundNav implements Model {

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
     * unit_nav
     */
    public static final String UNIT_NAV = "unit_nav";

    /**
     * accum_nav
     */
    public static final String ACCUM_NAV = "accum_nav";

    /**
     * accum_div
     */
    public static final String ACCUM_DIV = "accum_div";

    /**
     * net_asset
     */
    public static final String NET_ASSET = "net_asset";

    /**
     * total_netasset
     */
    public static final String TOTAL_NETASSET = "total_netasset";

    /**
     * adj_nav
     */
    public static final String ADJ_NAV = "adj_nav";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, ANN_DATE, END_DATE, UNIT_NAV, ACCUM_NAV, ACCUM_DIV, NET_ASSET, TOTAL_NETASSET, ADJ_NAV);

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
     * 截止日期
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * 单位净值
     */
    @JsonProperty(value = "unit_nav")
    private Float unitNav;

    /**
     * 累计净值
     */
    @JsonProperty(value = "accum_nav")
    private Float accumNav;

    /**
     * 累计分红
     */
    @JsonProperty(value = "accum_div")
    private Float accumDiv;

    /**
     * 资产净值
     */
    @JsonProperty(value = "net_asset")
    private Float netAsset;

    /**
     * 合计资产净值
     */
    @JsonProperty(value = "total_netasset")
    private Float totalNetasset;

    /**
     * 复权单位净值
     */
    @JsonProperty(value = "adj_nav")
    private Float adjNav;


    /**
     * init by array
     */
    public static FundNav init(String[] fields, Object[] item) {
        FundNav fundNav = new FundNav();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    fundNav.setTsCode((String) item[i]);
                    break;
                case ANN_DATE:
                    fundNav.setAnnDate((String) item[i]);
                    break;
                case END_DATE:
                    fundNav.setEndDate((String) item[i]);
                    break;
                case UNIT_NAV:
                    fundNav.setUnitNav((Float) item[i]);
                    break;
                case ACCUM_NAV:
                    fundNav.setAccumNav((Float) item[i]);
                    break;
                case ACCUM_DIV:
                    fundNav.setAccumDiv((Float) item[i]);
                    break;
                case NET_ASSET:
                    fundNav.setNetAsset((Float) item[i]);
                    break;
                case TOTAL_NETASSET:
                    fundNav.setTotalNetasset((Float) item[i]);
                    break;
                case ADJ_NAV:
                    fundNav.setAdjNav((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return fundNav;
    }

}

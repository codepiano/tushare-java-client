package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.829434
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Express implements Model {

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
     * revenue
     */
    public static final String REVENUE = "revenue";

    /**
     * operate_profit
     */
    public static final String OPERATE_PROFIT = "operate_profit";

    /**
     * total_profit
     */
    public static final String TOTAL_PROFIT = "total_profit";

    /**
     * n_income
     */
    public static final String N_INCOME = "n_income";

    /**
     * total_assets
     */
    public static final String TOTAL_ASSETS = "total_assets";

    /**
     * total_hldr_eqy_exc_min_int
     */
    public static final String TOTAL_HLDR_EQY_EXC_MIN_INT = "total_hldr_eqy_exc_min_int";

    /**
     * diluted_eps
     */
    public static final String DILUTED_EPS = "diluted_eps";

    /**
     * diluted_roe
     */
    public static final String DILUTED_ROE = "diluted_roe";

    /**
     * yoy_net_profit
     */
    public static final String YOY_NET_PROFIT = "yoy_net_profit";

    /**
     * bps
     */
    public static final String BPS = "bps";

    /**
     * yoy_sales
     */
    public static final String YOY_SALES = "yoy_sales";

    /**
     * yoy_op
     */
    public static final String YOY_OP = "yoy_op";

    /**
     * yoy_tp
     */
    public static final String YOY_TP = "yoy_tp";

    /**
     * yoy_dedu_np
     */
    public static final String YOY_DEDU_NP = "yoy_dedu_np";

    /**
     * yoy_eps
     */
    public static final String YOY_EPS = "yoy_eps";

    /**
     * yoy_roe
     */
    public static final String YOY_ROE = "yoy_roe";

    /**
     * growth_assets
     */
    public static final String GROWTH_ASSETS = "growth_assets";

    /**
     * yoy_equity
     */
    public static final String YOY_EQUITY = "yoy_equity";

    /**
     * growth_bps
     */
    public static final String GROWTH_BPS = "growth_bps";

    /**
     * or_last_year
     */
    public static final String OR_LAST_YEAR = "or_last_year";

    /**
     * op_last_year
     */
    public static final String OP_LAST_YEAR = "op_last_year";

    /**
     * tp_last_year
     */
    public static final String TP_LAST_YEAR = "tp_last_year";

    /**
     * np_last_year
     */
    public static final String NP_LAST_YEAR = "np_last_year";

    /**
     * eps_last_year
     */
    public static final String EPS_LAST_YEAR = "eps_last_year";

    /**
     * open_net_assets
     */
    public static final String OPEN_NET_ASSETS = "open_net_assets";

    /**
     * open_bps
     */
    public static final String OPEN_BPS = "open_bps";

    /**
     * perf_summary
     */
    public static final String PERF_SUMMARY = "perf_summary";

    /**
     * is_audit
     */
    public static final String IS_AUDIT = "is_audit";

    /**
     * remark
     */
    public static final String REMARK = "remark";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, ANN_DATE, END_DATE, REVENUE, OPERATE_PROFIT, TOTAL_PROFIT, N_INCOME, TOTAL_ASSETS, TOTAL_HLDR_EQY_EXC_MIN_INT, DILUTED_EPS, DILUTED_ROE, YOY_NET_PROFIT, BPS, YOY_SALES, YOY_OP, YOY_TP, YOY_DEDU_NP, YOY_EPS, YOY_ROE, GROWTH_ASSETS, YOY_EQUITY, GROWTH_BPS, OR_LAST_YEAR, OP_LAST_YEAR, TP_LAST_YEAR, NP_LAST_YEAR, EPS_LAST_YEAR, OPEN_NET_ASSETS, OPEN_BPS, PERF_SUMMARY, IS_AUDIT, REMARK);

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
     * 营业收入(元)
     */
    @JsonProperty(value = "revenue")
    private Float revenue;

    /**
     * 营业利润(元)
     */
    @JsonProperty(value = "operate_profit")
    private Float operateProfit;

    /**
     * 利润总额(元)
     */
    @JsonProperty(value = "total_profit")
    private Float totalProfit;

    /**
     * 净利润(元)
     */
    @JsonProperty(value = "n_income")
    private Float nIncome;

    /**
     * 总资产(元)
     */
    @JsonProperty(value = "total_assets")
    private Float totalAssets;

    /**
     * 股东权益合计(不含少数股东权益)(元)
     */
    @JsonProperty(value = "total_hldr_eqy_exc_min_int")
    private Float totalHldrEqyExcMinInt;

    /**
     * 每股收益(摊薄)(元)
     */
    @JsonProperty(value = "diluted_eps")
    private Float dilutedEps;

    /**
     * 净资产收益率(摊薄)(%)
     */
    @JsonProperty(value = "diluted_roe")
    private Float dilutedRoe;

    /**
     * 去年同期修正后净利润
     */
    @JsonProperty(value = "yoy_net_profit")
    private Float yoyNetProfit;

    /**
     * 每股净资产
     */
    @JsonProperty(value = "bps")
    private Float bps;

    /**
     * 同比增长率:营业收入
     */
    @JsonProperty(value = "yoy_sales")
    private Float yoySales;

    /**
     * 同比增长率:营业利润
     */
    @JsonProperty(value = "yoy_op")
    private Float yoyOp;

    /**
     * 同比增长率:利润总额
     */
    @JsonProperty(value = "yoy_tp")
    private Float yoyTp;

    /**
     * 同比增长率:归属母公司股东的净利润
     */
    @JsonProperty(value = "yoy_dedu_np")
    private Float yoyDeduNp;

    /**
     * 同比增长率:基本每股收益
     */
    @JsonProperty(value = "yoy_eps")
    private Float yoyEps;

    /**
     * 同比增减:加权平均净资产收益率
     */
    @JsonProperty(value = "yoy_roe")
    private Float yoyRoe;

    /**
     * 比年初增长率:总资产
     */
    @JsonProperty(value = "growth_assets")
    private Float growthAssets;

    /**
     * 比年初增长率:归属母公司的股东权益
     */
    @JsonProperty(value = "yoy_equity")
    private Float yoyEquity;

    /**
     * 比年初增长率:归属于母公司股东的每股净资产
     */
    @JsonProperty(value = "growth_bps")
    private Float growthBps;

    /**
     * 去年同期营业收入
     */
    @JsonProperty(value = "or_last_year")
    private Float orLastYear;

    /**
     * 去年同期营业利润
     */
    @JsonProperty(value = "op_last_year")
    private Float opLastYear;

    /**
     * 去年同期利润总额
     */
    @JsonProperty(value = "tp_last_year")
    private Float tpLastYear;

    /**
     * 去年同期净利润
     */
    @JsonProperty(value = "np_last_year")
    private Float npLastYear;

    /**
     * 去年同期每股收益
     */
    @JsonProperty(value = "eps_last_year")
    private Float epsLastYear;

    /**
     * 期初净资产
     */
    @JsonProperty(value = "open_net_assets")
    private Float openNetAssets;

    /**
     * 期初每股净资产
     */
    @JsonProperty(value = "open_bps")
    private Float openBps;

    /**
     * 业绩简要说明
     */
    @JsonProperty(value = "perf_summary")
    private String perfSummary;

    /**
     * 是否审计： 1是 0否
     */
    @JsonProperty(value = "is_audit")
    private Integer isAudit;

    /**
     * 备注
     */
    @JsonProperty(value = "remark")
    private String remark;


    /**
     * init by array
     */
    public static Express init(String[] fields, Object[] item) {
        Express express = new Express();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    express.setTsCode((String) item[i]);
                    break;
                case ANN_DATE:
                    express.setAnnDate((String) item[i]);
                    break;
                case END_DATE:
                    express.setEndDate((String) item[i]);
                    break;
                case REVENUE:
                    express.setRevenue((Float) item[i]);
                    break;
                case OPERATE_PROFIT:
                    express.setOperateProfit((Float) item[i]);
                    break;
                case TOTAL_PROFIT:
                    express.setTotalProfit((Float) item[i]);
                    break;
                case N_INCOME:
                    express.setNIncome((Float) item[i]);
                    break;
                case TOTAL_ASSETS:
                    express.setTotalAssets((Float) item[i]);
                    break;
                case TOTAL_HLDR_EQY_EXC_MIN_INT:
                    express.setTotalHldrEqyExcMinInt((Float) item[i]);
                    break;
                case DILUTED_EPS:
                    express.setDilutedEps((Float) item[i]);
                    break;
                case DILUTED_ROE:
                    express.setDilutedRoe((Float) item[i]);
                    break;
                case YOY_NET_PROFIT:
                    express.setYoyNetProfit((Float) item[i]);
                    break;
                case BPS:
                    express.setBps((Float) item[i]);
                    break;
                case YOY_SALES:
                    express.setYoySales((Float) item[i]);
                    break;
                case YOY_OP:
                    express.setYoyOp((Float) item[i]);
                    break;
                case YOY_TP:
                    express.setYoyTp((Float) item[i]);
                    break;
                case YOY_DEDU_NP:
                    express.setYoyDeduNp((Float) item[i]);
                    break;
                case YOY_EPS:
                    express.setYoyEps((Float) item[i]);
                    break;
                case YOY_ROE:
                    express.setYoyRoe((Float) item[i]);
                    break;
                case GROWTH_ASSETS:
                    express.setGrowthAssets((Float) item[i]);
                    break;
                case YOY_EQUITY:
                    express.setYoyEquity((Float) item[i]);
                    break;
                case GROWTH_BPS:
                    express.setGrowthBps((Float) item[i]);
                    break;
                case OR_LAST_YEAR:
                    express.setOrLastYear((Float) item[i]);
                    break;
                case OP_LAST_YEAR:
                    express.setOpLastYear((Float) item[i]);
                    break;
                case TP_LAST_YEAR:
                    express.setTpLastYear((Float) item[i]);
                    break;
                case NP_LAST_YEAR:
                    express.setNpLastYear((Float) item[i]);
                    break;
                case EPS_LAST_YEAR:
                    express.setEpsLastYear((Float) item[i]);
                    break;
                case OPEN_NET_ASSETS:
                    express.setOpenNetAssets((Float) item[i]);
                    break;
                case OPEN_BPS:
                    express.setOpenBps((Float) item[i]);
                    break;
                case PERF_SUMMARY:
                    express.setPerfSummary((String) item[i]);
                    break;
                case IS_AUDIT:
                    express.setIsAudit((Integer) item[i]);
                    break;
                case REMARK:
                    express.setRemark((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return express;
    }

}

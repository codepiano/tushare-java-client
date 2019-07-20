package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.836286
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FinaIndicator implements Model {

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
     * eps
     */
    public static final String EPS = "eps";

    /**
     * dt_eps
     */
    public static final String DT_EPS = "dt_eps";

    /**
     * total_revenue_ps
     */
    public static final String TOTAL_REVENUE_PS = "total_revenue_ps";

    /**
     * revenue_ps
     */
    public static final String REVENUE_PS = "revenue_ps";

    /**
     * capital_rese_ps
     */
    public static final String CAPITAL_RESE_PS = "capital_rese_ps";

    /**
     * surplus_rese_ps
     */
    public static final String SURPLUS_RESE_PS = "surplus_rese_ps";

    /**
     * undist_profit_ps
     */
    public static final String UNDIST_PROFIT_PS = "undist_profit_ps";

    /**
     * extra_item
     */
    public static final String EXTRA_ITEM = "extra_item";

    /**
     * profit_dedt
     */
    public static final String PROFIT_DEDT = "profit_dedt";

    /**
     * gross_margin
     */
    public static final String GROSS_MARGIN = "gross_margin";

    /**
     * current_ratio
     */
    public static final String CURRENT_RATIO = "current_ratio";

    /**
     * quick_ratio
     */
    public static final String QUICK_RATIO = "quick_ratio";

    /**
     * cash_ratio
     */
    public static final String CASH_RATIO = "cash_ratio";

    /**
     * invturn_days
     */
    public static final String INVTURN_DAYS = "invturn_days";

    /**
     * arturn_days
     */
    public static final String ARTURN_DAYS = "arturn_days";

    /**
     * inv_turn
     */
    public static final String INV_TURN = "inv_turn";

    /**
     * ar_turn
     */
    public static final String AR_TURN = "ar_turn";

    /**
     * ca_turn
     */
    public static final String CA_TURN = "ca_turn";

    /**
     * fa_turn
     */
    public static final String FA_TURN = "fa_turn";

    /**
     * assets_turn
     */
    public static final String ASSETS_TURN = "assets_turn";

    /**
     * op_income
     */
    public static final String OP_INCOME = "op_income";

    /**
     * valuechange_income
     */
    public static final String VALUECHANGE_INCOME = "valuechange_income";

    /**
     * interst_income
     */
    public static final String INTERST_INCOME = "interst_income";

    /**
     * daa
     */
    public static final String DAA = "daa";

    /**
     * ebit
     */
    public static final String EBIT = "ebit";

    /**
     * ebitda
     */
    public static final String EBITDA = "ebitda";

    /**
     * fcff
     */
    public static final String FCFF = "fcff";

    /**
     * fcfe
     */
    public static final String FCFE = "fcfe";

    /**
     * current_exint
     */
    public static final String CURRENT_EXINT = "current_exint";

    /**
     * noncurrent_exint
     */
    public static final String NONCURRENT_EXINT = "noncurrent_exint";

    /**
     * interestdebt
     */
    public static final String INTERESTDEBT = "interestdebt";

    /**
     * netdebt
     */
    public static final String NETDEBT = "netdebt";

    /**
     * tangible_asset
     */
    public static final String TANGIBLE_ASSET = "tangible_asset";

    /**
     * working_capital
     */
    public static final String WORKING_CAPITAL = "working_capital";

    /**
     * networking_capital
     */
    public static final String NETWORKING_CAPITAL = "networking_capital";

    /**
     * invest_capital
     */
    public static final String INVEST_CAPITAL = "invest_capital";

    /**
     * retained_earnings
     */
    public static final String RETAINED_EARNINGS = "retained_earnings";

    /**
     * diluted2_eps
     */
    public static final String DILUTED2_EPS = "diluted2_eps";

    /**
     * bps
     */
    public static final String BPS = "bps";

    /**
     * ocfps
     */
    public static final String OCFPS = "ocfps";

    /**
     * retainedps
     */
    public static final String RETAINEDPS = "retainedps";

    /**
     * cfps
     */
    public static final String CFPS = "cfps";

    /**
     * ebit_ps
     */
    public static final String EBIT_PS = "ebit_ps";

    /**
     * fcff_ps
     */
    public static final String FCFF_PS = "fcff_ps";

    /**
     * fcfe_ps
     */
    public static final String FCFE_PS = "fcfe_ps";

    /**
     * netprofit_margin
     */
    public static final String NETPROFIT_MARGIN = "netprofit_margin";

    /**
     * grossprofit_margin
     */
    public static final String GROSSPROFIT_MARGIN = "grossprofit_margin";

    /**
     * cogs_of_sales
     */
    public static final String COGS_OF_SALES = "cogs_of_sales";

    /**
     * expense_of_sales
     */
    public static final String EXPENSE_OF_SALES = "expense_of_sales";

    /**
     * profit_to_gr
     */
    public static final String PROFIT_TO_GR = "profit_to_gr";

    /**
     * saleexp_to_gr
     */
    public static final String SALEEXP_TO_GR = "saleexp_to_gr";

    /**
     * adminexp_of_gr
     */
    public static final String ADMINEXP_OF_GR = "adminexp_of_gr";

    /**
     * finaexp_of_gr
     */
    public static final String FINAEXP_OF_GR = "finaexp_of_gr";

    /**
     * impai_ttm
     */
    public static final String IMPAI_TTM = "impai_ttm";

    /**
     * gc_of_gr
     */
    public static final String GC_OF_GR = "gc_of_gr";

    /**
     * op_of_gr
     */
    public static final String OP_OF_GR = "op_of_gr";

    /**
     * ebit_of_gr
     */
    public static final String EBIT_OF_GR = "ebit_of_gr";

    /**
     * roe
     */
    public static final String ROE = "roe";

    /**
     * roe_waa
     */
    public static final String ROE_WAA = "roe_waa";

    /**
     * roe_dt
     */
    public static final String ROE_DT = "roe_dt";

    /**
     * roa
     */
    public static final String ROA = "roa";

    /**
     * npta
     */
    public static final String NPTA = "npta";

    /**
     * roic
     */
    public static final String ROIC = "roic";

    /**
     * roe_yearly
     */
    public static final String ROE_YEARLY = "roe_yearly";

    /**
     * roa2_yearly
     */
    public static final String ROA2_YEARLY = "roa2_yearly";

    /**
     * roe_avg
     */
    public static final String ROE_AVG = "roe_avg";

    /**
     * opincome_of_ebt
     */
    public static final String OPINCOME_OF_EBT = "opincome_of_ebt";

    /**
     * investincome_of_ebt
     */
    public static final String INVESTINCOME_OF_EBT = "investincome_of_ebt";

    /**
     * n_op_profit_of_ebt
     */
    public static final String N_OP_PROFIT_OF_EBT = "n_op_profit_of_ebt";

    /**
     * tax_to_ebt
     */
    public static final String TAX_TO_EBT = "tax_to_ebt";

    /**
     * dtprofit_to_profit
     */
    public static final String DTPROFIT_TO_PROFIT = "dtprofit_to_profit";

    /**
     * salescash_to_or
     */
    public static final String SALESCASH_TO_OR = "salescash_to_or";

    /**
     * ocf_to_or
     */
    public static final String OCF_TO_OR = "ocf_to_or";

    /**
     * ocf_to_opincome
     */
    public static final String OCF_TO_OPINCOME = "ocf_to_opincome";

    /**
     * capitalized_to_da
     */
    public static final String CAPITALIZED_TO_DA = "capitalized_to_da";

    /**
     * debt_to_assets
     */
    public static final String DEBT_TO_ASSETS = "debt_to_assets";

    /**
     * assets_to_eqt
     */
    public static final String ASSETS_TO_EQT = "assets_to_eqt";

    /**
     * dp_assets_to_eqt
     */
    public static final String DP_ASSETS_TO_EQT = "dp_assets_to_eqt";

    /**
     * ca_to_assets
     */
    public static final String CA_TO_ASSETS = "ca_to_assets";

    /**
     * nca_to_assets
     */
    public static final String NCA_TO_ASSETS = "nca_to_assets";

    /**
     * tbassets_to_totalassets
     */
    public static final String TBASSETS_TO_TOTALASSETS = "tbassets_to_totalassets";

    /**
     * int_to_talcap
     */
    public static final String INT_TO_TALCAP = "int_to_talcap";

    /**
     * eqt_to_talcapital
     */
    public static final String EQT_TO_TALCAPITAL = "eqt_to_talcapital";

    /**
     * currentdebt_to_debt
     */
    public static final String CURRENTDEBT_TO_DEBT = "currentdebt_to_debt";

    /**
     * longdeb_to_debt
     */
    public static final String LONGDEB_TO_DEBT = "longdeb_to_debt";

    /**
     * ocf_to_shortdebt
     */
    public static final String OCF_TO_SHORTDEBT = "ocf_to_shortdebt";

    /**
     * debt_to_eqt
     */
    public static final String DEBT_TO_EQT = "debt_to_eqt";

    /**
     * eqt_to_debt
     */
    public static final String EQT_TO_DEBT = "eqt_to_debt";

    /**
     * eqt_to_interestdebt
     */
    public static final String EQT_TO_INTERESTDEBT = "eqt_to_interestdebt";

    /**
     * tangibleasset_to_debt
     */
    public static final String TANGIBLEASSET_TO_DEBT = "tangibleasset_to_debt";

    /**
     * tangasset_to_intdebt
     */
    public static final String TANGASSET_TO_INTDEBT = "tangasset_to_intdebt";

    /**
     * tangibleasset_to_netdebt
     */
    public static final String TANGIBLEASSET_TO_NETDEBT = "tangibleasset_to_netdebt";

    /**
     * ocf_to_debt
     */
    public static final String OCF_TO_DEBT = "ocf_to_debt";

    /**
     * ocf_to_interestdebt
     */
    public static final String OCF_TO_INTERESTDEBT = "ocf_to_interestdebt";

    /**
     * ocf_to_netdebt
     */
    public static final String OCF_TO_NETDEBT = "ocf_to_netdebt";

    /**
     * ebit_to_interest
     */
    public static final String EBIT_TO_INTEREST = "ebit_to_interest";

    /**
     * longdebt_to_workingcapital
     */
    public static final String LONGDEBT_TO_WORKINGCAPITAL = "longdebt_to_workingcapital";

    /**
     * ebitda_to_debt
     */
    public static final String EBITDA_TO_DEBT = "ebitda_to_debt";

    /**
     * turn_days
     */
    public static final String TURN_DAYS = "turn_days";

    /**
     * roa_yearly
     */
    public static final String ROA_YEARLY = "roa_yearly";

    /**
     * roa_dp
     */
    public static final String ROA_DP = "roa_dp";

    /**
     * fixed_assets
     */
    public static final String FIXED_ASSETS = "fixed_assets";

    /**
     * profit_prefin_exp
     */
    public static final String PROFIT_PREFIN_EXP = "profit_prefin_exp";

    /**
     * non_op_profit
     */
    public static final String NON_OP_PROFIT = "non_op_profit";

    /**
     * op_to_ebt
     */
    public static final String OP_TO_EBT = "op_to_ebt";

    /**
     * nop_to_ebt
     */
    public static final String NOP_TO_EBT = "nop_to_ebt";

    /**
     * ocf_to_profit
     */
    public static final String OCF_TO_PROFIT = "ocf_to_profit";

    /**
     * cash_to_liqdebt
     */
    public static final String CASH_TO_LIQDEBT = "cash_to_liqdebt";

    /**
     * cash_to_liqdebt_withinterest
     */
    public static final String CASH_TO_LIQDEBT_WITHINTEREST = "cash_to_liqdebt_withinterest";

    /**
     * op_to_liqdebt
     */
    public static final String OP_TO_LIQDEBT = "op_to_liqdebt";

    /**
     * op_to_debt
     */
    public static final String OP_TO_DEBT = "op_to_debt";

    /**
     * roic_yearly
     */
    public static final String ROIC_YEARLY = "roic_yearly";

    /**
     * total_fa_trun
     */
    public static final String TOTAL_FA_TRUN = "total_fa_trun";

    /**
     * profit_to_op
     */
    public static final String PROFIT_TO_OP = "profit_to_op";

    /**
     * q_opincome
     */
    public static final String Q_OPINCOME = "q_opincome";

    /**
     * q_investincome
     */
    public static final String Q_INVESTINCOME = "q_investincome";

    /**
     * q_dtprofit
     */
    public static final String Q_DTPROFIT = "q_dtprofit";

    /**
     * q_eps
     */
    public static final String Q_EPS = "q_eps";

    /**
     * q_netprofit_margin
     */
    public static final String Q_NETPROFIT_MARGIN = "q_netprofit_margin";

    /**
     * q_gsprofit_margin
     */
    public static final String Q_GSPROFIT_MARGIN = "q_gsprofit_margin";

    /**
     * q_exp_to_sales
     */
    public static final String Q_EXP_TO_SALES = "q_exp_to_sales";

    /**
     * q_profit_to_gr
     */
    public static final String Q_PROFIT_TO_GR = "q_profit_to_gr";

    /**
     * q_saleexp_to_gr
     */
    public static final String Q_SALEEXP_TO_GR = "q_saleexp_to_gr";

    /**
     * q_adminexp_to_gr
     */
    public static final String Q_ADMINEXP_TO_GR = "q_adminexp_to_gr";

    /**
     * q_finaexp_to_gr
     */
    public static final String Q_FINAEXP_TO_GR = "q_finaexp_to_gr";

    /**
     * q_impair_to_gr_ttm
     */
    public static final String Q_IMPAIR_TO_GR_TTM = "q_impair_to_gr_ttm";

    /**
     * q_gc_to_gr
     */
    public static final String Q_GC_TO_GR = "q_gc_to_gr";

    /**
     * q_op_to_gr
     */
    public static final String Q_OP_TO_GR = "q_op_to_gr";

    /**
     * q_roe
     */
    public static final String Q_ROE = "q_roe";

    /**
     * q_dt_roe
     */
    public static final String Q_DT_ROE = "q_dt_roe";

    /**
     * q_npta
     */
    public static final String Q_NPTA = "q_npta";

    /**
     * q_opincome_to_ebt
     */
    public static final String Q_OPINCOME_TO_EBT = "q_opincome_to_ebt";

    /**
     * q_investincome_to_ebt
     */
    public static final String Q_INVESTINCOME_TO_EBT = "q_investincome_to_ebt";

    /**
     * q_dtprofit_to_profit
     */
    public static final String Q_DTPROFIT_TO_PROFIT = "q_dtprofit_to_profit";

    /**
     * q_salescash_to_or
     */
    public static final String Q_SALESCASH_TO_OR = "q_salescash_to_or";

    /**
     * q_ocf_to_sales
     */
    public static final String Q_OCF_TO_SALES = "q_ocf_to_sales";

    /**
     * q_ocf_to_or
     */
    public static final String Q_OCF_TO_OR = "q_ocf_to_or";

    /**
     * basic_eps_yoy
     */
    public static final String BASIC_EPS_YOY = "basic_eps_yoy";

    /**
     * dt_eps_yoy
     */
    public static final String DT_EPS_YOY = "dt_eps_yoy";

    /**
     * cfps_yoy
     */
    public static final String CFPS_YOY = "cfps_yoy";

    /**
     * op_yoy
     */
    public static final String OP_YOY = "op_yoy";

    /**
     * ebt_yoy
     */
    public static final String EBT_YOY = "ebt_yoy";

    /**
     * netprofit_yoy
     */
    public static final String NETPROFIT_YOY = "netprofit_yoy";

    /**
     * dt_netprofit_yoy
     */
    public static final String DT_NETPROFIT_YOY = "dt_netprofit_yoy";

    /**
     * ocf_yoy
     */
    public static final String OCF_YOY = "ocf_yoy";

    /**
     * roe_yoy
     */
    public static final String ROE_YOY = "roe_yoy";

    /**
     * bps_yoy
     */
    public static final String BPS_YOY = "bps_yoy";

    /**
     * assets_yoy
     */
    public static final String ASSETS_YOY = "assets_yoy";

    /**
     * eqt_yoy
     */
    public static final String EQT_YOY = "eqt_yoy";

    /**
     * tr_yoy
     */
    public static final String TR_YOY = "tr_yoy";

    /**
     * or_yoy
     */
    public static final String OR_YOY = "or_yoy";

    /**
     * q_gr_yoy
     */
    public static final String Q_GR_YOY = "q_gr_yoy";

    /**
     * q_gr_qoq
     */
    public static final String Q_GR_QOQ = "q_gr_qoq";

    /**
     * q_sales_yoy
     */
    public static final String Q_SALES_YOY = "q_sales_yoy";

    /**
     * q_sales_qoq
     */
    public static final String Q_SALES_QOQ = "q_sales_qoq";

    /**
     * q_op_yoy
     */
    public static final String Q_OP_YOY = "q_op_yoy";

    /**
     * q_op_qoq
     */
    public static final String Q_OP_QOQ = "q_op_qoq";

    /**
     * q_profit_yoy
     */
    public static final String Q_PROFIT_YOY = "q_profit_yoy";

    /**
     * q_profit_qoq
     */
    public static final String Q_PROFIT_QOQ = "q_profit_qoq";

    /**
     * q_netprofit_yoy
     */
    public static final String Q_NETPROFIT_YOY = "q_netprofit_yoy";

    /**
     * q_netprofit_qoq
     */
    public static final String Q_NETPROFIT_QOQ = "q_netprofit_qoq";

    /**
     * equity_yoy
     */
    public static final String EQUITY_YOY = "equity_yoy";

    /**
     * rd_exp
     */
    public static final String RD_EXP = "rd_exp";

    /**
     * update_flag
     */
    public static final String UPDATE_FLAG = "update_flag";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, ANN_DATE, END_DATE, EPS, DT_EPS, TOTAL_REVENUE_PS, REVENUE_PS, CAPITAL_RESE_PS, SURPLUS_RESE_PS, UNDIST_PROFIT_PS, EXTRA_ITEM, PROFIT_DEDT, GROSS_MARGIN, CURRENT_RATIO, QUICK_RATIO, CASH_RATIO, INVTURN_DAYS, ARTURN_DAYS, INV_TURN, AR_TURN, CA_TURN, FA_TURN, ASSETS_TURN, OP_INCOME, VALUECHANGE_INCOME, INTERST_INCOME, DAA, EBIT, EBITDA, FCFF, FCFE, CURRENT_EXINT, NONCURRENT_EXINT, INTERESTDEBT, NETDEBT, TANGIBLE_ASSET, WORKING_CAPITAL, NETWORKING_CAPITAL, INVEST_CAPITAL, RETAINED_EARNINGS, DILUTED2_EPS, BPS, OCFPS, RETAINEDPS, CFPS, EBIT_PS, FCFF_PS, FCFE_PS, NETPROFIT_MARGIN, GROSSPROFIT_MARGIN, COGS_OF_SALES, EXPENSE_OF_SALES, PROFIT_TO_GR, SALEEXP_TO_GR, ADMINEXP_OF_GR, FINAEXP_OF_GR, IMPAI_TTM, GC_OF_GR, OP_OF_GR, EBIT_OF_GR, ROE, ROE_WAA, ROE_DT, ROA, NPTA, ROIC, ROE_YEARLY, ROA2_YEARLY, ROE_AVG, OPINCOME_OF_EBT, INVESTINCOME_OF_EBT, N_OP_PROFIT_OF_EBT, TAX_TO_EBT, DTPROFIT_TO_PROFIT, SALESCASH_TO_OR, OCF_TO_OR, OCF_TO_OPINCOME, CAPITALIZED_TO_DA, DEBT_TO_ASSETS, ASSETS_TO_EQT, DP_ASSETS_TO_EQT, CA_TO_ASSETS, NCA_TO_ASSETS, TBASSETS_TO_TOTALASSETS, INT_TO_TALCAP, EQT_TO_TALCAPITAL, CURRENTDEBT_TO_DEBT, LONGDEB_TO_DEBT, OCF_TO_SHORTDEBT, DEBT_TO_EQT, EQT_TO_DEBT, EQT_TO_INTERESTDEBT, TANGIBLEASSET_TO_DEBT, TANGASSET_TO_INTDEBT, TANGIBLEASSET_TO_NETDEBT, OCF_TO_DEBT, OCF_TO_INTERESTDEBT, OCF_TO_NETDEBT, EBIT_TO_INTEREST, LONGDEBT_TO_WORKINGCAPITAL, EBITDA_TO_DEBT, TURN_DAYS, ROA_YEARLY, ROA_DP, FIXED_ASSETS, PROFIT_PREFIN_EXP, NON_OP_PROFIT, OP_TO_EBT, NOP_TO_EBT, OCF_TO_PROFIT, CASH_TO_LIQDEBT, CASH_TO_LIQDEBT_WITHINTEREST, OP_TO_LIQDEBT, OP_TO_DEBT, ROIC_YEARLY, TOTAL_FA_TRUN, PROFIT_TO_OP, Q_OPINCOME, Q_INVESTINCOME, Q_DTPROFIT, Q_EPS, Q_NETPROFIT_MARGIN, Q_GSPROFIT_MARGIN, Q_EXP_TO_SALES, Q_PROFIT_TO_GR, Q_SALEEXP_TO_GR, Q_ADMINEXP_TO_GR, Q_FINAEXP_TO_GR, Q_IMPAIR_TO_GR_TTM, Q_GC_TO_GR, Q_OP_TO_GR, Q_ROE, Q_DT_ROE, Q_NPTA, Q_OPINCOME_TO_EBT, Q_INVESTINCOME_TO_EBT, Q_DTPROFIT_TO_PROFIT, Q_SALESCASH_TO_OR, Q_OCF_TO_SALES, Q_OCF_TO_OR, BASIC_EPS_YOY, DT_EPS_YOY, CFPS_YOY, OP_YOY, EBT_YOY, NETPROFIT_YOY, DT_NETPROFIT_YOY, OCF_YOY, ROE_YOY, BPS_YOY, ASSETS_YOY, EQT_YOY, TR_YOY, OR_YOY, Q_GR_YOY, Q_GR_QOQ, Q_SALES_YOY, Q_SALES_QOQ, Q_OP_YOY, Q_OP_QOQ, Q_PROFIT_YOY, Q_PROFIT_QOQ, Q_NETPROFIT_YOY, Q_NETPROFIT_QOQ, EQUITY_YOY, RD_EXP, UPDATE_FLAG);

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
     * 报告期
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * 基本每股收益
     */
    @JsonProperty(value = "eps")
    private Float eps;

    /**
     * 稀释每股收益
     */
    @JsonProperty(value = "dt_eps")
    private Float dtEps;

    /**
     * 每股营业总收入
     */
    @JsonProperty(value = "total_revenue_ps")
    private Float totalRevenuePs;

    /**
     * 每股营业收入
     */
    @JsonProperty(value = "revenue_ps")
    private Float revenuePs;

    /**
     * 每股资本公积
     */
    @JsonProperty(value = "capital_rese_ps")
    private Float capitalResePs;

    /**
     * 每股盈余公积
     */
    @JsonProperty(value = "surplus_rese_ps")
    private Float surplusResePs;

    /**
     * 每股未分配利润
     */
    @JsonProperty(value = "undist_profit_ps")
    private Float undistProfitPs;

    /**
     * 非经常性损益
     */
    @JsonProperty(value = "extra_item")
    private Float extraItem;

    /**
     * 扣除非经常性损益后的净利润
     */
    @JsonProperty(value = "profit_dedt")
    private Float profitDedt;

    /**
     * 毛利
     */
    @JsonProperty(value = "gross_margin")
    private Float grossMargin;

    /**
     * 流动比率
     */
    @JsonProperty(value = "current_ratio")
    private Float currentRatio;

    /**
     * 速动比率
     */
    @JsonProperty(value = "quick_ratio")
    private Float quickRatio;

    /**
     * 保守速动比率
     */
    @JsonProperty(value = "cash_ratio")
    private Float cashRatio;

    /**
     * 存货周转天数
     */
    @JsonProperty(value = "invturn_days")
    private Float invturnDays;

    /**
     * 应收账款周转天数
     */
    @JsonProperty(value = "arturn_days")
    private Float arturnDays;

    /**
     * 存货周转率
     */
    @JsonProperty(value = "inv_turn")
    private Float invTurn;

    /**
     * 应收账款周转率
     */
    @JsonProperty(value = "ar_turn")
    private Float arTurn;

    /**
     * 流动资产周转率
     */
    @JsonProperty(value = "ca_turn")
    private Float caTurn;

    /**
     * 固定资产周转率
     */
    @JsonProperty(value = "fa_turn")
    private Float faTurn;

    /**
     * 总资产周转率
     */
    @JsonProperty(value = "assets_turn")
    private Float assetsTurn;

    /**
     * 经营活动净收益
     */
    @JsonProperty(value = "op_income")
    private Float opIncome;

    /**
     * 价值变动净收益
     */
    @JsonProperty(value = "valuechange_income")
    private Float valuechangeIncome;

    /**
     * 利息费用
     */
    @JsonProperty(value = "interst_income")
    private Float interstIncome;

    /**
     * 折旧与摊销
     */
    @JsonProperty(value = "daa")
    private Float daa;

    /**
     * 息税前利润
     */
    @JsonProperty(value = "ebit")
    private Float ebit;

    /**
     * 息税折旧摊销前利润
     */
    @JsonProperty(value = "ebitda")
    private Float ebitda;

    /**
     * 企业自由现金流量
     */
    @JsonProperty(value = "fcff")
    private Float fcff;

    /**
     * 股权自由现金流量
     */
    @JsonProperty(value = "fcfe")
    private Float fcfe;

    /**
     * 无息流动负债
     */
    @JsonProperty(value = "current_exint")
    private Float currentExint;

    /**
     * 无息非流动负债
     */
    @JsonProperty(value = "noncurrent_exint")
    private Float noncurrentExint;

    /**
     * 带息债务
     */
    @JsonProperty(value = "interestdebt")
    private Float interestdebt;

    /**
     * 净债务
     */
    @JsonProperty(value = "netdebt")
    private Float netdebt;

    /**
     * 有形资产
     */
    @JsonProperty(value = "tangible_asset")
    private Float tangibleAsset;

    /**
     * 营运资金
     */
    @JsonProperty(value = "working_capital")
    private Float workingCapital;

    /**
     * 营运流动资本
     */
    @JsonProperty(value = "networking_capital")
    private Float networkingCapital;

    /**
     * 全部投入资本
     */
    @JsonProperty(value = "invest_capital")
    private Float investCapital;

    /**
     * 留存收益
     */
    @JsonProperty(value = "retained_earnings")
    private Float retainedEarnings;

    /**
     * 期末摊薄每股收益
     */
    @JsonProperty(value = "diluted2_eps")
    private Float diluted2Eps;

    /**
     * 每股净资产
     */
    @JsonProperty(value = "bps")
    private Float bps;

    /**
     * 每股经营活动产生的现金流量净额
     */
    @JsonProperty(value = "ocfps")
    private Float ocfps;

    /**
     * 每股留存收益
     */
    @JsonProperty(value = "retainedps")
    private Float retainedps;

    /**
     * 每股现金流量净额
     */
    @JsonProperty(value = "cfps")
    private Float cfps;

    /**
     * 每股息税前利润
     */
    @JsonProperty(value = "ebit_ps")
    private Float ebitPs;

    /**
     * 每股企业自由现金流量
     */
    @JsonProperty(value = "fcff_ps")
    private Float fcffPs;

    /**
     * 每股股东自由现金流量
     */
    @JsonProperty(value = "fcfe_ps")
    private Float fcfePs;

    /**
     * 销售净利率
     */
    @JsonProperty(value = "netprofit_margin")
    private Float netprofitMargin;

    /**
     * 销售毛利率
     */
    @JsonProperty(value = "grossprofit_margin")
    private Float grossprofitMargin;

    /**
     * 销售成本率
     */
    @JsonProperty(value = "cogs_of_sales")
    private Float cogsOfSales;

    /**
     * 销售期间费用率
     */
    @JsonProperty(value = "expense_of_sales")
    private Float expenseOfSales;

    /**
     * 净利润/营业总收入
     */
    @JsonProperty(value = "profit_to_gr")
    private Float profitToGr;

    /**
     * 销售费用/营业总收入
     */
    @JsonProperty(value = "saleexp_to_gr")
    private Float saleexpToGr;

    /**
     * 管理费用/营业总收入
     */
    @JsonProperty(value = "adminexp_of_gr")
    private Float adminexpOfGr;

    /**
     * 财务费用/营业总收入
     */
    @JsonProperty(value = "finaexp_of_gr")
    private Float finaexpOfGr;

    /**
     * 资产减值损失/营业总收入
     */
    @JsonProperty(value = "impai_ttm")
    private Float impaiTtm;

    /**
     * 营业总成本/营业总收入
     */
    @JsonProperty(value = "gc_of_gr")
    private Float gcOfGr;

    /**
     * 营业利润/营业总收入
     */
    @JsonProperty(value = "op_of_gr")
    private Float opOfGr;

    /**
     * 息税前利润/营业总收入
     */
    @JsonProperty(value = "ebit_of_gr")
    private Float ebitOfGr;

    /**
     * 净资产收益率
     */
    @JsonProperty(value = "roe")
    private Float roe;

    /**
     * 加权平均净资产收益率
     */
    @JsonProperty(value = "roe_waa")
    private Float roeWaa;

    /**
     * 净资产收益率(扣除非经常损益)
     */
    @JsonProperty(value = "roe_dt")
    private Float roeDt;

    /**
     * 总资产报酬率
     */
    @JsonProperty(value = "roa")
    private Float roa;

    /**
     * 总资产净利润
     */
    @JsonProperty(value = "npta")
    private Float npta;

    /**
     * 投入资本回报率
     */
    @JsonProperty(value = "roic")
    private Float roic;

    /**
     * 年化净资产收益率
     */
    @JsonProperty(value = "roe_yearly")
    private Float roeYearly;

    /**
     * 年化总资产报酬率
     */
    @JsonProperty(value = "roa2_yearly")
    private Float roa2Yearly;

    /**
     * 平均净资产收益率(增发条件)
     */
    @JsonProperty(value = "roe_avg")
    private Float roeAvg;

    /**
     * 经营活动净收益/利润总额
     */
    @JsonProperty(value = "opincome_of_ebt")
    private Float opincomeOfEbt;

    /**
     * 价值变动净收益/利润总额
     */
    @JsonProperty(value = "investincome_of_ebt")
    private Float investincomeOfEbt;

    /**
     * 营业外收支净额/利润总额
     */
    @JsonProperty(value = "n_op_profit_of_ebt")
    private Float nOpProfitOfEbt;

    /**
     * 所得税/利润总额
     */
    @JsonProperty(value = "tax_to_ebt")
    private Float taxToEbt;

    /**
     * 扣除非经常损益后的净利润/净利润
     */
    @JsonProperty(value = "dtprofit_to_profit")
    private Float dtprofitToProfit;

    /**
     * 销售商品提供劳务收到的现金/营业收入
     */
    @JsonProperty(value = "salescash_to_or")
    private Float salescashToOr;

    /**
     * 经营活动产生的现金流量净额/营业收入
     */
    @JsonProperty(value = "ocf_to_or")
    private Float ocfToOr;

    /**
     * 经营活动产生的现金流量净额/经营活动净收益
     */
    @JsonProperty(value = "ocf_to_opincome")
    private Float ocfToOpincome;

    /**
     * 资本支出/折旧和摊销
     */
    @JsonProperty(value = "capitalized_to_da")
    private Float capitalizedToDa;

    /**
     * 资产负债率
     */
    @JsonProperty(value = "debt_to_assets")
    private Float debtToAssets;

    /**
     * 权益乘数
     */
    @JsonProperty(value = "assets_to_eqt")
    private Float assetsToEqt;

    /**
     * 权益乘数(杜邦分析)
     */
    @JsonProperty(value = "dp_assets_to_eqt")
    private Float dpAssetsToEqt;

    /**
     * 流动资产/总资产
     */
    @JsonProperty(value = "ca_to_assets")
    private Float caToAssets;

    /**
     * 非流动资产/总资产
     */
    @JsonProperty(value = "nca_to_assets")
    private Float ncaToAssets;

    /**
     * 有形资产/总资产
     */
    @JsonProperty(value = "tbassets_to_totalassets")
    private Float tbassetsToTotalassets;

    /**
     * 带息债务/全部投入资本
     */
    @JsonProperty(value = "int_to_talcap")
    private Float intToTalcap;

    /**
     * 归属于母公司的股东权益/全部投入资本
     */
    @JsonProperty(value = "eqt_to_talcapital")
    private Float eqtToTalcapital;

    /**
     * 流动负债/负债合计
     */
    @JsonProperty(value = "currentdebt_to_debt")
    private Float currentdebtToDebt;

    /**
     * 非流动负债/负债合计
     */
    @JsonProperty(value = "longdeb_to_debt")
    private Float longdebToDebt;

    /**
     * 经营活动产生的现金流量净额/流动负债
     */
    @JsonProperty(value = "ocf_to_shortdebt")
    private Float ocfToShortdebt;

    /**
     * 产权比率
     */
    @JsonProperty(value = "debt_to_eqt")
    private Float debtToEqt;

    /**
     * 归属于母公司的股东权益/负债合计
     */
    @JsonProperty(value = "eqt_to_debt")
    private Float eqtToDebt;

    /**
     * 归属于母公司的股东权益/带息债务
     */
    @JsonProperty(value = "eqt_to_interestdebt")
    private Float eqtToInterestdebt;

    /**
     * 有形资产/负债合计
     */
    @JsonProperty(value = "tangibleasset_to_debt")
    private Float tangibleassetToDebt;

    /**
     * 有形资产/带息债务
     */
    @JsonProperty(value = "tangasset_to_intdebt")
    private Float tangassetToIntdebt;

    /**
     * 有形资产/净债务
     */
    @JsonProperty(value = "tangibleasset_to_netdebt")
    private Float tangibleassetToNetdebt;

    /**
     * 经营活动产生的现金流量净额/负债合计
     */
    @JsonProperty(value = "ocf_to_debt")
    private Float ocfToDebt;

    /**
     * 经营活动产生的现金流量净额/带息债务
     */
    @JsonProperty(value = "ocf_to_interestdebt")
    private Float ocfToInterestdebt;

    /**
     * 经营活动产生的现金流量净额/净债务
     */
    @JsonProperty(value = "ocf_to_netdebt")
    private Float ocfToNetdebt;

    /**
     * 已获利息倍数(EBIT/利息费用)
     */
    @JsonProperty(value = "ebit_to_interest")
    private Float ebitToInterest;

    /**
     * 长期债务与营运资金比率
     */
    @JsonProperty(value = "longdebt_to_workingcapital")
    private Float longdebtToWorkingcapital;

    /**
     * 息税折旧摊销前利润/负债合计
     */
    @JsonProperty(value = "ebitda_to_debt")
    private Float ebitdaToDebt;

    /**
     * 营业周期
     */
    @JsonProperty(value = "turn_days")
    private Float turnDays;

    /**
     * 年化总资产净利率
     */
    @JsonProperty(value = "roa_yearly")
    private Float roaYearly;

    /**
     * 总资产净利率(杜邦分析)
     */
    @JsonProperty(value = "roa_dp")
    private Float roaDp;

    /**
     * 固定资产合计
     */
    @JsonProperty(value = "fixed_assets")
    private Float fixedAssets;

    /**
     * 扣除财务费用前营业利润
     */
    @JsonProperty(value = "profit_prefin_exp")
    private Float profitPrefinExp;

    /**
     * 非营业利润
     */
    @JsonProperty(value = "non_op_profit")
    private Float nonOpProfit;

    /**
     * 营业利润／利润总额
     */
    @JsonProperty(value = "op_to_ebt")
    private Float opToEbt;

    /**
     * 非营业利润／利润总额
     */
    @JsonProperty(value = "nop_to_ebt")
    private Float nopToEbt;

    /**
     * 经营活动产生的现金流量净额／营业利润
     */
    @JsonProperty(value = "ocf_to_profit")
    private Float ocfToProfit;

    /**
     * 货币资金／流动负债
     */
    @JsonProperty(value = "cash_to_liqdebt")
    private Float cashToLiqdebt;

    /**
     * 货币资金／带息流动负债
     */
    @JsonProperty(value = "cash_to_liqdebt_withinterest")
    private Float cashToLiqdebtWithinterest;

    /**
     * 营业利润／流动负债
     */
    @JsonProperty(value = "op_to_liqdebt")
    private Float opToLiqdebt;

    /**
     * 营业利润／负债合计
     */
    @JsonProperty(value = "op_to_debt")
    private Float opToDebt;

    /**
     * 年化投入资本回报率
     */
    @JsonProperty(value = "roic_yearly")
    private Float roicYearly;

    /**
     * 固定资产合计周转率
     */
    @JsonProperty(value = "total_fa_trun")
    private Float totalFaTrun;

    /**
     * 利润总额／营业收入
     */
    @JsonProperty(value = "profit_to_op")
    private Float profitToOp;

    /**
     * 经营活动单季度净收益
     */
    @JsonProperty(value = "q_opincome")
    private Float qOpincome;

    /**
     * 价值变动单季度净收益
     */
    @JsonProperty(value = "q_investincome")
    private Float qInvestincome;

    /**
     * 扣除非经常损益后的单季度净利润
     */
    @JsonProperty(value = "q_dtprofit")
    private Float qDtprofit;

    /**
     * 每股收益(单季度)
     */
    @JsonProperty(value = "q_eps")
    private Float qEps;

    /**
     * 销售净利率(单季度)
     */
    @JsonProperty(value = "q_netprofit_margin")
    private Float qNetprofitMargin;

    /**
     * 销售毛利率(单季度)
     */
    @JsonProperty(value = "q_gsprofit_margin")
    private Float qGsprofitMargin;

    /**
     * 销售期间费用率(单季度)
     */
    @JsonProperty(value = "q_exp_to_sales")
    private Float qExpToSales;

    /**
     * 净利润／营业总收入(单季度)
     */
    @JsonProperty(value = "q_profit_to_gr")
    private Float qProfitToGr;

    /**
     * 销售费用／营业总收入 (单季度)
     */
    @JsonProperty(value = "q_saleexp_to_gr")
    private Float qSaleexpToGr;

    /**
     * 管理费用／营业总收入 (单季度)
     */
    @JsonProperty(value = "q_adminexp_to_gr")
    private Float qAdminexpToGr;

    /**
     * 财务费用／营业总收入 (单季度)
     */
    @JsonProperty(value = "q_finaexp_to_gr")
    private Float qFinaexpToGr;

    /**
     * 资产减值损失／营业总收入(单季度)
     */
    @JsonProperty(value = "q_impair_to_gr_ttm")
    private Float qImpairToGrTtm;

    /**
     * 营业总成本／营业总收入 (单季度)
     */
    @JsonProperty(value = "q_gc_to_gr")
    private Float qGcToGr;

    /**
     * 营业利润／营业总收入(单季度)
     */
    @JsonProperty(value = "q_op_to_gr")
    private Float qOpToGr;

    /**
     * 净资产收益率(单季度)
     */
    @JsonProperty(value = "q_roe")
    private Float qRoe;

    /**
     * 净资产单季度收益率(扣除非经常损益)
     */
    @JsonProperty(value = "q_dt_roe")
    private Float qDtRoe;

    /**
     * 总资产净利润(单季度)
     */
    @JsonProperty(value = "q_npta")
    private Float qNpta;

    /**
     * 经营活动净收益／利润总额(单季度)
     */
    @JsonProperty(value = "q_opincome_to_ebt")
    private Float qOpincomeToEbt;

    /**
     * 价值变动净收益／利润总额(单季度)
     */
    @JsonProperty(value = "q_investincome_to_ebt")
    private Float qInvestincomeToEbt;

    /**
     * 扣除非经常损益后的净利润／净利润(单季度)
     */
    @JsonProperty(value = "q_dtprofit_to_profit")
    private Float qDtprofitToProfit;

    /**
     * 销售商品提供劳务收到的现金／营业收入(单季度)
     */
    @JsonProperty(value = "q_salescash_to_or")
    private Float qSalescashToOr;

    /**
     * 经营活动产生的现金流量净额／营业收入(单季度)
     */
    @JsonProperty(value = "q_ocf_to_sales")
    private Float qOcfToSales;

    /**
     * 经营活动产生的现金流量净额／经营活动净收益(单季度)
     */
    @JsonProperty(value = "q_ocf_to_or")
    private Float qOcfToOr;

    /**
     * 基本每股收益同比增长率(%)
     */
    @JsonProperty(value = "basic_eps_yoy")
    private Float basicEpsYoy;

    /**
     * 稀释每股收益同比增长率(%)
     */
    @JsonProperty(value = "dt_eps_yoy")
    private Float dtEpsYoy;

    /**
     * 每股经营活动产生的现金流量净额同比增长率(%)
     */
    @JsonProperty(value = "cfps_yoy")
    private Float cfpsYoy;

    /**
     * 营业利润同比增长率(%)
     */
    @JsonProperty(value = "op_yoy")
    private Float opYoy;

    /**
     * 利润总额同比增长率(%)
     */
    @JsonProperty(value = "ebt_yoy")
    private Float ebtYoy;

    /**
     * 归属母公司股东的净利润同比增长率(%)
     */
    @JsonProperty(value = "netprofit_yoy")
    private Float netprofitYoy;

    /**
     * 归属母公司股东的净利润-扣除非经常损益同比增长率(%)
     */
    @JsonProperty(value = "dt_netprofit_yoy")
    private Float dtNetprofitYoy;

    /**
     * 经营活动产生的现金流量净额同比增长率(%)
     */
    @JsonProperty(value = "ocf_yoy")
    private Float ocfYoy;

    /**
     * 净资产收益率(摊薄)同比增长率(%)
     */
    @JsonProperty(value = "roe_yoy")
    private Float roeYoy;

    /**
     * 每股净资产相对年初增长率(%)
     */
    @JsonProperty(value = "bps_yoy")
    private Float bpsYoy;

    /**
     * 资产总计相对年初增长率(%)
     */
    @JsonProperty(value = "assets_yoy")
    private Float assetsYoy;

    /**
     * 归属母公司的股东权益相对年初增长率(%)
     */
    @JsonProperty(value = "eqt_yoy")
    private Float eqtYoy;

    /**
     * 营业总收入同比增长率(%)
     */
    @JsonProperty(value = "tr_yoy")
    private Float trYoy;

    /**
     * 营业收入同比增长率(%)
     */
    @JsonProperty(value = "or_yoy")
    private Float orYoy;

    /**
     * 营业总收入同比增长率(%)(单季度)
     */
    @JsonProperty(value = "q_gr_yoy")
    private Float qGrYoy;

    /**
     * 营业总收入环比增长率(%)(单季度)
     */
    @JsonProperty(value = "q_gr_qoq")
    private Float qGrQoq;

    /**
     * 营业收入同比增长率(%)(单季度)
     */
    @JsonProperty(value = "q_sales_yoy")
    private Float qSalesYoy;

    /**
     * 营业收入环比增长率(%)(单季度)
     */
    @JsonProperty(value = "q_sales_qoq")
    private Float qSalesQoq;

    /**
     * 营业利润同比增长率(%)(单季度)
     */
    @JsonProperty(value = "q_op_yoy")
    private Float qOpYoy;

    /**
     * 营业利润环比增长率(%)(单季度)
     */
    @JsonProperty(value = "q_op_qoq")
    private Float qOpQoq;

    /**
     * 净利润同比增长率(%)(单季度)
     */
    @JsonProperty(value = "q_profit_yoy")
    private Float qProfitYoy;

    /**
     * 净利润环比增长率(%)(单季度)
     */
    @JsonProperty(value = "q_profit_qoq")
    private Float qProfitQoq;

    /**
     * 归属母公司股东的净利润同比增长率(%)(单季度)
     */
    @JsonProperty(value = "q_netprofit_yoy")
    private Float qNetprofitYoy;

    /**
     * 归属母公司股东的净利润环比增长率(%)(单季度)
     */
    @JsonProperty(value = "q_netprofit_qoq")
    private Float qNetprofitQoq;

    /**
     * 净资产同比增长率
     */
    @JsonProperty(value = "equity_yoy")
    private Float equityYoy;

    /**
     * 研发费用
     */
    @JsonProperty(value = "rd_exp")
    private Float rdExp;

    /**
     * 更新标识
     */
    @JsonProperty(value = "update_flag")
    private String updateFlag;


    /**
     * init by array
     */
    public static FinaIndicator init(String[] fields, Object[] item) {
        FinaIndicator finaIndicator = new FinaIndicator();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    finaIndicator.setTsCode((String) item[i]);
                    break;
                case ANN_DATE:
                    finaIndicator.setAnnDate((String) item[i]);
                    break;
                case END_DATE:
                    finaIndicator.setEndDate((String) item[i]);
                    break;
                case EPS:
                    finaIndicator.setEps((Float) item[i]);
                    break;
                case DT_EPS:
                    finaIndicator.setDtEps((Float) item[i]);
                    break;
                case TOTAL_REVENUE_PS:
                    finaIndicator.setTotalRevenuePs((Float) item[i]);
                    break;
                case REVENUE_PS:
                    finaIndicator.setRevenuePs((Float) item[i]);
                    break;
                case CAPITAL_RESE_PS:
                    finaIndicator.setCapitalResePs((Float) item[i]);
                    break;
                case SURPLUS_RESE_PS:
                    finaIndicator.setSurplusResePs((Float) item[i]);
                    break;
                case UNDIST_PROFIT_PS:
                    finaIndicator.setUndistProfitPs((Float) item[i]);
                    break;
                case EXTRA_ITEM:
                    finaIndicator.setExtraItem((Float) item[i]);
                    break;
                case PROFIT_DEDT:
                    finaIndicator.setProfitDedt((Float) item[i]);
                    break;
                case GROSS_MARGIN:
                    finaIndicator.setGrossMargin((Float) item[i]);
                    break;
                case CURRENT_RATIO:
                    finaIndicator.setCurrentRatio((Float) item[i]);
                    break;
                case QUICK_RATIO:
                    finaIndicator.setQuickRatio((Float) item[i]);
                    break;
                case CASH_RATIO:
                    finaIndicator.setCashRatio((Float) item[i]);
                    break;
                case INVTURN_DAYS:
                    finaIndicator.setInvturnDays((Float) item[i]);
                    break;
                case ARTURN_DAYS:
                    finaIndicator.setArturnDays((Float) item[i]);
                    break;
                case INV_TURN:
                    finaIndicator.setInvTurn((Float) item[i]);
                    break;
                case AR_TURN:
                    finaIndicator.setArTurn((Float) item[i]);
                    break;
                case CA_TURN:
                    finaIndicator.setCaTurn((Float) item[i]);
                    break;
                case FA_TURN:
                    finaIndicator.setFaTurn((Float) item[i]);
                    break;
                case ASSETS_TURN:
                    finaIndicator.setAssetsTurn((Float) item[i]);
                    break;
                case OP_INCOME:
                    finaIndicator.setOpIncome((Float) item[i]);
                    break;
                case VALUECHANGE_INCOME:
                    finaIndicator.setValuechangeIncome((Float) item[i]);
                    break;
                case INTERST_INCOME:
                    finaIndicator.setInterstIncome((Float) item[i]);
                    break;
                case DAA:
                    finaIndicator.setDaa((Float) item[i]);
                    break;
                case EBIT:
                    finaIndicator.setEbit((Float) item[i]);
                    break;
                case EBITDA:
                    finaIndicator.setEbitda((Float) item[i]);
                    break;
                case FCFF:
                    finaIndicator.setFcff((Float) item[i]);
                    break;
                case FCFE:
                    finaIndicator.setFcfe((Float) item[i]);
                    break;
                case CURRENT_EXINT:
                    finaIndicator.setCurrentExint((Float) item[i]);
                    break;
                case NONCURRENT_EXINT:
                    finaIndicator.setNoncurrentExint((Float) item[i]);
                    break;
                case INTERESTDEBT:
                    finaIndicator.setInterestdebt((Float) item[i]);
                    break;
                case NETDEBT:
                    finaIndicator.setNetdebt((Float) item[i]);
                    break;
                case TANGIBLE_ASSET:
                    finaIndicator.setTangibleAsset((Float) item[i]);
                    break;
                case WORKING_CAPITAL:
                    finaIndicator.setWorkingCapital((Float) item[i]);
                    break;
                case NETWORKING_CAPITAL:
                    finaIndicator.setNetworkingCapital((Float) item[i]);
                    break;
                case INVEST_CAPITAL:
                    finaIndicator.setInvestCapital((Float) item[i]);
                    break;
                case RETAINED_EARNINGS:
                    finaIndicator.setRetainedEarnings((Float) item[i]);
                    break;
                case DILUTED2_EPS:
                    finaIndicator.setDiluted2Eps((Float) item[i]);
                    break;
                case BPS:
                    finaIndicator.setBps((Float) item[i]);
                    break;
                case OCFPS:
                    finaIndicator.setOcfps((Float) item[i]);
                    break;
                case RETAINEDPS:
                    finaIndicator.setRetainedps((Float) item[i]);
                    break;
                case CFPS:
                    finaIndicator.setCfps((Float) item[i]);
                    break;
                case EBIT_PS:
                    finaIndicator.setEbitPs((Float) item[i]);
                    break;
                case FCFF_PS:
                    finaIndicator.setFcffPs((Float) item[i]);
                    break;
                case FCFE_PS:
                    finaIndicator.setFcfePs((Float) item[i]);
                    break;
                case NETPROFIT_MARGIN:
                    finaIndicator.setNetprofitMargin((Float) item[i]);
                    break;
                case GROSSPROFIT_MARGIN:
                    finaIndicator.setGrossprofitMargin((Float) item[i]);
                    break;
                case COGS_OF_SALES:
                    finaIndicator.setCogsOfSales((Float) item[i]);
                    break;
                case EXPENSE_OF_SALES:
                    finaIndicator.setExpenseOfSales((Float) item[i]);
                    break;
                case PROFIT_TO_GR:
                    finaIndicator.setProfitToGr((Float) item[i]);
                    break;
                case SALEEXP_TO_GR:
                    finaIndicator.setSaleexpToGr((Float) item[i]);
                    break;
                case ADMINEXP_OF_GR:
                    finaIndicator.setAdminexpOfGr((Float) item[i]);
                    break;
                case FINAEXP_OF_GR:
                    finaIndicator.setFinaexpOfGr((Float) item[i]);
                    break;
                case IMPAI_TTM:
                    finaIndicator.setImpaiTtm((Float) item[i]);
                    break;
                case GC_OF_GR:
                    finaIndicator.setGcOfGr((Float) item[i]);
                    break;
                case OP_OF_GR:
                    finaIndicator.setOpOfGr((Float) item[i]);
                    break;
                case EBIT_OF_GR:
                    finaIndicator.setEbitOfGr((Float) item[i]);
                    break;
                case ROE:
                    finaIndicator.setRoe((Float) item[i]);
                    break;
                case ROE_WAA:
                    finaIndicator.setRoeWaa((Float) item[i]);
                    break;
                case ROE_DT:
                    finaIndicator.setRoeDt((Float) item[i]);
                    break;
                case ROA:
                    finaIndicator.setRoa((Float) item[i]);
                    break;
                case NPTA:
                    finaIndicator.setNpta((Float) item[i]);
                    break;
                case ROIC:
                    finaIndicator.setRoic((Float) item[i]);
                    break;
                case ROE_YEARLY:
                    finaIndicator.setRoeYearly((Float) item[i]);
                    break;
                case ROA2_YEARLY:
                    finaIndicator.setRoa2Yearly((Float) item[i]);
                    break;
                case ROE_AVG:
                    finaIndicator.setRoeAvg((Float) item[i]);
                    break;
                case OPINCOME_OF_EBT:
                    finaIndicator.setOpincomeOfEbt((Float) item[i]);
                    break;
                case INVESTINCOME_OF_EBT:
                    finaIndicator.setInvestincomeOfEbt((Float) item[i]);
                    break;
                case N_OP_PROFIT_OF_EBT:
                    finaIndicator.setNOpProfitOfEbt((Float) item[i]);
                    break;
                case TAX_TO_EBT:
                    finaIndicator.setTaxToEbt((Float) item[i]);
                    break;
                case DTPROFIT_TO_PROFIT:
                    finaIndicator.setDtprofitToProfit((Float) item[i]);
                    break;
                case SALESCASH_TO_OR:
                    finaIndicator.setSalescashToOr((Float) item[i]);
                    break;
                case OCF_TO_OR:
                    finaIndicator.setOcfToOr((Float) item[i]);
                    break;
                case OCF_TO_OPINCOME:
                    finaIndicator.setOcfToOpincome((Float) item[i]);
                    break;
                case CAPITALIZED_TO_DA:
                    finaIndicator.setCapitalizedToDa((Float) item[i]);
                    break;
                case DEBT_TO_ASSETS:
                    finaIndicator.setDebtToAssets((Float) item[i]);
                    break;
                case ASSETS_TO_EQT:
                    finaIndicator.setAssetsToEqt((Float) item[i]);
                    break;
                case DP_ASSETS_TO_EQT:
                    finaIndicator.setDpAssetsToEqt((Float) item[i]);
                    break;
                case CA_TO_ASSETS:
                    finaIndicator.setCaToAssets((Float) item[i]);
                    break;
                case NCA_TO_ASSETS:
                    finaIndicator.setNcaToAssets((Float) item[i]);
                    break;
                case TBASSETS_TO_TOTALASSETS:
                    finaIndicator.setTbassetsToTotalassets((Float) item[i]);
                    break;
                case INT_TO_TALCAP:
                    finaIndicator.setIntToTalcap((Float) item[i]);
                    break;
                case EQT_TO_TALCAPITAL:
                    finaIndicator.setEqtToTalcapital((Float) item[i]);
                    break;
                case CURRENTDEBT_TO_DEBT:
                    finaIndicator.setCurrentdebtToDebt((Float) item[i]);
                    break;
                case LONGDEB_TO_DEBT:
                    finaIndicator.setLongdebToDebt((Float) item[i]);
                    break;
                case OCF_TO_SHORTDEBT:
                    finaIndicator.setOcfToShortdebt((Float) item[i]);
                    break;
                case DEBT_TO_EQT:
                    finaIndicator.setDebtToEqt((Float) item[i]);
                    break;
                case EQT_TO_DEBT:
                    finaIndicator.setEqtToDebt((Float) item[i]);
                    break;
                case EQT_TO_INTERESTDEBT:
                    finaIndicator.setEqtToInterestdebt((Float) item[i]);
                    break;
                case TANGIBLEASSET_TO_DEBT:
                    finaIndicator.setTangibleassetToDebt((Float) item[i]);
                    break;
                case TANGASSET_TO_INTDEBT:
                    finaIndicator.setTangassetToIntdebt((Float) item[i]);
                    break;
                case TANGIBLEASSET_TO_NETDEBT:
                    finaIndicator.setTangibleassetToNetdebt((Float) item[i]);
                    break;
                case OCF_TO_DEBT:
                    finaIndicator.setOcfToDebt((Float) item[i]);
                    break;
                case OCF_TO_INTERESTDEBT:
                    finaIndicator.setOcfToInterestdebt((Float) item[i]);
                    break;
                case OCF_TO_NETDEBT:
                    finaIndicator.setOcfToNetdebt((Float) item[i]);
                    break;
                case EBIT_TO_INTEREST:
                    finaIndicator.setEbitToInterest((Float) item[i]);
                    break;
                case LONGDEBT_TO_WORKINGCAPITAL:
                    finaIndicator.setLongdebtToWorkingcapital((Float) item[i]);
                    break;
                case EBITDA_TO_DEBT:
                    finaIndicator.setEbitdaToDebt((Float) item[i]);
                    break;
                case TURN_DAYS:
                    finaIndicator.setTurnDays((Float) item[i]);
                    break;
                case ROA_YEARLY:
                    finaIndicator.setRoaYearly((Float) item[i]);
                    break;
                case ROA_DP:
                    finaIndicator.setRoaDp((Float) item[i]);
                    break;
                case FIXED_ASSETS:
                    finaIndicator.setFixedAssets((Float) item[i]);
                    break;
                case PROFIT_PREFIN_EXP:
                    finaIndicator.setProfitPrefinExp((Float) item[i]);
                    break;
                case NON_OP_PROFIT:
                    finaIndicator.setNonOpProfit((Float) item[i]);
                    break;
                case OP_TO_EBT:
                    finaIndicator.setOpToEbt((Float) item[i]);
                    break;
                case NOP_TO_EBT:
                    finaIndicator.setNopToEbt((Float) item[i]);
                    break;
                case OCF_TO_PROFIT:
                    finaIndicator.setOcfToProfit((Float) item[i]);
                    break;
                case CASH_TO_LIQDEBT:
                    finaIndicator.setCashToLiqdebt((Float) item[i]);
                    break;
                case CASH_TO_LIQDEBT_WITHINTEREST:
                    finaIndicator.setCashToLiqdebtWithinterest((Float) item[i]);
                    break;
                case OP_TO_LIQDEBT:
                    finaIndicator.setOpToLiqdebt((Float) item[i]);
                    break;
                case OP_TO_DEBT:
                    finaIndicator.setOpToDebt((Float) item[i]);
                    break;
                case ROIC_YEARLY:
                    finaIndicator.setRoicYearly((Float) item[i]);
                    break;
                case TOTAL_FA_TRUN:
                    finaIndicator.setTotalFaTrun((Float) item[i]);
                    break;
                case PROFIT_TO_OP:
                    finaIndicator.setProfitToOp((Float) item[i]);
                    break;
                case Q_OPINCOME:
                    finaIndicator.setQOpincome((Float) item[i]);
                    break;
                case Q_INVESTINCOME:
                    finaIndicator.setQInvestincome((Float) item[i]);
                    break;
                case Q_DTPROFIT:
                    finaIndicator.setQDtprofit((Float) item[i]);
                    break;
                case Q_EPS:
                    finaIndicator.setQEps((Float) item[i]);
                    break;
                case Q_NETPROFIT_MARGIN:
                    finaIndicator.setQNetprofitMargin((Float) item[i]);
                    break;
                case Q_GSPROFIT_MARGIN:
                    finaIndicator.setQGsprofitMargin((Float) item[i]);
                    break;
                case Q_EXP_TO_SALES:
                    finaIndicator.setQExpToSales((Float) item[i]);
                    break;
                case Q_PROFIT_TO_GR:
                    finaIndicator.setQProfitToGr((Float) item[i]);
                    break;
                case Q_SALEEXP_TO_GR:
                    finaIndicator.setQSaleexpToGr((Float) item[i]);
                    break;
                case Q_ADMINEXP_TO_GR:
                    finaIndicator.setQAdminexpToGr((Float) item[i]);
                    break;
                case Q_FINAEXP_TO_GR:
                    finaIndicator.setQFinaexpToGr((Float) item[i]);
                    break;
                case Q_IMPAIR_TO_GR_TTM:
                    finaIndicator.setQImpairToGrTtm((Float) item[i]);
                    break;
                case Q_GC_TO_GR:
                    finaIndicator.setQGcToGr((Float) item[i]);
                    break;
                case Q_OP_TO_GR:
                    finaIndicator.setQOpToGr((Float) item[i]);
                    break;
                case Q_ROE:
                    finaIndicator.setQRoe((Float) item[i]);
                    break;
                case Q_DT_ROE:
                    finaIndicator.setQDtRoe((Float) item[i]);
                    break;
                case Q_NPTA:
                    finaIndicator.setQNpta((Float) item[i]);
                    break;
                case Q_OPINCOME_TO_EBT:
                    finaIndicator.setQOpincomeToEbt((Float) item[i]);
                    break;
                case Q_INVESTINCOME_TO_EBT:
                    finaIndicator.setQInvestincomeToEbt((Float) item[i]);
                    break;
                case Q_DTPROFIT_TO_PROFIT:
                    finaIndicator.setQDtprofitToProfit((Float) item[i]);
                    break;
                case Q_SALESCASH_TO_OR:
                    finaIndicator.setQSalescashToOr((Float) item[i]);
                    break;
                case Q_OCF_TO_SALES:
                    finaIndicator.setQOcfToSales((Float) item[i]);
                    break;
                case Q_OCF_TO_OR:
                    finaIndicator.setQOcfToOr((Float) item[i]);
                    break;
                case BASIC_EPS_YOY:
                    finaIndicator.setBasicEpsYoy((Float) item[i]);
                    break;
                case DT_EPS_YOY:
                    finaIndicator.setDtEpsYoy((Float) item[i]);
                    break;
                case CFPS_YOY:
                    finaIndicator.setCfpsYoy((Float) item[i]);
                    break;
                case OP_YOY:
                    finaIndicator.setOpYoy((Float) item[i]);
                    break;
                case EBT_YOY:
                    finaIndicator.setEbtYoy((Float) item[i]);
                    break;
                case NETPROFIT_YOY:
                    finaIndicator.setNetprofitYoy((Float) item[i]);
                    break;
                case DT_NETPROFIT_YOY:
                    finaIndicator.setDtNetprofitYoy((Float) item[i]);
                    break;
                case OCF_YOY:
                    finaIndicator.setOcfYoy((Float) item[i]);
                    break;
                case ROE_YOY:
                    finaIndicator.setRoeYoy((Float) item[i]);
                    break;
                case BPS_YOY:
                    finaIndicator.setBpsYoy((Float) item[i]);
                    break;
                case ASSETS_YOY:
                    finaIndicator.setAssetsYoy((Float) item[i]);
                    break;
                case EQT_YOY:
                    finaIndicator.setEqtYoy((Float) item[i]);
                    break;
                case TR_YOY:
                    finaIndicator.setTrYoy((Float) item[i]);
                    break;
                case OR_YOY:
                    finaIndicator.setOrYoy((Float) item[i]);
                    break;
                case Q_GR_YOY:
                    finaIndicator.setQGrYoy((Float) item[i]);
                    break;
                case Q_GR_QOQ:
                    finaIndicator.setQGrQoq((Float) item[i]);
                    break;
                case Q_SALES_YOY:
                    finaIndicator.setQSalesYoy((Float) item[i]);
                    break;
                case Q_SALES_QOQ:
                    finaIndicator.setQSalesQoq((Float) item[i]);
                    break;
                case Q_OP_YOY:
                    finaIndicator.setQOpYoy((Float) item[i]);
                    break;
                case Q_OP_QOQ:
                    finaIndicator.setQOpQoq((Float) item[i]);
                    break;
                case Q_PROFIT_YOY:
                    finaIndicator.setQProfitYoy((Float) item[i]);
                    break;
                case Q_PROFIT_QOQ:
                    finaIndicator.setQProfitQoq((Float) item[i]);
                    break;
                case Q_NETPROFIT_YOY:
                    finaIndicator.setQNetprofitYoy((Float) item[i]);
                    break;
                case Q_NETPROFIT_QOQ:
                    finaIndicator.setQNetprofitQoq((Float) item[i]);
                    break;
                case EQUITY_YOY:
                    finaIndicator.setEquityYoy((Float) item[i]);
                    break;
                case RD_EXP:
                    finaIndicator.setRdExp((Float) item[i]);
                    break;
                case UPDATE_FLAG:
                    finaIndicator.setUpdateFlag((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return finaIndicator;
    }

}

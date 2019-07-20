package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.830276
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Cashflow implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * ann_date
     */
    public static final String ANN_DATE = "ann_date";

    /**
     * f_ann_date
     */
    public static final String F_ANN_DATE = "f_ann_date";

    /**
     * end_date
     */
    public static final String END_DATE = "end_date";

    /**
     * comp_type
     */
    public static final String COMP_TYPE = "comp_type";

    /**
     * report_type
     */
    public static final String REPORT_TYPE = "report_type";

    /**
     * net_profit
     */
    public static final String NET_PROFIT = "net_profit";

    /**
     * finan_exp
     */
    public static final String FINAN_EXP = "finan_exp";

    /**
     * c_fr_sale_sg
     */
    public static final String C_FR_SALE_SG = "c_fr_sale_sg";

    /**
     * recp_tax_rends
     */
    public static final String RECP_TAX_RENDS = "recp_tax_rends";

    /**
     * n_depos_incr_fi
     */
    public static final String N_DEPOS_INCR_FI = "n_depos_incr_fi";

    /**
     * n_incr_loans_cb
     */
    public static final String N_INCR_LOANS_CB = "n_incr_loans_cb";

    /**
     * n_inc_borr_oth_fi
     */
    public static final String N_INC_BORR_OTH_FI = "n_inc_borr_oth_fi";

    /**
     * prem_fr_orig_contr
     */
    public static final String PREM_FR_ORIG_CONTR = "prem_fr_orig_contr";

    /**
     * n_incr_insured_dep
     */
    public static final String N_INCR_INSURED_DEP = "n_incr_insured_dep";

    /**
     * n_reinsur_prem
     */
    public static final String N_REINSUR_PREM = "n_reinsur_prem";

    /**
     * n_incr_disp_tfa
     */
    public static final String N_INCR_DISP_TFA = "n_incr_disp_tfa";

    /**
     * ifc_cash_incr
     */
    public static final String IFC_CASH_INCR = "ifc_cash_incr";

    /**
     * n_incr_disp_faas
     */
    public static final String N_INCR_DISP_FAAS = "n_incr_disp_faas";

    /**
     * n_incr_loans_oth_bank
     */
    public static final String N_INCR_LOANS_OTH_BANK = "n_incr_loans_oth_bank";

    /**
     * n_cap_incr_repur
     */
    public static final String N_CAP_INCR_REPUR = "n_cap_incr_repur";

    /**
     * c_fr_oth_operate_a
     */
    public static final String C_FR_OTH_OPERATE_A = "c_fr_oth_operate_a";

    /**
     * c_inf_fr_operate_a
     */
    public static final String C_INF_FR_OPERATE_A = "c_inf_fr_operate_a";

    /**
     * c_paid_goods_s
     */
    public static final String C_PAID_GOODS_S = "c_paid_goods_s";

    /**
     * c_paid_to_for_empl
     */
    public static final String C_PAID_TO_FOR_EMPL = "c_paid_to_for_empl";

    /**
     * c_paid_for_taxes
     */
    public static final String C_PAID_FOR_TAXES = "c_paid_for_taxes";

    /**
     * n_incr_clt_loan_adv
     */
    public static final String N_INCR_CLT_LOAN_ADV = "n_incr_clt_loan_adv";

    /**
     * n_incr_dep_cbob
     */
    public static final String N_INCR_DEP_CBOB = "n_incr_dep_cbob";

    /**
     * c_pay_claims_orig_inco
     */
    public static final String C_PAY_CLAIMS_ORIG_INCO = "c_pay_claims_orig_inco";

    /**
     * pay_handling_chrg
     */
    public static final String PAY_HANDLING_CHRG = "pay_handling_chrg";

    /**
     * pay_comm_insur_plcy
     */
    public static final String PAY_COMM_INSUR_PLCY = "pay_comm_insur_plcy";

    /**
     * oth_cash_pay_oper_act
     */
    public static final String OTH_CASH_PAY_OPER_ACT = "oth_cash_pay_oper_act";

    /**
     * st_cash_out_act
     */
    public static final String ST_CASH_OUT_ACT = "st_cash_out_act";

    /**
     * n_cashflow_act
     */
    public static final String N_CASHFLOW_ACT = "n_cashflow_act";

    /**
     * oth_recp_ral_inv_act
     */
    public static final String OTH_RECP_RAL_INV_ACT = "oth_recp_ral_inv_act";

    /**
     * c_disp_withdrwl_invest
     */
    public static final String C_DISP_WITHDRWL_INVEST = "c_disp_withdrwl_invest";

    /**
     * c_recp_return_invest
     */
    public static final String C_RECP_RETURN_INVEST = "c_recp_return_invest";

    /**
     * n_recp_disp_fiolta
     */
    public static final String N_RECP_DISP_FIOLTA = "n_recp_disp_fiolta";

    /**
     * n_recp_disp_sobu
     */
    public static final String N_RECP_DISP_SOBU = "n_recp_disp_sobu";

    /**
     * stot_inflows_inv_act
     */
    public static final String STOT_INFLOWS_INV_ACT = "stot_inflows_inv_act";

    /**
     * c_pay_acq_const_fiolta
     */
    public static final String C_PAY_ACQ_CONST_FIOLTA = "c_pay_acq_const_fiolta";

    /**
     * c_paid_invest
     */
    public static final String C_PAID_INVEST = "c_paid_invest";

    /**
     * n_disp_subs_oth_biz
     */
    public static final String N_DISP_SUBS_OTH_BIZ = "n_disp_subs_oth_biz";

    /**
     * oth_pay_ral_inv_act
     */
    public static final String OTH_PAY_RAL_INV_ACT = "oth_pay_ral_inv_act";

    /**
     * n_incr_pledge_loan
     */
    public static final String N_INCR_PLEDGE_LOAN = "n_incr_pledge_loan";

    /**
     * stot_out_inv_act
     */
    public static final String STOT_OUT_INV_ACT = "stot_out_inv_act";

    /**
     * n_cashflow_inv_act
     */
    public static final String N_CASHFLOW_INV_ACT = "n_cashflow_inv_act";

    /**
     * c_recp_borrow
     */
    public static final String C_RECP_BORROW = "c_recp_borrow";

    /**
     * proc_issue_bonds
     */
    public static final String PROC_ISSUE_BONDS = "proc_issue_bonds";

    /**
     * oth_cash_recp_ral_fnc_act
     */
    public static final String OTH_CASH_RECP_RAL_FNC_ACT = "oth_cash_recp_ral_fnc_act";

    /**
     * stot_cash_in_fnc_act
     */
    public static final String STOT_CASH_IN_FNC_ACT = "stot_cash_in_fnc_act";

    /**
     * free_cashflow
     */
    public static final String FREE_CASHFLOW = "free_cashflow";

    /**
     * c_prepay_amt_borr
     */
    public static final String C_PREPAY_AMT_BORR = "c_prepay_amt_borr";

    /**
     * c_pay_dist_dpcp_int_exp
     */
    public static final String C_PAY_DIST_DPCP_INT_EXP = "c_pay_dist_dpcp_int_exp";

    /**
     * incl_dvd_profit_paid_sc_ms
     */
    public static final String INCL_DVD_PROFIT_PAID_SC_MS = "incl_dvd_profit_paid_sc_ms";

    /**
     * oth_cashpay_ral_fnc_act
     */
    public static final String OTH_CASHPAY_RAL_FNC_ACT = "oth_cashpay_ral_fnc_act";

    /**
     * stot_cashout_fnc_act
     */
    public static final String STOT_CASHOUT_FNC_ACT = "stot_cashout_fnc_act";

    /**
     * n_cash_flows_fnc_act
     */
    public static final String N_CASH_FLOWS_FNC_ACT = "n_cash_flows_fnc_act";

    /**
     * eff_fx_flu_cash
     */
    public static final String EFF_FX_FLU_CASH = "eff_fx_flu_cash";

    /**
     * n_incr_cash_cash_equ
     */
    public static final String N_INCR_CASH_CASH_EQU = "n_incr_cash_cash_equ";

    /**
     * c_cash_equ_beg_period
     */
    public static final String C_CASH_EQU_BEG_PERIOD = "c_cash_equ_beg_period";

    /**
     * c_cash_equ_end_period
     */
    public static final String C_CASH_EQU_END_PERIOD = "c_cash_equ_end_period";

    /**
     * c_recp_cap_contrib
     */
    public static final String C_RECP_CAP_CONTRIB = "c_recp_cap_contrib";

    /**
     * incl_cash_rec_saims
     */
    public static final String INCL_CASH_REC_SAIMS = "incl_cash_rec_saims";

    /**
     * uncon_invest_loss
     */
    public static final String UNCON_INVEST_LOSS = "uncon_invest_loss";

    /**
     * prov_depr_assets
     */
    public static final String PROV_DEPR_ASSETS = "prov_depr_assets";

    /**
     * depr_fa_coga_dpba
     */
    public static final String DEPR_FA_COGA_DPBA = "depr_fa_coga_dpba";

    /**
     * amort_intang_assets
     */
    public static final String AMORT_INTANG_ASSETS = "amort_intang_assets";

    /**
     * lt_amort_deferred_exp
     */
    public static final String LT_AMORT_DEFERRED_EXP = "lt_amort_deferred_exp";

    /**
     * decr_deferred_exp
     */
    public static final String DECR_DEFERRED_EXP = "decr_deferred_exp";

    /**
     * incr_acc_exp
     */
    public static final String INCR_ACC_EXP = "incr_acc_exp";

    /**
     * loss_disp_fiolta
     */
    public static final String LOSS_DISP_FIOLTA = "loss_disp_fiolta";

    /**
     * loss_scr_fa
     */
    public static final String LOSS_SCR_FA = "loss_scr_fa";

    /**
     * loss_fv_chg
     */
    public static final String LOSS_FV_CHG = "loss_fv_chg";

    /**
     * invest_loss
     */
    public static final String INVEST_LOSS = "invest_loss";

    /**
     * decr_def_inc_tax_assets
     */
    public static final String DECR_DEF_INC_TAX_ASSETS = "decr_def_inc_tax_assets";

    /**
     * incr_def_inc_tax_liab
     */
    public static final String INCR_DEF_INC_TAX_LIAB = "incr_def_inc_tax_liab";

    /**
     * decr_inventories
     */
    public static final String DECR_INVENTORIES = "decr_inventories";

    /**
     * decr_oper_payable
     */
    public static final String DECR_OPER_PAYABLE = "decr_oper_payable";

    /**
     * incr_oper_payable
     */
    public static final String INCR_OPER_PAYABLE = "incr_oper_payable";

    /**
     * others
     */
    public static final String OTHERS = "others";

    /**
     * im_net_cashflow_oper_act
     */
    public static final String IM_NET_CASHFLOW_OPER_ACT = "im_net_cashflow_oper_act";

    /**
     * conv_debt_into_cap
     */
    public static final String CONV_DEBT_INTO_CAP = "conv_debt_into_cap";

    /**
     * conv_copbonds_due_within_1y
     */
    public static final String CONV_COPBONDS_DUE_WITHIN_1Y = "conv_copbonds_due_within_1y";

    /**
     * fa_fnc_leases
     */
    public static final String FA_FNC_LEASES = "fa_fnc_leases";

    /**
     * end_bal_cash
     */
    public static final String END_BAL_CASH = "end_bal_cash";

    /**
     * beg_bal_cash
     */
    public static final String BEG_BAL_CASH = "beg_bal_cash";

    /**
     * end_bal_cash_equ
     */
    public static final String END_BAL_CASH_EQU = "end_bal_cash_equ";

    /**
     * beg_bal_cash_equ
     */
    public static final String BEG_BAL_CASH_EQU = "beg_bal_cash_equ";

    /**
     * im_n_incr_cash_equ
     */
    public static final String IM_N_INCR_CASH_EQU = "im_n_incr_cash_equ";

    /**
     * update_flag
     */
    public static final String UPDATE_FLAG = "update_flag";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, ANN_DATE, F_ANN_DATE, END_DATE, COMP_TYPE, REPORT_TYPE, NET_PROFIT, FINAN_EXP, C_FR_SALE_SG, RECP_TAX_RENDS, N_DEPOS_INCR_FI, N_INCR_LOANS_CB, N_INC_BORR_OTH_FI, PREM_FR_ORIG_CONTR, N_INCR_INSURED_DEP, N_REINSUR_PREM, N_INCR_DISP_TFA, IFC_CASH_INCR, N_INCR_DISP_FAAS, N_INCR_LOANS_OTH_BANK, N_CAP_INCR_REPUR, C_FR_OTH_OPERATE_A, C_INF_FR_OPERATE_A, C_PAID_GOODS_S, C_PAID_TO_FOR_EMPL, C_PAID_FOR_TAXES, N_INCR_CLT_LOAN_ADV, N_INCR_DEP_CBOB, C_PAY_CLAIMS_ORIG_INCO, PAY_HANDLING_CHRG, PAY_COMM_INSUR_PLCY, OTH_CASH_PAY_OPER_ACT, ST_CASH_OUT_ACT, N_CASHFLOW_ACT, OTH_RECP_RAL_INV_ACT, C_DISP_WITHDRWL_INVEST, C_RECP_RETURN_INVEST, N_RECP_DISP_FIOLTA, N_RECP_DISP_SOBU, STOT_INFLOWS_INV_ACT, C_PAY_ACQ_CONST_FIOLTA, C_PAID_INVEST, N_DISP_SUBS_OTH_BIZ, OTH_PAY_RAL_INV_ACT, N_INCR_PLEDGE_LOAN, STOT_OUT_INV_ACT, N_CASHFLOW_INV_ACT, C_RECP_BORROW, PROC_ISSUE_BONDS, OTH_CASH_RECP_RAL_FNC_ACT, STOT_CASH_IN_FNC_ACT, FREE_CASHFLOW, C_PREPAY_AMT_BORR, C_PAY_DIST_DPCP_INT_EXP, INCL_DVD_PROFIT_PAID_SC_MS, OTH_CASHPAY_RAL_FNC_ACT, STOT_CASHOUT_FNC_ACT, N_CASH_FLOWS_FNC_ACT, EFF_FX_FLU_CASH, N_INCR_CASH_CASH_EQU, C_CASH_EQU_BEG_PERIOD, C_CASH_EQU_END_PERIOD, C_RECP_CAP_CONTRIB, INCL_CASH_REC_SAIMS, UNCON_INVEST_LOSS, PROV_DEPR_ASSETS, DEPR_FA_COGA_DPBA, AMORT_INTANG_ASSETS, LT_AMORT_DEFERRED_EXP, DECR_DEFERRED_EXP, INCR_ACC_EXP, LOSS_DISP_FIOLTA, LOSS_SCR_FA, LOSS_FV_CHG, INVEST_LOSS, DECR_DEF_INC_TAX_ASSETS, INCR_DEF_INC_TAX_LIAB, DECR_INVENTORIES, DECR_OPER_PAYABLE, INCR_OPER_PAYABLE, OTHERS, IM_NET_CASHFLOW_OPER_ACT, CONV_DEBT_INTO_CAP, CONV_COPBONDS_DUE_WITHIN_1Y, FA_FNC_LEASES, END_BAL_CASH, BEG_BAL_CASH, END_BAL_CASH_EQU, BEG_BAL_CASH_EQU, IM_N_INCR_CASH_EQU, UPDATE_FLAG);

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
     * 实际公告日期
     */
    @JsonProperty(value = "f_ann_date")
    private String fAnnDate;

    /**
     * 报告期
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * 报表类型
     */
    @JsonProperty(value = "comp_type")
    private String compType;

    /**
     * 公司类型
     */
    @JsonProperty(value = "report_type")
    private String reportType;

    /**
     * 净利润
     */
    @JsonProperty(value = "net_profit")
    private Float netProfit;

    /**
     * 财务费用
     */
    @JsonProperty(value = "finan_exp")
    private Float finanExp;

    /**
     * 销售商品、提供劳务收到的现金
     */
    @JsonProperty(value = "c_fr_sale_sg")
    private Float cFrSaleSg;

    /**
     * 收到的税费返还
     */
    @JsonProperty(value = "recp_tax_rends")
    private Float recpTaxRends;

    /**
     * 客户存款和同业存放款项净增加额
     */
    @JsonProperty(value = "n_depos_incr_fi")
    private Float nDeposIncrFi;

    /**
     * 向中央银行借款净增加额
     */
    @JsonProperty(value = "n_incr_loans_cb")
    private Float nIncrLoansCb;

    /**
     * 向其他金融机构拆入资金净增加额
     */
    @JsonProperty(value = "n_inc_borr_oth_fi")
    private Float nIncBorrOthFi;

    /**
     * 收到原保险合同保费取得的现金
     */
    @JsonProperty(value = "prem_fr_orig_contr")
    private Float premFrOrigContr;

    /**
     * 保户储金净增加额
     */
    @JsonProperty(value = "n_incr_insured_dep")
    private Float nIncrInsuredDep;

    /**
     * 收到再保业务现金净额
     */
    @JsonProperty(value = "n_reinsur_prem")
    private Float nReinsurPrem;

    /**
     * 处置交易性金融资产净增加额
     */
    @JsonProperty(value = "n_incr_disp_tfa")
    private Float nIncrDispTfa;

    /**
     * 收取利息和手续费净增加额
     */
    @JsonProperty(value = "ifc_cash_incr")
    private Float ifcCashIncr;

    /**
     * 处置可供出售金融资产净增加额
     */
    @JsonProperty(value = "n_incr_disp_faas")
    private Float nIncrDispFaas;

    /**
     * 拆入资金净增加额
     */
    @JsonProperty(value = "n_incr_loans_oth_bank")
    private Float nIncrLoansOthBank;

    /**
     * 回购业务资金净增加额
     */
    @JsonProperty(value = "n_cap_incr_repur")
    private Float nCapIncrRepur;

    /**
     * 收到其他与经营活动有关的现金
     */
    @JsonProperty(value = "c_fr_oth_operate_a")
    private Float cFrOthOperateA;

    /**
     * 经营活动现金流入小计
     */
    @JsonProperty(value = "c_inf_fr_operate_a")
    private Float cInfFrOperateA;

    /**
     * 购买商品、接受劳务支付的现金
     */
    @JsonProperty(value = "c_paid_goods_s")
    private Float cPaidGoodsS;

    /**
     * 支付给职工以及为职工支付的现金
     */
    @JsonProperty(value = "c_paid_to_for_empl")
    private Float cPaidToForEmpl;

    /**
     * 支付的各项税费
     */
    @JsonProperty(value = "c_paid_for_taxes")
    private Float cPaidForTaxes;

    /**
     * 客户贷款及垫款净增加额
     */
    @JsonProperty(value = "n_incr_clt_loan_adv")
    private Float nIncrCltLoanAdv;

    /**
     * 存放央行和同业款项净增加额
     */
    @JsonProperty(value = "n_incr_dep_cbob")
    private Float nIncrDepCbob;

    /**
     * 支付原保险合同赔付款项的现金
     */
    @JsonProperty(value = "c_pay_claims_orig_inco")
    private Float cPayClaimsOrigInco;

    /**
     * 支付手续费的现金
     */
    @JsonProperty(value = "pay_handling_chrg")
    private Float payHandlingChrg;

    /**
     * 支付保单红利的现金
     */
    @JsonProperty(value = "pay_comm_insur_plcy")
    private Float payCommInsurPlcy;

    /**
     * 支付其他与经营活动有关的现金
     */
    @JsonProperty(value = "oth_cash_pay_oper_act")
    private Float othCashPayOperAct;

    /**
     * 经营活动现金流出小计
     */
    @JsonProperty(value = "st_cash_out_act")
    private Float stCashOutAct;

    /**
     * 经营活动产生的现金流量净额
     */
    @JsonProperty(value = "n_cashflow_act")
    private Float nCashflowAct;

    /**
     * 收到其他与投资活动有关的现金
     */
    @JsonProperty(value = "oth_recp_ral_inv_act")
    private Float othRecpRalInvAct;

    /**
     * 收回投资收到的现金
     */
    @JsonProperty(value = "c_disp_withdrwl_invest")
    private Float cDispWithdrwlInvest;

    /**
     * 取得投资收益收到的现金
     */
    @JsonProperty(value = "c_recp_return_invest")
    private Float cRecpReturnInvest;

    /**
     * 处置固定资产、无形资产和其他长期资产收回的现金净额
     */
    @JsonProperty(value = "n_recp_disp_fiolta")
    private Float nRecpDispFiolta;

    /**
     * 处置子公司及其他营业单位收到的现金净额
     */
    @JsonProperty(value = "n_recp_disp_sobu")
    private Float nRecpDispSobu;

    /**
     * 投资活动现金流入小计
     */
    @JsonProperty(value = "stot_inflows_inv_act")
    private Float stotInflowsInvAct;

    /**
     * 购建固定资产、无形资产和其他长期资产支付的现金
     */
    @JsonProperty(value = "c_pay_acq_const_fiolta")
    private Float cPayAcqConstFiolta;

    /**
     * 投资支付的现金
     */
    @JsonProperty(value = "c_paid_invest")
    private Float cPaidInvest;

    /**
     * 取得子公司及其他营业单位支付的现金净额
     */
    @JsonProperty(value = "n_disp_subs_oth_biz")
    private Float nDispSubsOthBiz;

    /**
     * 支付其他与投资活动有关的现金
     */
    @JsonProperty(value = "oth_pay_ral_inv_act")
    private Float othPayRalInvAct;

    /**
     * 质押贷款净增加额
     */
    @JsonProperty(value = "n_incr_pledge_loan")
    private Float nIncrPledgeLoan;

    /**
     * 投资活动现金流出小计
     */
    @JsonProperty(value = "stot_out_inv_act")
    private Float stotOutInvAct;

    /**
     * 投资活动产生的现金流量净额
     */
    @JsonProperty(value = "n_cashflow_inv_act")
    private Float nCashflowInvAct;

    /**
     * 取得借款收到的现金
     */
    @JsonProperty(value = "c_recp_borrow")
    private Float cRecpBorrow;

    /**
     * 发行债券收到的现金
     */
    @JsonProperty(value = "proc_issue_bonds")
    private Float procIssueBonds;

    /**
     * 收到其他与筹资活动有关的现金
     */
    @JsonProperty(value = "oth_cash_recp_ral_fnc_act")
    private Float othCashRecpRalFncAct;

    /**
     * 筹资活动现金流入小计
     */
    @JsonProperty(value = "stot_cash_in_fnc_act")
    private Float stotCashInFncAct;

    /**
     * 企业自由现金流量
     */
    @JsonProperty(value = "free_cashflow")
    private Float freeCashflow;

    /**
     * 偿还债务支付的现金
     */
    @JsonProperty(value = "c_prepay_amt_borr")
    private Float cPrepayAmtBorr;

    /**
     * 分配股利、利润或偿付利息支付的现金
     */
    @JsonProperty(value = "c_pay_dist_dpcp_int_exp")
    private Float cPayDistDpcpIntExp;

    /**
     * 其中:子公司支付给少数股东的股利、利润
     */
    @JsonProperty(value = "incl_dvd_profit_paid_sc_ms")
    private Float inclDvdProfitPaidScMs;

    /**
     * 支付其他与筹资活动有关的现金
     */
    @JsonProperty(value = "oth_cashpay_ral_fnc_act")
    private Float othCashpayRalFncAct;

    /**
     * 筹资活动现金流出小计
     */
    @JsonProperty(value = "stot_cashout_fnc_act")
    private Float stotCashoutFncAct;

    /**
     * 筹资活动产生的现金流量净额
     */
    @JsonProperty(value = "n_cash_flows_fnc_act")
    private Float nCashFlowsFncAct;

    /**
     * 汇率变动对现金的影响
     */
    @JsonProperty(value = "eff_fx_flu_cash")
    private Float effFxFluCash;

    /**
     * 现金及现金等价物净增加额
     */
    @JsonProperty(value = "n_incr_cash_cash_equ")
    private Float nIncrCashCashEqu;

    /**
     * 期初现金及现金等价物余额
     */
    @JsonProperty(value = "c_cash_equ_beg_period")
    private Float cCashEquBegPeriod;

    /**
     * 期末现金及现金等价物余额
     */
    @JsonProperty(value = "c_cash_equ_end_period")
    private Float cCashEquEndPeriod;

    /**
     * 吸收投资收到的现金
     */
    @JsonProperty(value = "c_recp_cap_contrib")
    private Float cRecpCapContrib;

    /**
     * 其中:子公司吸收少数股东投资收到的现金
     */
    @JsonProperty(value = "incl_cash_rec_saims")
    private Float inclCashRecSaims;

    /**
     * 未确认投资损失
     */
    @JsonProperty(value = "uncon_invest_loss")
    private Float unconInvestLoss;

    /**
     * 加:资产减值准备
     */
    @JsonProperty(value = "prov_depr_assets")
    private Float provDeprAssets;

    /**
     * 固定资产折旧、油气资产折耗、生产性生物资产折旧
     */
    @JsonProperty(value = "depr_fa_coga_dpba")
    private Float deprFaCogaDpba;

    /**
     * 无形资产摊销
     */
    @JsonProperty(value = "amort_intang_assets")
    private Float amortIntangAssets;

    /**
     * 长期待摊费用摊销
     */
    @JsonProperty(value = "lt_amort_deferred_exp")
    private Float ltAmortDeferredExp;

    /**
     * 待摊费用减少
     */
    @JsonProperty(value = "decr_deferred_exp")
    private Float decrDeferredExp;

    /**
     * 预提费用增加
     */
    @JsonProperty(value = "incr_acc_exp")
    private Float incrAccExp;

    /**
     * 处置固定、无形资产和其他长期资产的损失
     */
    @JsonProperty(value = "loss_disp_fiolta")
    private Float lossDispFiolta;

    /**
     * 固定资产报废损失
     */
    @JsonProperty(value = "loss_scr_fa")
    private Float lossScrFa;

    /**
     * 公允价值变动损失
     */
    @JsonProperty(value = "loss_fv_chg")
    private Float lossFvChg;

    /**
     * 投资损失
     */
    @JsonProperty(value = "invest_loss")
    private Float investLoss;

    /**
     * 递延所得税资产减少
     */
    @JsonProperty(value = "decr_def_inc_tax_assets")
    private Float decrDefIncTaxAssets;

    /**
     * 递延所得税负债增加
     */
    @JsonProperty(value = "incr_def_inc_tax_liab")
    private Float incrDefIncTaxLiab;

    /**
     * 存货的减少
     */
    @JsonProperty(value = "decr_inventories")
    private Float decrInventories;

    /**
     * 经营性应收项目的减少
     */
    @JsonProperty(value = "decr_oper_payable")
    private Float decrOperPayable;

    /**
     * 经营性应付项目的增加
     */
    @JsonProperty(value = "incr_oper_payable")
    private Float incrOperPayable;

    /**
     * 其他
     */
    @JsonProperty(value = "others")
    private Float others;

    /**
     * 经营活动产生的现金流量净额(间接法)
     */
    @JsonProperty(value = "im_net_cashflow_oper_act")
    private Float imNetCashflowOperAct;

    /**
     * 债务转为资本
     */
    @JsonProperty(value = "conv_debt_into_cap")
    private Float convDebtIntoCap;

    /**
     * 一年内到期的可转换公司债券
     */
    @JsonProperty(value = "conv_copbonds_due_within_1y")
    private Float convCopbondsDueWithin1y;

    /**
     * 融资租入固定资产
     */
    @JsonProperty(value = "fa_fnc_leases")
    private Float faFncLeases;

    /**
     * 现金的期末余额
     */
    @JsonProperty(value = "end_bal_cash")
    private Float endBalCash;

    /**
     * 减:现金的期初余额
     */
    @JsonProperty(value = "beg_bal_cash")
    private Float begBalCash;

    /**
     * 加:现金等价物的期末余额
     */
    @JsonProperty(value = "end_bal_cash_equ")
    private Float endBalCashEqu;

    /**
     * 减:现金等价物的期初余额
     */
    @JsonProperty(value = "beg_bal_cash_equ")
    private Float begBalCashEqu;

    /**
     * 现金及现金等价物净增加额(间接法)
     */
    @JsonProperty(value = "im_n_incr_cash_equ")
    private Float imNIncrCashEqu;

    /**
     * 更新标识
     */
    @JsonProperty(value = "update_flag")
    private String updateFlag;


    /**
     * init by array
     */
    public static Cashflow init(String[] fields, Object[] item) {
        Cashflow cashflow = new Cashflow();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    cashflow.setTsCode((String) item[i]);
                    break;
                case ANN_DATE:
                    cashflow.setAnnDate((String) item[i]);
                    break;
                case F_ANN_DATE:
                    cashflow.setFAnnDate((String) item[i]);
                    break;
                case END_DATE:
                    cashflow.setEndDate((String) item[i]);
                    break;
                case COMP_TYPE:
                    cashflow.setCompType((String) item[i]);
                    break;
                case REPORT_TYPE:
                    cashflow.setReportType((String) item[i]);
                    break;
                case NET_PROFIT:
                    cashflow.setNetProfit((Float) item[i]);
                    break;
                case FINAN_EXP:
                    cashflow.setFinanExp((Float) item[i]);
                    break;
                case C_FR_SALE_SG:
                    cashflow.setCFrSaleSg((Float) item[i]);
                    break;
                case RECP_TAX_RENDS:
                    cashflow.setRecpTaxRends((Float) item[i]);
                    break;
                case N_DEPOS_INCR_FI:
                    cashflow.setNDeposIncrFi((Float) item[i]);
                    break;
                case N_INCR_LOANS_CB:
                    cashflow.setNIncrLoansCb((Float) item[i]);
                    break;
                case N_INC_BORR_OTH_FI:
                    cashflow.setNIncBorrOthFi((Float) item[i]);
                    break;
                case PREM_FR_ORIG_CONTR:
                    cashflow.setPremFrOrigContr((Float) item[i]);
                    break;
                case N_INCR_INSURED_DEP:
                    cashflow.setNIncrInsuredDep((Float) item[i]);
                    break;
                case N_REINSUR_PREM:
                    cashflow.setNReinsurPrem((Float) item[i]);
                    break;
                case N_INCR_DISP_TFA:
                    cashflow.setNIncrDispTfa((Float) item[i]);
                    break;
                case IFC_CASH_INCR:
                    cashflow.setIfcCashIncr((Float) item[i]);
                    break;
                case N_INCR_DISP_FAAS:
                    cashflow.setNIncrDispFaas((Float) item[i]);
                    break;
                case N_INCR_LOANS_OTH_BANK:
                    cashflow.setNIncrLoansOthBank((Float) item[i]);
                    break;
                case N_CAP_INCR_REPUR:
                    cashflow.setNCapIncrRepur((Float) item[i]);
                    break;
                case C_FR_OTH_OPERATE_A:
                    cashflow.setCFrOthOperateA((Float) item[i]);
                    break;
                case C_INF_FR_OPERATE_A:
                    cashflow.setCInfFrOperateA((Float) item[i]);
                    break;
                case C_PAID_GOODS_S:
                    cashflow.setCPaidGoodsS((Float) item[i]);
                    break;
                case C_PAID_TO_FOR_EMPL:
                    cashflow.setCPaidToForEmpl((Float) item[i]);
                    break;
                case C_PAID_FOR_TAXES:
                    cashflow.setCPaidForTaxes((Float) item[i]);
                    break;
                case N_INCR_CLT_LOAN_ADV:
                    cashflow.setNIncrCltLoanAdv((Float) item[i]);
                    break;
                case N_INCR_DEP_CBOB:
                    cashflow.setNIncrDepCbob((Float) item[i]);
                    break;
                case C_PAY_CLAIMS_ORIG_INCO:
                    cashflow.setCPayClaimsOrigInco((Float) item[i]);
                    break;
                case PAY_HANDLING_CHRG:
                    cashflow.setPayHandlingChrg((Float) item[i]);
                    break;
                case PAY_COMM_INSUR_PLCY:
                    cashflow.setPayCommInsurPlcy((Float) item[i]);
                    break;
                case OTH_CASH_PAY_OPER_ACT:
                    cashflow.setOthCashPayOperAct((Float) item[i]);
                    break;
                case ST_CASH_OUT_ACT:
                    cashflow.setStCashOutAct((Float) item[i]);
                    break;
                case N_CASHFLOW_ACT:
                    cashflow.setNCashflowAct((Float) item[i]);
                    break;
                case OTH_RECP_RAL_INV_ACT:
                    cashflow.setOthRecpRalInvAct((Float) item[i]);
                    break;
                case C_DISP_WITHDRWL_INVEST:
                    cashflow.setCDispWithdrwlInvest((Float) item[i]);
                    break;
                case C_RECP_RETURN_INVEST:
                    cashflow.setCRecpReturnInvest((Float) item[i]);
                    break;
                case N_RECP_DISP_FIOLTA:
                    cashflow.setNRecpDispFiolta((Float) item[i]);
                    break;
                case N_RECP_DISP_SOBU:
                    cashflow.setNRecpDispSobu((Float) item[i]);
                    break;
                case STOT_INFLOWS_INV_ACT:
                    cashflow.setStotInflowsInvAct((Float) item[i]);
                    break;
                case C_PAY_ACQ_CONST_FIOLTA:
                    cashflow.setCPayAcqConstFiolta((Float) item[i]);
                    break;
                case C_PAID_INVEST:
                    cashflow.setCPaidInvest((Float) item[i]);
                    break;
                case N_DISP_SUBS_OTH_BIZ:
                    cashflow.setNDispSubsOthBiz((Float) item[i]);
                    break;
                case OTH_PAY_RAL_INV_ACT:
                    cashflow.setOthPayRalInvAct((Float) item[i]);
                    break;
                case N_INCR_PLEDGE_LOAN:
                    cashflow.setNIncrPledgeLoan((Float) item[i]);
                    break;
                case STOT_OUT_INV_ACT:
                    cashflow.setStotOutInvAct((Float) item[i]);
                    break;
                case N_CASHFLOW_INV_ACT:
                    cashflow.setNCashflowInvAct((Float) item[i]);
                    break;
                case C_RECP_BORROW:
                    cashflow.setCRecpBorrow((Float) item[i]);
                    break;
                case PROC_ISSUE_BONDS:
                    cashflow.setProcIssueBonds((Float) item[i]);
                    break;
                case OTH_CASH_RECP_RAL_FNC_ACT:
                    cashflow.setOthCashRecpRalFncAct((Float) item[i]);
                    break;
                case STOT_CASH_IN_FNC_ACT:
                    cashflow.setStotCashInFncAct((Float) item[i]);
                    break;
                case FREE_CASHFLOW:
                    cashflow.setFreeCashflow((Float) item[i]);
                    break;
                case C_PREPAY_AMT_BORR:
                    cashflow.setCPrepayAmtBorr((Float) item[i]);
                    break;
                case C_PAY_DIST_DPCP_INT_EXP:
                    cashflow.setCPayDistDpcpIntExp((Float) item[i]);
                    break;
                case INCL_DVD_PROFIT_PAID_SC_MS:
                    cashflow.setInclDvdProfitPaidScMs((Float) item[i]);
                    break;
                case OTH_CASHPAY_RAL_FNC_ACT:
                    cashflow.setOthCashpayRalFncAct((Float) item[i]);
                    break;
                case STOT_CASHOUT_FNC_ACT:
                    cashflow.setStotCashoutFncAct((Float) item[i]);
                    break;
                case N_CASH_FLOWS_FNC_ACT:
                    cashflow.setNCashFlowsFncAct((Float) item[i]);
                    break;
                case EFF_FX_FLU_CASH:
                    cashflow.setEffFxFluCash((Float) item[i]);
                    break;
                case N_INCR_CASH_CASH_EQU:
                    cashflow.setNIncrCashCashEqu((Float) item[i]);
                    break;
                case C_CASH_EQU_BEG_PERIOD:
                    cashflow.setCCashEquBegPeriod((Float) item[i]);
                    break;
                case C_CASH_EQU_END_PERIOD:
                    cashflow.setCCashEquEndPeriod((Float) item[i]);
                    break;
                case C_RECP_CAP_CONTRIB:
                    cashflow.setCRecpCapContrib((Float) item[i]);
                    break;
                case INCL_CASH_REC_SAIMS:
                    cashflow.setInclCashRecSaims((Float) item[i]);
                    break;
                case UNCON_INVEST_LOSS:
                    cashflow.setUnconInvestLoss((Float) item[i]);
                    break;
                case PROV_DEPR_ASSETS:
                    cashflow.setProvDeprAssets((Float) item[i]);
                    break;
                case DEPR_FA_COGA_DPBA:
                    cashflow.setDeprFaCogaDpba((Float) item[i]);
                    break;
                case AMORT_INTANG_ASSETS:
                    cashflow.setAmortIntangAssets((Float) item[i]);
                    break;
                case LT_AMORT_DEFERRED_EXP:
                    cashflow.setLtAmortDeferredExp((Float) item[i]);
                    break;
                case DECR_DEFERRED_EXP:
                    cashflow.setDecrDeferredExp((Float) item[i]);
                    break;
                case INCR_ACC_EXP:
                    cashflow.setIncrAccExp((Float) item[i]);
                    break;
                case LOSS_DISP_FIOLTA:
                    cashflow.setLossDispFiolta((Float) item[i]);
                    break;
                case LOSS_SCR_FA:
                    cashflow.setLossScrFa((Float) item[i]);
                    break;
                case LOSS_FV_CHG:
                    cashflow.setLossFvChg((Float) item[i]);
                    break;
                case INVEST_LOSS:
                    cashflow.setInvestLoss((Float) item[i]);
                    break;
                case DECR_DEF_INC_TAX_ASSETS:
                    cashflow.setDecrDefIncTaxAssets((Float) item[i]);
                    break;
                case INCR_DEF_INC_TAX_LIAB:
                    cashflow.setIncrDefIncTaxLiab((Float) item[i]);
                    break;
                case DECR_INVENTORIES:
                    cashflow.setDecrInventories((Float) item[i]);
                    break;
                case DECR_OPER_PAYABLE:
                    cashflow.setDecrOperPayable((Float) item[i]);
                    break;
                case INCR_OPER_PAYABLE:
                    cashflow.setIncrOperPayable((Float) item[i]);
                    break;
                case OTHERS:
                    cashflow.setOthers((Float) item[i]);
                    break;
                case IM_NET_CASHFLOW_OPER_ACT:
                    cashflow.setImNetCashflowOperAct((Float) item[i]);
                    break;
                case CONV_DEBT_INTO_CAP:
                    cashflow.setConvDebtIntoCap((Float) item[i]);
                    break;
                case CONV_COPBONDS_DUE_WITHIN_1Y:
                    cashflow.setConvCopbondsDueWithin1y((Float) item[i]);
                    break;
                case FA_FNC_LEASES:
                    cashflow.setFaFncLeases((Float) item[i]);
                    break;
                case END_BAL_CASH:
                    cashflow.setEndBalCash((Float) item[i]);
                    break;
                case BEG_BAL_CASH:
                    cashflow.setBegBalCash((Float) item[i]);
                    break;
                case END_BAL_CASH_EQU:
                    cashflow.setEndBalCashEqu((Float) item[i]);
                    break;
                case BEG_BAL_CASH_EQU:
                    cashflow.setBegBalCashEqu((Float) item[i]);
                    break;
                case IM_N_INCR_CASH_EQU:
                    cashflow.setImNIncrCashEqu((Float) item[i]);
                    break;
                case UPDATE_FLAG:
                    cashflow.setUpdateFlag((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return cashflow;
    }

}

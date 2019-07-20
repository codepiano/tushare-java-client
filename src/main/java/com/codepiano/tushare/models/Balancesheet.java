package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.834150
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Balancesheet implements Model {

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
     * report_type
     */
    public static final String REPORT_TYPE = "report_type";

    /**
     * comp_type
     */
    public static final String COMP_TYPE = "comp_type";

    /**
     * total_share
     */
    public static final String TOTAL_SHARE = "total_share";

    /**
     * cap_rese
     */
    public static final String CAP_RESE = "cap_rese";

    /**
     * undistr_porfit
     */
    public static final String UNDISTR_PORFIT = "undistr_porfit";

    /**
     * surplus_rese
     */
    public static final String SURPLUS_RESE = "surplus_rese";

    /**
     * special_rese
     */
    public static final String SPECIAL_RESE = "special_rese";

    /**
     * money_cap
     */
    public static final String MONEY_CAP = "money_cap";

    /**
     * trad_asset
     */
    public static final String TRAD_ASSET = "trad_asset";

    /**
     * notes_receiv
     */
    public static final String NOTES_RECEIV = "notes_receiv";

    /**
     * accounts_receiv
     */
    public static final String ACCOUNTS_RECEIV = "accounts_receiv";

    /**
     * oth_receiv
     */
    public static final String OTH_RECEIV = "oth_receiv";

    /**
     * prepayment
     */
    public static final String PREPAYMENT = "prepayment";

    /**
     * div_receiv
     */
    public static final String DIV_RECEIV = "div_receiv";

    /**
     * int_receiv
     */
    public static final String INT_RECEIV = "int_receiv";

    /**
     * inventories
     */
    public static final String INVENTORIES = "inventories";

    /**
     * amor_exp
     */
    public static final String AMOR_EXP = "amor_exp";

    /**
     * nca_within_1y
     */
    public static final String NCA_WITHIN_1Y = "nca_within_1y";

    /**
     * sett_rsrv
     */
    public static final String SETT_RSRV = "sett_rsrv";

    /**
     * loanto_oth_bank_fi
     */
    public static final String LOANTO_OTH_BANK_FI = "loanto_oth_bank_fi";

    /**
     * premium_receiv
     */
    public static final String PREMIUM_RECEIV = "premium_receiv";

    /**
     * reinsur_receiv
     */
    public static final String REINSUR_RECEIV = "reinsur_receiv";

    /**
     * reinsur_res_receiv
     */
    public static final String REINSUR_RES_RECEIV = "reinsur_res_receiv";

    /**
     * pur_resale_fa
     */
    public static final String PUR_RESALE_FA = "pur_resale_fa";

    /**
     * oth_cur_assets
     */
    public static final String OTH_CUR_ASSETS = "oth_cur_assets";

    /**
     * total_cur_assets
     */
    public static final String TOTAL_CUR_ASSETS = "total_cur_assets";

    /**
     * fa_avail_for_sale
     */
    public static final String FA_AVAIL_FOR_SALE = "fa_avail_for_sale";

    /**
     * htm_invest
     */
    public static final String HTM_INVEST = "htm_invest";

    /**
     * lt_eqt_invest
     */
    public static final String LT_EQT_INVEST = "lt_eqt_invest";

    /**
     * invest_real_estate
     */
    public static final String INVEST_REAL_ESTATE = "invest_real_estate";

    /**
     * time_deposits
     */
    public static final String TIME_DEPOSITS = "time_deposits";

    /**
     * oth_assets
     */
    public static final String OTH_ASSETS = "oth_assets";

    /**
     * lt_rec
     */
    public static final String LT_REC = "lt_rec";

    /**
     * fix_assets
     */
    public static final String FIX_ASSETS = "fix_assets";

    /**
     * cip
     */
    public static final String CIP = "cip";

    /**
     * const_materials
     */
    public static final String CONST_MATERIALS = "const_materials";

    /**
     * fixed_assets_disp
     */
    public static final String FIXED_ASSETS_DISP = "fixed_assets_disp";

    /**
     * produc_bio_assets
     */
    public static final String PRODUC_BIO_ASSETS = "produc_bio_assets";

    /**
     * oil_and_gas_assets
     */
    public static final String OIL_AND_GAS_ASSETS = "oil_and_gas_assets";

    /**
     * intan_assets
     */
    public static final String INTAN_ASSETS = "intan_assets";

    /**
     * r_and_d
     */
    public static final String R_AND_D = "r_and_d";

    /**
     * goodwill
     */
    public static final String GOODWILL = "goodwill";

    /**
     * lt_amor_exp
     */
    public static final String LT_AMOR_EXP = "lt_amor_exp";

    /**
     * defer_tax_assets
     */
    public static final String DEFER_TAX_ASSETS = "defer_tax_assets";

    /**
     * decr_in_disbur
     */
    public static final String DECR_IN_DISBUR = "decr_in_disbur";

    /**
     * oth_nca
     */
    public static final String OTH_NCA = "oth_nca";

    /**
     * total_nca
     */
    public static final String TOTAL_NCA = "total_nca";

    /**
     * cash_reser_cb
     */
    public static final String CASH_RESER_CB = "cash_reser_cb";

    /**
     * depos_in_oth_bfi
     */
    public static final String DEPOS_IN_OTH_BFI = "depos_in_oth_bfi";

    /**
     * prec_metals
     */
    public static final String PREC_METALS = "prec_metals";

    /**
     * deriv_assets
     */
    public static final String DERIV_ASSETS = "deriv_assets";

    /**
     * rr_reins_une_prem
     */
    public static final String RR_REINS_UNE_PREM = "rr_reins_une_prem";

    /**
     * rr_reins_outstd_cla
     */
    public static final String RR_REINS_OUTSTD_CLA = "rr_reins_outstd_cla";

    /**
     * rr_reins_lins_liab
     */
    public static final String RR_REINS_LINS_LIAB = "rr_reins_lins_liab";

    /**
     * rr_reins_lthins_liab
     */
    public static final String RR_REINS_LTHINS_LIAB = "rr_reins_lthins_liab";

    /**
     * refund_depos
     */
    public static final String REFUND_DEPOS = "refund_depos";

    /**
     * ph_pledge_loans
     */
    public static final String PH_PLEDGE_LOANS = "ph_pledge_loans";

    /**
     * refund_cap_depos
     */
    public static final String REFUND_CAP_DEPOS = "refund_cap_depos";

    /**
     * indep_acct_assets
     */
    public static final String INDEP_ACCT_ASSETS = "indep_acct_assets";

    /**
     * client_depos
     */
    public static final String CLIENT_DEPOS = "client_depos";

    /**
     * client_prov
     */
    public static final String CLIENT_PROV = "client_prov";

    /**
     * transac_seat_fee
     */
    public static final String TRANSAC_SEAT_FEE = "transac_seat_fee";

    /**
     * invest_as_receiv
     */
    public static final String INVEST_AS_RECEIV = "invest_as_receiv";

    /**
     * total_assets
     */
    public static final String TOTAL_ASSETS = "total_assets";

    /**
     * lt_borr
     */
    public static final String LT_BORR = "lt_borr";

    /**
     * st_borr
     */
    public static final String ST_BORR = "st_borr";

    /**
     * cb_borr
     */
    public static final String CB_BORR = "cb_borr";

    /**
     * depos_ib_deposits
     */
    public static final String DEPOS_IB_DEPOSITS = "depos_ib_deposits";

    /**
     * loan_oth_bank
     */
    public static final String LOAN_OTH_BANK = "loan_oth_bank";

    /**
     * trading_fl
     */
    public static final String TRADING_FL = "trading_fl";

    /**
     * notes_payable
     */
    public static final String NOTES_PAYABLE = "notes_payable";

    /**
     * acct_payable
     */
    public static final String ACCT_PAYABLE = "acct_payable";

    /**
     * adv_receipts
     */
    public static final String ADV_RECEIPTS = "adv_receipts";

    /**
     * sold_for_repur_fa
     */
    public static final String SOLD_FOR_REPUR_FA = "sold_for_repur_fa";

    /**
     * comm_payable
     */
    public static final String COMM_PAYABLE = "comm_payable";

    /**
     * payroll_payable
     */
    public static final String PAYROLL_PAYABLE = "payroll_payable";

    /**
     * taxes_payable
     */
    public static final String TAXES_PAYABLE = "taxes_payable";

    /**
     * int_payable
     */
    public static final String INT_PAYABLE = "int_payable";

    /**
     * div_payable
     */
    public static final String DIV_PAYABLE = "div_payable";

    /**
     * oth_payable
     */
    public static final String OTH_PAYABLE = "oth_payable";

    /**
     * acc_exp
     */
    public static final String ACC_EXP = "acc_exp";

    /**
     * deferred_inc
     */
    public static final String DEFERRED_INC = "deferred_inc";

    /**
     * st_bonds_payable
     */
    public static final String ST_BONDS_PAYABLE = "st_bonds_payable";

    /**
     * payable_to_reinsurer
     */
    public static final String PAYABLE_TO_REINSURER = "payable_to_reinsurer";

    /**
     * rsrv_insur_cont
     */
    public static final String RSRV_INSUR_CONT = "rsrv_insur_cont";

    /**
     * acting_trading_sec
     */
    public static final String ACTING_TRADING_SEC = "acting_trading_sec";

    /**
     * acting_uw_sec
     */
    public static final String ACTING_UW_SEC = "acting_uw_sec";

    /**
     * non_cur_liab_due_1y
     */
    public static final String NON_CUR_LIAB_DUE_1Y = "non_cur_liab_due_1y";

    /**
     * oth_cur_liab
     */
    public static final String OTH_CUR_LIAB = "oth_cur_liab";

    /**
     * total_cur_liab
     */
    public static final String TOTAL_CUR_LIAB = "total_cur_liab";

    /**
     * bond_payable
     */
    public static final String BOND_PAYABLE = "bond_payable";

    /**
     * lt_payable
     */
    public static final String LT_PAYABLE = "lt_payable";

    /**
     * specific_payables
     */
    public static final String SPECIFIC_PAYABLES = "specific_payables";

    /**
     * estimated_liab
     */
    public static final String ESTIMATED_LIAB = "estimated_liab";

    /**
     * defer_tax_liab
     */
    public static final String DEFER_TAX_LIAB = "defer_tax_liab";

    /**
     * defer_inc_non_cur_liab
     */
    public static final String DEFER_INC_NON_CUR_LIAB = "defer_inc_non_cur_liab";

    /**
     * oth_ncl
     */
    public static final String OTH_NCL = "oth_ncl";

    /**
     * total_ncl
     */
    public static final String TOTAL_NCL = "total_ncl";

    /**
     * depos_oth_bfi
     */
    public static final String DEPOS_OTH_BFI = "depos_oth_bfi";

    /**
     * deriv_liab
     */
    public static final String DERIV_LIAB = "deriv_liab";

    /**
     * depos
     */
    public static final String DEPOS = "depos";

    /**
     * agency_bus_liab
     */
    public static final String AGENCY_BUS_LIAB = "agency_bus_liab";

    /**
     * oth_liab
     */
    public static final String OTH_LIAB = "oth_liab";

    /**
     * prem_receiv_adva
     */
    public static final String PREM_RECEIV_ADVA = "prem_receiv_adva";

    /**
     * depos_received
     */
    public static final String DEPOS_RECEIVED = "depos_received";

    /**
     * ph_invest
     */
    public static final String PH_INVEST = "ph_invest";

    /**
     * reser_une_prem
     */
    public static final String RESER_UNE_PREM = "reser_une_prem";

    /**
     * reser_outstd_claims
     */
    public static final String RESER_OUTSTD_CLAIMS = "reser_outstd_claims";

    /**
     * reser_lins_liab
     */
    public static final String RESER_LINS_LIAB = "reser_lins_liab";

    /**
     * reser_lthins_liab
     */
    public static final String RESER_LTHINS_LIAB = "reser_lthins_liab";

    /**
     * indept_acc_liab
     */
    public static final String INDEPT_ACC_LIAB = "indept_acc_liab";

    /**
     * pledge_borr
     */
    public static final String PLEDGE_BORR = "pledge_borr";

    /**
     * indem_payable
     */
    public static final String INDEM_PAYABLE = "indem_payable";

    /**
     * policy_div_payable
     */
    public static final String POLICY_DIV_PAYABLE = "policy_div_payable";

    /**
     * total_liab
     */
    public static final String TOTAL_LIAB = "total_liab";

    /**
     * treasury_share
     */
    public static final String TREASURY_SHARE = "treasury_share";

    /**
     * ordin_risk_reser
     */
    public static final String ORDIN_RISK_RESER = "ordin_risk_reser";

    /**
     * forex_differ
     */
    public static final String FOREX_DIFFER = "forex_differ";

    /**
     * invest_loss_unconf
     */
    public static final String INVEST_LOSS_UNCONF = "invest_loss_unconf";

    /**
     * minority_int
     */
    public static final String MINORITY_INT = "minority_int";

    /**
     * total_hldr_eqy_exc_min_int
     */
    public static final String TOTAL_HLDR_EQY_EXC_MIN_INT = "total_hldr_eqy_exc_min_int";

    /**
     * total_hldr_eqy_inc_min_int
     */
    public static final String TOTAL_HLDR_EQY_INC_MIN_INT = "total_hldr_eqy_inc_min_int";

    /**
     * total_liab_hldr_eqy
     */
    public static final String TOTAL_LIAB_HLDR_EQY = "total_liab_hldr_eqy";

    /**
     * lt_payroll_payable
     */
    public static final String LT_PAYROLL_PAYABLE = "lt_payroll_payable";

    /**
     * oth_comp_income
     */
    public static final String OTH_COMP_INCOME = "oth_comp_income";

    /**
     * oth_eqt_tools
     */
    public static final String OTH_EQT_TOOLS = "oth_eqt_tools";

    /**
     * oth_eqt_tools_p_shr
     */
    public static final String OTH_EQT_TOOLS_P_SHR = "oth_eqt_tools_p_shr";

    /**
     * lending_funds
     */
    public static final String LENDING_FUNDS = "lending_funds";

    /**
     * acc_receivable
     */
    public static final String ACC_RECEIVABLE = "acc_receivable";

    /**
     * st_fin_payable
     */
    public static final String ST_FIN_PAYABLE = "st_fin_payable";

    /**
     * payables
     */
    public static final String PAYABLES = "payables";

    /**
     * hfs_assets
     */
    public static final String HFS_ASSETS = "hfs_assets";

    /**
     * hfs_sales
     */
    public static final String HFS_SALES = "hfs_sales";

    /**
     * update_flag
     */
    public static final String UPDATE_FLAG = "update_flag";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, ANN_DATE, F_ANN_DATE, END_DATE, REPORT_TYPE, COMP_TYPE, TOTAL_SHARE, CAP_RESE, UNDISTR_PORFIT, SURPLUS_RESE, SPECIAL_RESE, MONEY_CAP, TRAD_ASSET, NOTES_RECEIV, ACCOUNTS_RECEIV, OTH_RECEIV, PREPAYMENT, DIV_RECEIV, INT_RECEIV, INVENTORIES, AMOR_EXP, NCA_WITHIN_1Y, SETT_RSRV, LOANTO_OTH_BANK_FI, PREMIUM_RECEIV, REINSUR_RECEIV, REINSUR_RES_RECEIV, PUR_RESALE_FA, OTH_CUR_ASSETS, TOTAL_CUR_ASSETS, FA_AVAIL_FOR_SALE, HTM_INVEST, LT_EQT_INVEST, INVEST_REAL_ESTATE, TIME_DEPOSITS, OTH_ASSETS, LT_REC, FIX_ASSETS, CIP, CONST_MATERIALS, FIXED_ASSETS_DISP, PRODUC_BIO_ASSETS, OIL_AND_GAS_ASSETS, INTAN_ASSETS, R_AND_D, GOODWILL, LT_AMOR_EXP, DEFER_TAX_ASSETS, DECR_IN_DISBUR, OTH_NCA, TOTAL_NCA, CASH_RESER_CB, DEPOS_IN_OTH_BFI, PREC_METALS, DERIV_ASSETS, RR_REINS_UNE_PREM, RR_REINS_OUTSTD_CLA, RR_REINS_LINS_LIAB, RR_REINS_LTHINS_LIAB, REFUND_DEPOS, PH_PLEDGE_LOANS, REFUND_CAP_DEPOS, INDEP_ACCT_ASSETS, CLIENT_DEPOS, CLIENT_PROV, TRANSAC_SEAT_FEE, INVEST_AS_RECEIV, TOTAL_ASSETS, LT_BORR, ST_BORR, CB_BORR, DEPOS_IB_DEPOSITS, LOAN_OTH_BANK, TRADING_FL, NOTES_PAYABLE, ACCT_PAYABLE, ADV_RECEIPTS, SOLD_FOR_REPUR_FA, COMM_PAYABLE, PAYROLL_PAYABLE, TAXES_PAYABLE, INT_PAYABLE, DIV_PAYABLE, OTH_PAYABLE, ACC_EXP, DEFERRED_INC, ST_BONDS_PAYABLE, PAYABLE_TO_REINSURER, RSRV_INSUR_CONT, ACTING_TRADING_SEC, ACTING_UW_SEC, NON_CUR_LIAB_DUE_1Y, OTH_CUR_LIAB, TOTAL_CUR_LIAB, BOND_PAYABLE, LT_PAYABLE, SPECIFIC_PAYABLES, ESTIMATED_LIAB, DEFER_TAX_LIAB, DEFER_INC_NON_CUR_LIAB, OTH_NCL, TOTAL_NCL, DEPOS_OTH_BFI, DERIV_LIAB, DEPOS, AGENCY_BUS_LIAB, OTH_LIAB, PREM_RECEIV_ADVA, DEPOS_RECEIVED, PH_INVEST, RESER_UNE_PREM, RESER_OUTSTD_CLAIMS, RESER_LINS_LIAB, RESER_LTHINS_LIAB, INDEPT_ACC_LIAB, PLEDGE_BORR, INDEM_PAYABLE, POLICY_DIV_PAYABLE, TOTAL_LIAB, TREASURY_SHARE, ORDIN_RISK_RESER, FOREX_DIFFER, INVEST_LOSS_UNCONF, MINORITY_INT, TOTAL_HLDR_EQY_EXC_MIN_INT, TOTAL_HLDR_EQY_INC_MIN_INT, TOTAL_LIAB_HLDR_EQY, LT_PAYROLL_PAYABLE, OTH_COMP_INCOME, OTH_EQT_TOOLS, OTH_EQT_TOOLS_P_SHR, LENDING_FUNDS, ACC_RECEIVABLE, ST_FIN_PAYABLE, PAYABLES, HFS_ASSETS, HFS_SALES, UPDATE_FLAG);

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
    @JsonProperty(value = "report_type")
    private String reportType;

    /**
     * 公司类型
     */
    @JsonProperty(value = "comp_type")
    private String compType;

    /**
     * 期末总股本
     */
    @JsonProperty(value = "total_share")
    private Float totalShare;

    /**
     * 资本公积金
     */
    @JsonProperty(value = "cap_rese")
    private Float capRese;

    /**
     * 未分配利润
     */
    @JsonProperty(value = "undistr_porfit")
    private Float undistrPorfit;

    /**
     * 盈余公积金
     */
    @JsonProperty(value = "surplus_rese")
    private Float surplusRese;

    /**
     * 专项储备
     */
    @JsonProperty(value = "special_rese")
    private Float specialRese;

    /**
     * 货币资金
     */
    @JsonProperty(value = "money_cap")
    private Float moneyCap;

    /**
     * 交易性金融资产
     */
    @JsonProperty(value = "trad_asset")
    private Float tradAsset;

    /**
     * 应收票据
     */
    @JsonProperty(value = "notes_receiv")
    private Float notesReceiv;

    /**
     * 应收账款
     */
    @JsonProperty(value = "accounts_receiv")
    private Float accountsReceiv;

    /**
     * 其他应收款
     */
    @JsonProperty(value = "oth_receiv")
    private Float othReceiv;

    /**
     * 预付款项
     */
    @JsonProperty(value = "prepayment")
    private Float prepayment;

    /**
     * 应收股利
     */
    @JsonProperty(value = "div_receiv")
    private Float divReceiv;

    /**
     * 应收利息
     */
    @JsonProperty(value = "int_receiv")
    private Float intReceiv;

    /**
     * 存货
     */
    @JsonProperty(value = "inventories")
    private Float inventories;

    /**
     * 长期待摊费用
     */
    @JsonProperty(value = "amor_exp")
    private Float amorExp;

    /**
     * 一年内到期的非流动资产
     */
    @JsonProperty(value = "nca_within_1y")
    private Float ncaWithin1y;

    /**
     * 结算备付金
     */
    @JsonProperty(value = "sett_rsrv")
    private Float settRsrv;

    /**
     * 拆出资金
     */
    @JsonProperty(value = "loanto_oth_bank_fi")
    private Float loantoOthBankFi;

    /**
     * 应收保费
     */
    @JsonProperty(value = "premium_receiv")
    private Float premiumReceiv;

    /**
     * 应收分保账款
     */
    @JsonProperty(value = "reinsur_receiv")
    private Float reinsurReceiv;

    /**
     * 应收分保合同准备金
     */
    @JsonProperty(value = "reinsur_res_receiv")
    private Float reinsurResReceiv;

    /**
     * 买入返售金融资产
     */
    @JsonProperty(value = "pur_resale_fa")
    private Float purResaleFa;

    /**
     * 其他流动资产
     */
    @JsonProperty(value = "oth_cur_assets")
    private Float othCurAssets;

    /**
     * 流动资产合计
     */
    @JsonProperty(value = "total_cur_assets")
    private Float totalCurAssets;

    /**
     * 可供出售金融资产
     */
    @JsonProperty(value = "fa_avail_for_sale")
    private Float faAvailForSale;

    /**
     * 持有至到期投资
     */
    @JsonProperty(value = "htm_invest")
    private Float htmInvest;

    /**
     * 长期股权投资
     */
    @JsonProperty(value = "lt_eqt_invest")
    private Float ltEqtInvest;

    /**
     * 投资性房地产
     */
    @JsonProperty(value = "invest_real_estate")
    private Float investRealEstate;

    /**
     * 定期存款
     */
    @JsonProperty(value = "time_deposits")
    private Float timeDeposits;

    /**
     * 其他资产
     */
    @JsonProperty(value = "oth_assets")
    private Float othAssets;

    /**
     * 长期应收款
     */
    @JsonProperty(value = "lt_rec")
    private Float ltRec;

    /**
     * 固定资产
     */
    @JsonProperty(value = "fix_assets")
    private Float fixAssets;

    /**
     * 在建工程
     */
    @JsonProperty(value = "cip")
    private Float cip;

    /**
     * 工程物资
     */
    @JsonProperty(value = "const_materials")
    private Float constMaterials;

    /**
     * 固定资产清理
     */
    @JsonProperty(value = "fixed_assets_disp")
    private Float fixedAssetsDisp;

    /**
     * 生产性生物资产
     */
    @JsonProperty(value = "produc_bio_assets")
    private Float producBioAssets;

    /**
     * 油气资产
     */
    @JsonProperty(value = "oil_and_gas_assets")
    private Float oilAndGasAssets;

    /**
     * 无形资产
     */
    @JsonProperty(value = "intan_assets")
    private Float intanAssets;

    /**
     * 研发支出
     */
    @JsonProperty(value = "r_and_d")
    private Float rAndD;

    /**
     * 商誉
     */
    @JsonProperty(value = "goodwill")
    private Float goodwill;

    /**
     * 长期待摊费用
     */
    @JsonProperty(value = "lt_amor_exp")
    private Float ltAmorExp;

    /**
     * 递延所得税资产
     */
    @JsonProperty(value = "defer_tax_assets")
    private Float deferTaxAssets;

    /**
     * 发放贷款及垫款
     */
    @JsonProperty(value = "decr_in_disbur")
    private Float decrInDisbur;

    /**
     * 其他非流动资产
     */
    @JsonProperty(value = "oth_nca")
    private Float othNca;

    /**
     * 非流动资产合计
     */
    @JsonProperty(value = "total_nca")
    private Float totalNca;

    /**
     * 现金及存放中央银行款项
     */
    @JsonProperty(value = "cash_reser_cb")
    private Float cashReserCb;

    /**
     * 存放同业和其它金融机构款项
     */
    @JsonProperty(value = "depos_in_oth_bfi")
    private Float deposInOthBfi;

    /**
     * 贵金属
     */
    @JsonProperty(value = "prec_metals")
    private Float precMetals;

    /**
     * 衍生金融资产
     */
    @JsonProperty(value = "deriv_assets")
    private Float derivAssets;

    /**
     * 应收分保未到期责任准备金
     */
    @JsonProperty(value = "rr_reins_une_prem")
    private Float rrReinsUnePrem;

    /**
     * 应收分保未决赔款准备金
     */
    @JsonProperty(value = "rr_reins_outstd_cla")
    private Float rrReinsOutstdCla;

    /**
     * 应收分保寿险责任准备金
     */
    @JsonProperty(value = "rr_reins_lins_liab")
    private Float rrReinsLinsLiab;

    /**
     * 应收分保长期健康险责任准备金
     */
    @JsonProperty(value = "rr_reins_lthins_liab")
    private Float rrReinsLthinsLiab;

    /**
     * 存出保证金
     */
    @JsonProperty(value = "refund_depos")
    private Float refundDepos;

    /**
     * 保户质押贷款
     */
    @JsonProperty(value = "ph_pledge_loans")
    private Float phPledgeLoans;

    /**
     * 存出资本保证金
     */
    @JsonProperty(value = "refund_cap_depos")
    private Float refundCapDepos;

    /**
     * 独立账户资产
     */
    @JsonProperty(value = "indep_acct_assets")
    private Float indepAcctAssets;

    /**
     * 其中：客户资金存款
     */
    @JsonProperty(value = "client_depos")
    private Float clientDepos;

    /**
     * 其中：客户备付金
     */
    @JsonProperty(value = "client_prov")
    private Float clientProv;

    /**
     * 其中:交易席位费
     */
    @JsonProperty(value = "transac_seat_fee")
    private Float transacSeatFee;

    /**
     * 应收款项类投资
     */
    @JsonProperty(value = "invest_as_receiv")
    private Float investAsReceiv;

    /**
     * 资产总计
     */
    @JsonProperty(value = "total_assets")
    private Float totalAssets;

    /**
     * 长期借款
     */
    @JsonProperty(value = "lt_borr")
    private Float ltBorr;

    /**
     * 短期借款
     */
    @JsonProperty(value = "st_borr")
    private Float stBorr;

    /**
     * 向中央银行借款
     */
    @JsonProperty(value = "cb_borr")
    private Float cbBorr;

    /**
     * 吸收存款及同业存放
     */
    @JsonProperty(value = "depos_ib_deposits")
    private Float deposIbDeposits;

    /**
     * 拆入资金
     */
    @JsonProperty(value = "loan_oth_bank")
    private Float loanOthBank;

    /**
     * 交易性金融负债
     */
    @JsonProperty(value = "trading_fl")
    private Float tradingFl;

    /**
     * 应付票据
     */
    @JsonProperty(value = "notes_payable")
    private Float notesPayable;

    /**
     * 应付账款
     */
    @JsonProperty(value = "acct_payable")
    private Float acctPayable;

    /**
     * 预收款项
     */
    @JsonProperty(value = "adv_receipts")
    private Float advReceipts;

    /**
     * 卖出回购金融资产款
     */
    @JsonProperty(value = "sold_for_repur_fa")
    private Float soldForRepurFa;

    /**
     * 应付手续费及佣金
     */
    @JsonProperty(value = "comm_payable")
    private Float commPayable;

    /**
     * 应付职工薪酬
     */
    @JsonProperty(value = "payroll_payable")
    private Float payrollPayable;

    /**
     * 应交税费
     */
    @JsonProperty(value = "taxes_payable")
    private Float taxesPayable;

    /**
     * 应付利息
     */
    @JsonProperty(value = "int_payable")
    private Float intPayable;

    /**
     * 应付股利
     */
    @JsonProperty(value = "div_payable")
    private Float divPayable;

    /**
     * 其他应付款
     */
    @JsonProperty(value = "oth_payable")
    private Float othPayable;

    /**
     * 预提费用
     */
    @JsonProperty(value = "acc_exp")
    private Float accExp;

    /**
     * 递延收益
     */
    @JsonProperty(value = "deferred_inc")
    private Float deferredInc;

    /**
     * 应付短期债券
     */
    @JsonProperty(value = "st_bonds_payable")
    private Float stBondsPayable;

    /**
     * 应付分保账款
     */
    @JsonProperty(value = "payable_to_reinsurer")
    private Float payableToReinsurer;

    /**
     * 保险合同准备金
     */
    @JsonProperty(value = "rsrv_insur_cont")
    private Float rsrvInsurCont;

    /**
     * 代理买卖证券款
     */
    @JsonProperty(value = "acting_trading_sec")
    private Float actingTradingSec;

    /**
     * 代理承销证券款
     */
    @JsonProperty(value = "acting_uw_sec")
    private Float actingUwSec;

    /**
     * 一年内到期的非流动负债
     */
    @JsonProperty(value = "non_cur_liab_due_1y")
    private Float nonCurLiabDue1y;

    /**
     * 其他流动负债
     */
    @JsonProperty(value = "oth_cur_liab")
    private Float othCurLiab;

    /**
     * 流动负债合计
     */
    @JsonProperty(value = "total_cur_liab")
    private Float totalCurLiab;

    /**
     * 应付债券
     */
    @JsonProperty(value = "bond_payable")
    private Float bondPayable;

    /**
     * 长期应付款
     */
    @JsonProperty(value = "lt_payable")
    private Float ltPayable;

    /**
     * 专项应付款
     */
    @JsonProperty(value = "specific_payables")
    private Float specificPayables;

    /**
     * 预计负债
     */
    @JsonProperty(value = "estimated_liab")
    private Float estimatedLiab;

    /**
     * 递延所得税负债
     */
    @JsonProperty(value = "defer_tax_liab")
    private Float deferTaxLiab;

    /**
     * 递延收益-非流动负债
     */
    @JsonProperty(value = "defer_inc_non_cur_liab")
    private Float deferIncNonCurLiab;

    /**
     * 其他非流动负债
     */
    @JsonProperty(value = "oth_ncl")
    private Float othNcl;

    /**
     * 非流动负债合计
     */
    @JsonProperty(value = "total_ncl")
    private Float totalNcl;

    /**
     * 同业和其它金融机构存放款项
     */
    @JsonProperty(value = "depos_oth_bfi")
    private Float deposOthBfi;

    /**
     * 衍生金融负债
     */
    @JsonProperty(value = "deriv_liab")
    private Float derivLiab;

    /**
     * 吸收存款
     */
    @JsonProperty(value = "depos")
    private Float depos;

    /**
     * 代理业务负债
     */
    @JsonProperty(value = "agency_bus_liab")
    private Float agencyBusLiab;

    /**
     * 其他负债
     */
    @JsonProperty(value = "oth_liab")
    private Float othLiab;

    /**
     * 预收保费
     */
    @JsonProperty(value = "prem_receiv_adva")
    private Float premReceivAdva;

    /**
     * 存入保证金
     */
    @JsonProperty(value = "depos_received")
    private Float deposReceived;

    /**
     * 保户储金及投资款
     */
    @JsonProperty(value = "ph_invest")
    private Float phInvest;

    /**
     * 未到期责任准备金
     */
    @JsonProperty(value = "reser_une_prem")
    private Float reserUnePrem;

    /**
     * 未决赔款准备金
     */
    @JsonProperty(value = "reser_outstd_claims")
    private Float reserOutstdClaims;

    /**
     * 寿险责任准备金
     */
    @JsonProperty(value = "reser_lins_liab")
    private Float reserLinsLiab;

    /**
     * 长期健康险责任准备金
     */
    @JsonProperty(value = "reser_lthins_liab")
    private Float reserLthinsLiab;

    /**
     * 独立账户负债
     */
    @JsonProperty(value = "indept_acc_liab")
    private Float indeptAccLiab;

    /**
     * 其中:质押借款
     */
    @JsonProperty(value = "pledge_borr")
    private Float pledgeBorr;

    /**
     * 应付赔付款
     */
    @JsonProperty(value = "indem_payable")
    private Float indemPayable;

    /**
     * 应付保单红利
     */
    @JsonProperty(value = "policy_div_payable")
    private Float policyDivPayable;

    /**
     * 负债合计
     */
    @JsonProperty(value = "total_liab")
    private Float totalLiab;

    /**
     * 减:库存股
     */
    @JsonProperty(value = "treasury_share")
    private Float treasuryShare;

    /**
     * 一般风险准备
     */
    @JsonProperty(value = "ordin_risk_reser")
    private Float ordinRiskReser;

    /**
     * 外币报表折算差额
     */
    @JsonProperty(value = "forex_differ")
    private Float forexDiffer;

    /**
     * 未确认的投资损失
     */
    @JsonProperty(value = "invest_loss_unconf")
    private Float investLossUnconf;

    /**
     * 少数股东权益
     */
    @JsonProperty(value = "minority_int")
    private Float minorityInt;

    /**
     * 股东权益合计(不含少数股东权益)
     */
    @JsonProperty(value = "total_hldr_eqy_exc_min_int")
    private Float totalHldrEqyExcMinInt;

    /**
     * 股东权益合计(含少数股东权益)
     */
    @JsonProperty(value = "total_hldr_eqy_inc_min_int")
    private Float totalHldrEqyIncMinInt;

    /**
     * 负债及股东权益总计
     */
    @JsonProperty(value = "total_liab_hldr_eqy")
    private Float totalLiabHldrEqy;

    /**
     * 长期应付职工薪酬
     */
    @JsonProperty(value = "lt_payroll_payable")
    private Float ltPayrollPayable;

    /**
     * 其他综合收益
     */
    @JsonProperty(value = "oth_comp_income")
    private Float othCompIncome;

    /**
     * 其他权益工具
     */
    @JsonProperty(value = "oth_eqt_tools")
    private Float othEqtTools;

    /**
     * 其他权益工具(优先股)
     */
    @JsonProperty(value = "oth_eqt_tools_p_shr")
    private Float othEqtToolsPShr;

    /**
     * 融出资金
     */
    @JsonProperty(value = "lending_funds")
    private Float lendingFunds;

    /**
     * 应收款项
     */
    @JsonProperty(value = "acc_receivable")
    private Float accReceivable;

    /**
     * 应付短期融资款
     */
    @JsonProperty(value = "st_fin_payable")
    private Float stFinPayable;

    /**
     * 应付款项
     */
    @JsonProperty(value = "payables")
    private Float payables;

    /**
     * 持有待售的资产
     */
    @JsonProperty(value = "hfs_assets")
    private Float hfsAssets;

    /**
     * 持有待售的负债
     */
    @JsonProperty(value = "hfs_sales")
    private Float hfsSales;

    /**
     * 更新标识
     */
    @JsonProperty(value = "update_flag")
    private String updateFlag;


    /**
     * init by array
     */
    public static Balancesheet init(String[] fields, Object[] item) {
        Balancesheet balancesheet = new Balancesheet();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    balancesheet.setTsCode((String) item[i]);
                    break;
                case ANN_DATE:
                    balancesheet.setAnnDate((String) item[i]);
                    break;
                case F_ANN_DATE:
                    balancesheet.setFAnnDate((String) item[i]);
                    break;
                case END_DATE:
                    balancesheet.setEndDate((String) item[i]);
                    break;
                case REPORT_TYPE:
                    balancesheet.setReportType((String) item[i]);
                    break;
                case COMP_TYPE:
                    balancesheet.setCompType((String) item[i]);
                    break;
                case TOTAL_SHARE:
                    balancesheet.setTotalShare((Float) item[i]);
                    break;
                case CAP_RESE:
                    balancesheet.setCapRese((Float) item[i]);
                    break;
                case UNDISTR_PORFIT:
                    balancesheet.setUndistrPorfit((Float) item[i]);
                    break;
                case SURPLUS_RESE:
                    balancesheet.setSurplusRese((Float) item[i]);
                    break;
                case SPECIAL_RESE:
                    balancesheet.setSpecialRese((Float) item[i]);
                    break;
                case MONEY_CAP:
                    balancesheet.setMoneyCap((Float) item[i]);
                    break;
                case TRAD_ASSET:
                    balancesheet.setTradAsset((Float) item[i]);
                    break;
                case NOTES_RECEIV:
                    balancesheet.setNotesReceiv((Float) item[i]);
                    break;
                case ACCOUNTS_RECEIV:
                    balancesheet.setAccountsReceiv((Float) item[i]);
                    break;
                case OTH_RECEIV:
                    balancesheet.setOthReceiv((Float) item[i]);
                    break;
                case PREPAYMENT:
                    balancesheet.setPrepayment((Float) item[i]);
                    break;
                case DIV_RECEIV:
                    balancesheet.setDivReceiv((Float) item[i]);
                    break;
                case INT_RECEIV:
                    balancesheet.setIntReceiv((Float) item[i]);
                    break;
                case INVENTORIES:
                    balancesheet.setInventories((Float) item[i]);
                    break;
                case AMOR_EXP:
                    balancesheet.setAmorExp((Float) item[i]);
                    break;
                case NCA_WITHIN_1Y:
                    balancesheet.setNcaWithin1y((Float) item[i]);
                    break;
                case SETT_RSRV:
                    balancesheet.setSettRsrv((Float) item[i]);
                    break;
                case LOANTO_OTH_BANK_FI:
                    balancesheet.setLoantoOthBankFi((Float) item[i]);
                    break;
                case PREMIUM_RECEIV:
                    balancesheet.setPremiumReceiv((Float) item[i]);
                    break;
                case REINSUR_RECEIV:
                    balancesheet.setReinsurReceiv((Float) item[i]);
                    break;
                case REINSUR_RES_RECEIV:
                    balancesheet.setReinsurResReceiv((Float) item[i]);
                    break;
                case PUR_RESALE_FA:
                    balancesheet.setPurResaleFa((Float) item[i]);
                    break;
                case OTH_CUR_ASSETS:
                    balancesheet.setOthCurAssets((Float) item[i]);
                    break;
                case TOTAL_CUR_ASSETS:
                    balancesheet.setTotalCurAssets((Float) item[i]);
                    break;
                case FA_AVAIL_FOR_SALE:
                    balancesheet.setFaAvailForSale((Float) item[i]);
                    break;
                case HTM_INVEST:
                    balancesheet.setHtmInvest((Float) item[i]);
                    break;
                case LT_EQT_INVEST:
                    balancesheet.setLtEqtInvest((Float) item[i]);
                    break;
                case INVEST_REAL_ESTATE:
                    balancesheet.setInvestRealEstate((Float) item[i]);
                    break;
                case TIME_DEPOSITS:
                    balancesheet.setTimeDeposits((Float) item[i]);
                    break;
                case OTH_ASSETS:
                    balancesheet.setOthAssets((Float) item[i]);
                    break;
                case LT_REC:
                    balancesheet.setLtRec((Float) item[i]);
                    break;
                case FIX_ASSETS:
                    balancesheet.setFixAssets((Float) item[i]);
                    break;
                case CIP:
                    balancesheet.setCip((Float) item[i]);
                    break;
                case CONST_MATERIALS:
                    balancesheet.setConstMaterials((Float) item[i]);
                    break;
                case FIXED_ASSETS_DISP:
                    balancesheet.setFixedAssetsDisp((Float) item[i]);
                    break;
                case PRODUC_BIO_ASSETS:
                    balancesheet.setProducBioAssets((Float) item[i]);
                    break;
                case OIL_AND_GAS_ASSETS:
                    balancesheet.setOilAndGasAssets((Float) item[i]);
                    break;
                case INTAN_ASSETS:
                    balancesheet.setIntanAssets((Float) item[i]);
                    break;
                case R_AND_D:
                    balancesheet.setRAndD((Float) item[i]);
                    break;
                case GOODWILL:
                    balancesheet.setGoodwill((Float) item[i]);
                    break;
                case LT_AMOR_EXP:
                    balancesheet.setLtAmorExp((Float) item[i]);
                    break;
                case DEFER_TAX_ASSETS:
                    balancesheet.setDeferTaxAssets((Float) item[i]);
                    break;
                case DECR_IN_DISBUR:
                    balancesheet.setDecrInDisbur((Float) item[i]);
                    break;
                case OTH_NCA:
                    balancesheet.setOthNca((Float) item[i]);
                    break;
                case TOTAL_NCA:
                    balancesheet.setTotalNca((Float) item[i]);
                    break;
                case CASH_RESER_CB:
                    balancesheet.setCashReserCb((Float) item[i]);
                    break;
                case DEPOS_IN_OTH_BFI:
                    balancesheet.setDeposInOthBfi((Float) item[i]);
                    break;
                case PREC_METALS:
                    balancesheet.setPrecMetals((Float) item[i]);
                    break;
                case DERIV_ASSETS:
                    balancesheet.setDerivAssets((Float) item[i]);
                    break;
                case RR_REINS_UNE_PREM:
                    balancesheet.setRrReinsUnePrem((Float) item[i]);
                    break;
                case RR_REINS_OUTSTD_CLA:
                    balancesheet.setRrReinsOutstdCla((Float) item[i]);
                    break;
                case RR_REINS_LINS_LIAB:
                    balancesheet.setRrReinsLinsLiab((Float) item[i]);
                    break;
                case RR_REINS_LTHINS_LIAB:
                    balancesheet.setRrReinsLthinsLiab((Float) item[i]);
                    break;
                case REFUND_DEPOS:
                    balancesheet.setRefundDepos((Float) item[i]);
                    break;
                case PH_PLEDGE_LOANS:
                    balancesheet.setPhPledgeLoans((Float) item[i]);
                    break;
                case REFUND_CAP_DEPOS:
                    balancesheet.setRefundCapDepos((Float) item[i]);
                    break;
                case INDEP_ACCT_ASSETS:
                    balancesheet.setIndepAcctAssets((Float) item[i]);
                    break;
                case CLIENT_DEPOS:
                    balancesheet.setClientDepos((Float) item[i]);
                    break;
                case CLIENT_PROV:
                    balancesheet.setClientProv((Float) item[i]);
                    break;
                case TRANSAC_SEAT_FEE:
                    balancesheet.setTransacSeatFee((Float) item[i]);
                    break;
                case INVEST_AS_RECEIV:
                    balancesheet.setInvestAsReceiv((Float) item[i]);
                    break;
                case TOTAL_ASSETS:
                    balancesheet.setTotalAssets((Float) item[i]);
                    break;
                case LT_BORR:
                    balancesheet.setLtBorr((Float) item[i]);
                    break;
                case ST_BORR:
                    balancesheet.setStBorr((Float) item[i]);
                    break;
                case CB_BORR:
                    balancesheet.setCbBorr((Float) item[i]);
                    break;
                case DEPOS_IB_DEPOSITS:
                    balancesheet.setDeposIbDeposits((Float) item[i]);
                    break;
                case LOAN_OTH_BANK:
                    balancesheet.setLoanOthBank((Float) item[i]);
                    break;
                case TRADING_FL:
                    balancesheet.setTradingFl((Float) item[i]);
                    break;
                case NOTES_PAYABLE:
                    balancesheet.setNotesPayable((Float) item[i]);
                    break;
                case ACCT_PAYABLE:
                    balancesheet.setAcctPayable((Float) item[i]);
                    break;
                case ADV_RECEIPTS:
                    balancesheet.setAdvReceipts((Float) item[i]);
                    break;
                case SOLD_FOR_REPUR_FA:
                    balancesheet.setSoldForRepurFa((Float) item[i]);
                    break;
                case COMM_PAYABLE:
                    balancesheet.setCommPayable((Float) item[i]);
                    break;
                case PAYROLL_PAYABLE:
                    balancesheet.setPayrollPayable((Float) item[i]);
                    break;
                case TAXES_PAYABLE:
                    balancesheet.setTaxesPayable((Float) item[i]);
                    break;
                case INT_PAYABLE:
                    balancesheet.setIntPayable((Float) item[i]);
                    break;
                case DIV_PAYABLE:
                    balancesheet.setDivPayable((Float) item[i]);
                    break;
                case OTH_PAYABLE:
                    balancesheet.setOthPayable((Float) item[i]);
                    break;
                case ACC_EXP:
                    balancesheet.setAccExp((Float) item[i]);
                    break;
                case DEFERRED_INC:
                    balancesheet.setDeferredInc((Float) item[i]);
                    break;
                case ST_BONDS_PAYABLE:
                    balancesheet.setStBondsPayable((Float) item[i]);
                    break;
                case PAYABLE_TO_REINSURER:
                    balancesheet.setPayableToReinsurer((Float) item[i]);
                    break;
                case RSRV_INSUR_CONT:
                    balancesheet.setRsrvInsurCont((Float) item[i]);
                    break;
                case ACTING_TRADING_SEC:
                    balancesheet.setActingTradingSec((Float) item[i]);
                    break;
                case ACTING_UW_SEC:
                    balancesheet.setActingUwSec((Float) item[i]);
                    break;
                case NON_CUR_LIAB_DUE_1Y:
                    balancesheet.setNonCurLiabDue1y((Float) item[i]);
                    break;
                case OTH_CUR_LIAB:
                    balancesheet.setOthCurLiab((Float) item[i]);
                    break;
                case TOTAL_CUR_LIAB:
                    balancesheet.setTotalCurLiab((Float) item[i]);
                    break;
                case BOND_PAYABLE:
                    balancesheet.setBondPayable((Float) item[i]);
                    break;
                case LT_PAYABLE:
                    balancesheet.setLtPayable((Float) item[i]);
                    break;
                case SPECIFIC_PAYABLES:
                    balancesheet.setSpecificPayables((Float) item[i]);
                    break;
                case ESTIMATED_LIAB:
                    balancesheet.setEstimatedLiab((Float) item[i]);
                    break;
                case DEFER_TAX_LIAB:
                    balancesheet.setDeferTaxLiab((Float) item[i]);
                    break;
                case DEFER_INC_NON_CUR_LIAB:
                    balancesheet.setDeferIncNonCurLiab((Float) item[i]);
                    break;
                case OTH_NCL:
                    balancesheet.setOthNcl((Float) item[i]);
                    break;
                case TOTAL_NCL:
                    balancesheet.setTotalNcl((Float) item[i]);
                    break;
                case DEPOS_OTH_BFI:
                    balancesheet.setDeposOthBfi((Float) item[i]);
                    break;
                case DERIV_LIAB:
                    balancesheet.setDerivLiab((Float) item[i]);
                    break;
                case DEPOS:
                    balancesheet.setDepos((Float) item[i]);
                    break;
                case AGENCY_BUS_LIAB:
                    balancesheet.setAgencyBusLiab((Float) item[i]);
                    break;
                case OTH_LIAB:
                    balancesheet.setOthLiab((Float) item[i]);
                    break;
                case PREM_RECEIV_ADVA:
                    balancesheet.setPremReceivAdva((Float) item[i]);
                    break;
                case DEPOS_RECEIVED:
                    balancesheet.setDeposReceived((Float) item[i]);
                    break;
                case PH_INVEST:
                    balancesheet.setPhInvest((Float) item[i]);
                    break;
                case RESER_UNE_PREM:
                    balancesheet.setReserUnePrem((Float) item[i]);
                    break;
                case RESER_OUTSTD_CLAIMS:
                    balancesheet.setReserOutstdClaims((Float) item[i]);
                    break;
                case RESER_LINS_LIAB:
                    balancesheet.setReserLinsLiab((Float) item[i]);
                    break;
                case RESER_LTHINS_LIAB:
                    balancesheet.setReserLthinsLiab((Float) item[i]);
                    break;
                case INDEPT_ACC_LIAB:
                    balancesheet.setIndeptAccLiab((Float) item[i]);
                    break;
                case PLEDGE_BORR:
                    balancesheet.setPledgeBorr((Float) item[i]);
                    break;
                case INDEM_PAYABLE:
                    balancesheet.setIndemPayable((Float) item[i]);
                    break;
                case POLICY_DIV_PAYABLE:
                    balancesheet.setPolicyDivPayable((Float) item[i]);
                    break;
                case TOTAL_LIAB:
                    balancesheet.setTotalLiab((Float) item[i]);
                    break;
                case TREASURY_SHARE:
                    balancesheet.setTreasuryShare((Float) item[i]);
                    break;
                case ORDIN_RISK_RESER:
                    balancesheet.setOrdinRiskReser((Float) item[i]);
                    break;
                case FOREX_DIFFER:
                    balancesheet.setForexDiffer((Float) item[i]);
                    break;
                case INVEST_LOSS_UNCONF:
                    balancesheet.setInvestLossUnconf((Float) item[i]);
                    break;
                case MINORITY_INT:
                    balancesheet.setMinorityInt((Float) item[i]);
                    break;
                case TOTAL_HLDR_EQY_EXC_MIN_INT:
                    balancesheet.setTotalHldrEqyExcMinInt((Float) item[i]);
                    break;
                case TOTAL_HLDR_EQY_INC_MIN_INT:
                    balancesheet.setTotalHldrEqyIncMinInt((Float) item[i]);
                    break;
                case TOTAL_LIAB_HLDR_EQY:
                    balancesheet.setTotalLiabHldrEqy((Float) item[i]);
                    break;
                case LT_PAYROLL_PAYABLE:
                    balancesheet.setLtPayrollPayable((Float) item[i]);
                    break;
                case OTH_COMP_INCOME:
                    balancesheet.setOthCompIncome((Float) item[i]);
                    break;
                case OTH_EQT_TOOLS:
                    balancesheet.setOthEqtTools((Float) item[i]);
                    break;
                case OTH_EQT_TOOLS_P_SHR:
                    balancesheet.setOthEqtToolsPShr((Float) item[i]);
                    break;
                case LENDING_FUNDS:
                    balancesheet.setLendingFunds((Float) item[i]);
                    break;
                case ACC_RECEIVABLE:
                    balancesheet.setAccReceivable((Float) item[i]);
                    break;
                case ST_FIN_PAYABLE:
                    balancesheet.setStFinPayable((Float) item[i]);
                    break;
                case PAYABLES:
                    balancesheet.setPayables((Float) item[i]);
                    break;
                case HFS_ASSETS:
                    balancesheet.setHfsAssets((Float) item[i]);
                    break;
                case HFS_SALES:
                    balancesheet.setHfsSales((Float) item[i]);
                    break;
                case UPDATE_FLAG:
                    balancesheet.setUpdateFlag((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return balancesheet;
    }

}

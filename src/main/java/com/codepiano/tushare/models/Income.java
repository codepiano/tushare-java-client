package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.839511
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Income implements Model {

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
     * basic_eps
     */
    public static final String BASIC_EPS = "basic_eps";

    /**
     * diluted_eps
     */
    public static final String DILUTED_EPS = "diluted_eps";

    /**
     * total_revenue
     */
    public static final String TOTAL_REVENUE = "total_revenue";

    /**
     * revenue
     */
    public static final String REVENUE = "revenue";

    /**
     * int_income
     */
    public static final String INT_INCOME = "int_income";

    /**
     * prem_earned
     */
    public static final String PREM_EARNED = "prem_earned";

    /**
     * comm_income
     */
    public static final String COMM_INCOME = "comm_income";

    /**
     * n_commis_income
     */
    public static final String N_COMMIS_INCOME = "n_commis_income";

    /**
     * n_oth_income
     */
    public static final String N_OTH_INCOME = "n_oth_income";

    /**
     * n_oth_b_income
     */
    public static final String N_OTH_B_INCOME = "n_oth_b_income";

    /**
     * prem_income
     */
    public static final String PREM_INCOME = "prem_income";

    /**
     * out_prem
     */
    public static final String OUT_PREM = "out_prem";

    /**
     * une_prem_reser
     */
    public static final String UNE_PREM_RESER = "une_prem_reser";

    /**
     * reins_income
     */
    public static final String REINS_INCOME = "reins_income";

    /**
     * n_sec_tb_income
     */
    public static final String N_SEC_TB_INCOME = "n_sec_tb_income";

    /**
     * n_sec_uw_income
     */
    public static final String N_SEC_UW_INCOME = "n_sec_uw_income";

    /**
     * n_asset_mg_income
     */
    public static final String N_ASSET_MG_INCOME = "n_asset_mg_income";

    /**
     * oth_b_income
     */
    public static final String OTH_B_INCOME = "oth_b_income";

    /**
     * fv_value_chg_gain
     */
    public static final String FV_VALUE_CHG_GAIN = "fv_value_chg_gain";

    /**
     * invest_income
     */
    public static final String INVEST_INCOME = "invest_income";

    /**
     * ass_invest_income
     */
    public static final String ASS_INVEST_INCOME = "ass_invest_income";

    /**
     * forex_gain
     */
    public static final String FOREX_GAIN = "forex_gain";

    /**
     * total_cogs
     */
    public static final String TOTAL_COGS = "total_cogs";

    /**
     * oper_cost
     */
    public static final String OPER_COST = "oper_cost";

    /**
     * int_exp
     */
    public static final String INT_EXP = "int_exp";

    /**
     * comm_exp
     */
    public static final String COMM_EXP = "comm_exp";

    /**
     * biz_tax_surchg
     */
    public static final String BIZ_TAX_SURCHG = "biz_tax_surchg";

    /**
     * sell_exp
     */
    public static final String SELL_EXP = "sell_exp";

    /**
     * admin_exp
     */
    public static final String ADMIN_EXP = "admin_exp";

    /**
     * fin_exp
     */
    public static final String FIN_EXP = "fin_exp";

    /**
     * assets_impair_loss
     */
    public static final String ASSETS_IMPAIR_LOSS = "assets_impair_loss";

    /**
     * prem_refund
     */
    public static final String PREM_REFUND = "prem_refund";

    /**
     * compens_payout
     */
    public static final String COMPENS_PAYOUT = "compens_payout";

    /**
     * reser_insur_liab
     */
    public static final String RESER_INSUR_LIAB = "reser_insur_liab";

    /**
     * div_payt
     */
    public static final String DIV_PAYT = "div_payt";

    /**
     * reins_exp
     */
    public static final String REINS_EXP = "reins_exp";

    /**
     * oper_exp
     */
    public static final String OPER_EXP = "oper_exp";

    /**
     * compens_payout_refu
     */
    public static final String COMPENS_PAYOUT_REFU = "compens_payout_refu";

    /**
     * insur_reser_refu
     */
    public static final String INSUR_RESER_REFU = "insur_reser_refu";

    /**
     * reins_cost_refund
     */
    public static final String REINS_COST_REFUND = "reins_cost_refund";

    /**
     * other_bus_cost
     */
    public static final String OTHER_BUS_COST = "other_bus_cost";

    /**
     * operate_profit
     */
    public static final String OPERATE_PROFIT = "operate_profit";

    /**
     * non_oper_income
     */
    public static final String NON_OPER_INCOME = "non_oper_income";

    /**
     * non_oper_exp
     */
    public static final String NON_OPER_EXP = "non_oper_exp";

    /**
     * nca_disploss
     */
    public static final String NCA_DISPLOSS = "nca_disploss";

    /**
     * total_profit
     */
    public static final String TOTAL_PROFIT = "total_profit";

    /**
     * income_tax
     */
    public static final String INCOME_TAX = "income_tax";

    /**
     * n_income
     */
    public static final String N_INCOME = "n_income";

    /**
     * n_income_attr_p
     */
    public static final String N_INCOME_ATTR_P = "n_income_attr_p";

    /**
     * minority_gain
     */
    public static final String MINORITY_GAIN = "minority_gain";

    /**
     * oth_compr_income
     */
    public static final String OTH_COMPR_INCOME = "oth_compr_income";

    /**
     * t_compr_income
     */
    public static final String T_COMPR_INCOME = "t_compr_income";

    /**
     * compr_inc_attr_p
     */
    public static final String COMPR_INC_ATTR_P = "compr_inc_attr_p";

    /**
     * compr_inc_attr_m_s
     */
    public static final String COMPR_INC_ATTR_M_S = "compr_inc_attr_m_s";

    /**
     * ebit
     */
    public static final String EBIT = "ebit";

    /**
     * ebitda
     */
    public static final String EBITDA = "ebitda";

    /**
     * insurance_exp
     */
    public static final String INSURANCE_EXP = "insurance_exp";

    /**
     * undist_profit
     */
    public static final String UNDIST_PROFIT = "undist_profit";

    /**
     * distable_profit
     */
    public static final String DISTABLE_PROFIT = "distable_profit";

    /**
     * update_flag
     */
    public static final String UPDATE_FLAG = "update_flag";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, ANN_DATE, F_ANN_DATE, END_DATE, REPORT_TYPE, COMP_TYPE, BASIC_EPS, DILUTED_EPS, TOTAL_REVENUE, REVENUE, INT_INCOME, PREM_EARNED, COMM_INCOME, N_COMMIS_INCOME, N_OTH_INCOME, N_OTH_B_INCOME, PREM_INCOME, OUT_PREM, UNE_PREM_RESER, REINS_INCOME, N_SEC_TB_INCOME, N_SEC_UW_INCOME, N_ASSET_MG_INCOME, OTH_B_INCOME, FV_VALUE_CHG_GAIN, INVEST_INCOME, ASS_INVEST_INCOME, FOREX_GAIN, TOTAL_COGS, OPER_COST, INT_EXP, COMM_EXP, BIZ_TAX_SURCHG, SELL_EXP, ADMIN_EXP, FIN_EXP, ASSETS_IMPAIR_LOSS, PREM_REFUND, COMPENS_PAYOUT, RESER_INSUR_LIAB, DIV_PAYT, REINS_EXP, OPER_EXP, COMPENS_PAYOUT_REFU, INSUR_RESER_REFU, REINS_COST_REFUND, OTHER_BUS_COST, OPERATE_PROFIT, NON_OPER_INCOME, NON_OPER_EXP, NCA_DISPLOSS, TOTAL_PROFIT, INCOME_TAX, N_INCOME, N_INCOME_ATTR_P, MINORITY_GAIN, OTH_COMPR_INCOME, T_COMPR_INCOME, COMPR_INC_ATTR_P, COMPR_INC_ATTR_M_S, EBIT, EBITDA, INSURANCE_EXP, UNDIST_PROFIT, DISTABLE_PROFIT, UPDATE_FLAG);

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
     * 报告类型 1合并报表 2单季合并 3调整单季合并表 4调整合并报表 5调整前合并报表 6母公司报表 7母公司单季表 8 母公司调整单季表 9母公司调整表 10母公司调整前报表 11调整前合并报表 12母公司调整前报表
     */
    @JsonProperty(value = "report_type")
    private String reportType;

    /**
     * 公司类型(1一般工商业2银行3保险4证券)
     */
    @JsonProperty(value = "comp_type")
    private String compType;

    /**
     * 基本每股收益
     */
    @JsonProperty(value = "basic_eps")
    private Float basicEps;

    /**
     * 稀释每股收益
     */
    @JsonProperty(value = "diluted_eps")
    private Float dilutedEps;

    /**
     * 营业总收入
     */
    @JsonProperty(value = "total_revenue")
    private Float totalRevenue;

    /**
     * 营业收入
     */
    @JsonProperty(value = "revenue")
    private Float revenue;

    /**
     * 利息收入
     */
    @JsonProperty(value = "int_income")
    private Float intIncome;

    /**
     * 已赚保费
     */
    @JsonProperty(value = "prem_earned")
    private Float premEarned;

    /**
     * 手续费及佣金收入
     */
    @JsonProperty(value = "comm_income")
    private Float commIncome;

    /**
     * 手续费及佣金净收入
     */
    @JsonProperty(value = "n_commis_income")
    private Float nCommisIncome;

    /**
     * 其他经营净收益
     */
    @JsonProperty(value = "n_oth_income")
    private Float nOthIncome;

    /**
     * 加:其他业务净收益
     */
    @JsonProperty(value = "n_oth_b_income")
    private Float nOthBIncome;

    /**
     * 保险业务收入
     */
    @JsonProperty(value = "prem_income")
    private Float premIncome;

    /**
     * 减:分出保费
     */
    @JsonProperty(value = "out_prem")
    private Float outPrem;

    /**
     * 提取未到期责任准备金
     */
    @JsonProperty(value = "une_prem_reser")
    private Float unePremReser;

    /**
     * 其中:分保费收入
     */
    @JsonProperty(value = "reins_income")
    private Float reinsIncome;

    /**
     * 代理买卖证券业务净收入
     */
    @JsonProperty(value = "n_sec_tb_income")
    private Float nSecTbIncome;

    /**
     * 证券承销业务净收入
     */
    @JsonProperty(value = "n_sec_uw_income")
    private Float nSecUwIncome;

    /**
     * 受托客户资产管理业务净收入
     */
    @JsonProperty(value = "n_asset_mg_income")
    private Float nAssetMgIncome;

    /**
     * 其他业务收入
     */
    @JsonProperty(value = "oth_b_income")
    private Float othBIncome;

    /**
     * 加:公允价值变动净收益
     */
    @JsonProperty(value = "fv_value_chg_gain")
    private Float fvValueChgGain;

    /**
     * 加:投资净收益
     */
    @JsonProperty(value = "invest_income")
    private Float investIncome;

    /**
     * 其中:对联营企业和合营企业的投资收益
     */
    @JsonProperty(value = "ass_invest_income")
    private Float assInvestIncome;

    /**
     * 加:汇兑净收益
     */
    @JsonProperty(value = "forex_gain")
    private Float forexGain;

    /**
     * 营业总成本
     */
    @JsonProperty(value = "total_cogs")
    private Float totalCogs;

    /**
     * 减:营业成本
     */
    @JsonProperty(value = "oper_cost")
    private Float operCost;

    /**
     * 减:利息支出
     */
    @JsonProperty(value = "int_exp")
    private Float intExp;

    /**
     * 减:手续费及佣金支出
     */
    @JsonProperty(value = "comm_exp")
    private Float commExp;

    /**
     * 减:营业税金及附加
     */
    @JsonProperty(value = "biz_tax_surchg")
    private Float bizTaxSurchg;

    /**
     * 减:销售费用
     */
    @JsonProperty(value = "sell_exp")
    private Float sellExp;

    /**
     * 减:管理费用
     */
    @JsonProperty(value = "admin_exp")
    private Float adminExp;

    /**
     * 减:财务费用
     */
    @JsonProperty(value = "fin_exp")
    private Float finExp;

    /**
     * 减:资产减值损失
     */
    @JsonProperty(value = "assets_impair_loss")
    private Float assetsImpairLoss;

    /**
     * 退保金
     */
    @JsonProperty(value = "prem_refund")
    private Float premRefund;

    /**
     * 赔付总支出
     */
    @JsonProperty(value = "compens_payout")
    private Float compensPayout;

    /**
     * 提取保险责任准备金
     */
    @JsonProperty(value = "reser_insur_liab")
    private Float reserInsurLiab;

    /**
     * 保户红利支出
     */
    @JsonProperty(value = "div_payt")
    private Float divPayt;

    /**
     * 分保费用
     */
    @JsonProperty(value = "reins_exp")
    private Float reinsExp;

    /**
     * 营业支出
     */
    @JsonProperty(value = "oper_exp")
    private Float operExp;

    /**
     * 减:摊回赔付支出
     */
    @JsonProperty(value = "compens_payout_refu")
    private Float compensPayoutRefu;

    /**
     * 减:摊回保险责任准备金
     */
    @JsonProperty(value = "insur_reser_refu")
    private Float insurReserRefu;

    /**
     * 减:摊回分保费用
     */
    @JsonProperty(value = "reins_cost_refund")
    private Float reinsCostRefund;

    /**
     * 其他业务成本
     */
    @JsonProperty(value = "other_bus_cost")
    private Float otherBusCost;

    /**
     * 营业利润
     */
    @JsonProperty(value = "operate_profit")
    private Float operateProfit;

    /**
     * 加:营业外收入
     */
    @JsonProperty(value = "non_oper_income")
    private Float nonOperIncome;

    /**
     * 减:营业外支出
     */
    @JsonProperty(value = "non_oper_exp")
    private Float nonOperExp;

    /**
     * 其中:减:非流动资产处置净损失
     */
    @JsonProperty(value = "nca_disploss")
    private Float ncaDisploss;

    /**
     * 利润总额
     */
    @JsonProperty(value = "total_profit")
    private Float totalProfit;

    /**
     * 所得税费用
     */
    @JsonProperty(value = "income_tax")
    private Float incomeTax;

    /**
     * 净利润(含少数股东损益)
     */
    @JsonProperty(value = "n_income")
    private Float nIncome;

    /**
     * 净利润(不含少数股东损益)
     */
    @JsonProperty(value = "n_income_attr_p")
    private Float nIncomeAttrP;

    /**
     * 少数股东损益
     */
    @JsonProperty(value = "minority_gain")
    private Float minorityGain;

    /**
     * 其他综合收益
     */
    @JsonProperty(value = "oth_compr_income")
    private Float othComprIncome;

    /**
     * 综合收益总额
     */
    @JsonProperty(value = "t_compr_income")
    private Float tComprIncome;

    /**
     * 归属于母公司(或股东)的综合收益总额
     */
    @JsonProperty(value = "compr_inc_attr_p")
    private Float comprIncAttrP;

    /**
     * 归属于少数股东的综合收益总额
     */
    @JsonProperty(value = "compr_inc_attr_m_s")
    private Float comprIncAttrMS;

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
     * 保险业务支出
     */
    @JsonProperty(value = "insurance_exp")
    private Float insuranceExp;

    /**
     * 年初未分配利润
     */
    @JsonProperty(value = "undist_profit")
    private Float undistProfit;

    /**
     * 可分配利润
     */
    @JsonProperty(value = "distable_profit")
    private Float distableProfit;

    /**
     * 更新标识
     */
    @JsonProperty(value = "update_flag")
    private String updateFlag;


    /**
     * init by array
     */
    public static Income init(String[] fields, Object[] item) {
        Income income = new Income();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    income.setTsCode((String) item[i]);
                    break;
                case ANN_DATE:
                    income.setAnnDate((String) item[i]);
                    break;
                case F_ANN_DATE:
                    income.setFAnnDate((String) item[i]);
                    break;
                case END_DATE:
                    income.setEndDate((String) item[i]);
                    break;
                case REPORT_TYPE:
                    income.setReportType((String) item[i]);
                    break;
                case COMP_TYPE:
                    income.setCompType((String) item[i]);
                    break;
                case BASIC_EPS:
                    income.setBasicEps((Float) item[i]);
                    break;
                case DILUTED_EPS:
                    income.setDilutedEps((Float) item[i]);
                    break;
                case TOTAL_REVENUE:
                    income.setTotalRevenue((Float) item[i]);
                    break;
                case REVENUE:
                    income.setRevenue((Float) item[i]);
                    break;
                case INT_INCOME:
                    income.setIntIncome((Float) item[i]);
                    break;
                case PREM_EARNED:
                    income.setPremEarned((Float) item[i]);
                    break;
                case COMM_INCOME:
                    income.setCommIncome((Float) item[i]);
                    break;
                case N_COMMIS_INCOME:
                    income.setNCommisIncome((Float) item[i]);
                    break;
                case N_OTH_INCOME:
                    income.setNOthIncome((Float) item[i]);
                    break;
                case N_OTH_B_INCOME:
                    income.setNOthBIncome((Float) item[i]);
                    break;
                case PREM_INCOME:
                    income.setPremIncome((Float) item[i]);
                    break;
                case OUT_PREM:
                    income.setOutPrem((Float) item[i]);
                    break;
                case UNE_PREM_RESER:
                    income.setUnePremReser((Float) item[i]);
                    break;
                case REINS_INCOME:
                    income.setReinsIncome((Float) item[i]);
                    break;
                case N_SEC_TB_INCOME:
                    income.setNSecTbIncome((Float) item[i]);
                    break;
                case N_SEC_UW_INCOME:
                    income.setNSecUwIncome((Float) item[i]);
                    break;
                case N_ASSET_MG_INCOME:
                    income.setNAssetMgIncome((Float) item[i]);
                    break;
                case OTH_B_INCOME:
                    income.setOthBIncome((Float) item[i]);
                    break;
                case FV_VALUE_CHG_GAIN:
                    income.setFvValueChgGain((Float) item[i]);
                    break;
                case INVEST_INCOME:
                    income.setInvestIncome((Float) item[i]);
                    break;
                case ASS_INVEST_INCOME:
                    income.setAssInvestIncome((Float) item[i]);
                    break;
                case FOREX_GAIN:
                    income.setForexGain((Float) item[i]);
                    break;
                case TOTAL_COGS:
                    income.setTotalCogs((Float) item[i]);
                    break;
                case OPER_COST:
                    income.setOperCost((Float) item[i]);
                    break;
                case INT_EXP:
                    income.setIntExp((Float) item[i]);
                    break;
                case COMM_EXP:
                    income.setCommExp((Float) item[i]);
                    break;
                case BIZ_TAX_SURCHG:
                    income.setBizTaxSurchg((Float) item[i]);
                    break;
                case SELL_EXP:
                    income.setSellExp((Float) item[i]);
                    break;
                case ADMIN_EXP:
                    income.setAdminExp((Float) item[i]);
                    break;
                case FIN_EXP:
                    income.setFinExp((Float) item[i]);
                    break;
                case ASSETS_IMPAIR_LOSS:
                    income.setAssetsImpairLoss((Float) item[i]);
                    break;
                case PREM_REFUND:
                    income.setPremRefund((Float) item[i]);
                    break;
                case COMPENS_PAYOUT:
                    income.setCompensPayout((Float) item[i]);
                    break;
                case RESER_INSUR_LIAB:
                    income.setReserInsurLiab((Float) item[i]);
                    break;
                case DIV_PAYT:
                    income.setDivPayt((Float) item[i]);
                    break;
                case REINS_EXP:
                    income.setReinsExp((Float) item[i]);
                    break;
                case OPER_EXP:
                    income.setOperExp((Float) item[i]);
                    break;
                case COMPENS_PAYOUT_REFU:
                    income.setCompensPayoutRefu((Float) item[i]);
                    break;
                case INSUR_RESER_REFU:
                    income.setInsurReserRefu((Float) item[i]);
                    break;
                case REINS_COST_REFUND:
                    income.setReinsCostRefund((Float) item[i]);
                    break;
                case OTHER_BUS_COST:
                    income.setOtherBusCost((Float) item[i]);
                    break;
                case OPERATE_PROFIT:
                    income.setOperateProfit((Float) item[i]);
                    break;
                case NON_OPER_INCOME:
                    income.setNonOperIncome((Float) item[i]);
                    break;
                case NON_OPER_EXP:
                    income.setNonOperExp((Float) item[i]);
                    break;
                case NCA_DISPLOSS:
                    income.setNcaDisploss((Float) item[i]);
                    break;
                case TOTAL_PROFIT:
                    income.setTotalProfit((Float) item[i]);
                    break;
                case INCOME_TAX:
                    income.setIncomeTax((Float) item[i]);
                    break;
                case N_INCOME:
                    income.setNIncome((Float) item[i]);
                    break;
                case N_INCOME_ATTR_P:
                    income.setNIncomeAttrP((Float) item[i]);
                    break;
                case MINORITY_GAIN:
                    income.setMinorityGain((Float) item[i]);
                    break;
                case OTH_COMPR_INCOME:
                    income.setOthComprIncome((Float) item[i]);
                    break;
                case T_COMPR_INCOME:
                    income.setTComprIncome((Float) item[i]);
                    break;
                case COMPR_INC_ATTR_P:
                    income.setComprIncAttrP((Float) item[i]);
                    break;
                case COMPR_INC_ATTR_M_S:
                    income.setComprIncAttrMS((Float) item[i]);
                    break;
                case EBIT:
                    income.setEbit((Float) item[i]);
                    break;
                case EBITDA:
                    income.setEbitda((Float) item[i]);
                    break;
                case INSURANCE_EXP:
                    income.setInsuranceExp((Float) item[i]);
                    break;
                case UNDIST_PROFIT:
                    income.setUndistProfit((Float) item[i]);
                    break;
                case DISTABLE_PROFIT:
                    income.setDistableProfit((Float) item[i]);
                    break;
                case UPDATE_FLAG:
                    income.setUpdateFlag((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return income;
    }

}

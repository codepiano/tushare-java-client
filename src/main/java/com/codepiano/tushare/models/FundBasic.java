package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.808774
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FundBasic implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * name
     */
    public static final String NAME = "name";

    /**
     * management
     */
    public static final String MANAGEMENT = "management";

    /**
     * custodian
     */
    public static final String CUSTODIAN = "custodian";

    /**
     * fund_type
     */
    public static final String FUND_TYPE = "fund_type";

    /**
     * found_date
     */
    public static final String FOUND_DATE = "found_date";

    /**
     * due_date
     */
    public static final String DUE_DATE = "due_date";

    /**
     * list_date
     */
    public static final String LIST_DATE = "list_date";

    /**
     * issue_date
     */
    public static final String ISSUE_DATE = "issue_date";

    /**
     * delist_date
     */
    public static final String DELIST_DATE = "delist_date";

    /**
     * issue_amount
     */
    public static final String ISSUE_AMOUNT = "issue_amount";

    /**
     * m_fee
     */
    public static final String M_FEE = "m_fee";

    /**
     * c_fee
     */
    public static final String C_FEE = "c_fee";

    /**
     * duration_year
     */
    public static final String DURATION_YEAR = "duration_year";

    /**
     * p_value
     */
    public static final String P_VALUE = "p_value";

    /**
     * min_amount
     */
    public static final String MIN_AMOUNT = "min_amount";

    /**
     * exp_return
     */
    public static final String EXP_RETURN = "exp_return";

    /**
     * benchmark
     */
    public static final String BENCHMARK = "benchmark";

    /**
     * status
     */
    public static final String STATUS = "status";

    /**
     * invest_type
     */
    public static final String INVEST_TYPE = "invest_type";

    /**
     * type
     */
    public static final String TYPE = "type";

    /**
     * trustee
     */
    public static final String TRUSTEE = "trustee";

    /**
     * purc_startdate
     */
    public static final String PURC_STARTDATE = "purc_startdate";

    /**
     * redm_startdate
     */
    public static final String REDM_STARTDATE = "redm_startdate";

    /**
     * market
     */
    public static final String MARKET = "market";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, NAME, MANAGEMENT, CUSTODIAN, FUND_TYPE, FOUND_DATE, DUE_DATE, LIST_DATE, ISSUE_DATE, DELIST_DATE, ISSUE_AMOUNT, M_FEE, C_FEE, DURATION_YEAR, P_VALUE, MIN_AMOUNT, EXP_RETURN, BENCHMARK, STATUS, INVEST_TYPE, TYPE, TRUSTEE, PURC_STARTDATE, REDM_STARTDATE, MARKET);

    /**
     * 基金代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 简称
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * 管理人
     */
    @JsonProperty(value = "management")
    private String management;

    /**
     * 托管人
     */
    @JsonProperty(value = "custodian")
    private String custodian;

    /**
     * 投资类型
     */
    @JsonProperty(value = "fund_type")
    private String fundType;

    /**
     * 成立日期
     */
    @JsonProperty(value = "found_date")
    private String foundDate;

    /**
     * 到期日期
     */
    @JsonProperty(value = "due_date")
    private String dueDate;

    /**
     * 上市时间
     */
    @JsonProperty(value = "list_date")
    private String listDate;

    /**
     * 发行日期
     */
    @JsonProperty(value = "issue_date")
    private String issueDate;

    /**
     * 退市日期
     */
    @JsonProperty(value = "delist_date")
    private String delistDate;

    /**
     * 发行份额(亿)
     */
    @JsonProperty(value = "issue_amount")
    private Float issueAmount;

    /**
     * 管理费
     */
    @JsonProperty(value = "m_fee")
    private Float mFee;

    /**
     * 托管费
     */
    @JsonProperty(value = "c_fee")
    private Float cFee;

    /**
     * 存续期
     */
    @JsonProperty(value = "duration_year")
    private Float durationYear;

    /**
     * 面值
     */
    @JsonProperty(value = "p_value")
    private Float pValue;

    /**
     * 起点金额(万元)
     */
    @JsonProperty(value = "min_amount")
    private Float minAmount;

    /**
     * 预期收益率
     */
    @JsonProperty(value = "exp_return")
    private Float expReturn;

    /**
     * 业绩比较基准
     */
    @JsonProperty(value = "benchmark")
    private String benchmark;

    /**
     * 存续状态D摘牌 I发行 L已上市
     */
    @JsonProperty(value = "status")
    private String status;

    /**
     * 投资风格
     */
    @JsonProperty(value = "invest_type")
    private String investType;

    /**
     * 基金类型
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * 受托人
     */
    @JsonProperty(value = "trustee")
    private String trustee;

    /**
     * 日常申购起始日
     */
    @JsonProperty(value = "purc_startdate")
    private String purcStartdate;

    /**
     * 日常赎回起始日
     */
    @JsonProperty(value = "redm_startdate")
    private String redmStartdate;

    /**
     * E场内O场外
     */
    @JsonProperty(value = "market")
    private String market;


    /**
     * init by array
     */
    public static FundBasic init(String[] fields, Object[] item) {
        FundBasic fundBasic = new FundBasic();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    fundBasic.setTsCode((String) item[i]);
                    break;
                case NAME:
                    fundBasic.setName((String) item[i]);
                    break;
                case MANAGEMENT:
                    fundBasic.setManagement((String) item[i]);
                    break;
                case CUSTODIAN:
                    fundBasic.setCustodian((String) item[i]);
                    break;
                case FUND_TYPE:
                    fundBasic.setFundType((String) item[i]);
                    break;
                case FOUND_DATE:
                    fundBasic.setFoundDate((String) item[i]);
                    break;
                case DUE_DATE:
                    fundBasic.setDueDate((String) item[i]);
                    break;
                case LIST_DATE:
                    fundBasic.setListDate((String) item[i]);
                    break;
                case ISSUE_DATE:
                    fundBasic.setIssueDate((String) item[i]);
                    break;
                case DELIST_DATE:
                    fundBasic.setDelistDate((String) item[i]);
                    break;
                case ISSUE_AMOUNT:
                    fundBasic.setIssueAmount((Float) item[i]);
                    break;
                case M_FEE:
                    fundBasic.setMFee((Float) item[i]);
                    break;
                case C_FEE:
                    fundBasic.setCFee((Float) item[i]);
                    break;
                case DURATION_YEAR:
                    fundBasic.setDurationYear((Float) item[i]);
                    break;
                case P_VALUE:
                    fundBasic.setPValue((Float) item[i]);
                    break;
                case MIN_AMOUNT:
                    fundBasic.setMinAmount((Float) item[i]);
                    break;
                case EXP_RETURN:
                    fundBasic.setExpReturn((Float) item[i]);
                    break;
                case BENCHMARK:
                    fundBasic.setBenchmark((String) item[i]);
                    break;
                case STATUS:
                    fundBasic.setStatus((String) item[i]);
                    break;
                case INVEST_TYPE:
                    fundBasic.setInvestType((String) item[i]);
                    break;
                case TYPE:
                    fundBasic.setType((String) item[i]);
                    break;
                case TRUSTEE:
                    fundBasic.setTrustee((String) item[i]);
                    break;
                case PURC_STARTDATE:
                    fundBasic.setPurcStartdate((String) item[i]);
                    break;
                case REDM_STARTDATE:
                    fundBasic.setRedmStartdate((String) item[i]);
                    break;
                case MARKET:
                    fundBasic.setMarket((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return fundBasic;
    }

}

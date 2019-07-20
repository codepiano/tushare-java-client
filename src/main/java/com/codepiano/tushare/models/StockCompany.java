package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.821550
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class StockCompany implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * exchange
     */
    public static final String EXCHANGE = "exchange";

    /**
     * chairman
     */
    public static final String CHAIRMAN = "chairman";

    /**
     * manager
     */
    public static final String MANAGER = "manager";

    /**
     * secretary
     */
    public static final String SECRETARY = "secretary";

    /**
     * reg_capital
     */
    public static final String REG_CAPITAL = "reg_capital";

    /**
     * setup_date
     */
    public static final String SETUP_DATE = "setup_date";

    /**
     * province
     */
    public static final String PROVINCE = "province";

    /**
     * city
     */
    public static final String CITY = "city";

    /**
     * introduction
     */
    public static final String INTRODUCTION = "introduction";

    /**
     * website
     */
    public static final String WEBSITE = "website";

    /**
     * email
     */
    public static final String EMAIL = "email";

    /**
     * office
     */
    public static final String OFFICE = "office";

    /**
     * employees
     */
    public static final String EMPLOYEES = "employees";

    /**
     * main_business
     */
    public static final String MAIN_BUSINESS = "main_business";

    /**
     * business_scope
     */
    public static final String BUSINESS_SCOPE = "business_scope";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, EXCHANGE, CHAIRMAN, MANAGER, SECRETARY, REG_CAPITAL, SETUP_DATE, PROVINCE, CITY, INTRODUCTION, WEBSITE, EMAIL, OFFICE, EMPLOYEES, MAIN_BUSINESS, BUSINESS_SCOPE);

    /**
     * 股票代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 交易所代码 ，SSE上交所 SZSE深交所
     */
    @JsonProperty(value = "exchange")
    private String exchange;

    /**
     * 法人代表
     */
    @JsonProperty(value = "chairman")
    private String chairman;

    /**
     * 总经理
     */
    @JsonProperty(value = "manager")
    private String manager;

    /**
     * 董秘
     */
    @JsonProperty(value = "secretary")
    private String secretary;

    /**
     * 注册资本
     */
    @JsonProperty(value = "reg_capital")
    private Float regCapital;

    /**
     * 注册日期
     */
    @JsonProperty(value = "setup_date")
    private String setupDate;

    /**
     * 所在省份
     */
    @JsonProperty(value = "province")
    private String province;

    /**
     * 所在城市
     */
    @JsonProperty(value = "city")
    private String city;

    /**
     * 公司介绍
     */
    @JsonProperty(value = "introduction")
    private String introduction;

    /**
     * 公司主页
     */
    @JsonProperty(value = "website")
    private String website;

    /**
     * 电子邮件
     */
    @JsonProperty(value = "email")
    private String email;

    /**
     * 办公室
     */
    @JsonProperty(value = "office")
    private String office;

    /**
     * 员工人数
     */
    @JsonProperty(value = "employees")
    private Integer employees;

    /**
     * 主要业务及产品
     */
    @JsonProperty(value = "main_business")
    private String mainBusiness;

    /**
     * 经营范围
     */
    @JsonProperty(value = "business_scope")
    private String businessScope;


    /**
     * init by array
     */
    public static StockCompany init(String[] fields, Object[] item) {
        StockCompany stockCompany = new StockCompany();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    stockCompany.setTsCode((String) item[i]);
                    break;
                case EXCHANGE:
                    stockCompany.setExchange((String) item[i]);
                    break;
                case CHAIRMAN:
                    stockCompany.setChairman((String) item[i]);
                    break;
                case MANAGER:
                    stockCompany.setManager((String) item[i]);
                    break;
                case SECRETARY:
                    stockCompany.setSecretary((String) item[i]);
                    break;
                case REG_CAPITAL:
                    stockCompany.setRegCapital((Float) item[i]);
                    break;
                case SETUP_DATE:
                    stockCompany.setSetupDate((String) item[i]);
                    break;
                case PROVINCE:
                    stockCompany.setProvince((String) item[i]);
                    break;
                case CITY:
                    stockCompany.setCity((String) item[i]);
                    break;
                case INTRODUCTION:
                    stockCompany.setIntroduction((String) item[i]);
                    break;
                case WEBSITE:
                    stockCompany.setWebsite((String) item[i]);
                    break;
                case EMAIL:
                    stockCompany.setEmail((String) item[i]);
                    break;
                case OFFICE:
                    stockCompany.setOffice((String) item[i]);
                    break;
                case EMPLOYEES:
                    stockCompany.setEmployees((Integer) item[i]);
                    break;
                case MAIN_BUSINESS:
                    stockCompany.setMainBusiness((String) item[i]);
                    break;
                case BUSINESS_SCOPE:
                    stockCompany.setBusinessScope((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return stockCompany;
    }

}

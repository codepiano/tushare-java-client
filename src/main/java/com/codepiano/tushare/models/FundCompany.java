package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.809548
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FundCompany implements Model {

    /**
     * name
     */
    public static final String NAME = "name";

    /**
     * shortname
     */
    public static final String SHORTNAME = "shortname";

    /**
     * short_enname
     */
    public static final String SHORT_ENNAME = "short_enname";

    /**
     * province
     */
    public static final String PROVINCE = "province";

    /**
     * city
     */
    public static final String CITY = "city";

    /**
     * address
     */
    public static final String ADDRESS = "address";

    /**
     * phone
     */
    public static final String PHONE = "phone";

    /**
     * office
     */
    public static final String OFFICE = "office";

    /**
     * website
     */
    public static final String WEBSITE = "website";

    /**
     * chairman
     */
    public static final String CHAIRMAN = "chairman";

    /**
     * manager
     */
    public static final String MANAGER = "manager";

    /**
     * reg_capital
     */
    public static final String REG_CAPITAL = "reg_capital";

    /**
     * setup_date
     */
    public static final String SETUP_DATE = "setup_date";

    /**
     * end_date
     */
    public static final String END_DATE = "end_date";

    /**
     * employees
     */
    public static final String EMPLOYEES = "employees";

    /**
     * main_business
     */
    public static final String MAIN_BUSINESS = "main_business";

    /**
     * org_code
     */
    public static final String ORG_CODE = "org_code";

    /**
     * credit_code
     */
    public static final String CREDIT_CODE = "credit_code";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(NAME, SHORTNAME, SHORT_ENNAME, PROVINCE, CITY, ADDRESS, PHONE, OFFICE, WEBSITE, CHAIRMAN, MANAGER, REG_CAPITAL, SETUP_DATE, END_DATE, EMPLOYEES, MAIN_BUSINESS, ORG_CODE, CREDIT_CODE);

    /**
     * 基金公司名称
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * 简称
     */
    @JsonProperty(value = "shortname")
    private String shortname;

    /**
     * 英文缩写
     */
    @JsonProperty(value = "short_enname")
    private String shortEnname;

    /**
     * 省份
     */
    @JsonProperty(value = "province")
    private String province;

    /**
     * 城市
     */
    @JsonProperty(value = "city")
    private String city;

    /**
     * 注册地址
     */
    @JsonProperty(value = "address")
    private String address;

    /**
     * 电话
     */
    @JsonProperty(value = "phone")
    private String phone;

    /**
     * 办公地址
     */
    @JsonProperty(value = "office")
    private String office;

    /**
     * 公司网址
     */
    @JsonProperty(value = "website")
    private String website;

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
     * 注册资本
     */
    @JsonProperty(value = "reg_capital")
    private Float regCapital;

    /**
     * 成立日期
     */
    @JsonProperty(value = "setup_date")
    private String setupDate;

    /**
     * 公司终止日期
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * 员工总数
     */
    @JsonProperty(value = "employees")
    private Float employees;

    /**
     * 主要产品及业务
     */
    @JsonProperty(value = "main_business")
    private String mainBusiness;

    /**
     * 组织机构代码
     */
    @JsonProperty(value = "org_code")
    private String orgCode;

    /**
     * 统一社会信用代码
     */
    @JsonProperty(value = "credit_code")
    private String creditCode;


    /**
     * init by array
     */
    public static FundCompany init(String[] fields, Object[] item) {
        FundCompany fundCompany = new FundCompany();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case NAME:
                    fundCompany.setName((String) item[i]);
                    break;
                case SHORTNAME:
                    fundCompany.setShortname((String) item[i]);
                    break;
                case SHORT_ENNAME:
                    fundCompany.setShortEnname((String) item[i]);
                    break;
                case PROVINCE:
                    fundCompany.setProvince((String) item[i]);
                    break;
                case CITY:
                    fundCompany.setCity((String) item[i]);
                    break;
                case ADDRESS:
                    fundCompany.setAddress((String) item[i]);
                    break;
                case PHONE:
                    fundCompany.setPhone((String) item[i]);
                    break;
                case OFFICE:
                    fundCompany.setOffice((String) item[i]);
                    break;
                case WEBSITE:
                    fundCompany.setWebsite((String) item[i]);
                    break;
                case CHAIRMAN:
                    fundCompany.setChairman((String) item[i]);
                    break;
                case MANAGER:
                    fundCompany.setManager((String) item[i]);
                    break;
                case REG_CAPITAL:
                    fundCompany.setRegCapital((Float) item[i]);
                    break;
                case SETUP_DATE:
                    fundCompany.setSetupDate((String) item[i]);
                    break;
                case END_DATE:
                    fundCompany.setEndDate((String) item[i]);
                    break;
                case EMPLOYEES:
                    fundCompany.setEmployees((Float) item[i]);
                    break;
                case MAIN_BUSINESS:
                    fundCompany.setMainBusiness((String) item[i]);
                    break;
                case ORG_CODE:
                    fundCompany.setOrgCode((String) item[i]);
                    break;
                case CREDIT_CODE:
                    fundCompany.setCreditCode((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return fundCompany;
    }

}

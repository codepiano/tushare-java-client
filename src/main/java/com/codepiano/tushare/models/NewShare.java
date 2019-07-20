package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.848880
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class NewShare implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * sub_code
     */
    public static final String SUB_CODE = "sub_code";

    /**
     * name
     */
    public static final String NAME = "name";

    /**
     * ipo_date
     */
    public static final String IPO_DATE = "ipo_date";

    /**
     * issue_date
     */
    public static final String ISSUE_DATE = "issue_date";

    /**
     * amount
     */
    public static final String AMOUNT = "amount";

    /**
     * market_amount
     */
    public static final String MARKET_AMOUNT = "market_amount";

    /**
     * price
     */
    public static final String PRICE = "price";

    /**
     * pe
     */
    public static final String PE = "pe";

    /**
     * limit_amount
     */
    public static final String LIMIT_AMOUNT = "limit_amount";

    /**
     * funds
     */
    public static final String FUNDS = "funds";

    /**
     * ballot
     */
    public static final String BALLOT = "ballot";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, SUB_CODE, NAME, IPO_DATE, ISSUE_DATE, AMOUNT, MARKET_AMOUNT, PRICE, PE, LIMIT_AMOUNT, FUNDS, BALLOT);

    /**
     * TS股票代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 申购代码
     */
    @JsonProperty(value = "sub_code")
    private String subCode;

    /**
     * 名称
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * 上网发行日期
     */
    @JsonProperty(value = "ipo_date")
    private String ipoDate;

    /**
     * 上市日期
     */
    @JsonProperty(value = "issue_date")
    private String issueDate;

    /**
     * 发行总量（万股）
     */
    @JsonProperty(value = "amount")
    private Float amount;

    /**
     * 上网发行总量（万股）
     */
    @JsonProperty(value = "market_amount")
    private Float marketAmount;

    /**
     * 发行价格
     */
    @JsonProperty(value = "price")
    private Float price;

    /**
     * 市盈率
     */
    @JsonProperty(value = "pe")
    private Float pe;

    /**
     * 个人申购上限（万股）
     */
    @JsonProperty(value = "limit_amount")
    private Float limitAmount;

    /**
     * 募集资金（亿元）
     */
    @JsonProperty(value = "funds")
    private Float funds;

    /**
     * 中签率
     */
    @JsonProperty(value = "ballot")
    private Float ballot;


    /**
     * init by array
     */
    public static NewShare init(String[] fields, Object[] item) {
        NewShare newShare = new NewShare();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    newShare.setTsCode((String) item[i]);
                    break;
                case SUB_CODE:
                    newShare.setSubCode((String) item[i]);
                    break;
                case NAME:
                    newShare.setName((String) item[i]);
                    break;
                case IPO_DATE:
                    newShare.setIpoDate((String) item[i]);
                    break;
                case ISSUE_DATE:
                    newShare.setIssueDate((String) item[i]);
                    break;
                case AMOUNT:
                    newShare.setAmount((Float) item[i]);
                    break;
                case MARKET_AMOUNT:
                    newShare.setMarketAmount((Float) item[i]);
                    break;
                case PRICE:
                    newShare.setPrice((Float) item[i]);
                    break;
                case PE:
                    newShare.setPe((Float) item[i]);
                    break;
                case LIMIT_AMOUNT:
                    newShare.setLimitAmount((Float) item[i]);
                    break;
                case FUNDS:
                    newShare.setFunds((Float) item[i]);
                    break;
                case BALLOT:
                    newShare.setBallot((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return newShare;
    }

}

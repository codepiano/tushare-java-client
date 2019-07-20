package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.849419
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class StockBasic implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * symbol
     */
    public static final String SYMBOL = "symbol";

    /**
     * name
     */
    public static final String NAME = "name";

    /**
     * area
     */
    public static final String AREA = "area";

    /**
     * industry
     */
    public static final String INDUSTRY = "industry";

    /**
     * fullname
     */
    public static final String FULLNAME = "fullname";

    /**
     * enname
     */
    public static final String ENNAME = "enname";

    /**
     * market
     */
    public static final String MARKET = "market";

    /**
     * exchange
     */
    public static final String EXCHANGE = "exchange";

    /**
     * curr_type
     */
    public static final String CURR_TYPE = "curr_type";

    /**
     * list_status
     */
    public static final String LIST_STATUS = "list_status";

    /**
     * list_date
     */
    public static final String LIST_DATE = "list_date";

    /**
     * delist_date
     */
    public static final String DELIST_DATE = "delist_date";

    /**
     * is_hs
     */
    public static final String IS_HS = "is_hs";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, SYMBOL, NAME, AREA, INDUSTRY, FULLNAME, ENNAME, MARKET, EXCHANGE, CURR_TYPE, LIST_STATUS, LIST_DATE, DELIST_DATE, IS_HS);

    /**
     * TS代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 股票代码
     */
    @JsonProperty(value = "symbol")
    private String symbol;

    /**
     * 股票名称
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * 所在地域
     */
    @JsonProperty(value = "area")
    private String area;

    /**
     * 所属行业
     */
    @JsonProperty(value = "industry")
    private String industry;

    /**
     * 股票全称
     */
    @JsonProperty(value = "fullname")
    private String fullname;

    /**
     * 英文全称
     */
    @JsonProperty(value = "enname")
    private String enname;

    /**
     * 市场类型 （主板/中小板/创业板）
     */
    @JsonProperty(value = "market")
    private String market;

    /**
     * 交易所代码
     */
    @JsonProperty(value = "exchange")
    private String exchange;

    /**
     * 交易货币
     */
    @JsonProperty(value = "curr_type")
    private String currType;

    /**
     * 上市状态： L上市 D退市 P暂停上市
     */
    @JsonProperty(value = "list_status")
    private String listStatus;

    /**
     * 上市日期
     */
    @JsonProperty(value = "list_date")
    private String listDate;

    /**
     * 退市日期
     */
    @JsonProperty(value = "delist_date")
    private String delistDate;

    /**
     * 是否沪深港通标的，N否 H沪股通 S深股通
     */
    @JsonProperty(value = "is_hs")
    private String isHs;


    /**
     * init by array
     */
    public static StockBasic init(String[] fields, Object[] item) {
        StockBasic stockBasic = new StockBasic();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    stockBasic.setTsCode((String) item[i]);
                    break;
                case SYMBOL:
                    stockBasic.setSymbol((String) item[i]);
                    break;
                case NAME:
                    stockBasic.setName((String) item[i]);
                    break;
                case AREA:
                    stockBasic.setArea((String) item[i]);
                    break;
                case INDUSTRY:
                    stockBasic.setIndustry((String) item[i]);
                    break;
                case FULLNAME:
                    stockBasic.setFullname((String) item[i]);
                    break;
                case ENNAME:
                    stockBasic.setEnname((String) item[i]);
                    break;
                case MARKET:
                    stockBasic.setMarket((String) item[i]);
                    break;
                case EXCHANGE:
                    stockBasic.setExchange((String) item[i]);
                    break;
                case CURR_TYPE:
                    stockBasic.setCurrType((String) item[i]);
                    break;
                case LIST_STATUS:
                    stockBasic.setListStatus((String) item[i]);
                    break;
                case LIST_DATE:
                    stockBasic.setListDate((String) item[i]);
                    break;
                case DELIST_DATE:
                    stockBasic.setDelistDate((String) item[i]);
                    break;
                case IS_HS:
                    stockBasic.setIsHs((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return stockBasic;
    }

}

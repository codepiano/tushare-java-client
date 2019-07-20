package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.815115
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class OptBasic implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * exchange
     */
    public static final String EXCHANGE = "exchange";

    /**
     * name
     */
    public static final String NAME = "name";

    /**
     * per_unit
     */
    public static final String PER_UNIT = "per_unit";

    /**
     * opt_code
     */
    public static final String OPT_CODE = "opt_code";

    /**
     * opt_type
     */
    public static final String OPT_TYPE = "opt_type";

    /**
     * call_put
     */
    public static final String CALL_PUT = "call_put";

    /**
     * exercise_type
     */
    public static final String EXERCISE_TYPE = "exercise_type";

    /**
     * exercise_price
     */
    public static final String EXERCISE_PRICE = "exercise_price";

    /**
     * s_month
     */
    public static final String S_MONTH = "s_month";

    /**
     * maturity_date
     */
    public static final String MATURITY_DATE = "maturity_date";

    /**
     * list_price
     */
    public static final String LIST_PRICE = "list_price";

    /**
     * list_date
     */
    public static final String LIST_DATE = "list_date";

    /**
     * delist_date
     */
    public static final String DELIST_DATE = "delist_date";

    /**
     * last_edate
     */
    public static final String LAST_EDATE = "last_edate";

    /**
     * last_ddate
     */
    public static final String LAST_DDATE = "last_ddate";

    /**
     * quote_unit
     */
    public static final String QUOTE_UNIT = "quote_unit";

    /**
     * min_price_chg
     */
    public static final String MIN_PRICE_CHG = "min_price_chg";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, EXCHANGE, NAME, PER_UNIT, OPT_CODE, OPT_TYPE, CALL_PUT, EXERCISE_TYPE, EXERCISE_PRICE, S_MONTH, MATURITY_DATE, LIST_PRICE, LIST_DATE, DELIST_DATE, LAST_EDATE, LAST_DDATE, QUOTE_UNIT, MIN_PRICE_CHG);

    /**
     * TS代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 交易市场
     */
    @JsonProperty(value = "exchange")
    private String exchange;

    /**
     * 合约名称
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * 合约单位
     */
    @JsonProperty(value = "per_unit")
    private String perUnit;

    /**
     * 标准合约代码
     */
    @JsonProperty(value = "opt_code")
    private String optCode;

    /**
     * 合约类型
     */
    @JsonProperty(value = "opt_type")
    private String optType;

    /**
     * 期权类型
     */
    @JsonProperty(value = "call_put")
    private String callPut;

    /**
     * 行权方式
     */
    @JsonProperty(value = "exercise_type")
    private String exerciseType;

    /**
     * 行权价格
     */
    @JsonProperty(value = "exercise_price")
    private Float exercisePrice;

    /**
     * 结算月
     */
    @JsonProperty(value = "s_month")
    private String sMonth;

    /**
     * 到期日
     */
    @JsonProperty(value = "maturity_date")
    private String maturityDate;

    /**
     * 挂牌基准价
     */
    @JsonProperty(value = "list_price")
    private Float listPrice;

    /**
     * 开始交易日期
     */
    @JsonProperty(value = "list_date")
    private String listDate;

    /**
     * 最后交易日期
     */
    @JsonProperty(value = "delist_date")
    private String delistDate;

    /**
     * 最后行权日期
     */
    @JsonProperty(value = "last_edate")
    private String lastEdate;

    /**
     * 最后交割日期
     */
    @JsonProperty(value = "last_ddate")
    private String lastDdate;

    /**
     * 报价单位
     */
    @JsonProperty(value = "quote_unit")
    private String quoteUnit;

    /**
     * 最小价格波幅
     */
    @JsonProperty(value = "min_price_chg")
    private String minPriceChg;


    /**
     * init by array
     */
    public static OptBasic init(String[] fields, Object[] item) {
        OptBasic optBasic = new OptBasic();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    optBasic.setTsCode((String) item[i]);
                    break;
                case EXCHANGE:
                    optBasic.setExchange((String) item[i]);
                    break;
                case NAME:
                    optBasic.setName((String) item[i]);
                    break;
                case PER_UNIT:
                    optBasic.setPerUnit((String) item[i]);
                    break;
                case OPT_CODE:
                    optBasic.setOptCode((String) item[i]);
                    break;
                case OPT_TYPE:
                    optBasic.setOptType((String) item[i]);
                    break;
                case CALL_PUT:
                    optBasic.setCallPut((String) item[i]);
                    break;
                case EXERCISE_TYPE:
                    optBasic.setExerciseType((String) item[i]);
                    break;
                case EXERCISE_PRICE:
                    optBasic.setExercisePrice((Float) item[i]);
                    break;
                case S_MONTH:
                    optBasic.setSMonth((String) item[i]);
                    break;
                case MATURITY_DATE:
                    optBasic.setMaturityDate((String) item[i]);
                    break;
                case LIST_PRICE:
                    optBasic.setListPrice((Float) item[i]);
                    break;
                case LIST_DATE:
                    optBasic.setListDate((String) item[i]);
                    break;
                case DELIST_DATE:
                    optBasic.setDelistDate((String) item[i]);
                    break;
                case LAST_EDATE:
                    optBasic.setLastEdate((String) item[i]);
                    break;
                case LAST_DDATE:
                    optBasic.setLastDdate((String) item[i]);
                    break;
                case QUOTE_UNIT:
                    optBasic.setQuoteUnit((String) item[i]);
                    break;
                case MIN_PRICE_CHG:
                    optBasic.setMinPriceChg((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return optBasic;
    }

}

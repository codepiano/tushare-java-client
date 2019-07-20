package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.817634
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FutBasic implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * symbol
     */
    public static final String SYMBOL = "symbol";

    /**
     * exchange
     */
    public static final String EXCHANGE = "exchange";

    /**
     * name
     */
    public static final String NAME = "name";

    /**
     * fut_code
     */
    public static final String FUT_CODE = "fut_code";

    /**
     * multiplier
     */
    public static final String MULTIPLIER = "multiplier";

    /**
     * trade_unit
     */
    public static final String TRADE_UNIT = "trade_unit";

    /**
     * per_unit
     */
    public static final String PER_UNIT = "per_unit";

    /**
     * quote_unit
     */
    public static final String QUOTE_UNIT = "quote_unit";

    /**
     * quote_unit_desc
     */
    public static final String QUOTE_UNIT_DESC = "quote_unit_desc";

    /**
     * d_mode_desc
     */
    public static final String D_MODE_DESC = "d_mode_desc";

    /**
     * list_date
     */
    public static final String LIST_DATE = "list_date";

    /**
     * delist_date
     */
    public static final String DELIST_DATE = "delist_date";

    /**
     * d_month
     */
    public static final String D_MONTH = "d_month";

    /**
     * last_ddate
     */
    public static final String LAST_DDATE = "last_ddate";

    /**
     * trade_time_desc
     */
    public static final String TRADE_TIME_DESC = "trade_time_desc";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, SYMBOL, EXCHANGE, NAME, FUT_CODE, MULTIPLIER, TRADE_UNIT, PER_UNIT, QUOTE_UNIT, QUOTE_UNIT_DESC, D_MODE_DESC, LIST_DATE, DELIST_DATE, D_MONTH, LAST_DDATE, TRADE_TIME_DESC);

    /**
     * 合约代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 交易标识
     */
    @JsonProperty(value = "symbol")
    private String symbol;

    /**
     * 交易市场
     */
    @JsonProperty(value = "exchange")
    private String exchange;

    /**
     * 中文简称
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * 合约产品代码
     */
    @JsonProperty(value = "fut_code")
    private String futCode;

    /**
     * 合约乘数
     */
    @JsonProperty(value = "multiplier")
    private Float multiplier;

    /**
     * 交易计量单位
     */
    @JsonProperty(value = "trade_unit")
    private String tradeUnit;

    /**
     * 交易单位(每手)
     */
    @JsonProperty(value = "per_unit")
    private Float perUnit;

    /**
     * 报价单位
     */
    @JsonProperty(value = "quote_unit")
    private String quoteUnit;

    /**
     * 最小报价单位说明
     */
    @JsonProperty(value = "quote_unit_desc")
    private String quoteUnitDesc;

    /**
     * 交割方式说明
     */
    @JsonProperty(value = "d_mode_desc")
    private String dModeDesc;

    /**
     * 上市日期
     */
    @JsonProperty(value = "list_date")
    private String listDate;

    /**
     * 最后交易日期
     */
    @JsonProperty(value = "delist_date")
    private String delistDate;

    /**
     * 交割月份
     */
    @JsonProperty(value = "d_month")
    private String dMonth;

    /**
     * 最后交割日
     */
    @JsonProperty(value = "last_ddate")
    private String lastDdate;

    /**
     * 交易时间说明
     */
    @JsonProperty(value = "trade_time_desc")
    private String tradeTimeDesc;


    /**
     * init by array
     */
    public static FutBasic init(String[] fields, Object[] item) {
        FutBasic futBasic = new FutBasic();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    futBasic.setTsCode((String) item[i]);
                    break;
                case SYMBOL:
                    futBasic.setSymbol((String) item[i]);
                    break;
                case EXCHANGE:
                    futBasic.setExchange((String) item[i]);
                    break;
                case NAME:
                    futBasic.setName((String) item[i]);
                    break;
                case FUT_CODE:
                    futBasic.setFutCode((String) item[i]);
                    break;
                case MULTIPLIER:
                    futBasic.setMultiplier((Float) item[i]);
                    break;
                case TRADE_UNIT:
                    futBasic.setTradeUnit((String) item[i]);
                    break;
                case PER_UNIT:
                    futBasic.setPerUnit((Float) item[i]);
                    break;
                case QUOTE_UNIT:
                    futBasic.setQuoteUnit((String) item[i]);
                    break;
                case QUOTE_UNIT_DESC:
                    futBasic.setQuoteUnitDesc((String) item[i]);
                    break;
                case D_MODE_DESC:
                    futBasic.setDModeDesc((String) item[i]);
                    break;
                case LIST_DATE:
                    futBasic.setListDate((String) item[i]);
                    break;
                case DELIST_DATE:
                    futBasic.setDelistDate((String) item[i]);
                    break;
                case D_MONTH:
                    futBasic.setDMonth((String) item[i]);
                    break;
                case LAST_DDATE:
                    futBasic.setLastDdate((String) item[i]);
                    break;
                case TRADE_TIME_DESC:
                    futBasic.setTradeTimeDesc((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return futBasic;
    }

}

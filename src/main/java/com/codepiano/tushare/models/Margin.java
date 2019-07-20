package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.821052
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Margin implements Model {

    /**
     * trade_date
     */
    public static final String TRADE_DATE = "trade_date";

    /**
     * exchange_id
     */
    public static final String EXCHANGE_ID = "exchange_id";

    /**
     * rzye
     */
    public static final String RZYE = "rzye";

    /**
     * rzmre
     */
    public static final String RZMRE = "rzmre";

    /**
     * rzche
     */
    public static final String RZCHE = "rzche";

    /**
     * rqye
     */
    public static final String RQYE = "rqye";

    /**
     * rqmcl
     */
    public static final String RQMCL = "rqmcl";

    /**
     * rzrqye
     */
    public static final String RZRQYE = "rzrqye";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TRADE_DATE, EXCHANGE_ID, RZYE, RZMRE, RZCHE, RQYE, RQMCL, RZRQYE);

    /**
     * 交易日期
     */
    @JsonProperty(value = "trade_date")
    private String tradeDate;

    /**
     * 交易所代码（SSE上交所SZSE深交所）
     */
    @JsonProperty(value = "exchange_id")
    private String exchangeId;

    /**
     * 融资余额(元)
     */
    @JsonProperty(value = "rzye")
    private Float rzye;

    /**
     * 融资买入额(元)
     */
    @JsonProperty(value = "rzmre")
    private Float rzmre;

    /**
     * 融资偿还额(元)
     */
    @JsonProperty(value = "rzche")
    private Float rzche;

    /**
     * 融券余额(元)
     */
    @JsonProperty(value = "rqye")
    private Float rqye;

    /**
     * 融券卖出量(股,份,手)
     */
    @JsonProperty(value = "rqmcl")
    private Float rqmcl;

    /**
     * 融资融券余额(元)
     */
    @JsonProperty(value = "rzrqye")
    private Float rzrqye;


    /**
     * init by array
     */
    public static Margin init(String[] fields, Object[] item) {
        Margin margin = new Margin();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TRADE_DATE:
                    margin.setTradeDate((String) item[i]);
                    break;
                case EXCHANGE_ID:
                    margin.setExchangeId((String) item[i]);
                    break;
                case RZYE:
                    margin.setRzye((Float) item[i]);
                    break;
                case RZMRE:
                    margin.setRzmre((Float) item[i]);
                    break;
                case RZCHE:
                    margin.setRzche((Float) item[i]);
                    break;
                case RQYE:
                    margin.setRqye((Float) item[i]);
                    break;
                case RQMCL:
                    margin.setRqmcl((Float) item[i]);
                    break;
                case RZRQYE:
                    margin.setRzrqye((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return margin;
    }

}

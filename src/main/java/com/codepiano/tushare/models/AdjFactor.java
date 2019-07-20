package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.848351
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AdjFactor implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * trade_date
     */
    public static final String TRADE_DATE = "trade_date";

    /**
     * adj_factor
     */
    public static final String ADJ_FACTOR = "adj_factor";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, TRADE_DATE, ADJ_FACTOR);

    /**
     * 股票代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 交易日期
     */
    @JsonProperty(value = "trade_date")
    private String tradeDate;

    /**
     * 复权因子
     */
    @JsonProperty(value = "adj_factor")
    private Float adjFactor;


    /**
     * init by array
     */
    public static AdjFactor init(String[] fields, Object[] item) {
        AdjFactor adjFactor = new AdjFactor();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    adjFactor.setTsCode((String) item[i]);
                    break;
                case TRADE_DATE:
                    adjFactor.setTradeDate((String) item[i]);
                    break;
                case ADJ_FACTOR:
                    adjFactor.setAdjFactor((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return adjFactor;
    }

}

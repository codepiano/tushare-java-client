package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.796587
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class IndexWeight implements Model {

    /**
     * index_code
     */
    public static final String INDEX_CODE = "index_code";

    /**
     * con_code
     */
    public static final String CON_CODE = "con_code";

    /**
     * trade_date
     */
    public static final String TRADE_DATE = "trade_date";

    /**
     * weight
     */
    public static final String WEIGHT = "weight";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(INDEX_CODE, CON_CODE, TRADE_DATE, WEIGHT);

    /**
     * 指数代码
     */
    @JsonProperty(value = "index_code")
    private String indexCode;

    /**
     * 成分代码
     */
    @JsonProperty(value = "con_code")
    private String conCode;

    /**
     * 交易日期
     */
    @JsonProperty(value = "trade_date")
    private String tradeDate;

    /**
     * 权重
     */
    @JsonProperty(value = "weight")
    private Float weight;


    /**
     * init by array
     */
    public static IndexWeight init(String[] fields, Object[] item) {
        IndexWeight indexWeight = new IndexWeight();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case INDEX_CODE:
                    indexWeight.setIndexCode((String) item[i]);
                    break;
                case CON_CODE:
                    indexWeight.setConCode((String) item[i]);
                    break;
                case TRADE_DATE:
                    indexWeight.setTradeDate((String) item[i]);
                    break;
                case WEIGHT:
                    indexWeight.setWeight((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return indexWeight;
    }

}

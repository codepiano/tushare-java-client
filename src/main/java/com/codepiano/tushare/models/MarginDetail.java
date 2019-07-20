package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.822831
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class MarginDetail implements Model {

    /**
     * trade_date
     */
    public static final String TRADE_DATE = "trade_date";

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * rzye
     */
    public static final String RZYE = "rzye";

    /**
     * rqye
     */
    public static final String RQYE = "rqye";

    /**
     * rzmre
     */
    public static final String RZMRE = "rzmre";

    /**
     * rqyl
     */
    public static final String RQYL = "rqyl";

    /**
     * rzche
     */
    public static final String RZCHE = "rzche";

    /**
     * rqchl
     */
    public static final String RQCHL = "rqchl";

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
    public static final List<String> FIELDS = List.of(TRADE_DATE, TS_CODE, RZYE, RQYE, RZMRE, RQYL, RZCHE, RQCHL, RQMCL, RZRQYE);

    /**
     * 交易日期
     */
    @JsonProperty(value = "trade_date")
    private String tradeDate;

    /**
     * TS股票代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 融资余额(元)
     */
    @JsonProperty(value = "rzye")
    private Float rzye;

    /**
     * 融券余额(元)
     */
    @JsonProperty(value = "rqye")
    private Float rqye;

    /**
     * 融资买入额(元)
     */
    @JsonProperty(value = "rzmre")
    private Float rzmre;

    /**
     * 融券余量（手）
     */
    @JsonProperty(value = "rqyl")
    private Float rqyl;

    /**
     * 融资偿还额(元)
     */
    @JsonProperty(value = "rzche")
    private Float rzche;

    /**
     * 融券偿还量(手)
     */
    @JsonProperty(value = "rqchl")
    private Float rqchl;

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
    public static MarginDetail init(String[] fields, Object[] item) {
        MarginDetail marginDetail = new MarginDetail();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TRADE_DATE:
                    marginDetail.setTradeDate((String) item[i]);
                    break;
                case TS_CODE:
                    marginDetail.setTsCode((String) item[i]);
                    break;
                case RZYE:
                    marginDetail.setRzye((Float) item[i]);
                    break;
                case RQYE:
                    marginDetail.setRqye((Float) item[i]);
                    break;
                case RZMRE:
                    marginDetail.setRzmre((Float) item[i]);
                    break;
                case RQYL:
                    marginDetail.setRqyl((Float) item[i]);
                    break;
                case RZCHE:
                    marginDetail.setRzche((Float) item[i]);
                    break;
                case RQCHL:
                    marginDetail.setRqchl((Float) item[i]);
                    break;
                case RQMCL:
                    marginDetail.setRqmcl((Float) item[i]);
                    break;
                case RZRQYE:
                    marginDetail.setRzrqye((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return marginDetail;
    }

}

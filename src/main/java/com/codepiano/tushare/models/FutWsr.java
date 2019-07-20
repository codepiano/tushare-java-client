package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.817026
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FutWsr implements Model {

    /**
     * trade_date
     */
    public static final String TRADE_DATE = "trade_date";

    /**
     * symbol
     */
    public static final String SYMBOL = "symbol";

    /**
     * fut_name
     */
    public static final String FUT_NAME = "fut_name";

    /**
     * warehouse
     */
    public static final String WAREHOUSE = "warehouse";

    /**
     * wh_id
     */
    public static final String WH_ID = "wh_id";

    /**
     * pre_vol
     */
    public static final String PRE_VOL = "pre_vol";

    /**
     * vol
     */
    public static final String VOL = "vol";

    /**
     * vol_chg
     */
    public static final String VOL_CHG = "vol_chg";

    /**
     * area
     */
    public static final String AREA = "area";

    /**
     * year
     */
    public static final String YEAR = "year";

    /**
     * grade
     */
    public static final String GRADE = "grade";

    /**
     * brand
     */
    public static final String BRAND = "brand";

    /**
     * place
     */
    public static final String PLACE = "place";

    /**
     * pd
     */
    public static final String PD = "pd";

    /**
     * is_ct
     */
    public static final String IS_CT = "is_ct";

    /**
     * unit
     */
    public static final String UNIT = "unit";

    /**
     * exchange
     */
    public static final String EXCHANGE = "exchange";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TRADE_DATE, SYMBOL, FUT_NAME, WAREHOUSE, WH_ID, PRE_VOL, VOL, VOL_CHG, AREA, YEAR, GRADE, BRAND, PLACE, PD, IS_CT, UNIT, EXCHANGE);

    /**
     * 交易日期
     */
    @JsonProperty(value = "trade_date")
    private String tradeDate;

    /**
     * 产品代码
     */
    @JsonProperty(value = "symbol")
    private String symbol;

    /**
     * 产品名称
     */
    @JsonProperty(value = "fut_name")
    private String futName;

    /**
     * 仓库名称
     */
    @JsonProperty(value = "warehouse")
    private String warehouse;

    /**
     * 仓库编号
     */
    @JsonProperty(value = "wh_id")
    private String whId;

    /**
     * 昨日仓单量
     */
    @JsonProperty(value = "pre_vol")
    private Integer preVol;

    /**
     * 今日仓单量
     */
    @JsonProperty(value = "vol")
    private Integer vol;

    /**
     * 增减量
     */
    @JsonProperty(value = "vol_chg")
    private Integer volChg;

    /**
     * 地区
     */
    @JsonProperty(value = "area")
    private String area;

    /**
     * 年度
     */
    @JsonProperty(value = "year")
    private String year;

    /**
     * 等级
     */
    @JsonProperty(value = "grade")
    private String grade;

    /**
     * 品牌
     */
    @JsonProperty(value = "brand")
    private String brand;

    /**
     * 产地
     */
    @JsonProperty(value = "place")
    private String place;

    /**
     * 升贴水
     */
    @JsonProperty(value = "pd")
    private Integer pd;

    /**
     * 是否折算仓单
     */
    @JsonProperty(value = "is_ct")
    private String isCt;

    /**
     * 单位
     */
    @JsonProperty(value = "unit")
    private String unit;

    /**
     * 交易所
     */
    @JsonProperty(value = "exchange")
    private String exchange;


    /**
     * init by array
     */
    public static FutWsr init(String[] fields, Object[] item) {
        FutWsr futWsr = new FutWsr();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TRADE_DATE:
                    futWsr.setTradeDate((String) item[i]);
                    break;
                case SYMBOL:
                    futWsr.setSymbol((String) item[i]);
                    break;
                case FUT_NAME:
                    futWsr.setFutName((String) item[i]);
                    break;
                case WAREHOUSE:
                    futWsr.setWarehouse((String) item[i]);
                    break;
                case WH_ID:
                    futWsr.setWhId((String) item[i]);
                    break;
                case PRE_VOL:
                    futWsr.setPreVol((Integer) item[i]);
                    break;
                case VOL:
                    futWsr.setVol((Integer) item[i]);
                    break;
                case VOL_CHG:
                    futWsr.setVolChg((Integer) item[i]);
                    break;
                case AREA:
                    futWsr.setArea((String) item[i]);
                    break;
                case YEAR:
                    futWsr.setYear((String) item[i]);
                    break;
                case GRADE:
                    futWsr.setGrade((String) item[i]);
                    break;
                case BRAND:
                    futWsr.setBrand((String) item[i]);
                    break;
                case PLACE:
                    futWsr.setPlace((String) item[i]);
                    break;
                case PD:
                    futWsr.setPd((Integer) item[i]);
                    break;
                case IS_CT:
                    futWsr.setIsCt((String) item[i]);
                    break;
                case UNIT:
                    futWsr.setUnit((String) item[i]);
                    break;
                case EXCHANGE:
                    futWsr.setExchange((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return futWsr;
    }

}

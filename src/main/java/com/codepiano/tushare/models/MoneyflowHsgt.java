package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.825967
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class MoneyflowHsgt implements Model {

    /**
     * trade_date
     */
    public static final String TRADE_DATE = "trade_date";

    /**
     * ggt_ss
     */
    public static final String GGT_SS = "ggt_ss";

    /**
     * ggt_sz
     */
    public static final String GGT_SZ = "ggt_sz";

    /**
     * hgt
     */
    public static final String HGT = "hgt";

    /**
     * sgt
     */
    public static final String SGT = "sgt";

    /**
     * north_money
     */
    public static final String NORTH_MONEY = "north_money";

    /**
     * south_money
     */
    public static final String SOUTH_MONEY = "south_money";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TRADE_DATE, GGT_SS, GGT_SZ, HGT, SGT, NORTH_MONEY, SOUTH_MONEY);

    /**
     * 交易日期
     */
    @JsonProperty(value = "trade_date")
    private String tradeDate;

    /**
     * 港股通（上海）
     */
    @JsonProperty(value = "ggt_ss")
    private String ggtSs;

    /**
     * 港股通（深圳）
     */
    @JsonProperty(value = "ggt_sz")
    private String ggtSz;

    /**
     * 沪股通（百万元）
     */
    @JsonProperty(value = "hgt")
    private String hgt;

    /**
     * 深股通（百万元）
     */
    @JsonProperty(value = "sgt")
    private String sgt;

    /**
     * 北向资金（百万元）
     */
    @JsonProperty(value = "north_money")
    private String northMoney;

    /**
     * 南向资金（百万元）
     */
    @JsonProperty(value = "south_money")
    private String southMoney;


    /**
     * init by array
     */
    public static MoneyflowHsgt init(String[] fields, Object[] item) {
        MoneyflowHsgt moneyflowHsgt = new MoneyflowHsgt();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TRADE_DATE:
                    moneyflowHsgt.setTradeDate((String) item[i]);
                    break;
                case GGT_SS:
                    moneyflowHsgt.setGgtSs((String) item[i]);
                    break;
                case GGT_SZ:
                    moneyflowHsgt.setGgtSz((String) item[i]);
                    break;
                case HGT:
                    moneyflowHsgt.setHgt((String) item[i]);
                    break;
                case SGT:
                    moneyflowHsgt.setSgt((String) item[i]);
                    break;
                case NORTH_MONEY:
                    moneyflowHsgt.setNorthMoney((String) item[i]);
                    break;
                case SOUTH_MONEY:
                    moneyflowHsgt.setSouthMoney((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return moneyflowHsgt;
    }

}

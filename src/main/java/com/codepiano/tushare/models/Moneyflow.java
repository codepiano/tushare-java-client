package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.832972
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Moneyflow implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * trade_date
     */
    public static final String TRADE_DATE = "trade_date";

    /**
     * buy_sm_vol
     */
    public static final String BUY_SM_VOL = "buy_sm_vol";

    /**
     * buy_sm_amount
     */
    public static final String BUY_SM_AMOUNT = "buy_sm_amount";

    /**
     * sell_sm_vol
     */
    public static final String SELL_SM_VOL = "sell_sm_vol";

    /**
     * sell_sm_amount
     */
    public static final String SELL_SM_AMOUNT = "sell_sm_amount";

    /**
     * buy_md_vol
     */
    public static final String BUY_MD_VOL = "buy_md_vol";

    /**
     * buy_md_amount
     */
    public static final String BUY_MD_AMOUNT = "buy_md_amount";

    /**
     * sell_md_vol
     */
    public static final String SELL_MD_VOL = "sell_md_vol";

    /**
     * sell_md_amount
     */
    public static final String SELL_MD_AMOUNT = "sell_md_amount";

    /**
     * buy_lg_vol
     */
    public static final String BUY_LG_VOL = "buy_lg_vol";

    /**
     * buy_lg_amount
     */
    public static final String BUY_LG_AMOUNT = "buy_lg_amount";

    /**
     * sell_lg_vol
     */
    public static final String SELL_LG_VOL = "sell_lg_vol";

    /**
     * sell_lg_amount
     */
    public static final String SELL_LG_AMOUNT = "sell_lg_amount";

    /**
     * buy_elg_vol
     */
    public static final String BUY_ELG_VOL = "buy_elg_vol";

    /**
     * buy_elg_amount
     */
    public static final String BUY_ELG_AMOUNT = "buy_elg_amount";

    /**
     * sell_elg_vol
     */
    public static final String SELL_ELG_VOL = "sell_elg_vol";

    /**
     * sell_elg_amount
     */
    public static final String SELL_ELG_AMOUNT = "sell_elg_amount";

    /**
     * net_mf_vol
     */
    public static final String NET_MF_VOL = "net_mf_vol";

    /**
     * net_mf_amount
     */
    public static final String NET_MF_AMOUNT = "net_mf_amount";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, TRADE_DATE, BUY_SM_VOL, BUY_SM_AMOUNT, SELL_SM_VOL, SELL_SM_AMOUNT, BUY_MD_VOL, BUY_MD_AMOUNT, SELL_MD_VOL, SELL_MD_AMOUNT, BUY_LG_VOL, BUY_LG_AMOUNT, SELL_LG_VOL, SELL_LG_AMOUNT, BUY_ELG_VOL, BUY_ELG_AMOUNT, SELL_ELG_VOL, SELL_ELG_AMOUNT, NET_MF_VOL, NET_MF_AMOUNT);

    /**
     * TS代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 交易日期
     */
    @JsonProperty(value = "trade_date")
    private String tradeDate;

    /**
     * 小单买入量（手）
     */
    @JsonProperty(value = "buy_sm_vol")
    private Integer buySmVol;

    /**
     * 小单买入金额（万元）
     */
    @JsonProperty(value = "buy_sm_amount")
    private Float buySmAmount;

    /**
     * 小单卖出量（手）
     */
    @JsonProperty(value = "sell_sm_vol")
    private Integer sellSmVol;

    /**
     * 小单卖出金额（万元）
     */
    @JsonProperty(value = "sell_sm_amount")
    private Float sellSmAmount;

    /**
     * 中单买入量（手）
     */
    @JsonProperty(value = "buy_md_vol")
    private Integer buyMdVol;

    /**
     * 中单买入金额（万元）
     */
    @JsonProperty(value = "buy_md_amount")
    private Float buyMdAmount;

    /**
     * 中单卖出量（手）
     */
    @JsonProperty(value = "sell_md_vol")
    private Integer sellMdVol;

    /**
     * 中单卖出金额（万元）
     */
    @JsonProperty(value = "sell_md_amount")
    private Float sellMdAmount;

    /**
     * 大单买入量（手）
     */
    @JsonProperty(value = "buy_lg_vol")
    private Integer buyLgVol;

    /**
     * 大单买入金额（万元）
     */
    @JsonProperty(value = "buy_lg_amount")
    private Float buyLgAmount;

    /**
     * 大单卖出量（手）
     */
    @JsonProperty(value = "sell_lg_vol")
    private Integer sellLgVol;

    /**
     * 大单卖出金额（万元）
     */
    @JsonProperty(value = "sell_lg_amount")
    private Float sellLgAmount;

    /**
     * 特大单买入量（手）
     */
    @JsonProperty(value = "buy_elg_vol")
    private Integer buyElgVol;

    /**
     * 特大单买入金额（万元）
     */
    @JsonProperty(value = "buy_elg_amount")
    private Float buyElgAmount;

    /**
     * 特大单卖出量（手）
     */
    @JsonProperty(value = "sell_elg_vol")
    private Integer sellElgVol;

    /**
     * 特大单卖出金额（万元）
     */
    @JsonProperty(value = "sell_elg_amount")
    private Float sellElgAmount;

    /**
     * 净流入量（手）
     */
    @JsonProperty(value = "net_mf_vol")
    private Integer netMfVol;

    /**
     * 净流入额（万元）
     */
    @JsonProperty(value = "net_mf_amount")
    private Float netMfAmount;


    /**
     * init by array
     */
    public static Moneyflow init(String[] fields, Object[] item) {
        Moneyflow moneyflow = new Moneyflow();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    moneyflow.setTsCode((String) item[i]);
                    break;
                case TRADE_DATE:
                    moneyflow.setTradeDate((String) item[i]);
                    break;
                case BUY_SM_VOL:
                    moneyflow.setBuySmVol((Integer) item[i]);
                    break;
                case BUY_SM_AMOUNT:
                    moneyflow.setBuySmAmount((Float) item[i]);
                    break;
                case SELL_SM_VOL:
                    moneyflow.setSellSmVol((Integer) item[i]);
                    break;
                case SELL_SM_AMOUNT:
                    moneyflow.setSellSmAmount((Float) item[i]);
                    break;
                case BUY_MD_VOL:
                    moneyflow.setBuyMdVol((Integer) item[i]);
                    break;
                case BUY_MD_AMOUNT:
                    moneyflow.setBuyMdAmount((Float) item[i]);
                    break;
                case SELL_MD_VOL:
                    moneyflow.setSellMdVol((Integer) item[i]);
                    break;
                case SELL_MD_AMOUNT:
                    moneyflow.setSellMdAmount((Float) item[i]);
                    break;
                case BUY_LG_VOL:
                    moneyflow.setBuyLgVol((Integer) item[i]);
                    break;
                case BUY_LG_AMOUNT:
                    moneyflow.setBuyLgAmount((Float) item[i]);
                    break;
                case SELL_LG_VOL:
                    moneyflow.setSellLgVol((Integer) item[i]);
                    break;
                case SELL_LG_AMOUNT:
                    moneyflow.setSellLgAmount((Float) item[i]);
                    break;
                case BUY_ELG_VOL:
                    moneyflow.setBuyElgVol((Integer) item[i]);
                    break;
                case BUY_ELG_AMOUNT:
                    moneyflow.setBuyElgAmount((Float) item[i]);
                    break;
                case SELL_ELG_VOL:
                    moneyflow.setSellElgVol((Integer) item[i]);
                    break;
                case SELL_ELG_AMOUNT:
                    moneyflow.setSellElgAmount((Float) item[i]);
                    break;
                case NET_MF_VOL:
                    moneyflow.setNetMfVol((Integer) item[i]);
                    break;
                case NET_MF_AMOUNT:
                    moneyflow.setNetMfAmount((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return moneyflow;
    }

}

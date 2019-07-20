package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.841261
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class BlockTrade implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * trade_date
     */
    public static final String TRADE_DATE = "trade_date";

    /**
     * price
     */
    public static final String PRICE = "price";

    /**
     * vol
     */
    public static final String VOL = "vol";

    /**
     * amount
     */
    public static final String AMOUNT = "amount";

    /**
     * buyer
     */
    public static final String BUYER = "buyer";

    /**
     * seller
     */
    public static final String SELLER = "seller";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, TRADE_DATE, PRICE, VOL, AMOUNT, BUYER, SELLER);

    /**
     * TS代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 交易日历
     */
    @JsonProperty(value = "trade_date")
    private String tradeDate;

    /**
     * 成交价
     */
    @JsonProperty(value = "price")
    private Float price;

    /**
     * 成交量（万股）
     */
    @JsonProperty(value = "vol")
    private Float vol;

    /**
     * 成交金额
     */
    @JsonProperty(value = "amount")
    private Float amount;

    /**
     * 买方营业部
     */
    @JsonProperty(value = "buyer")
    private String buyer;

    /**
     * 卖方营业部
     */
    @JsonProperty(value = "seller")
    private String seller;


    /**
     * init by array
     */
    public static BlockTrade init(String[] fields, Object[] item) {
        BlockTrade blockTrade = new BlockTrade();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    blockTrade.setTsCode((String) item[i]);
                    break;
                case TRADE_DATE:
                    blockTrade.setTradeDate((String) item[i]);
                    break;
                case PRICE:
                    blockTrade.setPrice((Float) item[i]);
                    break;
                case VOL:
                    blockTrade.setVol((Float) item[i]);
                    break;
                case AMOUNT:
                    blockTrade.setAmount((Float) item[i]);
                    break;
                case BUYER:
                    blockTrade.setBuyer((String) item[i]);
                    break;
                case SELLER:
                    blockTrade.setSeller((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return blockTrade;
    }

}

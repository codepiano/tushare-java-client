package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.793579
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class BoCinema implements Model {

    /**
     * date
     */
    public static final String DATE = "date";

    /**
     * c_name
     */
    public static final String C_NAME = "c_name";

    /**
     * aud_count
     */
    public static final String AUD_COUNT = "aud_count";

    /**
     * att_ratio
     */
    public static final String ATT_RATIO = "att_ratio";

    /**
     * day_amount
     */
    public static final String DAY_AMOUNT = "day_amount";

    /**
     * day_showcount
     */
    public static final String DAY_SHOWCOUNT = "day_showcount";

    /**
     * avg_price
     */
    public static final String AVG_PRICE = "avg_price";

    /**
     * p_pc
     */
    public static final String P_PC = "p_pc";

    /**
     * rank
     */
    public static final String RANK = "rank";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(DATE, C_NAME, AUD_COUNT, ATT_RATIO, DAY_AMOUNT, DAY_SHOWCOUNT, AVG_PRICE, P_PC, RANK);

    /**
     * 日期
     */
    @JsonProperty(value = "date")
    private String date;

    /**
     * 影院名称
     */
    @JsonProperty(value = "c_name")
    private String cName;

    /**
     * 观众人数
     */
    @JsonProperty(value = "aud_count")
    private Integer audCount;

    /**
     * 上座率
     */
    @JsonProperty(value = "att_ratio")
    private Float attRatio;

    /**
     * 当日票房
     */
    @JsonProperty(value = "day_amount")
    private Float dayAmount;

    /**
     * 当日场次
     */
    @JsonProperty(value = "day_showcount")
    private Float dayShowcount;

    /**
     * 场均票价（元）
     */
    @JsonProperty(value = "avg_price")
    private Float avgPrice;

    /**
     * 场均人次
     */
    @JsonProperty(value = "p_pc")
    private Float pPc;

    /**
     * 排名
     */
    @JsonProperty(value = "rank")
    private Integer rank;


    /**
     * init by array
     */
    public static BoCinema init(String[] fields, Object[] item) {
        BoCinema boCinema = new BoCinema();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case DATE:
                    boCinema.setDate((String) item[i]);
                    break;
                case C_NAME:
                    boCinema.setCName((String) item[i]);
                    break;
                case AUD_COUNT:
                    boCinema.setAudCount((Integer) item[i]);
                    break;
                case ATT_RATIO:
                    boCinema.setAttRatio((Float) item[i]);
                    break;
                case DAY_AMOUNT:
                    boCinema.setDayAmount((Float) item[i]);
                    break;
                case DAY_SHOWCOUNT:
                    boCinema.setDayShowcount((Float) item[i]);
                    break;
                case AVG_PRICE:
                    boCinema.setAvgPrice((Float) item[i]);
                    break;
                case P_PC:
                    boCinema.setPPc((Float) item[i]);
                    break;
                case RANK:
                    boCinema.setRank((Integer) item[i]);
                    break;
                default:
                    ;
            }
        }
        return boCinema;
    }

}

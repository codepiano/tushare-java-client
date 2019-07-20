package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.791208
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class BoMonthly implements Model {

    /**
     * date
     */
    public static final String DATE = "date";

    /**
     * name
     */
    public static final String NAME = "name";

    /**
     * list_date
     */
    public static final String LIST_DATE = "list_date";

    /**
     * avg_price
     */
    public static final String AVG_PRICE = "avg_price";

    /**
     * month_amount
     */
    public static final String MONTH_AMOUNT = "month_amount";

    /**
     * list_day
     */
    public static final String LIST_DAY = "list_day";

    /**
     * p_pc
     */
    public static final String P_PC = "p_pc";

    /**
     * wom_index
     */
    public static final String WOM_INDEX = "wom_index";

    /**
     * m_ratio
     */
    public static final String M_RATIO = "m_ratio";

    /**
     * rank
     */
    public static final String RANK = "rank";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(DATE, NAME, LIST_DATE, AVG_PRICE, MONTH_AMOUNT, LIST_DAY, P_PC, WOM_INDEX, M_RATIO, RANK);

    /**
     * 日期
     */
    @JsonProperty(value = "date")
    private String date;

    /**
     * 影片名称
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * 上映日期
     */
    @JsonProperty(value = "list_date")
    private String listDate;

    /**
     * 平均票价
     */
    @JsonProperty(value = "avg_price")
    private Float avgPrice;

    /**
     * 当月票房（万）
     */
    @JsonProperty(value = "month_amount")
    private Float monthAmount;

    /**
     * 月内天数
     */
    @JsonProperty(value = "list_day")
    private Integer listDay;

    /**
     * 场均人次
     */
    @JsonProperty(value = "p_pc")
    private Integer pPc;

    /**
     * 口碑指数
     */
    @JsonProperty(value = "wom_index")
    private Float womIndex;

    /**
     * 月度占比（%）
     */
    @JsonProperty(value = "m_ratio")
    private Float mRatio;

    /**
     * 排名
     */
    @JsonProperty(value = "rank")
    private Integer rank;


    /**
     * init by array
     */
    public static BoMonthly init(String[] fields, Object[] item) {
        BoMonthly boMonthly = new BoMonthly();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case DATE:
                    boMonthly.setDate((String) item[i]);
                    break;
                case NAME:
                    boMonthly.setName((String) item[i]);
                    break;
                case LIST_DATE:
                    boMonthly.setListDate((String) item[i]);
                    break;
                case AVG_PRICE:
                    boMonthly.setAvgPrice((Float) item[i]);
                    break;
                case MONTH_AMOUNT:
                    boMonthly.setMonthAmount((Float) item[i]);
                    break;
                case LIST_DAY:
                    boMonthly.setListDay((Integer) item[i]);
                    break;
                case P_PC:
                    boMonthly.setPPc((Integer) item[i]);
                    break;
                case WOM_INDEX:
                    boMonthly.setWomIndex((Float) item[i]);
                    break;
                case M_RATIO:
                    boMonthly.setMRatio((Float) item[i]);
                    break;
                case RANK:
                    boMonthly.setRank((Integer) item[i]);
                    break;
                default:
                    ;
            }
        }
        return boMonthly;
    }

}

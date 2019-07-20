package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.789875
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class BoWeekly implements Model {

    /**
     * date
     */
    public static final String DATE = "date";

    /**
     * name
     */
    public static final String NAME = "name";

    /**
     * avg_price
     */
    public static final String AVG_PRICE = "avg_price";

    /**
     * week_amount
     */
    public static final String WEEK_AMOUNT = "week_amount";

    /**
     * total
     */
    public static final String TOTAL = "total";

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
     * up_ratio
     */
    public static final String UP_RATIO = "up_ratio";

    /**
     * rank
     */
    public static final String RANK = "rank";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(DATE, NAME, AVG_PRICE, WEEK_AMOUNT, TOTAL, LIST_DAY, P_PC, WOM_INDEX, UP_RATIO, RANK);

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
     * 平均票价
     */
    @JsonProperty(value = "avg_price")
    private Float avgPrice;

    /**
     * 当周票房（万）
     */
    @JsonProperty(value = "week_amount")
    private Float weekAmount;

    /**
     * 累计票房（万）
     */
    @JsonProperty(value = "total")
    private Float total;

    /**
     * 上映天数
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
     * 环比变化 （%）
     */
    @JsonProperty(value = "up_ratio")
    private Float upRatio;

    /**
     * 排名
     */
    @JsonProperty(value = "rank")
    private Integer rank;


    /**
     * init by array
     */
    public static BoWeekly init(String[] fields, Object[] item) {
        BoWeekly boWeekly = new BoWeekly();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case DATE:
                    boWeekly.setDate((String) item[i]);
                    break;
                case NAME:
                    boWeekly.setName((String) item[i]);
                    break;
                case AVG_PRICE:
                    boWeekly.setAvgPrice((Float) item[i]);
                    break;
                case WEEK_AMOUNT:
                    boWeekly.setWeekAmount((Float) item[i]);
                    break;
                case TOTAL:
                    boWeekly.setTotal((Float) item[i]);
                    break;
                case LIST_DAY:
                    boWeekly.setListDay((Integer) item[i]);
                    break;
                case P_PC:
                    boWeekly.setPPc((Integer) item[i]);
                    break;
                case WOM_INDEX:
                    boWeekly.setWomIndex((Float) item[i]);
                    break;
                case UP_RATIO:
                    boWeekly.setUpRatio((Float) item[i]);
                    break;
                case RANK:
                    boWeekly.setRank((Integer) item[i]);
                    break;
                default:
                    ;
            }
        }
        return boWeekly;
    }

}

package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.795118
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class BoDaily implements Model {

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
     * day_amount
     */
    public static final String DAY_AMOUNT = "day_amount";

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
    public static final List<String> FIELDS = List.of(DATE, NAME, AVG_PRICE, DAY_AMOUNT, TOTAL, LIST_DAY, P_PC, WOM_INDEX, UP_RATIO, RANK);

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
     * 当日票房（万）
     */
    @JsonProperty(value = "day_amount")
    private Float dayAmount;

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
    public static BoDaily init(String[] fields, Object[] item) {
        BoDaily boDaily = new BoDaily();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case DATE:
                    boDaily.setDate((String) item[i]);
                    break;
                case NAME:
                    boDaily.setName((String) item[i]);
                    break;
                case AVG_PRICE:
                    boDaily.setAvgPrice((Float) item[i]);
                    break;
                case DAY_AMOUNT:
                    boDaily.setDayAmount((Float) item[i]);
                    break;
                case TOTAL:
                    boDaily.setTotal((Float) item[i]);
                    break;
                case LIST_DAY:
                    boDaily.setListDay((Integer) item[i]);
                    break;
                case P_PC:
                    boDaily.setPPc((Integer) item[i]);
                    break;
                case WOM_INDEX:
                    boDaily.setWomIndex((Float) item[i]);
                    break;
                case UP_RATIO:
                    boDaily.setUpRatio((Float) item[i]);
                    break;
                case RANK:
                    boDaily.setRank((Integer) item[i]);
                    break;
                default:
                    ;
            }
        }
        return boDaily;
    }

}

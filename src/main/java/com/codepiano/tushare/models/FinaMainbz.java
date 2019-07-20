package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.823602
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class FinaMainbz implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * end_date
     */
    public static final String END_DATE = "end_date";

    /**
     * bz_item
     */
    public static final String BZ_ITEM = "bz_item";

    /**
     * bz_sales
     */
    public static final String BZ_SALES = "bz_sales";

    /**
     * bz_profit
     */
    public static final String BZ_PROFIT = "bz_profit";

    /**
     * bz_cost
     */
    public static final String BZ_COST = "bz_cost";

    /**
     * curr_type
     */
    public static final String CURR_TYPE = "curr_type";

    /**
     * update_flag
     */
    public static final String UPDATE_FLAG = "update_flag";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, END_DATE, BZ_ITEM, BZ_SALES, BZ_PROFIT, BZ_COST, CURR_TYPE, UPDATE_FLAG);

    /**
     * TS代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 报告期
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * 主营业务来源
     */
    @JsonProperty(value = "bz_item")
    private String bzItem;

    /**
     * 主营业务收入(元)
     */
    @JsonProperty(value = "bz_sales")
    private Float bzSales;

    /**
     * 主营业务利润(元)
     */
    @JsonProperty(value = "bz_profit")
    private Float bzProfit;

    /**
     * 主营业务成本(元)
     */
    @JsonProperty(value = "bz_cost")
    private Float bzCost;

    /**
     * 货币代码
     */
    @JsonProperty(value = "curr_type")
    private String currType;

    /**
     * 是否更新
     */
    @JsonProperty(value = "update_flag")
    private String updateFlag;


    /**
     * init by array
     */
    public static FinaMainbz init(String[] fields, Object[] item) {
        FinaMainbz finaMainbz = new FinaMainbz();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    finaMainbz.setTsCode((String) item[i]);
                    break;
                case END_DATE:
                    finaMainbz.setEndDate((String) item[i]);
                    break;
                case BZ_ITEM:
                    finaMainbz.setBzItem((String) item[i]);
                    break;
                case BZ_SALES:
                    finaMainbz.setBzSales((Float) item[i]);
                    break;
                case BZ_PROFIT:
                    finaMainbz.setBzProfit((Float) item[i]);
                    break;
                case BZ_COST:
                    finaMainbz.setBzCost((Float) item[i]);
                    break;
                case CURR_TYPE:
                    finaMainbz.setCurrType((String) item[i]);
                    break;
                case UPDATE_FLAG:
                    finaMainbz.setUpdateFlag((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return finaMainbz;
    }

}

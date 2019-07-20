package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.844657
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class StkAccount implements Model {

    /**
     * date
     */
    public static final String DATE = "date";

    /**
     * weekly_new
     */
    public static final String WEEKLY_NEW = "weekly_new";

    /**
     * total
     */
    public static final String TOTAL = "total";

    /**
     * weekly_hold
     */
    public static final String WEEKLY_HOLD = "weekly_hold";

    /**
     * weekly_trade
     */
    public static final String WEEKLY_TRADE = "weekly_trade";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(DATE, WEEKLY_NEW, TOTAL, WEEKLY_HOLD, WEEKLY_TRADE);

    /**
     * 统计周期
     */
    @JsonProperty(value = "date")
    private String date;

    /**
     * 本周新增（万）
     */
    @JsonProperty(value = "weekly_new")
    private Float weeklyNew;

    /**
     * 期末总账户数（万）
     */
    @JsonProperty(value = "total")
    private Float total;

    /**
     * 本周持仓账户数（万）
     */
    @JsonProperty(value = "weekly_hold")
    private Float weeklyHold;

    /**
     * 本周参与交易账户数（万）
     */
    @JsonProperty(value = "weekly_trade")
    private Float weeklyTrade;


    /**
     * init by array
     */
    public static StkAccount init(String[] fields, Object[] item) {
        StkAccount stkAccount = new StkAccount();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case DATE:
                    stkAccount.setDate((String) item[i]);
                    break;
                case WEEKLY_NEW:
                    stkAccount.setWeeklyNew((Float) item[i]);
                    break;
                case TOTAL:
                    stkAccount.setTotal((Float) item[i]);
                    break;
                case WEEKLY_HOLD:
                    stkAccount.setWeeklyHold((Float) item[i]);
                    break;
                case WEEKLY_TRADE:
                    stkAccount.setWeeklyTrade((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return stkAccount;
    }

}

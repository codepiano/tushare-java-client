package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.811054
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ShiborQuote implements Model {

    /**
     * date
     */
    public static final String DATE = "date";

    /**
     * bank
     */
    public static final String BANK = "bank";

    /**
     * on_b
     */
    public static final String ON_B = "on_b";

    /**
     * on_a
     */
    public static final String ON_A = "on_a";

    /**
     * 1w_b
     */
    public static final String _1W_B = "1w_b";

    /**
     * 1w_a
     */
    public static final String _1W_A = "1w_a";

    /**
     * 2w_b
     */
    public static final String _2W_B = "2w_b";

    /**
     * 2w_a
     */
    public static final String _2W_A = "2w_a";

    /**
     * 1m_b
     */
    public static final String _1M_B = "1m_b";

    /**
     * 1m_a
     */
    public static final String _1M_A = "1m_a";

    /**
     * 3m_b
     */
    public static final String _3M_B = "3m_b";

    /**
     * 3m_a
     */
    public static final String _3M_A = "3m_a";

    /**
     * 6m_b
     */
    public static final String _6M_B = "6m_b";

    /**
     * 6m_a
     */
    public static final String _6M_A = "6m_a";

    /**
     * 9m_b
     */
    public static final String _9M_B = "9m_b";

    /**
     * 9m_a
     */
    public static final String _9M_A = "9m_a";

    /**
     * 1y_b
     */
    public static final String _1Y_B = "1y_b";

    /**
     * 1y_a
     */
    public static final String _1Y_A = "1y_a";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(DATE, BANK, ON_B, ON_A, _1W_B, _1W_A, _2W_B, _2W_A, _1M_B, _1M_A, _3M_B, _3M_A, _6M_B, _6M_A, _9M_B, _9M_A, _1Y_B, _1Y_A);

    /**
     * 日期
     */
    @JsonProperty(value = "date")
    private String date;

    /**
     * 报价银行
     */
    @JsonProperty(value = "bank")
    private String bank;

    /**
     * 隔夜_Bid
     */
    @JsonProperty(value = "on_b")
    private Float onB;

    /**
     * 隔夜_Ask
     */
    @JsonProperty(value = "on_a")
    private Float onA;

    /**
     * 1周_Bid
     */
    @JsonProperty(value = "1w_b")
    private Float _1wB;

    /**
     * 1周_Ask
     */
    @JsonProperty(value = "1w_a")
    private Float _1wA;

    /**
     * 2周_Bid
     */
    @JsonProperty(value = "2w_b")
    private Float _2wB;

    /**
     * 2周_Ask
     */
    @JsonProperty(value = "2w_a")
    private Float _2wA;

    /**
     * 1月_Bid
     */
    @JsonProperty(value = "1m_b")
    private Float _1mB;

    /**
     * 1月_Ask
     */
    @JsonProperty(value = "1m_a")
    private Float _1mA;

    /**
     * 3月_Bid
     */
    @JsonProperty(value = "3m_b")
    private Float _3mB;

    /**
     * 3月_Ask
     */
    @JsonProperty(value = "3m_a")
    private Float _3mA;

    /**
     * 6月_Bid
     */
    @JsonProperty(value = "6m_b")
    private Float _6mB;

    /**
     * 6月_Ask
     */
    @JsonProperty(value = "6m_a")
    private Float _6mA;

    /**
     * 9月_Bid
     */
    @JsonProperty(value = "9m_b")
    private Float _9mB;

    /**
     * 9月_Ask
     */
    @JsonProperty(value = "9m_a")
    private Float _9mA;

    /**
     * 1年_Bid
     */
    @JsonProperty(value = "1y_b")
    private Float _1yB;

    /**
     * 1年_Ask
     */
    @JsonProperty(value = "1y_a")
    private Float _1yA;


    /**
     * init by array
     */
    public static ShiborQuote init(String[] fields, Object[] item) {
        ShiborQuote shiborQuote = new ShiborQuote();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case DATE:
                    shiborQuote.setDate((String) item[i]);
                    break;
                case BANK:
                    shiborQuote.setBank((String) item[i]);
                    break;
                case ON_B:
                    shiborQuote.setOnB((Float) item[i]);
                    break;
                case ON_A:
                    shiborQuote.setOnA((Float) item[i]);
                    break;
                case _1W_B:
                    shiborQuote.set_1wB((Float) item[i]);
                    break;
                case _1W_A:
                    shiborQuote.set_1wA((Float) item[i]);
                    break;
                case _2W_B:
                    shiborQuote.set_2wB((Float) item[i]);
                    break;
                case _2W_A:
                    shiborQuote.set_2wA((Float) item[i]);
                    break;
                case _1M_B:
                    shiborQuote.set_1mB((Float) item[i]);
                    break;
                case _1M_A:
                    shiborQuote.set_1mA((Float) item[i]);
                    break;
                case _3M_B:
                    shiborQuote.set_3mB((Float) item[i]);
                    break;
                case _3M_A:
                    shiborQuote.set_3mA((Float) item[i]);
                    break;
                case _6M_B:
                    shiborQuote.set_6mB((Float) item[i]);
                    break;
                case _6M_A:
                    shiborQuote.set_6mA((Float) item[i]);
                    break;
                case _9M_B:
                    shiborQuote.set_9mB((Float) item[i]);
                    break;
                case _9M_A:
                    shiborQuote.set_9mA((Float) item[i]);
                    break;
                case _1Y_B:
                    shiborQuote.set_1yB((Float) item[i]);
                    break;
                case _1Y_A:
                    shiborQuote.set_1yA((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return shiborQuote;
    }

}

package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.794466
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class TmtTwincomedetail implements Model {

    /**
     * date
     */
    public static final String DATE = "date";

    /**
     * item
     */
    public static final String ITEM = "item";

    /**
     * symbol
     */
    public static final String SYMBOL = "symbol";

    /**
     * op_income
     */
    public static final String OP_INCOME = "op_income";

    /**
     * consop_income
     */
    public static final String CONSOP_INCOME = "consop_income";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(DATE, ITEM, SYMBOL, OP_INCOME, CONSOP_INCOME);

    /**
     * 报告期
     */
    @JsonProperty(value = "date")
    private String date;

    /**
     * 产品代码
     */
    @JsonProperty(value = "item")
    private String item;

    /**
     * 公司代码
     */
    @JsonProperty(value = "symbol")
    private String symbol;

    /**
     * 月度营收
     */
    @JsonProperty(value = "op_income")
    private String opIncome;

    /**
     * 合并月度营收（默认不展示）
     */
    @JsonProperty(value = "consop_income")
    private String consopIncome;


    /**
     * init by array
     */
    public static TmtTwincomedetail init(String[] fields, Object[] item) {
        TmtTwincomedetail tmtTwincomedetail = new TmtTwincomedetail();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case DATE:
                    tmtTwincomedetail.setDate((String) item[i]);
                    break;
                case ITEM:
                    tmtTwincomedetail.setItem((String) item[i]);
                    break;
                case SYMBOL:
                    tmtTwincomedetail.setSymbol((String) item[i]);
                    break;
                case OP_INCOME:
                    tmtTwincomedetail.setOpIncome((String) item[i]);
                    break;
                case CONSOP_INCOME:
                    tmtTwincomedetail.setConsopIncome((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return tmtTwincomedetail;
    }

}

package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.795973
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class TmtTwincome implements Model {

    /**
     * date
     */
    public static final String DATE = "date";

    /**
     * item
     */
    public static final String ITEM = "item";

    /**
     * op_income
     */
    public static final String OP_INCOME = "op_income";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(DATE, ITEM, OP_INCOME);

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
     * 月度收入
     */
    @JsonProperty(value = "op_income")
    private String opIncome;


    /**
     * init by array
     */
    public static TmtTwincome init(String[] fields, Object[] item) {
        TmtTwincome tmtTwincome = new TmtTwincome();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case DATE:
                    tmtTwincome.setDate((String) item[i]);
                    break;
                case ITEM:
                    tmtTwincome.setItem((String) item[i]);
                    break;
                case OP_INCOME:
                    tmtTwincome.setOpIncome((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return tmtTwincome;
    }

}

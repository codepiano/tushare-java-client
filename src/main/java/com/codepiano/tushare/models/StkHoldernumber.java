package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.852589
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class StkHoldernumber implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * ann_date
     */
    public static final String ANN_DATE = "ann_date";

    /**
     * end_date
     */
    public static final String END_DATE = "end_date";

    /**
     * holder_num
     */
    public static final String HOLDER_NUM = "holder_num";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, ANN_DATE, END_DATE, HOLDER_NUM);

    /**
     * TS股票代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 公告日期
     */
    @JsonProperty(value = "ann_date")
    private String annDate;

    /**
     * 截止日期
     */
    @JsonProperty(value = "end_date")
    private String endDate;

    /**
     * 股东户数
     */
    @JsonProperty(value = "holder_num")
    private Integer holderNum;


    /**
     * init by array
     */
    public static StkHoldernumber init(String[] fields, Object[] item) {
        StkHoldernumber stkHoldernumber = new StkHoldernumber();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    stkHoldernumber.setTsCode((String) item[i]);
                    break;
                case ANN_DATE:
                    stkHoldernumber.setAnnDate((String) item[i]);
                    break;
                case END_DATE:
                    stkHoldernumber.setEndDate((String) item[i]);
                    break;
                case HOLDER_NUM:
                    stkHoldernumber.setHolderNum((Integer) item[i]);
                    break;
                default:
                    ;
            }
        }
        return stkHoldernumber;
    }

}

package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.814137
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class ShiborLpr implements Model {

    /**
     * date
     */
    public static final String DATE = "date";

    /**
     * 1y
     */
    public static final String _1Y = "1y";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(DATE, _1Y);

    /**
     * 日期
     */
    @JsonProperty(value = "date")
    private String date;

    /**
     * 1年贷款利率
     */
    @JsonProperty(value = "1y")
    private Float _1y;


    /**
     * init by array
     */
    public static ShiborLpr init(String[] fields, Object[] item) {
        ShiborLpr shiborLpr = new ShiborLpr();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case DATE:
                    shiborLpr.setDate((String) item[i]);
                    break;
                case _1Y:
                    shiborLpr.set_1y((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return shiborLpr;
    }

}

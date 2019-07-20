package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.813424
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class WzIndex implements Model {

    /**
     * date
     */
    public static final String DATE = "date";

    /**
     * comp_rate
     */
    public static final String COMP_RATE = "comp_rate";

    /**
     * center_rate
     */
    public static final String CENTER_RATE = "center_rate";

    /**
     * micro_rate
     */
    public static final String MICRO_RATE = "micro_rate";

    /**
     * cm_rate
     */
    public static final String CM_RATE = "cm_rate";

    /**
     * sdb_rate
     */
    public static final String SDB_RATE = "sdb_rate";

    /**
     * om_rate
     */
    public static final String OM_RATE = "om_rate";

    /**
     * aa_rate
     */
    public static final String AA_RATE = "aa_rate";

    /**
     * m1_rate
     */
    public static final String M1_RATE = "m1_rate";

    /**
     * m3_rate
     */
    public static final String M3_RATE = "m3_rate";

    /**
     * m6_rate
     */
    public static final String M6_RATE = "m6_rate";

    /**
     * m12_rate
     */
    public static final String M12_RATE = "m12_rate";

    /**
     * long_rate
     */
    public static final String LONG_RATE = "long_rate";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(DATE, COMP_RATE, CENTER_RATE, MICRO_RATE, CM_RATE, SDB_RATE, OM_RATE, AA_RATE, M1_RATE, M3_RATE, M6_RATE, M12_RATE, LONG_RATE);

    /**
     * 日期
     */
    @JsonProperty(value = "date")
    private String date;

    /**
     * 温州民间融资综合利率指数 (%，下同)
     */
    @JsonProperty(value = "comp_rate")
    private Float compRate;

    /**
     * 民间借贷服务中心利率
     */
    @JsonProperty(value = "center_rate")
    private Float centerRate;

    /**
     * 小额贷款公司放款利率
     */
    @JsonProperty(value = "micro_rate")
    private Float microRate;

    /**
     * 民间资本管理公司融资价格
     */
    @JsonProperty(value = "cm_rate")
    private Float cmRate;

    /**
     * 社会直接借贷利率
     */
    @JsonProperty(value = "sdb_rate")
    private Float sdbRate;

    /**
     * 其他市场主体利率
     */
    @JsonProperty(value = "om_rate")
    private Float omRate;

    /**
     * 农村互助会互助金费率
     */
    @JsonProperty(value = "aa_rate")
    private Float aaRate;

    /**
     * 温州地区民间借贷分期限利率（一月期）
     */
    @JsonProperty(value = "m1_rate")
    private Float m1Rate;

    /**
     * 温州地区民间借贷分期限利率（三月期）
     */
    @JsonProperty(value = "m3_rate")
    private Float m3Rate;

    /**
     * 温州地区民间借贷分期限利率（六月期）
     */
    @JsonProperty(value = "m6_rate")
    private Float m6Rate;

    /**
     * 温州地区民间借贷分期限利率（一年期）
     */
    @JsonProperty(value = "m12_rate")
    private Float m12Rate;

    /**
     * 温州地区民间借贷分期限利率（长期）
     */
    @JsonProperty(value = "long_rate")
    private Float longRate;


    /**
     * init by array
     */
    public static WzIndex init(String[] fields, Object[] item) {
        WzIndex wzIndex = new WzIndex();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case DATE:
                    wzIndex.setDate((String) item[i]);
                    break;
                case COMP_RATE:
                    wzIndex.setCompRate((Float) item[i]);
                    break;
                case CENTER_RATE:
                    wzIndex.setCenterRate((Float) item[i]);
                    break;
                case MICRO_RATE:
                    wzIndex.setMicroRate((Float) item[i]);
                    break;
                case CM_RATE:
                    wzIndex.setCmRate((Float) item[i]);
                    break;
                case SDB_RATE:
                    wzIndex.setSdbRate((Float) item[i]);
                    break;
                case OM_RATE:
                    wzIndex.setOmRate((Float) item[i]);
                    break;
                case AA_RATE:
                    wzIndex.setAaRate((Float) item[i]);
                    break;
                case M1_RATE:
                    wzIndex.setM1Rate((Float) item[i]);
                    break;
                case M3_RATE:
                    wzIndex.setM3Rate((Float) item[i]);
                    break;
                case M6_RATE:
                    wzIndex.setM6Rate((Float) item[i]);
                    break;
                case M12_RATE:
                    wzIndex.setM12Rate((Float) item[i]);
                    break;
                case LONG_RATE:
                    wzIndex.setLongRate((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return wzIndex;
    }

}

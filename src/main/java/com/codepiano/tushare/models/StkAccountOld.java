package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.843601
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class StkAccountOld implements Model {

    /**
     * date
     */
    public static final String DATE = "date";

    /**
     * new_sh
     */
    public static final String NEW_SH = "new_sh";

    /**
     * new_sz
     */
    public static final String NEW_SZ = "new_sz";

    /**
     * active_sh
     */
    public static final String ACTIVE_SH = "active_sh";

    /**
     * active_sz
     */
    public static final String ACTIVE_SZ = "active_sz";

    /**
     * total_sh
     */
    public static final String TOTAL_SH = "total_sh";

    /**
     * total_sz
     */
    public static final String TOTAL_SZ = "total_sz";

    /**
     * trade_sh
     */
    public static final String TRADE_SH = "trade_sh";

    /**
     * trade_sz
     */
    public static final String TRADE_SZ = "trade_sz";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(DATE, NEW_SH, NEW_SZ, ACTIVE_SH, ACTIVE_SZ, TOTAL_SH, TOTAL_SZ, TRADE_SH, TRADE_SZ);

    /**
     * 统计周期
     */
    @JsonProperty(value = "date")
    private String date;

    /**
     * 本周新增（上海，户）
     */
    @JsonProperty(value = "new_sh")
    private Integer newSh;

    /**
     * 本周新增（深圳，户）
     */
    @JsonProperty(value = "new_sz")
    private Integer newSz;

    /**
     * 期末有效账户（上海，万户）
     */
    @JsonProperty(value = "active_sh")
    private Float activeSh;

    /**
     * 期末有效账户（深圳，万户）
     */
    @JsonProperty(value = "active_sz")
    private Float activeSz;

    /**
     * 期末账户数（上海，万户）
     */
    @JsonProperty(value = "total_sh")
    private Float totalSh;

    /**
     * 期末账户数（深圳，万户）
     */
    @JsonProperty(value = "total_sz")
    private Float totalSz;

    /**
     * 参与交易账户数（上海，万户）
     */
    @JsonProperty(value = "trade_sh")
    private Float tradeSh;

    /**
     * 参与交易账户数（深圳，万户）
     */
    @JsonProperty(value = "trade_sz")
    private Float tradeSz;


    /**
     * init by array
     */
    public static StkAccountOld init(String[] fields, Object[] item) {
        StkAccountOld stkAccountOld = new StkAccountOld();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case DATE:
                    stkAccountOld.setDate((String) item[i]);
                    break;
                case NEW_SH:
                    stkAccountOld.setNewSh((Integer) item[i]);
                    break;
                case NEW_SZ:
                    stkAccountOld.setNewSz((Integer) item[i]);
                    break;
                case ACTIVE_SH:
                    stkAccountOld.setActiveSh((Float) item[i]);
                    break;
                case ACTIVE_SZ:
                    stkAccountOld.setActiveSz((Float) item[i]);
                    break;
                case TOTAL_SH:
                    stkAccountOld.setTotalSh((Float) item[i]);
                    break;
                case TOTAL_SZ:
                    stkAccountOld.setTotalSz((Float) item[i]);
                    break;
                case TRADE_SH:
                    stkAccountOld.setTradeSh((Float) item[i]);
                    break;
                case TRADE_SZ:
                    stkAccountOld.setTradeSz((Float) item[i]);
                    break;
                default:
                    ;
            }
        }
        return stkAccountOld;
    }

}

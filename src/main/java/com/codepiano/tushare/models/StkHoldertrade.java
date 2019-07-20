package com.codepiano.tushare.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

/**
 * @author codepiano
 * @date 2019-07-20T01:09:19.833644
 */
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class StkHoldertrade implements Model {

    /**
     * ts_code
     */
    public static final String TS_CODE = "ts_code";

    /**
     * ann_date
     */
    public static final String ANN_DATE = "ann_date";

    /**
     * holder_name
     */
    public static final String HOLDER_NAME = "holder_name";

    /**
     * holder_type
     */
    public static final String HOLDER_TYPE = "holder_type";

    /**
     * in_de
     */
    public static final String IN_DE = "in_de";

    /**
     * change_vol
     */
    public static final String CHANGE_VOL = "change_vol";

    /**
     * change_ratio
     */
    public static final String CHANGE_RATIO = "change_ratio";

    /**
     * after_share
     */
    public static final String AFTER_SHARE = "after_share";

    /**
     * after_ratio
     */
    public static final String AFTER_RATIO = "after_ratio";

    /**
     * avg_price
     */
    public static final String AVG_PRICE = "avg_price";

    /**
     * total_share
     */
    public static final String TOTAL_SHARE = "total_share";

    /**
     * begin_date
     */
    public static final String BEGIN_DATE = "begin_date";

    /**
     * close_date
     */
    public static final String CLOSE_DATE = "close_date";


    /**
     * all fields
     */
    public static final List<String> FIELDS = List.of(TS_CODE, ANN_DATE, HOLDER_NAME, HOLDER_TYPE, IN_DE, CHANGE_VOL, CHANGE_RATIO, AFTER_SHARE, AFTER_RATIO, AVG_PRICE, TOTAL_SHARE, BEGIN_DATE, CLOSE_DATE);

    /**
     * TS代码
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 公告日期
     */
    @JsonProperty(value = "ann_date")
    private String annDate;

    /**
     * 股东名称
     */
    @JsonProperty(value = "holder_name")
    private String holderName;

    /**
     * 股东类型G高管P个人C公司
     */
    @JsonProperty(value = "holder_type")
    private String holderType;

    /**
     * 类型IN增持DE减持
     */
    @JsonProperty(value = "in_de")
    private String inDe;

    /**
     * 变动数量
     */
    @JsonProperty(value = "change_vol")
    private Float changeVol;

    /**
     * 占流通比例（%）
     */
    @JsonProperty(value = "change_ratio")
    private Float changeRatio;

    /**
     * 变动后持股
     */
    @JsonProperty(value = "after_share")
    private Float afterShare;

    /**
     * 变动后占流通比例（%）
     */
    @JsonProperty(value = "after_ratio")
    private Float afterRatio;

    /**
     * 平均价格
     */
    @JsonProperty(value = "avg_price")
    private Float avgPrice;

    /**
     * 持股总数
     */
    @JsonProperty(value = "total_share")
    private Float totalShare;

    /**
     * 增减持开始日期
     */
    @JsonProperty(value = "begin_date")
    private String beginDate;

    /**
     * 增减持结束日期
     */
    @JsonProperty(value = "close_date")
    private String closeDate;


    /**
     * init by array
     */
    public static StkHoldertrade init(String[] fields, Object[] item) {
        StkHoldertrade stkHoldertrade = new StkHoldertrade();
        for (int i = 0; i < fields.length; i++) {
            switch (fields[i]) {
                case TS_CODE:
                    stkHoldertrade.setTsCode((String) item[i]);
                    break;
                case ANN_DATE:
                    stkHoldertrade.setAnnDate((String) item[i]);
                    break;
                case HOLDER_NAME:
                    stkHoldertrade.setHolderName((String) item[i]);
                    break;
                case HOLDER_TYPE:
                    stkHoldertrade.setHolderType((String) item[i]);
                    break;
                case IN_DE:
                    stkHoldertrade.setInDe((String) item[i]);
                    break;
                case CHANGE_VOL:
                    stkHoldertrade.setChangeVol((Float) item[i]);
                    break;
                case CHANGE_RATIO:
                    stkHoldertrade.setChangeRatio((Float) item[i]);
                    break;
                case AFTER_SHARE:
                    stkHoldertrade.setAfterShare((Float) item[i]);
                    break;
                case AFTER_RATIO:
                    stkHoldertrade.setAfterRatio((Float) item[i]);
                    break;
                case AVG_PRICE:
                    stkHoldertrade.setAvgPrice((Float) item[i]);
                    break;
                case TOTAL_SHARE:
                    stkHoldertrade.setTotalShare((Float) item[i]);
                    break;
                case BEGIN_DATE:
                    stkHoldertrade.setBeginDate((String) item[i]);
                    break;
                case CLOSE_DATE:
                    stkHoldertrade.setCloseDate((String) item[i]);
                    break;
                default:
                    ;
            }
        }
        return stkHoldertrade;
    }

}

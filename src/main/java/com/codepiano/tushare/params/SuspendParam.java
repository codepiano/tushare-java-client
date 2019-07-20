package com.codepiano.tushare.params;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author codepiano
 * @date 2019-07-17T00:39:27.986238
 */
@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class SuspendParam implements Param {

    /**
     * 可选
     * <p>
     * 股票代码(三选一)
     */
    @JsonProperty(value = "ts_code")
    private String tsCode;

    /**
     * 可选
     * <p>
     * 停牌日期(三选一)
     */
    @JsonProperty(value = "suspend_date")
    private String suspendDate;

    /**
     * 可选
     * <p>
     * 复牌日期(三选一)
     */
    @JsonProperty(value = "resume_date")
    private String resumeDate;


}

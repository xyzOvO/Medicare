package com.ruoyi.pill.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 药品信息对象 pill_drug
 *
 * @author xyz66
 * @date 2023-11-07
 */
public class PillDrug extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 药品ID */
    private Long drugId;

    /** 药品名称 */
    @Excel(name = "药品名称")
    private String drugName;

    /** 药品编码 */
    @Excel(name = "药品编码")
    private String drugCode;

    /** 生产厂家 */
    @Excel(name = "生产厂家")
    private Long factoryId;

    /** 药品类型 */
    @Excel(name = "药品类型")
    private String drugType;

    /** 处方类型 */
    @Excel(name = "处方类型")
    private String prescriptionType;

    /** 单位 */
    @Excel(name = "单位")
    private String unit;

    /** 价格 */
    @Excel(name = "价格")
    private Integer price;

    /** 库存量 */
    @Excel(name = "库存量")
    private Integer num;

    /** 预警值 */
    @Excel(name = "预警值")
    private Integer warnValue;

    /** 换算量 */
    @Excel(name = "换算量")
    private Integer conversion;

    /** 状态 */
    @Excel(name = "状态")
    private String status;

    private PillFactory pillFactory;

    public PillFactory getPillFactory() {
        return pillFactory;
    }

    public void setPillFactory(PillFactory pillFactory) {
        this.pillFactory = pillFactory;
    }

    public void setDrugId(Long drugId)
    {
        this.drugId = drugId;
    }

    public Long getDrugId()
    {
        return drugId;
    }
    public void setDrugName(String drugName)
    {
        this.drugName = drugName;
    }

    public String getDrugName()
    {
        return drugName;
    }
    public void setDrugCode(String drugCode)
    {
        this.drugCode = drugCode;
    }

    public String getDrugCode()
    {
        return drugCode;
    }
    public void setFactoryId(Long factoryId)
    {
        this.factoryId = factoryId;
    }

    public Long getFactoryId()
    {
        return factoryId;
    }
    public void setDrugType(String drugType)
    {
        this.drugType = drugType;
    }

    public String getDrugType()
    {
        return drugType;
    }
    public void setPrescriptionType(String prescriptionType)
    {
        this.prescriptionType = prescriptionType;
    }

    public String getPrescriptionType()
    {
        return prescriptionType;
    }
    public void setUnit(String unit)
    {
        this.unit = unit;
    }

    public String getUnit()
    {
        return unit;
    }
    public void setPrice(Integer price)
    {
        this.price = price;
    }

    public Integer getPrice()
    {
        return price;
    }
    public void setNum(Integer num)
    {
        this.num = num;
    }

    public Integer getNum()
    {
        return num;
    }
    public void setWarnValue(Integer warnValue)
    {
        this.warnValue = warnValue;
    }

    public Integer getWarnValue()
    {
        return warnValue;
    }
    public void setConversion(Integer conversion)
    {
        this.conversion = conversion;
    }

    public Integer getConversion()
    {
        return conversion;
    }
    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getStatus()
    {
        return status;
    }
    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("drugId", getDrugId())
            .append("drugName", getDrugName())
            .append("drugCode", getDrugCode())
            .append("factoryId", getFactoryId())
            .append("drugType", getDrugType())
            .append("prescriptionType", getPrescriptionType())
            .append("unit", getUnit())
            .append("price", getPrice())
            .append("num", getNum())
            .append("warnValue", getWarnValue())
            .append("conversion", getConversion())
            .append("status", getStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
                .append("PillFactory",getPillFactory())
            .toString();
    }
}

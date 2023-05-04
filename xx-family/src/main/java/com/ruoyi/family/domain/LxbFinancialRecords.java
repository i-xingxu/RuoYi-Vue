package com.ruoyi.family.domain;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 lxb_financial_records
 * 
 * @author ruoyi
 * @date 2023-04-26
 */
public class LxbFinancialRecords extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /**  */
    private Long id;

    /**  */
    @Excel(name = "")
    private String incomeExpense;

    /**  */
    @Excel(name = "")
    private String expenseCategory;

    /**  */
    @Excel(name = "")
    private BigDecimal amount;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Date billTime;

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setIncomeExpense(String incomeExpense)
    {
        this.incomeExpense = incomeExpense;
    }

    public String getIncomeExpense()
    {
        return incomeExpense;
    }
    public void setExpenseCategory(String expenseCategory)
    {
        this.expenseCategory = expenseCategory;
    }

    public String getExpenseCategory()
    {
        return expenseCategory;
    }
    public void setAmount(BigDecimal amount)
    {
        this.amount = amount;
    }

    public BigDecimal getAmount()
    {
        return amount;
    }
    public void setBillTime(Date billTime)
    {
        this.billTime = billTime;
    }

    public Date getBillTime()
    {
        return billTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("incomeExpense", getIncomeExpense())
                .append("expenseCategory", getExpenseCategory())
                .append("amount", getAmount())
                .append("remark", getRemark())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("billTime", getBillTime())
                .toString();
    }
}

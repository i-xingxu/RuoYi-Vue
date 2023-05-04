package com.ruoyi.family.service;

import java.util.List;
import com.ruoyi.family.domain.LxbFinancialRecords;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2023-04-26
 */
public interface ILxbFinancialRecordsService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public LxbFinancialRecords selectLxbFinancialRecordsById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param lxbFinancialRecords 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<LxbFinancialRecords> selectLxbFinancialRecordsList(LxbFinancialRecords lxbFinancialRecords);

    /**
     * 新增【请填写功能名称】
     * 
     * @param lxbFinancialRecords 【请填写功能名称】
     * @return 结果
     */
    public int insertLxbFinancialRecords(LxbFinancialRecords lxbFinancialRecords);

    /**
     * 修改【请填写功能名称】
     * 
     * @param lxbFinancialRecords 【请填写功能名称】
     * @return 结果
     */
    public int updateLxbFinancialRecords(LxbFinancialRecords lxbFinancialRecords);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteLxbFinancialRecordsByIds(Long[] ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteLxbFinancialRecordsById(Long id);
}

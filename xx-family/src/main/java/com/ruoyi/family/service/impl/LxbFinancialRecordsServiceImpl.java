package com.ruoyi.family.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.family.mapper.LxbFinancialRecordsMapper;
import com.ruoyi.family.domain.LxbFinancialRecords;
import com.ruoyi.family.service.ILxbFinancialRecordsService;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-04-26
 */
@Service
public class LxbFinancialRecordsServiceImpl implements ILxbFinancialRecordsService 
{
    @Autowired
    private LxbFinancialRecordsMapper lxbFinancialRecordsMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public LxbFinancialRecords selectLxbFinancialRecordsById(Long id)
    {
        return lxbFinancialRecordsMapper.selectLxbFinancialRecordsById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param lxbFinancialRecords 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<LxbFinancialRecords> selectLxbFinancialRecordsList(LxbFinancialRecords lxbFinancialRecords)
    {
        return lxbFinancialRecordsMapper.selectLxbFinancialRecordsList(lxbFinancialRecords);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param lxbFinancialRecords 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertLxbFinancialRecords(LxbFinancialRecords lxbFinancialRecords)
    {
        lxbFinancialRecords.setCreateTime(DateUtils.getNowDate());
        return lxbFinancialRecordsMapper.insertLxbFinancialRecords(lxbFinancialRecords);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param lxbFinancialRecords 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateLxbFinancialRecords(LxbFinancialRecords lxbFinancialRecords)
    {
        lxbFinancialRecords.setUpdateTime(DateUtils.getNowDate());
        return lxbFinancialRecordsMapper.updateLxbFinancialRecords(lxbFinancialRecords);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteLxbFinancialRecordsByIds(Long[] ids)
    {
        return lxbFinancialRecordsMapper.deleteLxbFinancialRecordsByIds(ids);
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteLxbFinancialRecordsById(Long id)
    {
        return lxbFinancialRecordsMapper.deleteLxbFinancialRecordsById(id);
    }
}

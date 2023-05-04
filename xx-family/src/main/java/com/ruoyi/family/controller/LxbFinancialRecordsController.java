package com.ruoyi.family.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.common.core.domain.entity.SysUser;
import com.ruoyi.common.core.domain.model.LoginUser;
import com.ruoyi.common.utils.ServletUtils;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.beans.factory.annotation.Autowired;
import com.ruoyi.framework.web.service.TokenService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.family.domain.LxbFinancialRecords;
import com.ruoyi.family.service.ILxbFinancialRecordsService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2023-04-26
 */
@RestController
@RequestMapping("/family/records")
public class LxbFinancialRecordsController extends BaseController
{
    @Autowired
    private ILxbFinancialRecordsService lxbFinancialRecordsService;
    @Autowired
    private TokenService tokenService;

    /**
     * 查询【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('common:records:list')")
    @GetMapping("/list")
    public TableDataInfo list(LxbFinancialRecords lxbFinancialRecords)
    {
        startPage();
        List<LxbFinancialRecords> list = lxbFinancialRecordsService.selectLxbFinancialRecordsList(lxbFinancialRecords);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @PreAuthorize("@ss.hasPermi('common:records:export')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, LxbFinancialRecords lxbFinancialRecords)
    {
        List<LxbFinancialRecords> list = lxbFinancialRecordsService.selectLxbFinancialRecordsList(lxbFinancialRecords);
        ExcelUtil<LxbFinancialRecords> util = new ExcelUtil<LxbFinancialRecords>(LxbFinancialRecords.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @PreAuthorize("@ss.hasPermi('common:records:query')")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(lxbFinancialRecordsService.selectLxbFinancialRecordsById(id));
    }

    /**
     * 新增【请填写功能名称】
     */
//    @PreAuthorize("@ss.hasPermi('common:records:add')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    public AjaxResult add(@RequestBody LxbFinancialRecords lxbFinancialRecords)
    {
        // 用户信息
        LoginUser loginUser = tokenService.getLoginUser(ServletUtils.getRequest());
        // 用户信息
        SysUser user = loginUser.getUser();
        lxbFinancialRecords.setCreateBy(user.getNickName());
        return toAjax(lxbFinancialRecordsService.insertLxbFinancialRecords(lxbFinancialRecords));
    }

    /**
     * 修改【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('common:records:edit')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody LxbFinancialRecords lxbFinancialRecords)
    {
        return toAjax(lxbFinancialRecordsService.updateLxbFinancialRecords(lxbFinancialRecords));
    }

    /**
     * 删除【请填写功能名称】
     */
    @PreAuthorize("@ss.hasPermi('common:records:remove')")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(lxbFinancialRecordsService.deleteLxbFinancialRecordsByIds(ids));
    }
}

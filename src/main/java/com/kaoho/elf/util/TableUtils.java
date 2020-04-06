package com.kaoho.elf.util;

import com.kaoho.elf.common.constant.SysConstant;
import com.kaoho.elf.domains.common.Page;

/**
 * Table Util
 */
public class TableUtils
{
    public static Page getPageDomain()
    {
        Page page = new Page();
        page.setPageNum(ServletUtils.getParameterToInt(SysConstant.PAGE_NUM));
        page.setPageSize(ServletUtils.getParameterToInt(SysConstant.PAGE_SIZE));
        page.setOrderByColumn(ServletUtils.getParameter(SysConstant.ORDER_BY_COLUMN));
        page.setIsAsc(ServletUtils.getParameter(SysConstant.IS_ASC));
        return page;
    }
}

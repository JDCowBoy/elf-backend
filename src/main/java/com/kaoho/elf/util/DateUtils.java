package com.kaoho.elf.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期工具类
 */
public class DateUtils
{
    /**
     * 格式化日期为 年-月-日
     * @param date
     * @return
     */
    public static String dateFormat(Date date)
    {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String timeFormat = simpleDateFormat.format(date);
        return timeFormat;
    }
}

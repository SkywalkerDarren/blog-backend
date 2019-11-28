package com.blog.utils;

import lombok.experimental.UtilityClass;

import java.util.Date;

@UtilityClass
public class CheckTool {
    /**
     * 检查日期
     * @param start
     * @param end
     */
    public static void checkDate(Date start, Date end) {
        if (start == null || end == null) {
            throw new RuntimeException("无时间");
        }
        if (start.after(end)) {
            throw new RuntimeException("起始时间晚于结束时间");
        }
    }
}

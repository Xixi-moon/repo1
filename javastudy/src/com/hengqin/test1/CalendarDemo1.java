package com.hengqin.test1;

import java.util.Calendar;

public class CalendarDemo1 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        StringBuffer strb = new StringBuffer();
        strb.append(cal.get(Calendar.YEAR)).append("年");
        strb.append(cal.get(Calendar.MONTH)+1).append("月");
        strb.append(cal.get(Calendar.DAY_OF_MONTH)).append("日 ");
        strb.append(cal.get(Calendar.HOUR_OF_DAY)).append("时");
        strb.append(cal.get(Calendar.MINUTE)).append("分");
        strb.append(cal.get(Calendar.SECOND)).append("秒");
        System.out.println(strb);
    }
}

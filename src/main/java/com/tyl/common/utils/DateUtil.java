package com.tyl.common.utils;

import java.util.Date;

public class DateUtil {

	public static Date randomDate(Date min,Date max){
		
		long t1 = min.getTime();
		long t2 = max.getTime();
		if(t1>t2) return null;
		double d = Math.random();
		Long x = (long)(d*(t2-t1+1)+t1);
		
		return new Date(x);		
	}
}

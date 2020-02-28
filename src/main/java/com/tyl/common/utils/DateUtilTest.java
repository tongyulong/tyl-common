package com.tyl.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void testRandomDate() {
		
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 1);
		Date date = DateUtil.randomDate(c.getTime(), new Date());
		SimpleDateFormat sf = new SimpleDateFormat("yyyy¡ªMM-dd");
		System.out.println(sf.format(date));
	}

}

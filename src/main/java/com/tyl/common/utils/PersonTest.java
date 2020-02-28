package com.tyl.common.utils;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test1(){
		
		for (int i=0; i<=10000 ; i++) {
					
			Person p = new Person();
			
			p.setName(StringUtil.generateChineseName());
			p.setAge(RandomUtil.random(1, 120));
			p.setAbout(StringUtil.randomChineseString(140));
			
			Calendar c = Calendar.getInstance();
			c.set(2010, 0, 1);
			
			p.setCreated(DateUtil.randomDate(c.getTime(), new Date()));
			System.out.println(p);
		}
	}
}

package com.famsa.eventadmin.util;

import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Seconds;

public class DateTimeUtil {
		
	@SuppressWarnings("deprecation")
	public static long getMilisecondsToNextMinute() {
		Date currentDate = new Date();				
		Date nextDate = new Date(currentDate.getYear(), currentDate.getMonth(), currentDate.getDay(), currentDate.getHours(), currentDate.getMinutes() + 1, 0);
		DateTime dtInit = new DateTime(currentDate);
		DateTime dtEnd = new DateTime(nextDate);
		int seconds = (Seconds.secondsBetween(dtInit, dtEnd).getSeconds() % 60);		
		return seconds * 1000;
	}
}

package com.famsa.eventadmin.util;

import java.util.Date;

public class MessageProcessor {

	public static void printMessage(String messageType, String action) {
		Date currentDate = new Date();
		System.out.println(
				messageType + ": [" + DateTimeParser.toFullDateTimeFormatString(currentDate) + "] - " + action + ".....");
	}
}

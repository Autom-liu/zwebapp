package com.scnu.zwebapp.common.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils extends org.apache.commons.lang3.time.DateUtils {
	
	private DateUtils() {}
	
	private static final ThreadLocal<DateFormat> standarDateFormat = new ThreadLocal<DateFormat>() {
		
		@Override
		protected DateFormat initialValue() {
			return new SimpleDateFormat("yyyy-MM-dd");
		}
		
	};
	
	
	public static String toString(Date date) {
		DateFormat formatter = standarDateFormat.get();
		return formatter.format(date);
	}
	
	public static String toString(Date date, DatePattern pattern) {
		DateFormat formatter = standarDateFormat.get();
		return formatter.format(date);
	}
	
	public enum DatePattern {
		/** yyyy-mm-dd **/
		STANDAR_DATE_FORMATER,
		/** yyyymmdd **/
		SIMPLE_DATE_FORMATER,
		/** yyyy-mm-dd hh:mi:ss **/
		STANDAR_DATETIME_FORAMTER,
		/**yyyymmdd hhmiss **/
		SIMPLE_DATETIME_FORMATER,
		/** hh:mi:ss **/
		STANDAR_TIME_FORMATER,
		/** hhmiss **/
		SIMPLE_TIME_FORMATER,
	}

}

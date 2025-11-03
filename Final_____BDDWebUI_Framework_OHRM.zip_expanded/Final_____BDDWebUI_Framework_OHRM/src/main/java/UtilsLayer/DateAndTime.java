package UtilsLayer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

	public static String getDateTimePattern(String pattern) {
		return LocalDateTime.now().format(DateTimeFormatter.ofPattern(pattern));
	}

	public static String getYear() {
		return getDateTimePattern("yyyy");
	}

	public static String getMonthYear() {
		return getDateTimePattern("MMM-yyyy");
	}

	public static String getDateMonthYear() {
		return getDateTimePattern("dd-MMM-yyyy");
	}

	public static String getDateMonthYearTime() {
		return getDateTimePattern("dd-MMM-yyyy-HHmmss");
	}
}

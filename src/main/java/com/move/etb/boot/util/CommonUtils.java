package com.move.etb.boot.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtils {

	public final static String YYYYMMDDHHMMSSX = "yyyy-MM-dd'T'HH:mm:ss.SSSZZZZ";
	
	public static String getDateToString(Date date,String format) {
		SimpleDateFormat dateFormat = null;
		String result = null;
		dateFormat = new SimpleDateFormat(format);
		result = dateFormat.format(date);
		return result;
	}
	
}

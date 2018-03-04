package edu.xjtu.cdl2bpel.cdl.xpathFunction;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TimeUtil {

	public static long getDeadline(String deadline) 
						throws IllegalArgumentException {
		long ret=0;
		
		if (deadline == null || deadline.trim().length() == 0) {
			throw new IllegalArgumentException("Deadline not specified");
		}
		
		try {
			Date date=null;
			
			try {
				date = m_formatter1.parse(deadline);
			} catch(Exception e2) {
				date = m_formatter2.parse(deadline);
			}
			
			ret = date.getTime();
			
		} catch(Exception e) {
			throw new IllegalArgumentException("Deadline format problem: "+
					e.getMessage());
		}
		
		return(ret);
	}
		
	public static long getDuration(String duration) 
						throws IllegalArgumentException {
		long ret=0;
		
		if (duration == null || duration.length() == 0) {
			throw new IllegalArgumentException("Duration text " +
					"has not been supplied");
			
		} else if (duration.charAt(0) != 'P') {
			throw new IllegalArgumentException(
					"Duration should start with a 'P'");
		} else {
			int num=0;
			int year=0;
			boolean f_year=false;
			int month=0;
			boolean f_month=false;
			int day=0;
			boolean f_day=false;
			int hour=0;
			boolean f_hour=false;
			int minutes=0;
			boolean f_minutes=false;
			int seconds=0;
			boolean f_seconds=false;
			boolean f_tee=false;
			float millisecs=0;
			boolean f_millisecs=false;
			
			for (int i=1; i < duration.length(); i++) {
				switch (duration.charAt(i)) {
				case 'Y':
					if (f_year == false) {
						year = num;
						num = 0;
						f_year = true;
					} else {
						throw new IllegalArgumentException(
								"Attempt to define year more " +
								"than once or out of order");
					}
					if (f_tee) {
						throw new IllegalArgumentException(
								"Year defined after the 'T'");
					}
					if (f_millisecs) {
						throw new IllegalArgumentException(
								"Duration contains a '.' in the year");
					}
					break;
				case 'M':
					if (f_tee == false && f_month == false) {
						month = num;
						num = 0;
						f_month = true;
						f_year = true;
					} else if (f_tee && f_minutes == false) {
						minutes = num;
						num = 0;
						f_minutes = true;
						f_hour = true;
						f_day = true;
						f_month = true;
						f_year = true;
					} else {
						throw new IllegalArgumentException(
								"Attempt to define month more " +
								"than once or out of order");
					}
					if (f_millisecs) {
						throw new IllegalArgumentException(
								"Duration contains a '.' in the month or minutes");
					}
					break;
				case 'D':
					if (f_day == false) {
						day = num;
						num = 0;
						f_day = true;
						f_month = true;
						f_year = true;
					} else {
						throw new IllegalArgumentException(
								"Attempt to define day more " +
								"than once or out of order");
					}
					if (f_tee) {
						throw new IllegalArgumentException(
								"Day defined after the 'T'");
					}
					if (f_millisecs) {
						throw new IllegalArgumentException(
								"Duration contains a '.' in the day");
					}
					break;
				case 'T':
					if (f_hour || f_minutes || f_seconds) {
						throw new IllegalArgumentException(
								"Duration contains a 'T' after " +
								"hour, minute or seconds have been " +
								"defined");
					}
					f_tee = true;
					break;
				case 'H':
					if (f_hour == false) {
						hour = num;
						num = 0;
						f_hour = true;
						f_day = true;
						f_month = true;
						f_year = true;
					} else {
						throw new IllegalArgumentException(
								"Attempt to define hour more " +
								"than once or out of order");
					}
					if (f_millisecs) {
						throw new IllegalArgumentException(
								"Duration contains a '.' in the hour");
					}
					break;
				case 'S':
					if (f_seconds == false) {
						seconds = num;
						num = 0;
						f_seconds = true;
						f_minutes = true;
						f_hour = true;
						f_day = true;
						f_month = true;
						f_year = true;
					} else {
						throw new IllegalArgumentException(
								"Attempt to define seconds more " +
								"than once or out of order");
					}
					break;
				default:
					if (f_seconds) {
						throw new IllegalArgumentException(
								"Duration should not specify anything "+
								"else following the seconds");
					}
					char ch=duration.charAt(i);
					if (Character.isDigit(ch)) {
						int val=Character.getNumericValue(ch);
						
						if (f_millisecs) {
							millisecs += val;
							millisecs /= 10;
						} else {
							num *= 10;
							num += val;
						}
					} else if (ch == '.') {
						f_millisecs = true;
					} else {
						throw new IllegalArgumentException(
								"Duration includes an invalid character '"+
								ch+"'");
					}
				}
			}
			
			// NOTE: This algorithm assumes 365 days per year and
			// 30 days per month. This is not always the case. An
			// alternative algorithm would be to take the current
			// date and add the number of units onto each property
			// (correcting where necessary), so one month may
			// vary in days depending on which is the current month.
			ret = ((((((((((long)year*365)+(month*30)+day)*
						24)+hour)*60)+minutes)*
						60)+seconds)*1000)+(long)(millisecs*1000);
		}
		
		if (logger.isLoggable(Level.FINE)) {
			logger.fine("Duration '"+duration+"' is "+ret+" milliseconds");
		}
		
		return(ret);
	}

    private static Logger logger = Logger.getLogger("edu.xjtu.cdl2bpel.cdl.xpath");
    
	private static SimpleDateFormat m_formatter1=
		new SimpleDateFormat("yyyy'-'MM'-'dd'T'HH':'mm':'ss");
	private static SimpleDateFormat m_formatter2=
		new SimpleDateFormat("yyyy'-'MM'-'dd'T'HH':'mm':'ssZ");
}

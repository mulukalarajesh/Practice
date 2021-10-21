package org.java.practice;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateCheck24 {

	
	
	static Date date=new Date();
	
	
	
	public static void main(String[] args) {
		/*System.out.println(date);
		Instant now = Instant.now();
		System.out.println(now);
		Boolean isWithinPrior24Hours = 
		    ( ! date.toInstant().isBefore( now.minus( 24 , ChronoUnit.HOURS) ) ) 
		    && 
		    ( date.toInstant().isBefore( now ) 
		) ;
		
		System.out.println(isWithinPrior24Hours);
		*/
		
		
		
		
		
		
		try {
			
			
			Date date1 = Calendar.getInstance().getTime();  
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");  
			String strDate = dateFormat.format(date1);  

		    date1 = dateFormat.parse(strDate);
		    System.out.println(date1.toString()); // Wed Dec 04 00:00:00 CST 2013

		    String output = dateFormat.format(date1);
		    System.out.println(output); // 2013-12-04
		    
		    Date date=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").parse(output);  
		    System.out.println(date);

			Instant now = Instant.now();

			Boolean isWithinPrior24Hours = 
				    ( ! date.toInstant().isBefore( now.minus( 24 , ChronoUnit.HOURS) ) ) 
				    && 
				    ( date.toInstant().isBefore( now ) 
				) ;
				
				System.out.println(isWithinPrior24Hours);
			
		    
		} 
		catch (ParseException e) {
		    e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
}

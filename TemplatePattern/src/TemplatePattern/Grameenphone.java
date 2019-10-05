package TemplatePattern;

import java.util.Calendar;

public class Grameenphone extends MobileOperator {
	
	 
	void calcCallRate(double time)
	{
		double peakRate=0.50;
		double nonPeakRate=1.00;
		
		Calendar cal = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		 
		
		
		cal.set(Calendar.HOUR_OF_DAY,13);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		
		boolean after = Calendar.getInstance().after(cal);
		
		cal2.set(Calendar.HOUR_OF_DAY,19);
		cal2.set(Calendar.MINUTE, 0);
		cal2.set(Calendar.SECOND, 0);
		cal2.set(Calendar.MILLISECOND, 0);
		 
		 
		 
		boolean before = Calendar.getInstance().before(cal2);
		
		 
		double totalCallRate = 0.0;
		
		if (after) {
		    if(before) {
		    	
		    	 totalCallRate=peakRate*time;
		    }
		
		
		else
		{
			  totalCallRate=nonPeakRate*time;
		}
		}
		 
		
		 System.out.println("Total Call Rate for GP: "+ totalCallRate);
	}

}

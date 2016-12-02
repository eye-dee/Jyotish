package com.erebor.app;
import org.joda.time.*;

public class App {
    public static void main( String[] args ){
   		final int ZONE_AMOUNT = 2;
   		final int TESTS_AMOUNT = 3;
    	{
    		DateTimeAll[] dt = new DateTimeAll[ZONE_AMOUNT];
	    	try {
		    	dt[0] = new DateTimeAll(new DateTime(), "Europe/Moscow");
		    	dt[1] = new DateTimeAll(new DateTime(), "America/New_York");
		    } catch (IllegalArgumentException iae){
		    	System.out.println(iae.getMessage());
		    	return;
		    }
	    	//DateTimeFriday dtf = new DateTimeFriday(new DateTime());

		    for (int j = 0; j < ZONE_AMOUNT; ++j){
			    System.out.println("dt[" + j + "]");
		    	for (int i = 0; i < TESTS_AMOUNT; ++i){
		    		DateTime temp = dt[j].getNextDate();
		    		if (temp.dayOfYear().get() != 256) {
		    			System.out.println("Something bad " + temp.dayOfYear().get());
		    		} else {
		    			System.out.println(temp.toString());
		    		}
		    	}
		    	for (int i = 0; i < TESTS_AMOUNT; ++i){
		    		DateTime temp = dt[j].getPreviousDate();
		    		if (temp.dayOfYear().get() != 256) {
		    			System.out.println("Something bad " + temp.dayOfYear().get());
		    		} else {
		    			System.out.println(temp.toString());
		    		}
		    	}
		    }
	    }


	    {
    		DateTimeFriday[] dt = new DateTimeFriday[ZONE_AMOUNT];
	    	try {
		    	dt[0] = new DateTimeFriday(new DateTime(), "Europe/Moscow");
		    	dt[1] = new DateTimeFriday(new DateTime(), "America/New_York");
		    } catch (IllegalArgumentException iae){
		    	System.out.println(iae.getMessage());
		    	return;
		    }

		    for (int j = 0; j < ZONE_AMOUNT; ++j){
			    System.out.println("dt[" + j + "]");
		    	for (int i = 0; i < TESTS_AMOUNT; ++i){
		    		DateTime temp = dt[j].getNextDate();
		    		if (temp.dayOfYear().get() != 256 || temp.dayOfWeek().get() != 5) {
		    			System.out.println("Something bad " + temp.dayOfYear().get() + ' ' + temp.dayOfWeek().get());
		    		} else {
		    			System.out.println(temp.toString());
		    		}
		    	}
		    	for (int i = 0; i < TESTS_AMOUNT; ++i){
		    		DateTime temp = dt[j].getPreviousDate();
		    		if (temp.dayOfYear().get() != 256 || temp.dayOfWeek().get() != 5) {
		    			System.out.println("Something bad " + temp.dayOfYear().get() + ' ' + temp.dayOfWeek().get());
		    		} else {
		    			System.out.println(temp.toString());
		    		}
		    	}
		    }
	    }
    }
}

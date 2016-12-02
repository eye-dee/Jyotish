package com.erebor.app;
import org.joda.time.*;

public abstract class DateTimeIterator {
   private DateTime currentDate;

   public DateTimeIterator(DateTime currentDate) {
       this.currentDate = currentDate;
   }

   public abstract DateTime getNextDate();
   public abstract DateTime getPreviousDate();
}
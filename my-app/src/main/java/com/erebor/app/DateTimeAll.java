package com.erebor.app;

import org.joda.time.*;

public class DateTimeAll extends DateTimeIterator{
	public DateTimeAll(DateTime currentDate, String dateZone) {
		super(currentDate);
		_currentIterator = currentDate.withZone(DateTimeZone.forID(dateZone)).
			withDayOfYear(256).
			withHourOfDay(18).
			withMinuteOfHour(0).
			withSecondOfMinute(0).
			withMillisOfSecond(0);
	}
	public DateTime getNextDate(){
		//return (_currentIterator = _currentIterator.plusYears(1));
		/*_currentIterator = _currentIterator.plusYears(1);

		int cur = _currentIterator.dayOfYear().get();
		int delta;
		if ( (delta = 256 - cur) > 0){
			_currentIterator = _currentIterator.plusDays(delta);
		} else {
			_currentIterator = _currentIterator.minusDays(-delta);
		}

		return _currentIterator;*/
		return (_currentIterator = _currentIterator.plusYears(1).withDayOfYear(256));
	}
	public DateTime getPreviousDate(){
		//return (_currentIterator = _currentIterator.minusYears(1));
		/*_currentIterator = _currentIterator.minusYears(1);

		int cur = _currentIterator.dayOfYear().get();
		int delta;
		if ( (delta = 256 - cur) > 0){
			_currentIterator = _currentIterator.plusDays(delta);
		} else {
			_currentIterator = _currentIterator.minusDays(-delta);
		}

		return _currentIterator;*/
		return (_currentIterator = _currentIterator.minusYears(1).withDayOfYear(256));
	}
	DateTime _currentIterator;
}
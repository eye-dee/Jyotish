package com.erebor.app;

import org.joda.time.*;

public class DateTimeFriday extends DateTimeIterator{
	public DateTimeFriday(DateTime currentDate, String dateZone) {
		super(currentDate);
		_currentIterator = currentDate.withZone(DateTimeZone.forID(dateZone)).
			withDayOfYear(256).
			withHourOfDay(18).
			withMinuteOfHour(0).
			withSecondOfMinute(0).
			withMillisOfSecond(0);

		_currentIterator = getNextDate();
	}
	private boolean isFriday(){
		return (_currentIterator.dayOfWeek().get() == 5);
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
		_currentIterator = _currentIterator.plusYears(1).withDayOfYear(256);
		while (!isFriday()){
			_currentIterator = _currentIterator.plusYears(1).withDayOfYear(256);
		}
		return _currentIterator;
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
		_currentIterator = _currentIterator.minusYears(1).withDayOfYear(256);
		while (!isFriday()){
			_currentIterator = _currentIterator.minusYears(1).withDayOfYear(256);
		}
		return _currentIterator;
	}
	DateTime _currentIterator;
}
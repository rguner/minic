package com.guner.java8calisma;

import static java.lang.System.*;
import static java.time.Month.*;
import static java.time.temporal.ChronoUnit.*;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		LocalDateTime meeting, flight, courseStart, courseEnd;
		meeting = LocalDateTime.of(2014, MARCH, 21, 13, 30);
		out.println("Meeting is on: " + meeting);
		LocalDate flightDate = LocalDate.of(2014, MARCH, 31);
		LocalTime flightTime = LocalTime.of(21, 45);
		flight = LocalDateTime.of(flightDate, flightTime);
		out.println("Flight leaves: " + flight);
		courseStart = LocalDateTime.of(2014, MARCH, 24, 9, 00);
		courseEnd = courseStart.plusDays(4).plusHours(8);
		out.println("Course starts: " + courseStart);
		out.println("Course ends: " + courseEnd);
		long courseHrs = (courseEnd.getHour() - courseStart.getHour()) * (courseStart.until(courseEnd, DAYS) + 1);
		out.println("Course is: " + courseHrs + " hours long.");

		out.println("Instant.");

		Instant now = Instant.now();
		try {
			Thread.sleep(0, 1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // long milliseconds, int nanoseconds
		Instant later = Instant.now();
		System.out.println("now is before later? " + now.isBefore(later));
		System.out.println("Now: " + now);
	}
}

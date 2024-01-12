package com.nt.sbeans;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {

	@Autowired // field injection
	private LocalDateTime dateTime;// HAS-A property

	public String generateMessage(String user) {

		int hour = dateTime.getHour();

		if (hour < 12)
			return " Good Morning " + user;
		else if (hour < 16)
			return " Good AfterNoon " + user;
		else if (hour < 20)
			return "Good evening " + user;
		else
			return " GoodNight " + user;

	}

}

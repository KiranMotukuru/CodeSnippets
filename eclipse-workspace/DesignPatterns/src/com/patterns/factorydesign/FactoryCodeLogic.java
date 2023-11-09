package com.patterns.factorydesign;

import com.patterns.factorydesign.clients.Email;
import com.patterns.factorydesign.clients.Mobile;
import com.patterns.factorydesign.clients.Sms;

public class FactoryCodeLogic {

	public Notification createNotification(String mode) {

		if (mode.equalsIgnoreCase("sms")) {
			Notification n = new Sms();
			return n;

		}

		if (mode.equalsIgnoreCase("Email")) {
			Notification n = new Email();
			return n;

		}

		if (mode.equalsIgnoreCase("mobile")) {
			Notification n = new Mobile();
			return n;

		}
		return null;
	}
}

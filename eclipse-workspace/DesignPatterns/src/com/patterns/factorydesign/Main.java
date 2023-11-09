package com.patterns.factorydesign;

public class Main {

	public static void main(String[] args) {

		FactoryCodeLogic f = new FactoryCodeLogic();
		
		Notification n = f.createNotification("sms");
		Notification ff = f.createNotification("email");
		Notification fff = f.createNotification("mobile");
		n.notifi();
		ff.notifi();
       fff.notifi();
	}

}

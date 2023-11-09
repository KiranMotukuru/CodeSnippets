package com.patterns.factorydesign.clients;

import com.patterns.factorydesign.Notification;

public class Mobile  implements Notification{

	@Override
	public void notifi() {
		System.out.println("Notification Though Mobile");

		
	}

}

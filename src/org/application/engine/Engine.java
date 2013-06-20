package org.application.engine;

import org.application.orders.Order;

public class Engine {
	
	/**
	 * Creates a new instance for the Order class.
	 */
	public Order handleOrder = new Order();
	
	/**
	 * Creates a new getter instance for the Engine class.
	 */
	public static Engine engine = new Engine();
	public static Engine getEngine() {
		return engine;
	}
	
	/**
	 * Sends the message to the specific android.
	 * @param s
	 */
	public static void sendAndroidMessage(String s) {
		System.out.println(s);
	}

}

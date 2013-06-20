package org.application.orders;

import java.util.HashMap;

import org.application.engine.DisplayLog;
import org.application.engine.Engine;

public class Order {
	
	/**
	 * Creates a new instance of the DisplayLog class.
	 */
	private DisplayLog displayLog;
	
	/**
	 * The maximum amount of orders the restaurants can have at a time.
	 */
	private static final int MAXIMUM_ORDER_AMOUNT = 12;
	
	/**
	 * Gets the order amount.
	 */
	public static int orderAmount;
	public static int getOrderAmount() {
		return orderAmount;
	}
	
	/**
	 * Places a new order.
	 */
	public int order;
	public int getOrder() {
		return order;
	}

	/**
	 * The price of the order.
	 */
	public int price;
	public int getPrice() {
		return price;
	}
	
	/**
	 * Gets the item name.
	 */
	public String itemName;
	public String getItemName() {
		return itemName;
	}
	
	/**
	 * Creates a new hashmap to hold all the restaurants: name, order amount.
	 */
	public static HashMap restaurants = new HashMap();
	static {
		restaurants.put("Indian", getOrderAmount());
		restaurants.put("Chinese", getOrderAmount());
		restaurants.put("McDonalds", getOrderAmount());
		restaurants.put("Burger King", getOrderAmount());
		restaurants.put("KFC", getOrderAmount());	
	}
	
	/**
	 * Handles the person(s) order.
	 */
	public void handlePlayerOrders() {
		if(restaurants.size() >= MAXIMUM_ORDER_AMOUNT) {
			Engine.sendAndroidMessage("This restaurant is currently full, we will process your order soon.");
		} else {
			displayLog.runOrders();
		}	
	}
	
}

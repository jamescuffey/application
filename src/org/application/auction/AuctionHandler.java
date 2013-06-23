package org.application.auction;

public class AuctionHandler {
	
	/**
	 * The integers to hold both the price and amount of items;
	 */
	int price, amount;
	
	/**
	 * Our constructor for the AuctionHandler class.
	 * @param price
	 * @param amount
	 */
	public AuctionHandler(int price, int amount) {
		setPrice(price);
		setAmount(amount);
	}
	
	/**
	 * Gets the price.
	 * @return price
	 */
	public int getPrice() {
		return price;
	}
	
	/**
	 * Sets the price.
	 * @param price
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	/**
	 * Gets the amount of items.
	 * @return amount
	 */
	public int getAmount() {
		return amount;
	}
	
	/**
	 * Sets the amount of items.
	 * @param amount
	 */
	public void setAmount(int amount) {
		this.amount = amount;
	}

}

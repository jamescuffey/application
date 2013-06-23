package org.application;

import java.util.LinkedList;
import java.util.Random;

import org.application.auction.AuctionHandler;

public class Server {
	
	private static LinkedList<AuctionHandler> auctions;

	/**
	 * Main run entry point.
	 * @param args
	 */
	public static void main(String[] args) {
		auctions = new LinkedList<AuctionHandler>();
		Random random = new Random();
		
		for(int i = 0;  i < Constants.AUCTION_AMOUNT; i++) {
			int price = random.nextInt(Constants.MINIMUM_PRICE + 2);
			int amount = random.nextInt(Constants.MINIMUM_AMOUNT + 2);
			auctions.add(new AuctionHandler(price, amount));
			
			System.out.println("Auction: " + auctions.size());
			System.out.println("Amount of items sold: " + amount + " with a price of: " + price);
		}
	}
}

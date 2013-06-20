package org.application.engine;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.application.orders.Order;

public class DisplayLog {

	/**
	 * Runs through the orders and prints them to a text document.
	 */
	public static void runOrders() {
		try {
			File file = new File("/users/James/orders.txt");
			
			if(!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter write = new FileWriter(file.getAbsoluteFile());
			BufferedWriter writer = new BufferedWriter(write);
			
			writer.write(Order.getOrderAmount());
			writer.close();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}

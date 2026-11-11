/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodbridge.fooddonations;

import java.util.ArrayList;

/**
 *
 * @author SWitkowski
 */
public class storeDonations {
	// Holds all donations in ArrayList.
	// Everything is static to keep data when a GUI window is disposed.

	/**
	 * TODO
	 * saving & reading files
	 * something else idk
	 */
	
	// List of every donation submitted
	private static final ArrayList<FoodDonations> donations = new ArrayList<>();

	// Next unused donationID (starts at 1)
	private static int nextID = 1;

	// Returns a new ID and moves counter up by one
	public static int nextID() {
		return nextID++;
	}

	// Saves donation to list
	public static void add(FoodDonations d) {
		donations.add(d);
	}

	// Returns all saved donations (use for preview donations)
	public static ArrayList<FoodDonations> getAll() {
		return donations;
	}
}

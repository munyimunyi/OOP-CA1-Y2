/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodbridge.fooddonations;

/**
 *
 * @author SWitkowski
 * 
 * Donation.java - parent class for donations
 */
public class Donation implements FileSaveable {
	private int donationID;
	private String donorName;
	private String donationDate;

	public Donation(int donationID, String donorName, String donationDate) {
		this.donationID = donationID;
		this.donorName = donorName;
		this.donationDate = donationDate;
	}

	public int getDonationID() {
		return donationID;
	}

	public String getDonorName() {
		return donorName;
	}

	public String getDonationDate() {
		return donationDate;
	}
	
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	
	public String getItemName() {
		return "General donation";
	}
	
	public String getSummary() {
		// return with " | " to keep summary clean with multiple lines
		return "#" + donationID + " | " + donorName + " | " + donationDate;
	}
	
	@Override
	public String toFileLine() {
		return donationID + "|" + donorName + "|" + donationDate;
	}
}

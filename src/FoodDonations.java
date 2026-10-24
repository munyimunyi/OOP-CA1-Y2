/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SWitkowski
 */
public class FoodDonations {
	private int donationID;
	private String donorName; // name of person or restaurant
	private String foodName; // "Rice", "Chicken", etc.
	private String foodCategory; // canned, dry, frozen, etc.
	private String donationDate; // date of donation
	private String unit; // kg, meals, grams, boxes, etc.
	private String expiryDate; // when expires (could be used with donationDate)
	private int quantity; // number of units (kg, boxes, etc.)

	public FoodDonations(int donationID, String donorName, String foodName, String foodCategory, String donationDate, String unit, String expiryDate, int quantity) {
		this.donationID = donationID;
		this.donorName = donorName;
		this.foodName = foodName;
		this.foodCategory = foodCategory;
		this.donationDate = donationDate;
		this.unit = unit;
		this.expiryDate = expiryDate;
		this.quantity = quantity;
	}

	public int getDonationID() {
		return donationID;
	}

	public void setDonationID(int donationID) {
		this.donationID = donationID;
	}

	public String getDonorName() {
		return donorName;
	}

	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getFoodCategory() {
		return foodCategory;
	}

	public void setFoodCategory(String foodCategory) {
		this.foodCategory = foodCategory;
	}

	public String getDonationDate() {
		return donationDate;
	}

	public void setDonationDate(String donationDate) {
		this.donationDate = donationDate;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if (quantity >= 0) {
			this.quantity = quantity;
		}
	}
	
	
	
}
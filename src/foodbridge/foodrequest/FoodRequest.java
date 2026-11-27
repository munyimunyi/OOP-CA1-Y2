/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Ethan
 */

package foodbridge.foodrequest;


public class FoodRequest implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    // Data members
    private int requestId;
    private int donationId;
    private String requesterName;
    private String foodType;
    private int quantity;
    private String status;

    // Constructor
    public FoodRequest(int requestId, int donationId,
            String requesterName, String foodType,
            int quantity) {

        this.requestId = requestId;
        this.donationId = donationId;
        this.requesterName = requesterName;
        this.foodType = foodType;
        this.quantity = quantity;
        this.status = "Pending";
    }

    // Getters
    public int getRequestId() {
        return requestId;
    }

    public int getDonationId() {
        return donationId;
    }

    public String getRequesterName() {
        return requesterName;
    }

    public String getFoodType() {
        return foodType;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getStatus() {
        return status;
    }

    // Setter
    public void setStatus(String status) {
        this.status = status;
    }

    // Display request information
    public String getDetails() {
        return "Request ID: " + requestId
                + "\nDonation ID: " + donationId
                + "\nName: " + requesterName
                + "\nFood Type: " + foodType
                + "\nQuantity: " + quantity
                + "\nStatus: " + status;
    }
}

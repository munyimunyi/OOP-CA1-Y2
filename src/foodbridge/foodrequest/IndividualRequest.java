/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Ethan
 */

package foodbridge.foodrequest;

public class IndividualRequest extends FoodRequest {

    private int householdSize;

    // Constructor
    public IndividualRequest(int requestId, int donationId,
            String requesterName, String foodType,
            int quantity, int householdSize) {

        super(requestId, donationId, requesterName,
                foodType, quantity);

        this.householdSize = householdSize;
    }

    // Getter
    public int getHouseholdSize() {
        return householdSize;
    }

    // Polymorphism - overriding parent method
    @Override
    public String getDetails() {
        return super.getDetails()
                + "\nHousehold Size: " + householdSize;
    }
}


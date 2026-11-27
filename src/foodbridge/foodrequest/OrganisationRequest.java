/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Ethan
 */

package foodbridge.foodrequest;

public class OrganisationRequest extends FoodRequest {

    private String organisationType;

    // Constructor
    public OrganisationRequest(int requestId, int donationId,
            String requesterName, String foodType,
            int quantity, String organisationType) {

        super(requestId, donationId, requesterName,
                foodType, quantity);

        this.organisationType = organisationType;
    }

    // Getter
    public String getOrganisationType() {
        return organisationType;
    }

    // Polymorphism - overriding parent method
    @Override
    public String getDetails() {
        return super.getDetails()
                + "\nOrganisation Type: " + organisationType;
    }
}

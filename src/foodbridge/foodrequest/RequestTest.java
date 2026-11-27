/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Ethan
 */

package foodbridge.foodrequest;

public class RequestTest {

    public static void main(String[] args) throws Exception {

        RequestManager manager = new RequestManager();

        // Create two different types of requests
        FoodRequest request1 = new IndividualRequest(
                1, 101, "John", "Bread", 2, 4);

        FoodRequest request2 = new OrganisationRequest(
                2, 102, "Food Bank", "Vegetables", 10,
                "Charity");

        // Add requests
        manager.addRequest(request1);
        manager.addRequest(request2);

        System.out.println("ALL REQUESTS:");
        System.out.println(manager.displayRequests());

        // Search
        System.out.println("SEARCH REQUEST 1:");
        FoodRequest found = manager.searchRequest(1);

        if (found != null) {
            System.out.println(found.getDetails());
        }

        // Update status
        manager.updateStatus(1, "Approved");

        // Delete request 2
        manager.deleteRequest(2);

        System.out.println("\nAFTER UPDATE AND DELETE:");
        System.out.println(manager.displayRequests());
        
        // Save requests to a file
        manager.saveRequests("requests.dat");

        System.out.println("Requests saved successfully!");

        // Create a new manager and load saved requests
        RequestManager loadedManager = new RequestManager();

        loadedManager.loadRequests("requests.dat");

        System.out.println("LOADED REQUESTS:");
        System.out.println(loadedManager.displayRequests());

    }
}

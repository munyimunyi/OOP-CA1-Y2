/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Ethan
 */

package foodbridge.foodrequest;

import java.util.ArrayList;

import java.io.*;



public class RequestManager implements RequestFileStorage {


    private ArrayList<FoodRequest> requests;

    // Constructor
    public RequestManager() {
        requests = new ArrayList<>();
    }

    // Add a new request
    public void addRequest(FoodRequest request) {
        requests.add(request);
    }

    // Display all requests
    public String displayRequests() {
        String result = "";

        for (FoodRequest request : requests) {
            result += request.getDetails() + "\n\n";
        }

        return result;
    }

    // Search for a request using its ID
    public FoodRequest searchRequest(int id) {
        for (FoodRequest request : requests) {
            if (request.getRequestId() == id) {
                return request;
            }
        }

        return null;
    }

    // Delete a request using its ID
    public boolean deleteRequest(int id) {
        FoodRequest request = searchRequest(id);

        if (request != null) {
            requests.remove(request);
            return true;
        }

        return false;
    }

    // Update request status
    public boolean updateStatus(int id, String status) {
        FoodRequest request = searchRequest(id);

        if (request != null) {
            request.setStatus(status);
            return true;
        }

        return false;
    }
    // Save all food requests to a file
    @Override
    public void saveRequests(String filename) throws IOException {

        try (ObjectOutputStream output =
                new ObjectOutputStream(
                        new FileOutputStream(filename))) {

            output.writeObject(requests);
        }
    }

    // Load food requests from a file
    @Override
    @SuppressWarnings("unchecked")
    public void loadRequests(String filename)
            throws IOException, ClassNotFoundException {

        try (ObjectInputStream input =
                new ObjectInputStream(
                        new FileInputStream(filename))) {

            requests = (ArrayList<FoodRequest>) input.readObject();
        }
    }
}



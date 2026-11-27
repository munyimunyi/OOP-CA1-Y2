/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
/**
 *
 * @author Ethan
 */

package foodbridge.foodrequest;

import java.io.IOException;

public interface RequestFileStorage {

    void saveRequests(String filename) throws IOException;

    void loadRequests(String filename)
            throws IOException, ClassNotFoundException;
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package volunteer;

/**
 *
 * @author Uchej
 */
public class Volunteer {
    
    private String volunteerName;
    private String vollunteerDOB;
    private String volunteerAddress;
    private String collectionPoint;
    private String deliveryLocation;

    public Volunteer(String volunteerName, String vollunteerDOB, String volunteerAddress, String collectionPoint, String deliveryLocation) {
        this.volunteerName = volunteerName;
        this.vollunteerDOB = vollunteerDOB;
        this.volunteerAddress = volunteerAddress;
        this.collectionPoint = collectionPoint;
        this.deliveryLocation = deliveryLocation;
    }

    public String getVolunteerName() {
        return volunteerName;
    }

    public void setVolunteerName(String volunteerName) {
        this.volunteerName = volunteerName;
    }

    public String getVollunteerDOB() {
        return vollunteerDOB;
    }

    public void setVollunteerDOB(String vollunteerDOB) {
        this.vollunteerDOB = vollunteerDOB;
    }

    public String getVolunteerAddress() {
        return volunteerAddress;
    }

    public void setVolunteerAddress(String volunteerAddress) {
        this.volunteerAddress = volunteerAddress;
    }

    public String getCollectionPoint() {
        return collectionPoint;
    }

    public void setCollectionPoint(String collectionPoint) {
        this.collectionPoint = collectionPoint;
    }

    public String getDeliveryLocation() {
        return deliveryLocation;
    }

    public void setDeliveryLocation(String deliveryLocation) {
        this.deliveryLocation = deliveryLocation;
    }
    
    



    
}

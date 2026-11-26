/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package foodbridge.volunteers;

/**
 *
 * @author Uchej
 */
public class Award {
    private String awardName;
    private int requiredDeliveries;

    public Award(String awardName,
                 int requiredDeliveries) {

        this.awardName = awardName;
        this.requiredDeliveries = requiredDeliveries;
    }
}

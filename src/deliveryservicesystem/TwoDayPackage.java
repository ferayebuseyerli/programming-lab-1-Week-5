/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliveryservicesystem;

/**
 *
 * @author Asus
 */

public class TwoDayPackage extends Package {
    private double flatFee; 

    public TwoDayPackage(String senderName, String senderAddress, String senderCity, String senderState, String senderZip,
                         String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZip,
                         double weight, double costPerOunce, double flatFee) {
        
        super(senderName, senderAddress, senderCity, senderState, senderZip, 
              recipientName, recipientAddress, recipientCity, recipientState, recipientZip, weight, costPerOunce);
        
        this.flatFee = (flatFee > 0.0) ? flatFee : 0.0;
    }

    
    @Override
    public double calculateCost() {
        return super.calculateCost() + flatFee;
    }
    
}



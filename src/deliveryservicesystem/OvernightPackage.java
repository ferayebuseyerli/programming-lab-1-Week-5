/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliveryservicesystem;

/**
 *
 * @author Asus
 */

public class OvernightPackage extends Package{
    private double additionalFeePerOunce; 

    public OvernightPackage(String senderName, String senderAddress, String senderCity, String senderState, String senderZip,
                            String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZip,
                            double weight, double costPerOunce, double additionalFeePerOunce) {
        
        super(senderName, senderAddress, senderCity, senderState, senderZip, 
              recipientName, recipientAddress, recipientCity, recipientState, recipientZip, weight, costPerOunce);
        
        this.additionalFeePerOunce = (additionalFeePerOunce > 0.0) ? additionalFeePerOunce : 0.0;
    }

   
    @Override
    public double calculateCost() {
        return super.calculateCost() + (getWeight() * additionalFeePerOunce);
    }
    
}



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package deliveryservicesystem;

/**
 *
 * @author Asus
 */

public class Package {
    private String senderName;
    private String senderAddress;
    private String senderCity;
    private String senderState;
    private String senderZip;
    
    private String recipientName;
    private String recipientAddress;
    private String recipientCity;
    private String recipientState;
    private String recipientZip;
    
    private double weight; 
    private double costPerOunce; 

    
    public Package(String senderName, String senderAddress, String senderCity, String senderState, String senderZip,
                   String recipientName, String recipientAddress, String recipientCity, String recipientState, String recipientZip,
                   double weight, double costPerOunce) {
        
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderCity = senderCity;
        this.senderState = senderState;
        this.senderZip = senderZip;
        
        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.recipientCity = recipientCity;
        this.recipientState = recipientState;
        this.recipientZip = recipientZip;
        
        
        this.weight = (weight > 0.0) ? weight : 0.0;
        this.costPerOunce = (costPerOunce > 0.0) ? costPerOunce : 0.0;
    }

    public double getWeight() {
        return weight;
    }

    public double getCostPerOunce() {
        return costPerOunce;
    }

    
    public double calculateCost() {
        return weight * costPerOunce;
    }
    public void displayInfo() {
        System.out.println("SENDER:");
        System.out.println(senderName);
        System.out.println(senderAddress);
        System.out.println(senderCity + ", " + senderState + " " + senderZip);
        
        System.out.println("\nRECIPIENT:");
        System.out.println(recipientName);
        System.out.println(recipientAddress);
        System.out.println(recipientCity + ", " + recipientState + " " + recipientZip);
        
        System.out.println("\nPackage weight: " + weight + " ons");
  


}
}



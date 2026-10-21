/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package deliveryservicesystem;

/**
 *
 * @author Asus
 */

public class DeliveryServiceSystem {


    public static void main(String[] args) {
    Package standardPackage = new Package(
        "John Doe", "123 Maple Street", "New York", "NY", "10001",
        "Jane Smith", "456 Oak Avenue", "Los Angeles", "CA", "90001",
        10.5, 2.0); 

    TwoDayPackage twoDayPackage = new TwoDayPackage(
        "Alice Johnson", "789 Pine Road", "Chicago", "IL", "60601",
        "Bob Brown", "321 Cedar Blvd", "Houston", "TX", "77001",
        10.5, 2.0, 15.0); 

    OvernightPackage overnightPackage = new OvernightPackage(
        "Charlie Davis", "555 Elm Street", "Miami", "FL", "33101",
        "Diana Evans", "999 Birch Court", "Seattle", "WA", "98101",
        10.5, 2.0, 1.5); 

    System.out.println("=========================================");
    System.out.println("STANDARD PACKAGE INFORMATION");
    System.out.println("=========================================");
    standardPackage.displayInfo();
    System.out.println("Total Shipping Cost: $" + standardPackage.calculateCost() + "\n");

    System.out.println("=========================================");
    System.out.println("TWO-DAY PACKAGE INFORMATION (With Flat Fee)");
    System.out.println("=========================================");
    twoDayPackage.displayInfo();
    System.out.println("Total Shipping Cost: $" + twoDayPackage.calculateCost() + "\n");

    System.out.println("=========================================");
    System.out.println("OVERNIGHT PACKAGE INFORMATION (Extra Fee Per Ounce)");
    System.out.println("=========================================");
    overnightPackage.displayInfo();
    System.out.println("Total Shipping Cost: $" + overnightPackage.calculateCost() + "\n");
}

    }
    

    
    


    
    


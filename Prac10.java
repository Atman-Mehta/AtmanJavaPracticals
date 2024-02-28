//  Write a program to demonstrate use of interfaces.

package JavaPracticals;

//Define an interface for DiplomaticStatus
interface DiplomaticStatus {
 void displayDiplomaticStatus();
}

//Implement the interface for FriendlyStatus
class FriendlyStatus implements DiplomaticStatus {
 @Override
 public void displayDiplomaticStatus() {
     System.out.println("Diplomatic Status: Friendly");
 }
}

//Implement the interface for NeutralStatus
class NeutralStatus implements DiplomaticStatus {
 @Override
 public void displayDiplomaticStatus() {
     System.out.println("Diplomatic Status: Neutral");
 }
}

//Implement the interface for HostileStatus
class HostileStatus implements DiplomaticStatus {
 @Override
 public void displayDiplomaticStatus() {
     System.out.println("Diplomatic Status: Hostile");
 }
}

//Class representing a country
class Country3 {
 private String name;
 private DiplomaticStatus diplomaticStatus;

 public Country3(String name, DiplomaticStatus diplomaticStatus) {
     this.name = name;
     this.diplomaticStatus = diplomaticStatus;
 }

 public void displayCountryInfo() {
     System.out.println("Country: " + name);
     diplomaticStatus.displayDiplomaticStatus();
 }
}

//Main class to demonstrate the use of interfaces for diplomatic status
public class Prac10 {
 public static void main(String[] args) {
     // Create instances of countries with different diplomatic statuses
     Country3 usa = new Country3("USA", new FriendlyStatus());
     Country3 india = new Country3("India", new NeutralStatus());
     Country3 russia = new Country3("Russia", new HostileStatus());

     // Display country information including diplomatic status
     usa.displayCountryInfo();
     india.displayCountryInfo();
     russia.displayCountryInfo();
 }
}

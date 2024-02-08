//  Write a Java program that implements runtime polymorphism.

package JavaPracticals;

//Base class representing a country
class Country1 {
 protected String name;

 public Country1(String name) {
     this.name = name;
 }

 public void displayDiplomaticStatus() {
     System.out.println("Diplomatic status of " + name + ":");
 }
}

//Subclass representing an allied country
class AlliedCountry extends Country1 {
 private String alliance;

 public AlliedCountry(String name, String alliance) {
     super(name);
     this.alliance = alliance;
 }

 @Override
 public void displayDiplomaticStatus() {
     super.displayDiplomaticStatus();
     System.out.println("Allied with " + alliance);
 }
}

//Subclass representing a neutral country
class NeutralCountry extends Country1 {
 public NeutralCountry(String name) {
     super(name);
 }

 @Override
 public void displayDiplomaticStatus() {
     super.displayDiplomaticStatus();
     System.out.println("Neutral");
 }
}

public class Prac08 {
 public static void main(String[] args) {
     // Creating instances of different countries
     Country1 usa = new AlliedCountry("USA", "NATO");
     Country1 russia = new AlliedCountry("Russia", "SCO");
     Country1 india = new NeutralCountry("India");

     // Displaying diplomatic status of each country
     usa.displayDiplomaticStatus();
     russia.displayDiplomaticStatus();
     india.displayDiplomaticStatus();
 }
}

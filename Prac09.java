//  Write a Java program to make use of Abstract classes and methods.

package JavaPracticals;

//Abstract class representing a country
abstract class Country2 {
 protected String name;

 public Country2(String name) {
     this.name = name;
 }

 // Abstract method to display diplomatic status
 public abstract void displayDiplomaticStatus();
}

//Subclass representing an allied country
class AlliedCountry1 extends Country2 {
 private String alliance;

 public AlliedCountry1(String name, String alliance) {
     super(name);
     this.alliance = alliance;
 }

 // Implementing abstract method to display diplomatic status
 @Override
 public void displayDiplomaticStatus() {
     System.out.println("Diplomatic status of " + name + ": Allied with " + alliance);
 }
}

//Subclass representing a neutral country
class NeutralCountry1 extends Country2 {
 public NeutralCountry1(String name) {
     super(name);
 }

 // Implementing abstract method to display diplomatic status
 @Override
 public void displayDiplomaticStatus() {
     System.out.println("Diplomatic status of " + name + ": Neutral");
 }
}

public class Prac09 {
 public static void main(String[] args) {
     // Creating instances of different countries
     Country2 usa = new AlliedCountry1("USA", "NATO");
     Country2 russia = new AlliedCountry1("Russia", "SCO");
     Country2 india = new NeutralCountry1("India");

     // Displaying diplomatic status of each country
     usa.displayDiplomaticStatus();
     russia.displayDiplomaticStatus();
     india.displayDiplomaticStatus();
 }
}
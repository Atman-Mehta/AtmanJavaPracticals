//  Write a Java program to implement various types of inheritance.

package JavaPracticals;

import java.util.Scanner;

//Base class representing a Country
class Country {
 private String name;
 private String capital;

 public Country(String name, String capital) {
     this.name = name;
     this.capital = capital;
 }

 public void displayDetails() {
     System.out.println("Country: " + name);
     System.out.println("Capital: " + capital);
 }
}

//Derived class representing DiplomaticRelations, inheriting from Country
class DiplomaticRelations extends Country {
 private String partnerCountry;
 private String diplomaticStatus;

 public DiplomaticRelations(String name, String capital, String partnerCountry, String diplomaticStatus) {
     super(name, capital);
     this.partnerCountry = partnerCountry;
     this.diplomaticStatus = diplomaticStatus;
 }

 public void displayDiplomaticDetails() {
     // Reusing the displayDetails method from the base class
     super.displayDetails();
     System.out.println("Partner Country: " + partnerCountry);
     System.out.println("Diplomatic Status: " + diplomaticStatus);
 }
}

//Derived class representing EconomicRelations, inheriting from Country
class EconomicRelations extends Country {
 private String tradePartner;
 private double tradeVolume;

 public EconomicRelations(String name, String capital, String tradePartner, double tradeVolume) {
     super(name, capital);
     this.tradePartner = tradePartner;
     this.tradeVolume = tradeVolume;
 }

 public void displayEconomicDetails() {
     // Reusing the displayDetails method from the base class
     super.displayDetails();
     System.out.println("Trade Partner: " + tradePartner);
     System.out.println("Trade Volume: $" + tradeVolume + " billion");
 }
}

//Derived class representing CulturalRelations, inheriting from DiplomaticRelations
class CulturalRelations extends DiplomaticRelations {
 private String culturalExchangeProgram;

 public CulturalRelations(String name, String capital, String partnerCountry, String diplomaticStatus, String culturalExchangeProgram) {
     super(name, capital, partnerCountry, diplomaticStatus);
     this.culturalExchangeProgram = culturalExchangeProgram;
 }

 public void displayCulturalDetails() {
     // Reusing the displayDiplomaticDetails method from the parent class
     super.displayDiplomaticDetails();
     System.out.println("Cultural Exchange Program: " + culturalExchangeProgram);
 }
}

public class Prac07 {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Select the type of relations:");
     System.out.println("1. Diplomatic Relations");
     System.out.println("2. Economic Relations");
     System.out.println("3. Cultural Relations");
     int relationType = scanner.nextInt();
     scanner.nextLine(); // Consume newline

     if (relationType == 1) {
         // Diplomatic Relations
         System.out.println("Enter your country name:");
         String countryName = scanner.nextLine();

         System.out.println("Enter the capital of your country:");
         String capital = scanner.nextLine();

         System.out.println("Enter the partner country for diplomatic relations:");
         String partnerCountry = scanner.nextLine();

         System.out.println("Enter the diplomatic status with the partner country:");
         String diplomaticStatus = scanner.nextLine();

         // Creating an instance of DiplomaticRelations
         DiplomaticRelations diplomaticRelations = new DiplomaticRelations(countryName, capital, partnerCountry, diplomaticStatus);

         System.out.println("\nDiplomatic Relations Details:");
         diplomaticRelations.displayDiplomaticDetails();
     } else if (relationType == 2) {
         // Economic Relations
         System.out.println("Enter your country name:");
         String countryName = scanner.nextLine();

         System.out.println("Enter the capital of your country:");
         String capital = scanner.nextLine();

         System.out.println("Enter the trade partner country for economic relations:");
         String tradePartner = scanner.nextLine();

         System.out.println("Enter the trade volume with the trade partner (in billion $):");
         double tradeVolume = scanner.nextDouble();

         // Creating an instance of EconomicRelations
         EconomicRelations economicRelations = new EconomicRelations(countryName, capital, tradePartner, tradeVolume);

         System.out.println("\nEconomic Relations Details:");
         economicRelations.displayEconomicDetails();
     } else if (relationType == 3) {
         // Cultural Relations
         System.out.println("Enter your country name:");
         String countryName = scanner.nextLine();

         System.out.println("Enter the capital of your country:");
         String capital = scanner.nextLine();

         System.out.println("Enter the partner country for cultural relations:");
         String partnerCountry = scanner.nextLine();

         System.out.println("Enter the diplomatic status with the partner country:");
         String diplomaticStatus = scanner.nextLine();

         System.out.println("Enter the cultural exchange program with the partner country:");
         String culturalExchangeProgram = scanner.nextLine();

         // Creating an instance of CulturalRelations
         CulturalRelations culturalRelations = new CulturalRelations(countryName, capital, partnerCountry, diplomaticStatus, culturalExchangeProgram);

         System.out.println("\nCultural Relations Details:");
         culturalRelations.displayCulturalDetails();
     } else {
         System.out.println("Invalid option. Exiting program.");
     }

     scanner.close();
 }
}
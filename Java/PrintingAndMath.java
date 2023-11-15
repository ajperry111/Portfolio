import java.util.Scanner;
import java.lang.Math;
class PrintingAndMath {
  public static void main(String[] args){
    // Part 1
    Scanner ui = new Scanner(System.in);
    System.out.println("Enter miles: ");
    double miles = ui.nextDouble(); 
    //System.out.print(miles+" miles is "+miles*1.6+" kilometers\n");
    System.out.printf("%.2f miles is %.2f kilometers%n",miles,miles*1.6); //used chatgpt for printf format using two doubles
    // Part 2
    System.out.println("Enter the amount of water in kilograms: ");
    double water = ui.nextDouble(); 
    System.out.println("Enter the initial temperature: ");
    double initialTemp = ui.nextDouble();
    System.out.println("Enter the final temperature: ");
    double finalTemp = ui.nextDouble();
    double temp = finalTemp-initialTemp;
    System.out.print("The energy needed is "+water*temp*4184+"\n");
    // Part 3
    System.out.println("Enter investment amount: ");
    double investment = ui.nextDouble(); 
    System.out.println("Enter annual interest rate in percentage: ");
    double interest = ui.nextDouble();
    System.out.println("Enter number of years: ");
    double years = ui.nextDouble();
    interest = interest*.01;
    double parenthesis = 1+interest/12;
    double months = years*12;
    double power = Math.pow(parenthesis,months);
    System.out.printf("Future value is $%.2f%n",power*investment);
    // Part 4
    System.out.println("Enter the driving distance: ");
    double distance = ui.nextDouble(); 
    System.out.println("Enter miles per gallon: ");
    double mpg = ui.nextDouble();
    System.out.println("Enter price per gallon: ");
    double ppg = ui.nextDouble();
    double gallons = 900.5/25.5;
    System.out.printf("The cost of driving is $%.2f%n",gallons*ppg);
    // Part 5
    System.out.printf("\t  J %n J \t aaa \t v \t vaaa %n J \t J \t aa \t v v \t a a %n J \t  aaaa \t v \t aaaa\n");
    // Part 6
    System.out.println("Please enter your first name: ");
    String firstName = ui.nextLine(); 
    System.out.println("Please enter your last name: ");
    String lastName = ui.nextLine();
    System.out.println("Please enter your street address: ");
    String streetAddy = ui.nextLine();
    System.out.println("Please enter your city: ");
    String city = ui.nextLine(); 
    System.out.println("Please enter your state: ");
    String state = ui.nextLine();
    System.out.println("Please enter your ZIP (ZIP+4 preferred): ");
    String zip = ui.nextLine();
    System.out.println("Please enter your amount owed: ");
    String amountOwed = ui.nextLine(); 
    System.out.println("Please enter your payment amount: ");
    String amountPayed = ui.nextLine();
    System.out.println("Please enter your payment date: ");
    String payDate = ui.nextLine();
    System.out.printf("\t\t\t\t\t\t\t\t\t\t\t\tXYZ Community Hospital %n%n================================================================================================================================================================%n%n Name \t\t\t\t\t\t\t Address \t\t\t\t\t\t\t\t\t Payment Information%n%n Last    First         AddressLine1             City,State             Zip           Amount Owed       Payment Amt       Payment Date%n%n================================================================================================================================================================%n%n %s    %s    %s     %s,%s        %s          $%s              $%s             %s",lastName,firstName,streetAddy,city,state,zip,amountOwed,amountPayed,payDate);
  }
}

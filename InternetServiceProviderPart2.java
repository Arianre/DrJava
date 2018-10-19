import java.text.DecimalFormat;
import java.util.Scanner;

public class InternetServiceProviderPart2 {

	public static void main(String[] args) {
		String userInputPackage ;
		double userInputHours ;
		//Constent Price 
		final double Package_A_Price  = 9.95;
		final double Package_B_Price  = 13.95;
		final double Package_C_Price  = 19.95;
		//limited hours
		final int 	 Package_A_Limit  = 10;
		final int 	 Package_B_Limit  = 20;
		//extra fee
		final double Package_A_ExtraFee  = 2.00;
		final double Package_B_ExtraFee  = 1.00;
		double hoursAdd 		 = 0;
		double hoursAddComper	 = 0;
		double extraCharge 		 = 0;
		double extraChargeComper = 0;
		double totalBill 		 = 0;
		double totalBillComper 	 = 0;
		double package_B_Saving  = 0;
		double package_C_Saving	 = 0;
		double package_C2_Saving = 0;
		
		
		
		
		//asking user input data
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter the letter of the package purchased: ");
		userInputPackage = userInput.nextLine();
		
		System.out.println("Enter the number of hours that were used: ");
		userInputHours = userInput.nextDouble();
		
		// ------- A -------
		if (userInputPackage.equalsIgnoreCase("a"))
		{
			if (userInputHours > Package_A_Limit) {
				hoursAdd = userInputHours - Package_A_Limit; // Additional Hours
				extraCharge = hoursAdd * Package_A_ExtraFee ;
			}
			totalBill = extraCharge + Package_A_Price ;
			System.out.println("Your total charges are $" + totalBill);
			
			// Calculating How much they  will Pay for Package B
			
				if (userInputHours > Package_B_Limit) {
					hoursAddComper = userInputHours - Package_B_Limit; // Additional Hours
					extraChargeComper = hoursAddComper * Package_B_ExtraFee ;
				}
				
				totalBillComper = extraChargeComper + Package_B_Price ;
				
				if(totalBillComper < totalBill) {
					package_B_Saving = totalBill - totalBillComper ;
					
					System.out.println("You would have saved " +(new DecimalFormat("0.00").format(package_B_Saving))+ " if you had gotten package B");
				}
					
			//// Calculating How much they  will Pay for Package B
				
				if ( Package_C_Price < totalBill) {
					
					package_C_Saving = totalBill - Package_C_Price ;
					System.out.print("You would have saved $" +(new DecimalFormat("0.00").format(package_C_Saving))+ " if you had gotten package C");
					
				}
			
			

		}
		
		
		// ------- B -------
		
		else if (userInputPackage.equalsIgnoreCase("b"))
		{
			if (userInputHours > Package_B_Limit) {
				hoursAdd = userInputHours - Package_B_Limit; // Additional Hours
				extraCharge = hoursAdd * Package_B_ExtraFee ;
			}
			
			totalBill = extraCharge + Package_B_Price ;
			System.out.println("Your total charges are $" +totalBill);
			
		// Compering Packge C To B 
			
			if (Package_C_Price < totalBill ) {
				
				package_C2_Saving = totalBill - Package_C_Price;
				System.out.println("You would have saved $" +(new DecimalFormat("0.00").format(package_C2_Saving))+ " if you had gotten package C");
			}
		
			
		}
		
		// ------- C -------
		
		else if (userInputPackage.equalsIgnoreCase("c")) 
		{
			totalBill = Package_C_Price;
			System.out.println("Your total charges are $" +totalBill);
		}
		
		// ------- D -------
		else if (userInputPackage.equalsIgnoreCase("d")) {
			
			System.out.print("That package input was not an option.");
		}
			
		
		}

	}

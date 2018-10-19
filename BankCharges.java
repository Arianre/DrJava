import java.util.Scanner; 
import java.text.DecimalFormat;

public class BankCharges {

	public static void main(String[] args) {
		
		//Bank Charges 
		double BanksFee 	 = 10.00; // PER MONTH
		double LessThan20	 = 0.10 ;
		double Between20_39  = 0.08 ; 
		double Between40_59	 = 0.06 ;
		double MoreThan60 	 = 0.04 ;
		double TotalFee		 = 0	;
		int    Checks		 = 0 	;
		
		
		//ASKING USER 
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Please enter the number of checks written this month:");
		Checks = userInput.nextInt();
		
		if ( Checks < 20){
			TotalFee = (Checks * LessThan20) + BanksFee;
			System.out.print("This month's service fees are $ "+TotalFee);
		}
		
		else if (Checks == 20 || Checks < 40) {
			TotalFee = (Checks * Between20_39) + BanksFee;
			System.out.print("This month's service fees are $ "+TotalFee);
			
		}
		
		else if (Checks == 40 || Checks < 60) {
			TotalFee = (Checks * Between40_59) + BanksFee;
			System.out.print("This month's service fees are $ "+TotalFee);
			
		}
		
		else if (Checks > 60) {
			TotalFee = (Checks * MoreThan60) + BanksFee;
			System.out.print("This month's service fees are $ "+TotalFee);
			
		}
		
	}

}


/*
A bank charges a base fee of $10 per month, plus the following check fees for a commercial checking account:
 $.10 each for less than 20 checks 
 $.08 each for 20–39 checks 
 $.06 each for 40–59 checks 
 $.04 each for 60 or more checks 
 Write a program that asks for the number of checks written for the month. 
The program should then calculate and display the bank’s service fees for the month.

Test Case1:

Please enter the number of checks written this month:
20
This month's service fees are $ 11.6

Test Case2:

Please enter the number of checks written this month:
10
This month's service fees are $ 11.0

Test Case3:

Please enter the number of checks written this month:
50
This month's service fees are $ 13.0

Test Case4:

Please enter the number of checks written this month:
70
This month's service fees are $ 12.8

*/


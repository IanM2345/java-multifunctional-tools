package griffith;
/*
 * Ian Mwai Gachoki
 * 3132394
 */

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.PatternSyntaxException;

public class Function {
	
	public static void main(String[] args) {
		System.out.println("68 percent is a "+ award(68));
		
		System.out.println("10.36hrs in 12 hr clock system is "+ timeConverter(10.36));
		System.out.println("16.00hrs in 12 hr clock system is "+ timeConverter(16.00));
		System.out.println("13.15hrs in 12 hr clock system is "+ timeConverter(13.15));
		
		
		/*
		 * The following code asks user to input number of rows and columns and envokes method grid to print out a box.
		 */
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter rows");
	    int rows = scan.nextInt();
	    System.out.println("Enter columns");
	    int columns =  scan.nextInt();
	    
	    grid(rows, columns);
	    
	    
	    while (true) {
	    	/*
	    	 * The following code ensures that if the date inputed is not in valid format it loops until user enters a date in valid format
	    	 */
	    	System.out.println("Enter a date");
		    String date = scan.nextLine();
	    	if (validDate(date)) {
	    		System.out.println( date+" is valid format");
	    		break;
	    	}
	    	else {
	    		System.out.println( date+" is not valid format");
	    		System.out.println("Enter date in the following format DD/MM/YYYY");
	    	}
	    	
	    }
	    scan.close();
	    
	    System.out.println("To say Listen and silent are anagrams is "+ anagramCheck("Listen","Silent"));
		
	}
       public static String award(int num1) {
    	   /*
    	    * The following method code checks for the value of certain number and returns a string that represents the value of the number
    	    */
    	   
    	   if ( num1 >0 &&num1 < 40) {
    		   return "Fail";
    	   }
    	   else if (num1>=40 && num1<=54) {
    		   return "Pass";
    	   }
    	   else if (num1>=55 && num1<=62) {
    		   return "Merit2";
    	   }
    	   else if (num1>=63 && num1<=69) {
    		   return "Merit1";
    	   }
    	   else if (num1>=70 && num1<=100) {
    		   return "Distinction";
    	   }
    	   else {
    		   return "Null";
    	   }
       }
       public static String timeConverter(double time) {
    	   /*
    	    * The following method converts time from the 24hr clock system to the 12 hour clock system
    	    * The input is required to be between 0 and 24 and with 2 decimal places
    	    */
    	   if (time<0 || time>=24) {
    		   return "invalid time";
    	   }
    	   double convertedTime = 0;
    	   String timePeriod = null;
    	   if (time>=12.00) {
    		   convertedTime= Math.ceil((time-12)*100)/100;
    		   timePeriod= "pm";
    	   }
    	   else {
    		   timePeriod = "am";
    	   }
    	   String formatedTime = String.valueOf(convertedTime);
    		   String result= formatedTime + timePeriod;
    		   return result;
       }
       
       public static void grid(int rows, int columns) {
    	   /*
    	    * The following code takes user input of rows and columns
    	    * It uses the inputed values to print out a box like structure using "_" and"|"
    	    */
    	   for (int i = 0; i<columns; i++) {
     		  System.out.print(" _");
    	   }
    	   for (int i = 0; i<=rows; i++) {
    		  System.out.print ("\n|_|");
    		  for (int j=0; j <columns-1;j++) {
    			  System.out.print ("_| ");
    		  }
    	   }
       }
       
       public static boolean validDate(String date) {
    	   /*
    	    * The following code checks if the date inputed by the user is in the following format DD/MM/YYYY
    	    * It uses regex to ensures that the input of days and months are 2 digits and year 4 digits
    	    */
    	   String dateFormat = "^\\d{2}/\\d{2}/\\d{4}$";
    	   return date.matches(dateFormat);
       }
       
       
       public static boolean anagramCheck(String first, String second) {
    	   /*
    	    * The following code checks if two words passed as strings are anagrams of eachother.
    	    * If they are it returns true
    	    */
    	   if (first.length() != second.length()) {
    		   return false;
    	   }
    	   first = first.toLowerCase();
    	   second= second.toLowerCase();
    	   
    	   char[] firstArray= first.toCharArray();
    	   char[] secondArray= second.toCharArray();
    	   
    	   Arrays.sort(firstArray);
    	   Arrays.sort(secondArray);
    	   
    	   if (Arrays.equals(firstArray, secondArray)) {
    	       return true;
    	   }
    	   else {
    		   return false;
    	   }
       }  
       
}

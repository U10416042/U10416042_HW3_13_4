import java.util.*; 
import java.util.Scanner; 
 
public class Calendar{ 
 	 
 	int a = 0; 
 	int y = 0; 
 	int m = 0; 
 	 
 	public Calendar(){ 
 		 
 	} 
 	 
 	//print the contents of calendar 
 	public static void printMonth(int y, int m){ 
 		printTitle(y, m); 
 		printBody(y, m); 
 	} 
 		 
 	//print the title of calendar	 
 	public static void printTitle(int y, int m){ 
 		System.out.println(""); 
 		System.out.println("         " + getMonthName(m) 
 		+ " " + y); 
 		System.out.println("------------------------------------"); 
 		System.out.println(" Sun Mon Tue Wed Thu Fri Sat"); 
 	} 
 	 
 	//get the name of the month users typed  
 	public static String getMonthName(int m){ 
 		String monthName = ""; 
 		 
 		//judge what is the name of the month  
 		if(m ==1 ) monthName = "January"; 
 		else if(m == 2) monthName = "February"; 
 		else if(m == 3) monthName = "March"; 
 		else if(m == 4)	monthName = "April"; 
 		else if(m == 5) monthName = "May"; 
 		else if(m == 6) monthName = "June"; 
 		else if(m == 7)	monthName = "July"; 
 		else if(m == 8)	monthName = "August"; 
 		else if(m == 9)	monthName = "September"; 
 		else if(m == 10) monthName = "October"; 
 		else if(m == 11) monthName = "November"; 
 		else if(m == 12) monthName = "December"; 
 		//return name 
 		return monthName; 
 	} 
 	//print the day position 
 	public static void printBody(int y, int m){ 
 		int startDay = getStartDay(y, m); 
		int numberOfDaysInMonth = getNumberOfDaysInMonth(y, m); 
 		int i = 0; 
		 
 		for (i = 0; i < startDay; i++) 
 		System.out.print("    "); 
 

 		for (i = 1; i <= numberOfDaysInMonth; i++) { 
 			System.out.printf("%4d", i); 
 
 			if ((i + startDay) % 7 == 0) 
 			System.out.println(); 
 		} 
 		System.out.println(); 
 	} 
 	//judge the total day is 
 	public static int getTotalNumberOfDays(int y, int m) { 
 		int total = 0; 
 		 
 		for (int i = 1800; i < y; i++) 
 			if (isLeapYear(i)) 
 				total = total + 366; 
 			else 
 				total = total + 365; 
 
 
 		for (int i = 1; i < m; i++) 
 			total = total + getNumberOfDaysInMonth(y, i); 

 
 		return total; 
   } 
 	 
 	//judge is leapYear or not 
 	public static boolean isLeapYear(int y) { 
 		return y % 400 == 0 || (y % 4 == 0 && y % 100 != 0); 
 	} 
 	 
 	//get the number of the month 
 	public static int getNumberOfDaysInMonth(int y, int m) { 
 		if (m == 1 || m == 3 || m == 5 || m == 7 || 
 		m == 8 || m == 10 || m == 12) 
 		return 31; 
 
 		if (m == 4 || m == 6 || m == 9 || m == 11) 
 		return 30; 
 
 
 		if (m == 2) return isLeapYear(y) ? 29 : 28; 
 
 		return 0; 
   } 
    
   public static int getStartDay(int y, int m) { 
     final int START_DAY_FOR_JAN_1_1800 = 3; 
      
     int totalNumberOfDays = getTotalNumberOfDays(y, m); 
 
 
     return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7; 
   } 
} 

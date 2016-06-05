import java.util.*; 
import java.util.Scanner; 
 
public class TestCalendar{ 
	public static void main(String[] args){ 
 		int a = 0;
		int y = 0;
		int m = 0;
		int cy = 0;
                int cm = 0; 
 		 
		Calendar display = new Calendar(); 
 		GregorianCalendar c = new GregorianCalendar(); 
 		Scanner input = new Scanner(System.in); 
 		 
		System.out.println("\nEnter 1 to start "); 
 		a = input.nextInt(); 
 		 
 		if(a == 1){ 
 			//Prompt 
 			System.out.print("Year: "); 
 			y = input.nextInt();  		 
 			
 			System.out.print("Month: "); 
 			m = input.nextInt(); 
		
 			cy = c.get(GregorianCalendar.YEAR); 
 			cm = c.get(GregorianCalendar.MONTH); 
		} 
 		 
 		//print the calender 
		display.printMonth(y, m);
 
		System.out.println("------------------------------------"); 
 		System.out.println("");

		String monthName = "January";

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
 		
		System.out.println("Today is: "+ monthName +" "+ c.get(GregorianCalendar.DATE) + "," + c.get(GregorianCalendar.YEAR) ); 
 	} 
 } 

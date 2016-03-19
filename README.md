import java.util.*; 
import java.util.Scanner; 

public class Calendar{ 
	public static void main(String[] args){ 
		
		int y = 0; 
		int m = 0; 
		 
		Calendar c = new GregorianCalendar(); 
		Scanner input = new Scanner(System.in); 
		 
		System.out.print("Valid from January 1970.\n");
		System.out.print("Month: "); 
		m = input.nextInt(); 
		System.out.print("Year: "); 
		y = input.nextInt(); 
		 
		printMonth(y, m); 
		 
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n"); 
		System.out.println("Current time: " + c.get(Calendar.MONTH) + c.get(Calendar.DATE) +","+ c.get(Calendar.YEAR)); 
						 
	} 

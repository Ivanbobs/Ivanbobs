package Codes;
import java.util.*;

public class WeekDay {

	public static void main(String[] args) {

		String [] weekDays = {
				"Monday",
				"Tuesday",
				"Wednesday",
				"Thursday",
				"Friday",
				"Saturday",
				"Sunday"
		};
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many days make a week ?");
		int daysInWeek = input.nextInt();
		
		if(daysInWeek == 7) {
			System.out.println("You got that right baby,....!, lets continue......");
			
			System.out.println("Enter the number to convert to a day of the week(from 1 - 8)");
			int number = input.nextInt();
			if(number>7 || number<1) {
				System.out.println("The number entered is invalid");
			}else {
				System.out.println("The numer entered corresponds to :" + weekDays[number-1]);
			}
		}else {
			System.out.println("You're wrong, " + daysInWeek + " days do not make a week !!!!");
		}
		

	}

}

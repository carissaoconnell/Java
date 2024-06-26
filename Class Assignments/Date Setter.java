// Carissa Lee O'Connell
// Date Setter program

import java.util.Scanner;  // import the scanner class

public class Date {  // Date class
	private int month, day, year;

	public Date(int day, int month, int year) {  // Method name
		this.day = day;  // take the date object and set the day to the day that is being passed in
		this.month = month;  // take the date object and set the month to the month that is being passed in
		this.year = year;  // take the date object and set the year to the year that is being passed in
	}

	public int getMonth() {  // method to return month
		return month;
	}

	public void setMonth(int month) {  // method to set the month to the value returned from getMonth
		this.month = month;  
	}

	public int getDay() {  // method to return day
		return day;
	}

	public void setDay(int day) {  // method to set the day to the value returned from  getDay
		this.day = day;
	}

	public int getYear() {  // method to return year
		return year;
	}

	public void setYear(int year) {  // method to set the year to the value returned from getYear
		this.year = year;
	}

	public void displayDate() {  // method to display the date
		System.out.printf("The Date object's state is: %d/%d/%d%n", month, day, year);
	}


public static void main(String[] args) {  // main function

Scanner userValue = new Scanner(System.in);  // scanner object

System.out.print("Enter the month, day and year in the form XX XX XXXX and hit enter:");

	int month = userValue.nextInt(); // read in the user's month
	int day = userValue.nextInt();  // read in the user's day
	int year = userValue.nextInt();  // read in the user's year

	Date date = new Date(day, month, year); // object for the Date class

	date.displayDate(); // call the function to print the date

	System.out.print("Enter a new year:");  // prompt to enter the new year
		year = userValue.nextInt();  // take in the user's year
		date.setYear(year);  // set the year
		date.displayDate();  // display the date with the new year

	System.out.print("Enter a new day:"); // prompt to enter the new day
		day = userValue.nextInt();  // take in the user's day
		date.setDay(day);  // set the day
		date.displayDate();  // display the date with the new year and day

	System.out.print("Enter a new month:");  // prompt the user to enter the new month
		month = userValue.nextInt();  // take in the user's month
		date.setMonth(month);  // set the month
		date.displayDate();  // display the date with the new year, day, and month
}

}

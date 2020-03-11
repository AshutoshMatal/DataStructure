import java.util.Scanner;

public class Calender {
	
	public static int getDayNumber(int date, int month, int year) {
		int ye = year - (14 - month) / 12;
		int x = ye + ye / 4 - ye / 100 + ye / 400;
		int mo = month + 12 * ((14 - month) / 12) - 2;
		int day = (date + x + (31 * mo) / 12) % 7;

		return day;

		}

		public static boolean isLeapYear(int year) {
		if ((year % 4 == 0) && (year % 100 != 0))
		return true;
		if (year % 400 == 0)
		return true;
		return false;
		}
		public static String[] monthsData(int month, int year)
		{

		String nonLeap[] = { "1", " 2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
		"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28" };
		String leap[] = { "1", " 2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17",
		"18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29" };
		String month_31[] = { "1", " 2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
		"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" };
		String month_30[] = { "1", " 2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16",
		"17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30" };
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
		return month_31;
		}
		else if (month == 4 || month == 6 || month == 9 || month == 11)
		{
		return month_30;
		}
		else if (month == 2 && isLeapYear(year))
		{
		return leap;
		}
		else
		{
		return nonLeap;
		}

		}
public static void main(String[] args) {
	int month =2 ;    // month (Jan = 1, Dec = 12)
	int year = 2020;     // year
	// months[i] = name of month i
	String[] months = {
	// leave empty so that months[1] = "January"
			"","January", "February", "March",
		         "April", "May", "June",
		         "July", "August", "September",
		         "October", "November", "December"
		   				};
	// days[i] = number of days in month i
	int[] days = {
		         0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
				};

	// check for leap year
	if (month == 2 && isLeapYear(year)) days[month] = 29;
	// print calendar header
	System.out.println("   " + months[month] + " " + year);
	System.out.println(" S  M Tu  W Th  F  S");
   // starting day
	int d = getDayNumber(month, 1, year);
	// print the calendar
	for (int i = 0; i < d; i++)
		System.out.print("   ");
			for (int i = 1; i <= days[month]; i++) 
		     {
		         System.out.printf("%2d ", i);
		         if (((i + d) % 7 == 0) || (i == days[month]))
		        System.out.println();
		     }
		}
	}
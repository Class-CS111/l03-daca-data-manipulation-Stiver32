// STUDENT NAME: Cameron Ortega
// DATE: 2/7/2025

public class Main 
{
  public static void main(String[] args) 
	{
		/***** DECLARATION & INITIALIZATION SECTION *****/
		int a,y,m;
		int jdnToday,jdnBday, approxAge, jdnDiff;

		int monthToday = 2;
		int dayToday = 2;
		int yearToday = 2020;

		int monthBday = 8;
		int dayBday = 26;
		int yearBday = 1918;
		
		
		/***** CALCULATION & PROCESSING SECTION *****/
		a = (14 - monthToday) / 12;
		y = yearToday + 4800 - a;
		m = monthToday + 12 * a - 3;
		jdnToday = dayToday + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045;

		a = (14 - monthBday) / 12;
		y = yearBday + 4800 - a;
		m = monthBday + 12 * a - 3;
		jdnBday = dayBday + (153 * m + 2) / 5 + 365 * y + y / 4 - y / 100 + y / 400 - 32045;
		
		jdnDiff = jdnToday - jdnBday;
		approxAge = jdnDiff / 365;

		/***** OUTPUT SECTION *****/
		System.out.println("Julian Day Number for today's date, " + monthToday + "/" + dayToday + "/" + yearToday + ", is " + jdnToday + "\n");
		System.out.println("Julian Day Number for birthday, " + monthBday + "/" + dayBday + "/" + yearBday + ", is " + jdnBday + "\n");
		System.out.println("The difference in days is " + jdnDiff + ", which makes you approximately " + approxAge + " years old!");


  }	
}
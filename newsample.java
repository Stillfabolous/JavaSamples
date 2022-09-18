package vkathelloworld;

public class HelloWorld {

	public static void main(String[] args) {

		int width ;
		int height ;
		int area ;
		double radius = 10.0;
		double pi = 3.14;
		boolean result = true ;
		width = 2;
		height = 22 ;
		 area = 5 ;

		int []  daysInMonth  = new int [12];
		String [] MonthNames = {
				"January", "February", "March",
				"April", "May", "June",
				"July", "August", "September",
				"October", "November", "December"} ;

	daysInMonth [0] = 30 ;
	daysInMonth [1] = 28 ;
	daysInMonth [2] = 31 ;
	daysInMonth [3] = 30 ;
	daysInMonth [4] = 31 ;
	daysInMonth [5] = 30 ;
	daysInMonth [6] = 31 ;
	daysInMonth [7] = 30 ;
	daysInMonth [8] = 31 ;
	daysInMonth [9] = 30 ;
	daysInMonth [10] = 31 ;
	daysInMonth [11] = 30 ;




		System.out.println("Hello there") ;
		System.out.println("The value of width is " + width) ;
		System.out.println("The value of height is " + height);
		System.out.println("The value of area is " + area);
		System.out.println("The result is " + result);
		System.out.println(MonthNames[0] + " has " + daysInMonth[0] + " days" ) ;
		System.out.println(MonthNames[1] + " has " + daysInMonth[1] + " days" ) ;
		System.out.println(MonthNames[2] + " has " + daysInMonth[2] + " days" ) ;
		System.out.println(MonthNames[0] + " has " + daysInMonth[3] + " days" ) ;
		System.out.println(MonthNames[4] + " has " + daysInMonth[4] + " days" ) ;
		System.out.println(MonthNames[5] + " has " + daysInMonth[5] + " days" ) ;
		System.out.println(MonthNames[6] + " has " + daysInMonth[6] + " days" ) ;
		System.out.println(MonthNames[7] + " has " + daysInMonth[7] + " days" ) ;
		System.out.println(MonthNames[8] + " has " + daysInMonth[8] + " days" ) ;
		System.out.println(MonthNames[9] + " has " + daysInMonth[9] + " days" ) ;
		System.out.println(MonthNames[10] + " has " + daysInMonth[10] + " days" ) ;
		System.out.println(MonthNames[11] + " has " + daysInMonth[11] + " days" ) ;

	}

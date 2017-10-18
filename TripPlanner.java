import java.util.Scanner;
class TripPlanner{
	public static void main(String args[])
	{
		
		greeting();
		timeAndBudget();
		timeDifference();
		area();
	}
	public static void greeting()
	{
		System.out.println("Welcome to the Vacation Planner!");
		System.out.print("What's your name? ");
		Scanner person = new Scanner(System.in);
		String name = person.nextLine();
		System.out.print("Nice to meet you "+name +" ,where are you travelling to? ");
		String place = person.nextLine();
		System.out.println("Great! "+place+" sounds like a great trip.");
		System.out.println("**********************");

	}
	public static void timeAndBudget()
	{
		Scanner person_timeBudget = new Scanner(System.in);
		System.out.print("How many days are you going to spend travelling? ");
		int days = person_timeBudget.nextInt();
		System.out.print("How much money,in USD,are you planning to spend on your trip? ");
		double money = person_timeBudget.nextDouble();
		System.out.print("What is three letter currency symbol for your travel Destination? ");
		String symbol = person_timeBudget.next();
		System.out.print("How many "+symbol+" are there in 1 USD? ");
		double moneyUSD = person_timeBudget.nextDouble();
		System.out.println();
		System.out.println();
		double hours= days*24;
		double minutes=hours*60;
		System.out.println("If you are travelling for "+days+" that is same as "+(int)hours+" hours or "+(int)minutes+" minutes.");
		double divided_money=money/days;
		divided_money=(int)(divided_money*100);
		divided_money=(double)(divided_money/100);
		System.out.println("If you are going to spend $"+money+" USD that means per day you can spend up to "+divided_money+" USD");
		double converted_money=money*moneyUSD;
		converted_money=(int)(converted_money*100);
		converted_money=(double)(converted_money/100);
		double per_day_converted_money=converted_money/days;
		per_day_converted_money=(int)(per_day_converted_money*100);
		per_day_converted_money=(double)(per_day_converted_money/100);

		System.out.println("Your total budget in "+symbol+" is "+converted_money+" "+symbol+", which per day is "+per_day_converted_money+" "+symbol+".");
		System.out.println("**********************");

	}
	public static void timeDifference()
	{
		Scanner person_time_difference = new Scanner(System.in);
		System.out.print("What is the time difference,in hours,between your home and your destination?");
		int timediff= person_time_difference.nextInt();
		int actual_midnighttime;
		int actual_noontime;
		if(timediff>0)
			{actual_midnighttime=timediff+0;
				actual_noontime=timediff+12;}
				else
					{actual_midnighttime= 24 +timediff;
						if(timediff<-12)
							{actual_noontime=24+(12+timediff);}
						else
							{actual_noontime=12+timediff;}
					}


					System.out.println("That means that when it is midnight that home it wil be "+actual_midnighttime+" in your travel destination and when it is noon it will be "+actual_noontime);
					System.out.println("**********************");
				}
				public static void area()
				{
					Scanner person_destinationArea = new Scanner(System.in);
					System.out.print("What is the square area of the destined country in km2?");
					double area = person_destinationArea.nextDouble();
					double miles= area*0.38;
					System.out.println("In mile2 it is "+miles);
					System.out.println("**********************");

				}
				
			}
import java.util.*;

public class formula
{
	static double rateOfWork = .25;

	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);
		double calories,joules,watts,time,actualCals;

		System.out.println("Enter amount of time in minutes");
		time = input.nextDouble();
		time *=60;

		//watts = 280;
		//joules = watts*time;
		//System.out.println(joules);
		

		//************************************************
		System.out.println("Enter Calories used per hour");
		calories = input.nextDouble();
		joules = calsToJoules(calories);  // calories to watts
		watts = joules/time;
		System.out.println("Amount of power used in watts = " +watts);
		//***************************************************


		//**********************************************************
		System.out.println("Enter watts used in an hour");
		watts = input.nextDouble();
		joules= wattsToJoules(watts, time);  //watts to calories
		calories = joulesToCals(joules);
		System.out.println(watts +" watts converting to calories = " +calories);
		//*************************************************************


		// actualCals = actualCalsUsed(calories);
		// System.out.println("Actual calories used working at an average rate = " + actualCals);
		


	}
	public static double wattsToJoules(double watts, double time)
	{
		return watts*time;
	}
	
	public static double actualCalsUsed(double calories)
	{
		return calories/rateOfWork;
	}
	public static double calsToJoules(double cals)
	{

		return cals*4186;
	}
	public static double joulesToCals(double joules)
	{
		return joules/4186;
	}
}
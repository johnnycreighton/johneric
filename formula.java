import java.util.*;

public class formula
{
	static double rateOfWork = .25;
	static double kiloJoule = 4186;

	public static void main(String args [])
	{
		Scanner input = new Scanner(System.in);
		double calories,joules,watts,time,actualCals;

		// System.out.println("Enter amount of time in minutes");
		// time = input.nextDouble();
		// time *=60;
		

		//**********************************************************
		System.out.println("This piece will convert calories into watts... \n");
		System.out.println("Enter Calories:");
		calories = input.nextDouble();
		System.out.println("Enter amount of time in minutes, it took to use them calories:");
		time = input.nextDouble();
		time *=60;
		joules = calsToJoules(calories);  // calories to watts
		watts = joules/time;
		System.out.println("Using "+calories+" calories of energy in "+time/60+" minutes produces "+watts+" watts of power.");
		//**********************************************************
		
		System.out.println("\n\n*********************************\n\n"); // new line
		time = 0;

		//**********************************************************
		System.out.println("This piece of code will cnovert watts to calories...\n");
		System.out.println("Enter watts:");
		watts = input.nextDouble();
		System.out.println("Enter amount of time in minutes, it took to use the wattage:");
		time = input.nextDouble();
		time *=60;
		joules= wattsToJoules(watts,time);  //watts to calories
		calories = joulesToCals(joules);
		System.out.println(watts + " watts converting into calories = " +calories);
		//**********************************************************
		
		System.out.println();
		time =0;

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
		return cals*kiloJoule;
	}
	
	public static double joulesToCals(double joules)
	{
		return joules/kiloJoule;
	}
}
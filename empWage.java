public class empWage
{
		//constants
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int WAGE_PER_HOUR=20;
	public static final int NUM_WORKING_DAYS=20;
	public static final int MAX_WORK_HOURS=100;
	public static void main(String args[])
	{
		//variables
		int empWage=0,empHours=0,totalempHours=0,totalempWage=0,totalWorkingDays=0;
		while(totalempHours<=MAX_WORK_HOURS && totalWorkingDays<NUM_WORKING_DAYS)
		{
			totalWorkingDays++;
			double empCheck=Math.floor(Math.random()*10)%3; 
			switch((int)empCheck)
			{
			case IS_FULL_TIME:
								empHours=8;
								break;
			case IS_PART_TIME:
								empHours=4;
								break;
			default:
								empHours=0;
			}
		//empWage=empHours*WAGE_PER_HOUR;
		//System.out.println("Day"+totalWorkingDays+"Employee daily wage"+empWage);
		totalempHours+=empHours;
		totalempWage=totalempHours*WAGE_PER_HOUR;
		}
		System.out.println("Total Employee Wage is"+totalempWage);
	}
}

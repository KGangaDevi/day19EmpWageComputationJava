public class empWage
{
	public static void main(String args[])
	{
	int IS_FULL_TIME=1;
	int WAGE_PER_HOUR=20;
	int salary=0,empHours=0;
	double empCheck=Math.floor(Math.random()*10)%2; 
	if(empCheck==IS_FULL_TIME)
			empHours=8;
	else
		System.out.println("Employee is Absent");
	salary=empHours*WAGE_PER_HOUR;
	System.out.println("Employee daily wage"+salary);
	}
}

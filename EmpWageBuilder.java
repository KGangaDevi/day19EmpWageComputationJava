public class EmpWageBuilder
{
      //constants
   public static final int IS_FULL_TIME=1;
   public static final int IS_PART_TIME=2;
   
	private final String company;
	private final int empRatePerHour;
   private final int numOfWorkingDays;
   private final int maxHoursPerMonth;

	public EmpWageBuilder( String company,int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
   {
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.numOfWorkingDays=numOfWorkingDays;
		this.maxHoursPerMonth=maxHoursPerMonth;
	}
   public static void main(String args[])
   {
    	EmpWageBuilder dMart= new EmpWageBuilder("Dmart",20,2,10);
		  //variables
      int empWage=0,empHours=0,totalempHours=0,totalempWage=0,totalWorkingDays=0;
      while(totalempHours<=dMart.maxHoursPerMonth && totalWorkingDays<dMart.numOfWorkingDays)
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
      empWage=empHours*dMart.empRatePerHour;
      System.out.println("Day"+totalWorkingDays+"Employee daily wage"+empWage);
      totalempHours+=empHours;
      totalempWage=totalempHours*dMart.empRatePerHour;
      }
      System.out.println("Total Employee Wage for company "+dMart.company+" is "+totalempWage);
   }
}

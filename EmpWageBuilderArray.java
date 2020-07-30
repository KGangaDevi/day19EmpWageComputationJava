public class EmpWageBuilderArray
{
	private int numOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;
	public EmpWageBuilderArray()
	{
	 comapanyEmpWageArray=new CompanyEmpWage[5];
	}
	private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays,int maxHoursPerMonth)
	{
		companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);
		numOfCompany++;
	}
	private void  computeEmpWage()
	{
		for(int i=0;i<numberOfCompany;i++)
		{
			companyEmpWageArray[i].setTotalEmpWage(this.calculatewageforComapny(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

   public void calculatewageforCompany(CompanyEmpWage companyEmpWage)
   {
      //Variabes
      int totalEmpHours=0,totalWorkingDays=0;
      int empWage=0,totalEmpWage=0;
      //computation
      while(totalEmpHours<=companyEmpWage.maxHours && totalWorkingDays<numofDays)
      {
      int empHrs=0;
      totalWorkingDays++;
      int empCheck=(int)Math.floor(Math.random()*10)%3;
      //System.out.println("Random Value"+Math.random());
      //Math class in java .lang package, Math contains
      //floor for low value,as random value returns decimal value, multiply with 10
      switch (empCheck)
         {
         case IS_FULL_TIME:
               empHrs=8;
               break;
         case IS_PART_TIME:
               empHrs=4;
               break;
         default:
               empHrs=0;
          }
         totalEmpHours+=empHrs;
         empwage=empHrs*EMP_RATE_PER_HOUR;
         System.out.println("total working days"+totalWorkingDays+ "EmpHrs:"+empHrs);
      }
      totalEmpWage=EMP_WAGE_PER_HOUR*totalEmpHours;
      System.out.println("Total Empoylee Wage"+"company is "+company+" "+totalEmpWage);
   	return totalEmpHours*companyEmpWage.emp;
	}
   public static void main(String args[])
   {
      EmpWageBuilderArray empbuilder=new EmpWageBuilderArray("Dmart",2,1,1);
      empbuilder.addCompanyEmpWage("Dmart");
      empbuilder.addCompanyEmpWage("Reliance");
   }


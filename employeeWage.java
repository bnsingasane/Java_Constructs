public class employeeWage {

	public static final int PART_TIME=1;
	public static final int FULL_TIME=2;
	public static final int EMP_RATE_PER_HR=20;
	public static final int NUM_OF_WORKING_DAYS=2;
	public static final int MAX_HRS_IN_MONTH=10;

	public static int computeEmpWage()
	{
		System.out.println("Welcome Employee");
		int empHrs=0;
		int totalEmpHrs=0;
		int totalWorkingDays=0;
		double EmpCheck=Math.floor(Math.random()*10)%3;
		if(EmpCheck==FULL_TIME)	
			System.out.println("Employee is Present.");
		else
			System.out.println("Employee is Absent.");
		
		if(EmpCheck==PART_TIME)
		{
			empHrs=4;
			System.out.println("Emp Wage for Part Time:");
		}
		else if(EmpCheck==FULL_TIME)
		{
			empHrs=8;
			System.out.println("Emp Wage for Full Time:");
		}
		else
		{
			empHrs=0;
			System.out.println("Emp Wage:");
		}
		int empWage = empHrs*EMP_RATE_PER_HR;
		System.out.println(empWage);

		while (totalEmpHrs<MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS)
		{
			totalWorkingDays++;
			int empCheck=(int) Math.floor(Math.random()*10)%3;
			switch (empCheck)
			{
				case PART_TIME:
					empHrs=4;
					break;
				case FULL_TIME:
					empHrs=8;
					break;
				default:
					empHrs=0;
			}	
			totalEmpHrs+=empHrs;
			System.out.println("Day:"+totalWorkingDays+"\tEmp Hr:"+empHrs);
		}
		int totalEmpWage=totalEmpHrs*EMP_RATE_PER_HR;
		System.out.println("Total Emp Wage:"+totalEmpWage);
		return totalEmpWage;
	}
	public static void main(String[] args)
	{
		computeEmpWage();
	}
}


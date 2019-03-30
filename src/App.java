
public class App {
	public static void main(String[] args) {
		SalaryCalculator salaryCalculator = new SalaryCalculator();

		Employee developer = new Employee(1200, Occupation.DEVELOPER);
		
		Employee dba = new Employee(3200, Occupation.DBA);
		
		System.out.println("Developer salary with discount: " + salaryCalculator.calculate(developer));
		System.out.println("");
		
		System.out.println("DBA salary with discount: " + salaryCalculator.calculate(dba));
		/*CalculationRules tenOrTwentyPerCent = new TenOrTwentyPerCent();

		System.out.println("Developer salary with discount: " + tenOrTwentyPerCent.calculate(developer));
		System.out.println("");*/

		
		//System.out.println("DBA salary with discount: " + tenOrTwentyPerCent.calculate(dba));
	}
}

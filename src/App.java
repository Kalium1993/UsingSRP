
public class App {
	public static void main(String[] args) {
		SalaryCalculator salaryCalculator = new SalaryCalculator();

		Employee developer = new Employee(1200, Occupation.DEVELOPER);
		
		Employee dba = new Employee(3200, Occupation.DBA);
		
		Employee tester = new Employee(1500, Occupation.TESTER);
		
		System.out.println("Developer salary with discount: " + salaryCalculator.calculate(developer));
		System.out.println("");
		
		System.out.println("DBA salary with discount: " + salaryCalculator.calculate(dba));
		System.out.println("");
		
		System.out.println("Tester salary with discount: " + salaryCalculator.calculate(tester));
	}
}

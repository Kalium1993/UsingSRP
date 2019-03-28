
public class App {
	public static void main(String[] args) {

		Employee developer = new Employee(1200, Occupation.DEVELOPER);

		CalculationRules tenOrTwentyPerCent = new TenOrTwentyPerCent();

		System.out.println("Developer salary with discount: " + tenOrTwentyPerCent.calculate(developer));
		System.out.println("");

		Employee dba = new Employee(3200, Occupation.DBA);
		System.out.println("DBA salary with discount: " + tenOrTwentyPerCent.calculate(dba));
	}
}

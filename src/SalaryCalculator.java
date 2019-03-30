
public class SalaryCalculator implements Calculations{
	
	public double calculate(Employee employee) {
		employee.calculate(employee.getOccupation());
		
		//CalculationRules tenOrTwentyPerCent = new TenOrTwentyPerCent();
		//return tenOrTwentyPerCent.calculate(employee);
		return 0;
	}
}

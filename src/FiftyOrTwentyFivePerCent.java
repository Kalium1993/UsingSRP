
public class FiftyOrTwentyFivePerCent implements CalculationRules{

	public double calculate(Employee employee) {
		if (employee.getBaseSalary() > 3000) {
			return employee.getBaseSalary() * 0.75;
		}
		return employee.getBaseSalary() * 0.85;
	}

}

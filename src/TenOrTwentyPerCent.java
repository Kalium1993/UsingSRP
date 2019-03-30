
public class TenOrTwentyPerCent implements CalculationRules {

	public double calculate(Employee employee) {
		if (employee.getBaseSalary() > 3000) {
			return employee.getBaseSalary() * 0.8;
		}
		return employee.getBaseSalary() * 0.9;
	}

}

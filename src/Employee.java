
public class Employee {
	private double baseSalary;
	private Occupation occupation;
	
	public Employee(double baseSalary, Occupation occupation) {
		this.baseSalary = baseSalary;
		this.occupation = occupation;
	}
	
	public Occupation getOccupation() {
		return this.occupation;
	}

	public double getBaseSalary() {
		return baseSalary;
	}
	
	public double calculate() {
		return this.occupation.getRules().calculate(this);
	}
	
}

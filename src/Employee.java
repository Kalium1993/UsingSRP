
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
	
	// Aqui o cálculo é finalmente executado, mas pelo
	// objeto occupation (cargo) do funcionário, pois
	// é ele que sabe a regra. Estamos simplesmente
	// passando a responsabilidade do cálculo para a
	// occupation.
	public double calculate() {
		return this.occupation.getRules().calculate(this);
	}
}

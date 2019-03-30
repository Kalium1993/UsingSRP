
public class App {
	public static void main(String[] args) {
		// Instância da calculadora
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
		
		// Alguns funcionários
		Employee developer = new Employee(1000, Occupation.DEVELOPER);
		Employee dba = new Employee(1000, Occupation.DBA);
		
		// Usando a calculadora para calcular
		double salaryForDeveloper = calculadora.calcula(developer);
		double salaryForDba = calculadora.calcula(dba);
		
		System.out.println("Salary for developer: " + salaryForDeveloper);
		System.out.println("Salary for dba: " + salaryForDba);
	}
}

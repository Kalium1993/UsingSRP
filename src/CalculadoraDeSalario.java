/*
 * A calculadora, nesse caso, simplesmente ficou
 * com a responsabilidade de chamar o método de
 * cálculo no próprio funcionário, já que o mesmo
 * tem o conhecimento do seu cargo - que por sua
 * vez sabe a regra a aplicar.
 */
public class CalculadoraDeSalario {
	public double calcula(Employee employee) {
		return employee.calculate();
	}
}

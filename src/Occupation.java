/*
 * O cargo é que tem conhecimento da regra 
 * a ser aplicada. Faz mais sentido termos a regra
 * mais próxima ao cargo do que na calculadora
 * (como era inicialmente).
 * 
 * Agora, ao acrescentar um novo cargo, precisamos
 * apenas alterar esta classe.
 */
public enum Occupation {
	DEVELOPER(new TenOrTwentyPerCent()),
	DBA(new FifteenOrTwentyFivePercent()),
	TESTER(new TenOrTwentyPerCent());
	
	private CalculationRules rules;
	
	Occupation(CalculationRules rules) {
		this.rules = rules;
	}
	
	public CalculationRules getRules() {
		return this.rules;
	}
}


public enum Occupation{
	DEVELOPER(new TenOrTwentyPerCent()),
	DBA(new FifteenOrTwentyFivePerCent()),
	TESTER(new FifteenOrTwentyFivePerCent());
	
	private CalculationRules rules;
	
	Occupation(CalculationRules rules) {
		this.rules = rules;
	}
	
	public CalculationRules getRules() {
		return this.rules;
	}
}

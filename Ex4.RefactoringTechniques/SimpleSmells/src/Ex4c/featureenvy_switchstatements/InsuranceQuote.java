package Ex4c.featureenvy_switchstatements;

public class InsuranceQuote {

	Motorist motorist;

	public InsuranceQuote(Motorist motorist) {
		this.motorist = motorist;
	}

	public double calculateInsurancePremium(double insuranceValue) {
		RiskFactor riskFactor = motorist.calculateMotoristRisk();
		return getCalRisk(riskFactor).calculateRate(insuranceValue);
	}

	private static CalRisk getCalRisk(RiskFactor riskFactor) {
		CalRisk calRisk;
		switch(riskFactor){
		case LOW_RISK :
			calRisk = new LowRisk();
			break;
		case MODERATE_RISK:
			calRisk = new ModerateRisk();
			break;
		default :
			calRisk = new NormalRisk();
			break;
		}
		return calRisk;
	}
}

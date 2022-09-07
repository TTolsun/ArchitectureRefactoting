package Ex4a.inappropriateintimacy;

public class License {
	private int points = 0;

	public int getPoints() {
		return points;
	}

	public void addPoints(int points) {
		this.points += points;
	}


	// 이건 라이센스로 옮기기
	public RiskFactor getRiskFactor() {
		if(getPoints() > 3)
			return RiskFactor.HIGH_RISK;
		if(getPoints() > 0)
			return RiskFactor.MODERATE_RISK;
		return RiskFactor.LOW_RISK;
	}
}

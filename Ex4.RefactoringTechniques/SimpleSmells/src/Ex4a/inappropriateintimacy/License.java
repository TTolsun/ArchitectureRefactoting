package Ex4a.inappropriateintimacy;

public class License {

	private Motorist motorist;
	private int points = 0;

	public void setMotorist(Motorist motorist) {
		this.motorist = motorist;
	}

	public int getPoints() {
		return points;
	}

	public void addPoints(int points) {
		this.points += points;
	}

	// 이건 모터로 옮기기
	public String getSummary() {
		return motorist.getTitle() + " " + motorist.getFirstName()
		+ " " + motorist.getSurname() + ", " + Integer.toString(getPoints())
		+ " points";
	}


}
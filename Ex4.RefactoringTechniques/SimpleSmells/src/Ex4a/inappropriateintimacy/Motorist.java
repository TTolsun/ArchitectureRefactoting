package Ex4a.inappropriateintimacy;

public class Motorist {


	public final License license;
	private final String surname;

	private final String firstName;
	private final String title;


	public Motorist(License license, String surname, String firstName, String title) {
		this.license = license;
		this.surname = surname;
		this.firstName = firstName;
		this.title = title;

	}

	public String getSurname() {
		return surname;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getTitle() {
		return title;
	}


	// 이건 모터로 옮기기
	public String getSummary(License license) {
		return getTitle() + " " + getFirstName()
		+ " " + getSurname() + ", " + Integer.toString(license.getPoints())
		+ " points";
	}
}

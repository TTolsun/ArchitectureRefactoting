package Ex4a.dataclass;

public class Address {

	private String city;
	private String postcode;
	private String country;


	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public void setCountry(String country) {
		this.country = country;

	}

	public String getAddressString() {
		return getCity() + ", " + getPostcode() + ", " + getCountry();
	}
}

package Ex4b.dataclumps;

public class Customer {

	private final Address address = new Address();
	private String firstName;
	private String lastName;
	private String title;
	public String getHouse() {
		return getAddressString(address.getHouse());
	}

	public String getStreet() {
		return getAddressString(address.getStreet());
	}

	public String getFirstName() {
		return getAddressString(firstName);
	}

	public String getLastName() {
		return getAddressString(lastName);
	}

	public String getTitle() {
		return getAddressString(title);
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getAddressSummary(){
		return getAddressString(address.getHouse() + ", " + address.getStreet() + ", " + address.getCity() + ", " +
				address.getPostcode() + ", " + address.getCountry());
	}

	private String getAddressString(String address) {
		return address;
	}

}

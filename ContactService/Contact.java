package ContactService;

public class Contact {
	private String contactID;
	private String firstName;
	private String lastName;
	private String number;
	private String address;
	
	public Contact(String contactID, String firstName, String lastName, String number, String address) {
		if(contactID == null || contactID.length()> 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		if(firstName == null || firstName.length() >10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if(number == null || number.length() != 10) {
			throw new IllegalArgumentException("Invalid Number");
		}
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.number = number;
		this.address = address;
	}
	
	public String getContactID() {
		return contactID;
	}
	public void setContactID(String contactID) {
		if(contactID == null || contactID.length()>= 10) {
			throw new IllegalArgumentException("Invalid ID");
		}
		this.contactID = contactID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length() >= 10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		if(lastName == null || lastName.length() >= 10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		this.lastName = lastName;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		if(number == null || number.length() != 10) {
			throw new IllegalArgumentException("Invalid Number");
		}
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(address == null || address.length() >= 30) {
			throw new IllegalArgumentException("Invalid Address");
		}
		this.address = address;
	}


}

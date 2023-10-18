package ContactService;
import java.util.ArrayList;
public class ContactService {
	private ArrayList<Contact>contacts;
	
	public ContactService() {
		contacts = new ArrayList<>();
	}
	//add a new contact
	public boolean addContact(Contact contact) {
		boolean contactAlready = false;
		for(Contact contactList:contacts) {
			if(contactList.equals(contact)) {
				contactAlready = true;
			}
		}
		if(!contactAlready) {
			contacts.add(contact);
			return true;
		}
		else {
			return false;
		}
	}
	//remove the contact based on contactID
	public boolean removeContact(String contactID) {
		for(Contact contactList:contacts) {
			if(contactList.getContactID().equals(contactID)) {
				contacts.remove(contactList);
				return true;
			}
		}
		return false;
	}
	//update the contact First Name
	public boolean updateContactFirstName(String contactID, String firstName) {
		for(Contact contactList:contacts) {
			if(contactList.getContactID().equals(contactID)) {
				if(!firstName.equals("")&&!(firstName.length()>10)) {
					contactList.setFirstName(firstName);
				}
				return true;
			}
		}
		return false;
	}
	
	//update the contact Last Name
		public boolean updateContactLastName(String contactID, String lastName) {
			for(Contact contactList:contacts) {
				if(contactList.getContactID().equals(contactID)) {
					if(!lastName.equals("")&&!(lastName.length()>10)) {
						contactList.setLastName(lastName);
					}
					return true;
				}
			}
			return false;
		}
		
		//update the contact Number
		public boolean updateContactNumber(String contactID, String number) {
			for(Contact contactList:contacts) {
				if(contactList.getContactID().equals(contactID)) {
					if(!number.equals("")&&!(number.length()!= 10)) {
						contactList.setNumber(number);
					}
					return true;
				}
			}
			return false;
		}
		
		//update the contact Address
		public boolean updateContactAddress(String contactID, String address) {
			for(Contact contactList:contacts) {
				if(contactList.getContactID().equals(contactID)) {
					if(!address.equals("")&&!(address.length()>=30)) {
						contactList.setAddress(address);
					}
					return true;
				}
			}
			return false;
		}
}

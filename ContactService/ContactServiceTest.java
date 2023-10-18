package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ContactService.Contact;
import ContactService.ContactService;

class ContactServiceTest {

	@Test
	public void testAdd() {
		ContactService cs = new ContactService();
		Contact test = new Contact("12345", "Kyle","Lund","9095551234","Test Drive");
		assertEquals(true, cs.addContact(test));
	}
	@Test
	public void testUpdateFirstName() {
		ContactService cs = new ContactService();
		
		Contact test = new Contact("12345","Jack","Smith","9095551234","Test Street");
		cs.addContact(test);
		assertEquals(true, cs.updateContactFirstName("12345","Jack"));
		assertEquals(false, cs.updateContactFirstName("54321", "Jack"));
	}
	
	@Test
	public void testUpdateLastName() {
		ContactService cs = new ContactService();
		
		Contact test = new Contact("12345","Jack","Smith","9095551234","Test Street");
		cs.addContact(test);
		assertEquals(true, cs.updateContactLastName("12345","Smith"));
		assertEquals(false, cs.updateContactLastName("54321","Smith"));
	}
	
	@Test
	public void testUpdateNumber() {
		ContactService cs = new ContactService();
		
		Contact test = new Contact("12345","Jack","Smith","9095551234","Test Street");
		cs.addContact(test);
		assertEquals(true, cs.updateContactNumber("12345","9095551234"));
		assertEquals(false, cs.updateContactNumber("54321","9095551234"));
	}
	
	@Test
	public void testUpdateAddress() {
		ContactService cs = new ContactService();
		
		Contact test = new Contact("12345","Jack","Smith","9095551234","Test Street");
		cs.addContact(test);
		assertEquals(true, cs.updateContactAddress("12345","Test Street"));
		assertEquals(false, cs.updateContactAddress("54321", "Test Street"));
	}
	@Test
	public void testRemove() {
		ContactService cs = new ContactService();
		
		Contact test = new Contact("12334","Jake","Doe","9095554321","Testing Road");
		cs.addContact(test);
		assertEquals(true, cs.removeContact("12334"));
		assertEquals(false, cs.removeContact("12343"));
	}
}
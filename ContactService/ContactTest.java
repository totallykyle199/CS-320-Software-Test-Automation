package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ContactService.Contact;

class ContactTest {

	@Test
	void testContact() {
		Contact Contact = new Contact("12345","Kyle","Lund", "9095551234","1234 Crown Road");
		assertTrue(Contact.getContactID().equals("12345"));
		assertTrue(Contact.getFirstName().equals("Kyle"));
		assertTrue(Contact.getLastName().equals("Lund"));
		assertTrue(Contact.getNumber().equals("9095551234"));
		assertTrue(Contact.getAddress().equals("1234 Crown Road"));
	}
	@Test
	void testIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new Contact("1234567891011", "Kyle", "Lund", "9095551234", "1234 Crown Road");
		});}
	
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () ->{
			new Contact("12345", "Kyleistoolong", "Lund", "9095551234", "1234 Crown Road");
		});}
	
	@Test
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () ->{
			new Contact("12345", "Kyle", "LundIsTooLong", "9095551234", "1234 Crown Road");
		});}
	
	@Test
	void testPhoneNumberTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () ->{
			new Contact("12345", "Kyle", "Lund", "90955512345555", "1234 Crown Road");
		});}
	
	@Test
	void testAddressToLong() {
		Assertions.assertThrows(IllegalArgumentException.class,  () ->{
			new Contact("12345", "Kyle", "Lund", "9095551234", "1234 Crown Road 171819202122232425");
		});}
	
}

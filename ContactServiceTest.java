import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    private ContactService service;
    private Contact contact;

    @BeforeEach
    public void setUp() {
        service = new ContactService();
        contact = new Contact("001", "Alice", "Wong", "5551234567", "789 Maple Ave");
        service.addContact(contact);
    }

    @Test
    public void testAddContactSuccess() {
        Contact newContact = new Contact("002", "Bob", "Lee", "5559876543", "321 Oak St");
        assertTrue(service.addContact(newContact));
    }

    @Test
    public void testAddContactDuplicateIdFails() {
        Contact duplicate = new Contact("001", "Ann", "Kim", "5550000000", "456 Pine St");
        assertFalse(service.addContact(duplicate));
    }

    @Test
    public void testDeleteContactSuccess() {
        assertTrue(service.deleteContact("001"));
        assertNull(service.getContact("001"));
    }

    @Test
    public void testUpdateContactFields() {
        assertTrue(service.updateFirstName("001", "Ally"));
        assertEquals("Ally", service.getContact("001").getFirstName());

        assertTrue(service.updatePhone("001", "5551112222"));
        assertEquals("5551112222", service.getContact("001").getPhone());
    }

    @Test
    public void testUpdateNonExistentContactFails() {
        assertFalse(service.updateLastName("999", "Smith"));
    }
}
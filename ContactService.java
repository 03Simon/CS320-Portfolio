import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private final Map<String, Contact> contacts = new HashMap<>();

    public boolean addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactId())) {
            return false;
        }
        contacts.put(contact.getContactId(), contact);
        return true;
    }

    public boolean deleteContact(String contactId) {
        return contacts.remove(contactId) != null;
    }

    public boolean updateFirstName(String contactId, String firstName) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setFirstName(firstName);
            return true;
        }
        return false;
    }

    public boolean updateLastName(String contactId, String lastName) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setLastName(lastName);
            return true;
        }
        return false;
    }

    public boolean updatePhone(String contactId, String phone) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setPhone(phone);
            return true;
        }
        return false;
    }

    public boolean updateAddress(String contactId, String address) {
        Contact contact = contacts.get(contactId);
        if (contact != null) {
            contact.setAddress(address);
            return true;
        }
        return false;
    }

    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}
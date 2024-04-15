import java.util.*;

public class Phonebook {
    private Map<String, List<String>> contacts;

    public Phonebook() {
        contacts = new HashMap<>();
    }

    public void add(String lastName, String phoneNumber) {
        if (contacts.containsKey(lastName)) {
            List<String> numbers = contacts.get(lastName);
            numbers.add(phoneNumber);
        } else {
            List<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            contacts.put(lastName, numbers);
        }
    }

    public List<String> get(String lastName) {
        if (contacts.containsKey(lastName)) {
            return contacts.get(lastName);
        } else {
            return new ArrayList<>();
        }
    }

    public void printAll() {
        System.out.println("\nТелефонный справочник:");
        for (Map.Entry<String, List<String>> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

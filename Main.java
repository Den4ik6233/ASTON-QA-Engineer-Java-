import java.util.*;


public class Main {
    public static void main(String[] args) {
        WordCounter wordCounter = new WordCounter();
        wordCounter.run();

        Phonebook phonebook = new Phonebook();

        phonebook.add("Иванов", "12-34-56");
        phonebook.add("Петров", "23-45-67");
        phonebook.add("Сидоров", "34-56-78");
        phonebook.add("Иванов", "45-67-89");
        phonebook.add("Иванов", "56-78-90");

        phonebook.printAll();

        String lastName = "Иванов";
        List<String> ivanovNumbers = phonebook.get(lastName);
        if (!ivanovNumbers.isEmpty()) {
            System.out.println("\nНомер(а) телефона для фамилии " + lastName + ": " + ivanovNumbers);
        } else {
            System.out.println("\nФамилии " + lastName + " нет в справочнике.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Сергей", "Инженер", "ivanov@yandex.ru", "892-31-23", 3000, 35);
        employees[1] = new Employee("Петров Алексей", "Программист", "petrov@gmail.com", "123-45-68", 6000, 28);
        employees[2] = new Employee("Сидоров Олег", "Менеджер", "sidorov@gmail.com", "312-34-56", 4500, 40);
        employees[3] = new Employee("Козлова Анна", "Дизайнер", "kozlova@gmail.com", "123-45-70", 5500, 32);
        employees[4] = new Employee("Смирнов Александр", "Техник", "smirnov@rambler.ru", "123-45-71", 4000, 25);

        // вывод сотрудников
        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }
}
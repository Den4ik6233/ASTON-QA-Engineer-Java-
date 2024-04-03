public class Park {
    private static class Attraction {
        String name;
        String work;
        double cost;
    }

    public static void main(String[] args) {
        //объект класса
        Park park = new Park();
        //объект аттракциона
        Attraction attraction = new Attraction();
        attraction.name = "Карусель";
        attraction.work = "10:00 - 18:00";
        attraction.cost = 5;
        // вывод аттракциона
        System.out.println("Аттракцион: " + attraction.name);
        System.out.println("Время работы: " + attraction.work);
        System.out.println("Стоимость: " + attraction.cost);
    }
}
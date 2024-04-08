public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 5;
        rectangle.height = 3;
        rectangle.fillColor = "Синий";
        rectangle.borderColor = "Черный";

        double areaRectangle = rectangle.calculateArea();
        double perimeterRectangle = rectangle.calculatePerimeter();

        System.out.println("Характеристики прямоугольника:");
        System.out.println("Площадь: " + areaRectangle);
        System.out.println("Периметр: " + perimeterRectangle);
        System.out.println("Цвет заливки: " + rectangle.getFillColor());
        System.out.println("Цвет границы: " + rectangle.getBorderColor());
        System.out.println();

        Circle circle = new Circle();
        circle.radius = 4;
        circle.fillColor = "Красный";
        circle.borderColor = "Зеленый";

        double areaCircle = circle.calculateArea();
        double perimeterCircle = circle.calculatePerimeter();

        System.out.println("Характеристики круга:");
        System.out.println("Площадь: " + areaCircle);
        System.out.println("Периметр: " + perimeterCircle);
        System.out.println("Цвет заливки: " + circle.getFillColor());
        System.out.println("Цвет границы: " + circle.getBorderColor());
        System.out.println();

        Triangle triangle = new Triangle();
        triangle.side1 = 3;
        triangle.side2 = 4;
        triangle.side3 = 5;
        triangle.fillColor = "Желтый";
        triangle.borderColor = "Серый";

        double areaTriangle = triangle.calculateArea();
        double perimeterTriangle = triangle.calculatePerimeter();

        System.out.println("Характеристики треугольника:");
        System.out.println("Площадь: " + areaTriangle);
        System.out.println("Периметр: " + perimeterTriangle);
        System.out.println("Цвет заливки: " + triangle.getFillColor());
        System.out.println("Цвет границы: " + triangle.getBorderColor());
    }
}
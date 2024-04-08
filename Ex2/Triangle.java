public class Triangle {
    double side1;
    double side2;
    double side3;
    String fillColor;
    String borderColor;

    double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    double calculateArea() {
        // Используем формулу Герона для вычисления площади треугольника
        double s = calculatePerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    String getFillColor() {
        return fillColor;
    }

    String getBorderColor() {
        return borderColor;
    }
}
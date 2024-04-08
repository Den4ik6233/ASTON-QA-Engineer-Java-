public class Circle {
    double radius;
    String fillColor;
    String borderColor;

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    String getFillColor() {
        return fillColor;
    }

    String getBorderColor() {
        return borderColor;
    }
}
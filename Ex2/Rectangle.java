public class Rectangle {
    double width;
    double height;
    String fillColor;
    String borderColor;

    double calculateArea() {
        return width * height;
    }

    double calculatePerimeter() {
        return 2 * (width + height);
    }

    String getFillColor() {
        return fillColor;
    }

    String getBorderColor() {
        return borderColor;
    }
}
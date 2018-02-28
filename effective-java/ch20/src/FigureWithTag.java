//잘못된 예, 태그 달린 클래스 대신 클래스 계층을 활용하자
public class FigureWithTag {

    enum Shape{
        RECTANGLE, CIRCLE
    };

    final Shape shape;

    //
    double length;
    double width;

    //
    double radius;

    // Constructor for circle
    FigureWithTag(double radius) {
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    // Constructor for rectangle
    FigureWithTag(double length, double width) {
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    double area() {
        switch (shape) {
            case RECTANGLE:
                return length * width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError();
        }
    }
}

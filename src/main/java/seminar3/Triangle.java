package seminar3;

public class Triangle extends Shape {
    private final double sideOne;
    private final double sideTwo;
    private final double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree) {

        if ((sideOne + sideTwo <= sideThree) ||
                (sideOne + sideThree <= sideTwo) ||
                (sideTwo + sideThree <= sideOne)) {
            throw new RuntimeException("Triangle cannot exist");
        }

        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        return Math.sqrt(halfPerimeter *
                (halfPerimeter - sideOne) *
                (halfPerimeter - sideTwo) *
                (halfPerimeter - sideThree));
    }

    @Override
    double getPerimeter() {
        return sideOne + sideTwo + sideThree;
    }
}
package az.edu.turing.module2.lesson03;

public class FiguresApp {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4, "red");
        Circle circle2 = new Circle(7.6, "blue");
        Circle circle3 = new Circle(9, "black");
        Square square1 = new Square("yellow", 7.0);
        circle3.setColor("green");

        double length1 = calcLength(circle1.getRadius());
        double length2 = calcLength(circle2.getRadius());
        double length3 = calcLength(circle3.getRadius());


        System.out.println(length1);
        System.out.println(length2);
        System.out.println(length3);
        System.out.println(square1.color);
        System.out.println(Circle.getCountOfCircle());
        System.out.println(Square.getCountOfSquare());

    }

    public static double calcLength(double radius) {
        return radius * 2 * Math.PI;
    }

}

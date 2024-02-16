package az.edu.turing.module2.lesson03;

public class CircleApp {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4, "red");
        Circle circle2 = new Circle(7.6, "blue");
        Circle circle3 = new Circle(9, "black");

        System.out.println(Circle.getCountOfCircle());
        double length1 = calcLength(circle1.getRadius());
        double length2 = calcLength(circle2.getRadius());
        double length3 = calcLength(circle3.getRadius());
        System.out.println(length1);
        System.out.println(length2);
        System.out.println(length3);
    }


    public static double calcLength(double radius) {
        return radius * 2 * Math.PI;
    }

}

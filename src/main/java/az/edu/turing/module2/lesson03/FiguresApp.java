package az.edu.turing.module2.lesson03;

public class FiguresApp {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4, "red");
        Figures circle2 = new Figures( "blue");
        //Circle circle3 = new Circle(9, "black");
        Figures square1 = new Circle(5,"fehrbhe");
        System.out.println(circle1 instanceof Figures);
        System.out.println(circle2 instanceof Circle);
        System.out.println(square1 instanceof Circle);
      /*  circle3.setColor("green");

        double length1 = calcLength(circle1.getRadius());
        double length2 = calcLength(circle2.getRadius());
        double length3 = calcLength(circle3.getRadius());


        System.out.println(length1);
        System.out.println(length2);
        System.out.println(length3);
        System.out.println(square1.color);
        System.out.println(Circle.getCountOfCircle());
        System.out.println(Square.getCountOfSquare());*/

    }

    public static double calcLength(double radius) {
        return radius * 2 * Math.PI;
    }

}

package az.edu.turing.module2.lesson03;



public class Circle extends Figures{
    private double radius;

    private static long countOfCircle;

    public Circle(double radius, String color) {
        super(color);
        ++countOfCircle;
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }



    public static long getCountOfCircle() {
        return countOfCircle;

    }

    public static void setCountOfCircle(long countOfCircle) {
        Circle.countOfCircle = countOfCircle;
    }
}

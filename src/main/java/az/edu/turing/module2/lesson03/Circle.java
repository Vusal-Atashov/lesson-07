package az.edu.turing.module2.lesson03;

import java.util.Objects;

public class Circle {
    private double radius;
    private String color;
    private static long countOfCircle;

    public Circle(double radius, String color) {
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!Objects.equals(color, "white"))
            this.color = color;
    }

    public static long getCountOfCircle() {
        return countOfCircle;

    }

    public static void setCountOfCircle(long countCircle) {
        Circle.countOfCircle = countCircle;
    }
}

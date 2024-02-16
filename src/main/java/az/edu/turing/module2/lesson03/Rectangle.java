package az.edu.turing.module2.lesson03;

public class Rectangle extends Figures{

    double width;
    double length;

    public Rectangle(String color, double width, double length) {
        super(color);
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

}

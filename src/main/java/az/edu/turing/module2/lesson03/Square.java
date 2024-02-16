package az.edu.turing.module2.lesson03;

public class Square {

    private Double side;
    private String color;

    private static long countOfSquare;

    public Square(String color, Double side) {

        this.color = color;
        this.side = side;
        ++countOfSquare;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!"white".equals(color)) {
            this.color = color;
        }
    }

    public static long getCountOfSquare() {
        return countOfSquare;
    }

    public void setCountOfSquare(long countOfSquare) {
        this.countOfSquare = countOfSquare;
    }


    public Double getSide() {
        return side;
    }

    public void setSide(Double side) {
        this.side = side;
    }
}

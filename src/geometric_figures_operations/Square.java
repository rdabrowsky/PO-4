package geometric_figures_operations;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double CountArea() {
        return Math.pow(this.side, 2);
    }

    public double CountPerimeter() {
        return this.side * 4;
    }

    public void ShowData() {
        System.out.println("Figure: Square");
        System.out.println("Length of the side: " + this.side);
        System.out.println("Area of the square: " + CountArea());
        System.out.println("Perimeter of the square: " + CountPerimeter());
    }
}
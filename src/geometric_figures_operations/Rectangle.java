package geometric_figures_operations;

public class Rectangle {
    private double side_a;
    private double side_b;

    public Rectangle(double side_a, double side_b) {
        this.side_a = side_a;
        this.side_b = side_b;
    }

    public double CountArea() {
        return this.side_a * this.side_b;
    }

    public double CountPerimeter() {
        return this.side_a * 2 + this.side_b * 2;
    }

    public void ShowData() {
        System.out.println("Figure: Rectangle");
        System.out.println("Length of the side 'a'" + this.side_a);
        System.out.println("Length of the side 'b'" + this.side_b);
        System.out.println("Area of the rectangle: " + CountArea());
        System.out.println("Perimeter of the rectangle: " + CountPerimeter());
    }
}
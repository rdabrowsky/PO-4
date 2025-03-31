package geometric_figures_operations;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double CountArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double CountPerimeter() {
        return Math.PI * this.radius * 2;
    }

    public void ShowData() {
        System.out.println("Figure: Circle");
        System.out.println("Radius: " + this.radius);
        System.out.println("Area: " + CountArea());
        System.out.println("Perimeter: " + CountPerimeter());
    }
}

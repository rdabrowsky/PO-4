package geometric_figures_operations;

public class Cone {
    double radius;
    double height;
    double length_of_side;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
        this.length_of_side = SetLengthOfSide();
    }

    public Cone(double radius, double height, double length_of_side) {
        this.radius = radius;
        this.height = height;
        this.length_of_side = length_of_side;
    }

    public double SetLengthOfSide() {
        return Math.sqrt(Math.pow(this.radius, 2) + Math.pow(this.height, 2));
    }

    public double CountArea() {
        return Math.PI * this.radius * (this.radius + this.length_of_side);
    }

    public double CountVolume() {
        return Math.PI * Math.pow(this.radius, 2) * 1 / 3;
    }

    public void ShowData() {
        System.out.println("Figure: Cone");
        System.out.println("Radius of the cone: " + this.radius);
        System.out.println("Length of the height: " + this.height);
        System.out.println("Length of the side: " + this.length_of_side);
        System.out.println("Area of the cone: " + CountArea());
        System.out.println("Volume of the cone: " + CountVolume());
    }
}

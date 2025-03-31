package geometric_figures_operations;

public class Cube {
    private double side;


    public Cube(double side) {
        this.side = side;
    }

    public double CountArea() {
        return Math.pow(this.side, 2) * 6;
    }

    public double CountVolume() {
        return Math.pow(this.side, 3);
    }

    public void ShowData() {
        System.out.println("Figure: Cube");
        System.out.println("Length of the side" + this.side);
        System.out.println("Area of the cube: " + CountArea());
        System.out.println("Volume of the cube: " + CountVolume());
    }
}
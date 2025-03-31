package geometric_figures_operations;

public class Cuboid {
    private double a;
    private double b;
    private double h;


    public Cuboid(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    /*
     * When bottom of the figure is square
     * */
    public Cuboid(double a, double h) {
        this.a = a;
        this.b = a;
        this.h = h;
    }

    public double CountArea() {
        return (this.a * this.b + this.b * this.h + this.h * this.a) * 2;
    }

    public double CountVolume() {
        return this.a * this.b * this.h;
    }

    public void ShowData() {
        System.out.println("Figure: Cuboid");
        System.out.println("Length of the side 'a': " + this.a);
        System.out.println("Length of the side 'b': " + this.b);
        System.out.println("Length of the side 'h' (height): " + this.h);
        System.out.println("Area of the cuboid: " + CountArea());
        System.out.println("Volume of the cuboid: " + CountVolume());
    }
}
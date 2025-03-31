package geometric_figures_operations;

public class Globe {
    double radius;

    public Globe(double radius) {
        this.radius = radius;
    }

    public double CountArea() {
        return Math.pow(this.radius, 2) * 4;
    }

    public double CountVolume() {
        return Math.PI * Math.pow(this.radius, 3) * 4 / 3;
    }

    public void ShowData() {
        System.out.println("Figure: Globe");
        System.out.println("Radius of the globe" + this.radius);
        System.out.println("Area of the globe: " + CountArea());
        System.out.println("Volume of the globe: " + CountVolume());
    }
}

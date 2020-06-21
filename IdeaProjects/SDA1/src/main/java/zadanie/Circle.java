package zadanie;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateCircuit() {
        return 2 * Math.PI * radius;
    }
}

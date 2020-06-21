package zadanie;

public class Square implements Shape {
  private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calculateCircuit() {
        return 4 * a;
    }
}

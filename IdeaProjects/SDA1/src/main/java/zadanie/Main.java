package zadanie;

public class Main {
    public static void main(String[] args) {
        Shape[] tablica1 ={new Square(4.6),new Circle(3.3)};
        Circle[] tablica2 ={new Circle(4.1),new Circle(8.3)};
        Square[] tablica3 ={new Square(10.1),new Square(4.7)};

        BoxForShapes<Circle> boxForCircles = new BoxForShapes<>(tablica2);
        BoxForShapes<Shape> boxForShapes = new BoxForShapes<>(tablica1);
        BoxForShapes<Square> boxForSquares = new BoxForShapes<>(tablica3);

        double result1 = boxForCircles.totalSumCircuit();
        double result2 = boxForShapes.totalSumCircuit();
        double result3 = boxForSquares.totalSumCircuit();

        System.out.println("Suma obwodow circle: " + result1);
        System.out.println("Suma obwodow shape: " + result2);
        System.out.println("Suma obwodow square: " + result3);

    }
}

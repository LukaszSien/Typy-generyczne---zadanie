package zadanie;

public class BoxForShapes <T extends Shape> {
    T[] shapes;

    public BoxForShapes(T[] shapes) {
        this.shapes = shapes;
    }

    public double totalSumCircuit(){
        double wynik = 0;
        for(T t : shapes){
            wynik += t.calculateCircuit();
        }
        return wynik;
    }


}

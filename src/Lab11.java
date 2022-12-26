public class Lab11 {

    public static void main(String[] args) {
        Triangle t = new Triangle(3, 4, 5);
        System.out.println ("Периметр треугольника: " + t.getPerimeter());
        System.out.println("Площадь треугольника: " + t.getSquare());
        t.print();

        Rectangle r = new Rectangle(12, 9);
        System.out.println("Периметр прямоугольника: " + r.getPerimeter());
        System.out.println("Площадь прямоугольника: " + r.getSquare());
        r.print();

        ArrayOfIntegers arr = new ArrayOfIntegers(5);
        arr.createArray();
        arr.print();
        arr.sortArray();
        arr.print();
    }
}
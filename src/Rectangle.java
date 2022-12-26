public class Rectangle {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getPerimeter() {
        return 2 * (a + b);
    }

    public int getSquare() {
        return a * b;
    }

    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Длины сторон прямоугольника: " + a + ", " + b;
    }
}
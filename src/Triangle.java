public class Triangle {
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getPerimeter() {
        return a + b + c;
    }

    // по формуле герона
    public double getSquare() {
        double p = this.getPerimeter() / 2; // полупериметр
        double s = Math.sqrt(p * (p-a) * (p-b) * (p-c));
        return s;
    }

    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Стороны треугольника: " + a +", "+ b + ", " + c;
    }
}
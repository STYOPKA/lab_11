import java.util.Scanner;

public class ArrayOfIntegers {
    private int [] intArray;
    private int n;


    public ArrayOfIntegers(int n) {
        this.n = n;
        this.intArray = new int[n+1];
    }

    public void createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите " + n + " чисел: ");
        for (int i = 0; i < n; i++) {
            this.intArray[i] = sc.nextInt();
        }
    }

    public void sortArray() {
        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++) {
                int tmp = 0;
                if(this.intArray[i] > this.intArray[j]) {
                    tmp = this.intArray[i];
                    this.intArray[i] = this.intArray[j];
                    this.intArray[j] = tmp;
                }
            }
        }
    }


    public void print() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += " " + this.intArray[i];
        }
        return s;
    }
}
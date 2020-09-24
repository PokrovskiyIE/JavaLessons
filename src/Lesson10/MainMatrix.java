package Lesson10;


public class MainMatrix {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 4);
        System.out.println(matrix.getRows());
        System.out.println(matrix.getColumns());
        matrix.printToConsole();
    }

}

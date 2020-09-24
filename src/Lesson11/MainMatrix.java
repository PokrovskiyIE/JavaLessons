package Lesson11;


public class MainMatrix {
    public static void main(String[] args) {
        double[][] num1 = {{4, 4, 3, 7}, {2, 4, 6, 8}, {5, 6, 3, 9}};

        Matrix matrix1 = new Matrix(num1);

        double[][] num2 = {{7, 4, 7, 0}, {2, 3, 6, 6}, {5, 9, 8, 4}};

        Matrix matrix2 = new Matrix(num2);

        nedis.study.interfaces.t3.classes.IMatrix resultAdd = matrix1.add(matrix2);
        resultAdd.printToConsole();

        double[][] num3 = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}};
        Matrix matrix3 = new Matrix(num3);
        //System.out.println(matrix3.isIdentityMatrix() + " " + matrix3.isNullMatrix());
        System.out.println(matrix3.isNullMatrix() + " " + matrix3.isIdentityMatrix());

        matrix2.printToConsole();
        matrix2.transpose().printToConsole();



    }

}

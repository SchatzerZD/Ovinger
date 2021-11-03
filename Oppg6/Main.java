import java.util.Arrays;

class Main{
  public static void main(String[] args) {

    int[][] a = {{1,2},{3,4}};
    int[][] b = {{1,9},{3,4}};

    Matrix matrixA = new Matrix(a);
    Matrix matrixB = new Matrix(b);

    matrixA.printMatrix();
    System.out.println("-------");
    matrixB.printMatrix();

    System.out.println("\n-------\n");

    matrixA.addMatrix(matrixB).printMatrix();

    System.out.println("\n-------\n");

    matrixA.transMatrix().printMatrix();

    System.out.println("\n-------\n");

    matrixA.multiMatrix(matrixB).printMatrix();

  }
}

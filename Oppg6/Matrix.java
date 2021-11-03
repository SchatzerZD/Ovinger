import java.util.Arrays;

public final class Matrix{

  private final int[][] matrix;

  public Matrix(int[][] matrix){
      this.matrix = matrix;
  }

  public int[][] getMatrix(){
    return matrix;
  }

  public void printMatrix(){
    System.out.println(Arrays.toString(matrix[0]));
    System.out.println(Arrays.toString(matrix[1]));
  }

  public Matrix addMatrix(Matrix secondMatrix){
    if(isTwoMatrix(this.getMatrix()) == true){

      int[][] aCopy = this.getMatrix();
      int[][] bCopy = secondMatrix.getMatrix();

      int[][] c = new int[2][2];

      for(var i=0;i<2;i++){
        for(var j=0;j<2;j++){
          c[i][j] = aCopy[i][j] + bCopy[i][j];
        }
      }

      Matrix addedMatrix = new Matrix(c);
      return addedMatrix;
  }else{
    return null;
  }
}

  public Matrix transMatrix(){
    if(isTwoMatrix(this.getMatrix()) == true){

    int[][] aCopy = this.getMatrix();
    int[][] b = new int[2][2];

    for(var i=0;i<2;i++){
      for(var j=0;j<2;j++){
        b[i][j] = aCopy[j][i];
      }
    }

    Matrix transposedMatrix = new Matrix(b);
    return transposedMatrix;


  }else{
    return null;
  }
}

  public Matrix multiMatrix(Matrix secondMatrix){
    if(isTwoMatrix(this.getMatrix()) == true){
    int[][] aCopy = this.getMatrix();
    int[][] bCopy = secondMatrix.transMatrix().getMatrix();
    int[][] c = new int[2][2];

    for(var i=0;i<2;i++){
      for(var j=0;j<2;j++){
        c[i][j] = (aCopy[i][0] * bCopy[j][0]) + (aCopy[i][1] * bCopy[j][1]);
      }
    }

    Matrix multiplied = new Matrix(c);
    return multiplied;

  }else{
    return null;
  }
}

  static boolean isTwoMatrix(int[][] a){
    if(a.length == 2 && a[0].length == 2 && a[1].length == 2){
      return true;
    }else{
      return false;
    }
  }



}

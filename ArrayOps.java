public class ArrayOps {

  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    return sum;
  }

  public static int largest(int[] arr) {
    int largest = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > largest) largest = arr[i];
    }
    return largest;
  }

  public static int[] sumRows(int[][] matrix) {
    int[] arr_1D = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      arr_1D[i] = sum(matrix[i]);
    }
    return arr_1D;
  }

  public static int[] largestInRows(int[][] matrix) {
    int[] arr_1D = new int[matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      arr_1D[i] = largest(matrix[i]);
    }
    return arr_1D;
  }

  public static int sum(int[][] arr) {
    int[] arr_1D = sumRows(arr);
    int sum = sum(arr_1D);
    return sum;
  }

  public static int[] sumCols(int[][] matrix) {
    int[] sumCols = new int[matrix[0].length];
    for (int i = 0; i < matrix[0].length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        sumCols[i] += matrix[j][i];
      }
    }
    return sumCols;
  }

  public static boolean isRowMagic(int[][] matrix) {
    boolean isSameSum = true;
    for (int i = 1; i < matrix.length; i++) {
      int sumNow = sum(matrix[i]);
      int sumBefore = sum(matrix[i-1]);
      if (sumNow != sumBefore) isSameSum = false;
    }
    return isSameSum;
  }

  public static boolean isColMagic(int[][] matrix) {
    boolean isSameSum = true;
    int sNow = 0;
    int sBefore = 0;
    for (int i = 1; i < matrix[0].length; i++) {
      for (int j = 0; j < matrix.length; j++) {
        sNow += matrix[j][i];
        sBefore += matrix[j][i-1];
      }
      if (sNow != sBefore) isSameSum = false;
      sNow = 0;
      sBefore = 0;
    }
    return isSameSum;
  }

  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
    boolean isSameSum = false;
    int sumRow = sum(matrix[row]);
    int sumCol = 0;
    for (int i = 0; i < matrix.length; i++) {
      sumCol += matrix[i][col];
    }
    if (sumRow == sumCol) isSameSum = true;
    return isSameSum;
  }

}

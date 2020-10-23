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

  public static String arrToString(int[] arr) {
    String sArr = "{" ;
    for (int i = 0; i < arr.length; i++) {
      if (i != arr.length-1) sArr = sArr + arr[i] + ", ";
      else sArr = sArr + arr[i];
    }
    sArr = sArr + "}";
    return sArr;
  }

  public static String arrayDeepToString(int[][] arr) {
    String sDArr = "{";
    for (int i = 0; i < arr.length; i++) {
      if (i != arr.length-1) sDArr = sDArr + arrToString(arr[i]) + ", ";
      else sDArr = sDArr + arrToString(arr[i]);
    }
    sDArr = sDArr + "}";
    return sDArr;
  }


}

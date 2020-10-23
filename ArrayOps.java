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

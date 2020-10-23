public class Tester {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    System.out.println(ArrayOps.sum(arr));
    System.out.println(ArrayOps.largest(arr));
    int[][] arr2 = {{1,2,3}, {1,2,4}};
    int[] arr3 = ArrayOps.sumRows(arr2);
    int[] arr4 = ArrayOps.largestInRows(arr2);
    int[] arr5 = ArrayOps.sumCols(arr2);
    String arrS = ArrayOps.arrToString(arr3);
    String arrS2 = ArrayOps.arrToString(arr4);
    String arrS3 = ArrayOps.arrToString(arr5);
    System.out.println(arrS);
    System.out.println(arrS2);
    System.out.println(ArrayOps.sum(arr2));
    System.out.println(arrS3);
  }
}

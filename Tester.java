public class Tester {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3};
    System.out.println(ArrayOps.sum(arr));
    System.out.println(ArrayOps.largest(arr));
    int[][] arr2 = {{1,2,3}, {1,2,4}};
    int[][] arr6 = {{1,3,3}, {1,2,4}, {-1,5,3}};
    int[][] arr7 = {{1,1,1}, {2,2,2}, {3,3,3}};
    int[][] arr8 = {{2,4,2}, {2,2,2}};
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
    System.out.println(ArrayOps.isRowMagic(arr2));
    System.out.println(ArrayOps.isRowMagic(arr6));
    System.out.println(ArrayOps.isColMagic(arr2));
    System.out.println(ArrayOps.isColMagic(arr7));
    System.out.println(ArrayOps.isLocationMagic(arr8, 0, 1));
    System.out.println(ArrayOps.isLocationMagic(arr8, 1, 1));
  }
}

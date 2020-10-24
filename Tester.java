import java.util.Arrays;

public class Tester {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4};
    int[] arr2 = {-1, 5, 8, -2};
    int[] arr3 = {12, 7, -2, -8};
    int[] arr4 = {8, 13, 22, 28};
    int[] arr5 = {6, 6, 6};
    int[] arr6 = {11, 12, 13};

    int[][] arr7 = {arr, arr2};
    int[][] arr8 = {arr3, arr4};
    int[][] arr9 = {arr5, arr6};

    //Tests for sum()
    System.out.println("sum() tests");
    System.out.println((ArrayOps.sum(arr)) + " : Should be 10");
    System.out.println((ArrayOps.sum(arr2)) + " : Should be 10");
    System.out.println((ArrayOps.sum(arr3)) + " : Should be 9");
    System.out.println((ArrayOps.sum(arr4)) + " : Should be 71");
    System.out.println();

    //Tests for largest()
    System.out.println("largest() tests");
    System.out.println((ArrayOps.largest(arr)) + " : Should be 4");
    System.out.println((ArrayOps.largest(arr2)) + " : Should be 8");
    System.out.println((ArrayOps.largest(arr3)) + " : Should be 12");
    System.out.println((ArrayOps.largest(arr4)) + " : Should be 28");
    System.out.println();

    //Tests for sumRows()
    System.out.println("sumRows() tests");
    System.out.println((Arrays.toString(ArrayOps.sumRows(arr7))) + " : Should be [10, 10]");
    System.out.println((Arrays.toString(ArrayOps.sumRows(arr8))) + " : Should be [9, 71]");
    System.out.println();

    //Tests for largestInRows()
    System.out.println("largestInRows() tests");
    System.out.println((Arrays.toString(ArrayOps.largestInRows(arr7))) + " : Should be [4, 8]");
    System.out.println((Arrays.toString(ArrayOps.largestInRows(arr8))) + " : Should be [12, 28]");
    System.out.println();

    //Tests for sum()
    System.out.println("sum() tests");
    System.out.println((ArrayOps.sum(arr7)) + " : Should be 20");
    System.out.println((ArrayOps.sum(arr8)) + " : Should be 80");
    System.out.println();

    //Tests for somCols()
    System.out.println("sumCols() tests");
    System.out.println((Arrays.toString(ArrayOps.sumCols(arr7))) + " : Should be [0, 7, 11, 2]");
    System.out.println((Arrays.toString(ArrayOps.sumCols(arr8))) + " : Should be [20, 20, 20, 20]");
    System.out.println();

    //Tests for isRowMagic()
    System.out.println("isRowMagic() tests");
    System.out.println((ArrayOps.isRowMagic(arr7)) + " : Should be true");
    System.out.println((ArrayOps.isRowMagic(arr8)) + " : Should be false");
    System.out.println();

    //Tests for isColMagic()
    System.out.println("isColMagic() tests");
    System.out.println((ArrayOps.isColMagic(arr7)) + " : Should be false");
    System.out.println((ArrayOps.isColMagic(arr8)) + " : Should be true");
    System.out.println();

    //Tests for isLocationMagic()
    System.out.println("isLocationMagic() tests");
    System.out.println((ArrayOps.isLocationMagic(arr9, 0, 0)) + " : Should be false");
    System.out.println((ArrayOps.isLocationMagic(arr9, 0, 1)) + " : Should be true");
    System.out.println();

  }
}

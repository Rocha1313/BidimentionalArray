import java.util.Arrays;

public class BidimentionalArray {

    private static final int[][] bidiArray = new int[][]{{0,0},{0,1},{1,0},{1,1},{2,0},{2,1},{3,0},{3,1}};

    public static void print(){
        for (int[] i : bidiArray){

            System.out.println(Arrays.toString(i));
            System.out.println();
        }
    }
}

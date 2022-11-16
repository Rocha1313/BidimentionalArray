public class BidimentionalArray {

    private static final int[][] bidiArray = new int[][]{{0,0},{0,1},{1,0},{1,1},{2,0},{2,1}};

    public static void print(){
        for (int i = 0; i < bidiArray.length; i++){
            System.out.print("{ ");
            for (int f = 0; f < bidiArray[i].length; f++){
                if(f == 0){
                    System.out.print(bidiArray[i][f] + " ,");
                    continue;
                }
                System.out.print(bidiArray[i][f]);
            }
            System.out.println(" }");
        }
    }
}

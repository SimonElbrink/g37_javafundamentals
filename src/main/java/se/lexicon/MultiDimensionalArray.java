package se.lexicon;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        int[][] twoDimensionalArray = new int[3][3];

        twoDimensionalArray[0][1] = 1;

        //System.out.println(twoDimensionalArray[0][0]); // Print out

        for (int i=0 ; i < twoDimensionalArray.length; i++){

            for (int j = 0; j < twoDimensionalArray[i].length; j++){

                System.out.println(twoDimensionalArray[i][j]);

                if (j == twoDimensionalArray[i].length -1){
                    System.out.println();
                }
            }
        }
    }


}

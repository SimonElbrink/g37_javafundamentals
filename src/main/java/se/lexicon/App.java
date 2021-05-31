package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        foo();
//        int[] numbers;
//        numbers = new int[4];   // [0 , 0 , 0 , 0]
//
//        System.out.println( "numbers[1] : " + numbers[1]);
//
//        numbers[1] = 99; // [0 , 99 , 0 , 0]
//
//        System.out.println( "numbers[1] : " + numbers[1]);
//
//        foo();
//        char[] chars = {'J', 'A', 'V', 'A'};
//
//
//
//        System.out.println("How long is this Array? : "+ chars.length);
//
//        foo();


        int[][] twoDimensionalArray = new int[3][3];

        twoDimensionalArray[0][1] = 1;

        //System.out.println(twoDimensionalArray[0][0]);

        for (int i=0 ; i < twoDimensionalArray.length; i++){

            for (int j = 0; j < twoDimensionalArray[i].length; j++){

                System.out.println(twoDimensionalArray[i][j]);

                if (j == twoDimensionalArray[i].length -1){
                    System.out.println();
                }
            }
        }





    }

    public static void foo(){
        System.out.println( "Hello World!" );
    }

}

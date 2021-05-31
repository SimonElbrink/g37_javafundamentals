package se.lexicon;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        foo();
        int[] numbers;
        numbers = new int[4];   // [0 , 0 , 0 , 0]

        System.out.println( "numbers[1] : " + numbers[1]);

        numbers[1] = 99; // [0 , 99 , 0 , 0]

        System.out.println( "numbers[1] : " + numbers[1]);

        foo();
        char[] chars = {'J', 'A', 'V', 'A'};

        System.out.println("How long is this Array? : "+ chars.length);

        foo();








    }

    public static void foo(){
        System.out.println( "Hello World!" );
    }

}

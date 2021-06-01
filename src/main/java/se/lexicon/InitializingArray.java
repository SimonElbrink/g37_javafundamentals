package se.lexicon;

/**
 * As you might see there are many ways of creating a Array.
 * Feel free to use the one you understand and fits in you situation.
 *
 */
public class InitializingArray {

    public static void main(String[] args) {

        char[] chars = new char[10]; //Creating an char Array with FIXED Size/Length of 10 elements. (Index 0-9)

        int[] numbers; // Creating a non-initialised Array.
        numbers = new int[4];   //Instantiating the numbers array with size 4.  = [0 , 0 , 0 , 0]

        float floatingPoints[]; //Additional way of creating an Array. (it's not instantiated yet)

        char[] word = new char[] {'J', 'A', 'V', 'A'}; //An char array of Size 4 and can be accessed through "word".

        String[] sentence = {"Hi", "group37", "nice", "to", "meet", "you"}; // String Array of size 6 (0-5 index) containing words.


        int[] counting = new int[5]; // Creating a int Array of size 5. (looks like this [0, 0, 0, 0, 0])
        counting[0] = 1;    //[1, 0, 0, 0, 0]
        counting[1] = 2;    //[1, 2, 0, 0, 0]
        counting[2] = 3;    //[1, 2, 3, 0, 0]
        counting[3] = 4;    //[1, 2, 3, 4, 0]
        counting[4] = 5;    //[1, 2, 3, 4, 5]


    }
}

package se.lexicon;

public class InitializingArray {

    public static void main(String[] args) {

        char[] chars = new char[10]; //Creating an char Array with FIXED Size/Length of 10 elements. (Index 0-9)

        int[] numbers; // Creating a non-initialised Array.
        numbers = new int[4];   //Instantiating the numbers array with size 4.  = [0 , 0 , 0 , 0]

        float floatingPoints[]; //Additional way of creating an Array. (it's not instantiated yet)

        char[] word = new char[] {'J', 'A', 'V', 'A'}; //Could be done like this.

        String[] sentence = {"Hi", "group37", "nice", "to", "meet", "you"}; //Or like this.. ;)


        int[] counting = new int[5]; // Even this is good.
        counting[0] = 1;
        counting[1] = 2;
        counting[2] = 3;
        counting[3] = 4;
        counting[4] = 5;


        /*
        As you might see there are many ways of creating a Array.
        Feel free to use the one you understand and fits in you situation.
         */

    }
}

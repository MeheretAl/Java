package Leet;

import java.util.Arrays;
import java.util.Comparator;

public class SortSentence {
    public static void main(String[] args) {
        String sentence = "This1 a3 is2 sentence4";
        String answer = sortSentence(sentence);
        System.out.println(answer);

    }

    public static String sortSentence(String sentence){
        String[] parts = sentence.split(" ");
        // would be much easier in python with the lambda function
        // using a custom comparator for the Arrays.sort method to order
        // according to the last element of the words
        // numbers guaranteed to be between 1-9 so no need to worry about
        // parsing and cutting and stuff like that just sort according to
        // the last element of the word

        Arrays.sort(parts, new Comparator<String>() {
            public int compare(String s1,String s2){
                int num1 = Character.getNumericValue(s1.charAt(s1.length() -1 ));
                // so  Character is a wrapper class for char
                // .getNumericValue gets the numeric value of a char like '2' becomes 2
                // s1.length() - 1 gets the index of the last element which is where our number
                // is found and the charAt method grabs the character found at the specified index
                int num2 = Character.getNumericValue(s2.charAt(s2.length()-1));
                return Integer.compare(num1,num2);
            }
        });

        for( int i = 0; i < parts.length; i++) {
            parts[i] = parts[i].substring(0,parts[i].length() - 1);
        } // separates the number from the word
        //as for the two parameters in the substring method
        // the first one is inclusive the second one is exclusive(doesn't include that index)

        return String.join(" ",parts);


    }
}

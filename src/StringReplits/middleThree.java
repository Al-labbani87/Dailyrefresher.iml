package StringReplits;

import java.util.Scanner;

public class middleThree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE
        if (word.length()%2!=0 || word.length()>5){
            System.out.println(word.substring(word.length()/2-1,word.length()/2+2));
        }else {
            System.out.println("invalid");
        }



        /*
            Given a String variable word print the middle three characters if the word is an odd number of characters and has more than 5 characters.
            If the word does not meet the requirements print invalid.
         */
}}

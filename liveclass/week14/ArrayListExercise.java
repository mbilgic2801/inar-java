package week14;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercise {
    public static void main(String[] args) {
        //create one String
        // shuffle that string and add a random letter to a random position,
        //then store is as new string
        //compare those two strings, and find the added letter with its index
        String word="Inar Academy";
        String shuffled="";

        char random;

        ArrayList<Character> list=new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            list.add(word.charAt(i));
        }
        System.out.println(list.toString());
        Collections.shuffle(list);
        System.out.println(list.size());
        System.out.println(list.size());
        int index=(int)(Math.random()*list.size());
        char addedCharacter=(char)(Math.random()*26+'a') ;
        list.add(index,addedCharacter);
        System.out.println(list.toString());
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            shuffled+=list.get(i);
        }
        System.out.println(shuffled);
        String temp=shuffled;
        temp="7qwrteguq";
        System.out.println(shuffled);
        System.out.println(temp);
        for (int i = 0; i < word.length(); i++) {
            int index1=temp.indexOf(word.charAt(i));
            if(index1>-1){

            }
        }
    }
}

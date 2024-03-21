package com.athang.javatraining.basicjava;

import java.util.ArrayList;

public class LongestWords {
    public static void main(String[] args) {
        String[] dictionary = {"cat","flag","mamick","test","athang"};
        ArrayList<String> longestWords = findLongestWords(dictionary);

        if(longestWords.isEmpty()){
            System.out.println("No Words Found");
        }
        else{
            System.out.println("Longest Words:" + longestWords);
        }
    }
    public static ArrayList<String> findLongestWords(String[] dictionary){
        int maxLength = 0;
        ArrayList<String> longestWords = new ArrayList<>();

        for(String word:dictionary){
            int wordLength = word.length();
            if(wordLength > maxLength){
                maxLength = wordLength;
                longestWords.clear();
                longestWords.add(word);
            } else if (wordLength == maxLength) {
                longestWords.add(word);

            }
        }
        return longestWords;
    }
}

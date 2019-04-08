package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(scrambleWord("TAN"));
        System.out.println(scrambleWord("ABRACADABRA"));
    }

    public static String scrambleWord(String word){
        String newWord=word;
        for(int i = 0; i < word.length()-1; i++){
            if(word.substring(i,i+1).equals("A")&&!word.substring(i+1,i+2).equals("A")){
                newWord=newWord.substring(0, i) + newWord.charAt(i+1)
                        + newWord.substring(i + 1, i+1) + newWord.charAt(i)
                        + newWord.substring(i+1 + 1, newWord.length());
            }
        }
        return newWord;
    }

}

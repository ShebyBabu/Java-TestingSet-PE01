package com.sheby;

public class ConsonantOrVowel {
    private String word;
    private int length;

    public ConsonantOrVowel(String word) {
        this.word = word;
    }

    public String checkConsonantOrVowel(String word) {
        length = word.length();
        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);             //getting each character from the string
            if (Character.isDigit(ch))           //condition to check if the character is digit or not
            {
                return "Error";        //if the character is digit then print error
            } else if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
                return "Vowel";         //condition to check if the character is vowel or not and print
            } else {
                return "Consonant";      //if the character is consonant then print consonant
            }

        }

return null;
    }
}
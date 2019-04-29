package com.sheby;

public class GuessingNumber {
    private int guessedNumber;          //input variable
    private int targetNumber = 100;  //setting the target number/original number as 100
    private String result;

    public GuessingNumber(int guessedNumber) {
        this.guessedNumber = guessedNumber;
    }


    public String guessingNumberMethod(int guessedNumber, int targetNumber) {
        if (guessedNumber > targetNumber) {
            return "Number guessed is more than original number";  //if the target is greater than the guessed number
        } else if (guessedNumber < targetNumber) {
            return "Number guessed is less than original number";  //if the target is lesser than the guessed number
        } else {
            return "Number guessed matches original number";       //if the target number is equal to guessed number
        }
    }

}




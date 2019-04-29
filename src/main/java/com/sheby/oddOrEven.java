//2. Write a program which accepts an integer number as input from the user and perform the
//following conditional checks:
//a. Print Tom if number is odd and exists between 20 to 30
//b. Print Jerry, if number is even and exists between 20 and 30

package com.sheby;

public class oddOrEven {

    private int number;
    private String result;

    public oddOrEven(int number) {
        this.number = number;
    }


    public String checkOddOrEven(int number) {
        if (number >= 20 && number <= 30) {
            if (number % 2 != 0)         //if the number is odd then print Tom
            {
                return "Tom";
            } else {           //if the number is even then print Jerry
                return "Jerry";
            }
        } else            //if the number is not between 20 and 30, then print error
        {
            return "Error";
        }

    }
}









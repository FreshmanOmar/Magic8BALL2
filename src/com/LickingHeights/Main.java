package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Declare
        String question;
        int testing;
        int ten = 10, twenty = 20, thirty = 30, fourty = 40, fifty = 50, sixty = 60, seventy = 70, eighty = 80, ninty = 90, hundred = 100;
        Scanner input;

        //initilizing
        input = new Scanner(System.in);
        question = "Hello im a Magic 8 Ball i can give a fortune in return for a number think of your question then write you number";
        System.out.println(question);
        testing = input.nextInt();

        {

        }


        if (testing >= 0 && testing < 10) {
            System.out.println("Yes");

        } else if (testing >= 10 && testing < 20){
            System.out.println("No");

        }else if (testing >= 20 && testing < 30){
            System.out.println("Mabye");

        }else if (testing >= 30 && testing < 40){
            System.out.println("I Wouldn't");

        }else if (testing >= 40 && testing < 50){
            System.out.println("Just Don't");

        }else if (testing >= 50 && testing < 60){
            System.out.println("Reconsider");

        }else if (testing >= 60 && testing < 70){
            System.out.println("Absolutly");

        }else if (testing >= 70 && testing < 80){
            System.out.println("Follow your heart");

        }else if (testing >= 80 && testing < 90){
            System.out.println("Most Definitely");

        }else if (testing >= 90 && testing < 100){
            System.out.println("Never");
        }
    }


    }
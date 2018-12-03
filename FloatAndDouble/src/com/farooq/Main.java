package com.farooq;

public class Main {

    public static void main(String[] args) {
        //width of an int 32 (4 bytes)
        int myIntValue = 5 / 3;
        //width of a float 32 (4 bytes)
        float myFloatValue = 5f / 3;
        //width of a double 64 (8 bytes)
        double myDoubleValue = 5d / 3;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        double numPounds = 200d;
        double numKilos = numPounds * 0.45359237;
        System.out.println("There are " + numKilos + " kilos in " + numPounds + " pounds.");

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an Alien !");

        boolean isCar = false;
        if (isCar == true)
            System.out.println("This is not supposed to happen !");

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar was true");

        double num1 = 20;
        double num2 = 80;
        double total = (num1 + num2) * 25;
        System.out.println("The total is " + total);
        double rem = total % 40;
        if (rem <= 20) {
            System.out.println("Total was over the limit");
        } else {
            System.out.println("Total was not over the limt");
        }

        int myVar = 50;
        myVar++;
        myVar--;
        myVar++;
        myVar += 2;
        System.out.println("This is my value now :" + myVar);
        System.out.println("This is double the value :" + (myVar + myVar));

//        boolean gameOver = true;
//        int score = 1000;
//        int levelCompleted = 5;
//        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was less then 5000 but greater then 1000 !");
//        }
//         else if (score < 1000){
//            System.out.println("Your score was less then 1000");
//        }
//        else {
//            System.out.println("Got here.");
//        }

        int highScore = calculateScore(true,800,5,100);
        System.out.println("Your final score is " + highScore);

        int tablePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim",tablePosition);

         tablePosition = calculateHighScorePosition(900);
        displayHighScorePosition("John",tablePosition);

         tablePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Sam",tablePosition);

         tablePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Jim",tablePosition);


//        calculateScore(true, 10000, 8, 200);
//        bossLevelScore(true,15000,16,500);
//        simpleAdd(3,4);
//        simpleAdd(5,7);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score){
        if(score >= 1000){
            return 1;
        }
        else if (score >= 500){
            return 2;
        }
        else if (score >=100){
            return 3;
        }
        else {
            return 4;
        }
    }


//    }
//    public static void bossLevelScore(boolean gameOver, int score, int levelCompleted,int bonus){
//        if (gameOver) {
//            int BossScore = score + (levelCompleted * (bonus *5));
//            System.out.println("You Boss level score is " + BossScore);
//        }
//    }
//    public static int simpleAdd(int num1, int num2){
//        int total = num1 + num2;
//        System.out.println("Total is " + total);
//        return total;
//    }

}




package com.infix.qa.masuk;

public class ConditionalOperators {


    public static void main (String [] args){

        indianGrade();

    }
    public static void indianGrade() {
        int points = 90;
        if (points < 34) {
            System.out.println("My grade is F");
            System.out.println("My points are  " + points);
        } else if (points >= 0 && points <= 34) {
            System.out.println("My grade is C");
            System.out.println("My points are  " + points);
        } else if (points >= 35 && points <= 42) {
            System.out.println("My grade is C+");
            System.out.println("My points are  " + points);
        } else if (points >= 43 && points <= 49) {
            System.out.println("My grade is B");
            System.out.println("My points are  " + points);
        } else if (points >= 50 && points <= 54) {
            System.out.println("My grade is B+");
            System.out.println("My points are  " + points);
        } else if (points >= 55 && points <= 59) {
            System.out.println("My grade is A");
            System.out.println("My points are  " + points);
        } else if (points >= 60 && points <= 100) {
            System.out.println("My grade is A+ ");
            System.out.println("My points are " + points);}
        }
    }

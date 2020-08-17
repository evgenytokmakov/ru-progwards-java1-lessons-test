package ru.progwards.java1.lessons.basics;

public class Prosto {
    static String otvet;
    static int addAsStrings(int n1, int n2) {
        String a = String.valueOf(n1);
        String b = String.valueOf(n2);
        String itog = a + b;
        int c = Integer.parseInt(itog);
        System.out.println("itog= " + c);
        return (c);
    }

    static String textGrade(int grade) {


        if (grade == 0) {
            otvet = "не оценено";
            System.out.println(otvet);
        }

        if (grade <= 20) {
            otvet = "очень плохо";
            System.out.println(otvet);
        }

        if (grade <= 40) {
            otvet = "плохо";
            System.out.println(otvet);
        }

        if (grade <= 60) {
            otvet = "удовлетворительно";
            System.out.println(otvet);
        }

        if (grade <= 80) {
            otvet = "хорошо";
            System.out.println(otvet);
        }

        if (grade <= 100) {
            otvet = "отлично";
            System.out.println(otvet);
        }
        else{
            otvet = "не определено";
            System.out.println(otvet);
        }
            return (otvet);
    }
        public static void main (String[]args){
            addAsStrings(2, 1);
            textGrade(928);
        }


    }



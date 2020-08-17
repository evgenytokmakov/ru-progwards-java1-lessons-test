package ru.progwards.java1.lessons.test;

public class Factorial {
    static long factorial(long n) {
        long otvet = 1;
        if (n == 0) {
            otvet = 1;
            System.out.print("otvet= " + otvet);

        }
         else {
                for (int i = 1; i <= n; i++) {
                    otvet = otvet * i;
                }
            System.out.print("otvet= " + otvet);
            }

        return (otvet);
    }

    public static void main(String[] args) {
        factorial(6);
    }
}




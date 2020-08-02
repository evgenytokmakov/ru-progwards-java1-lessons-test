package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static double volumeBallDouble(double radius){
        double a=(4*3.14*radius*radius*radius)/3;
        System.out.println(a);
        return (a);
    }

    public static float volumeBallFloat(float radius) {
        float a = (4f * 3.14f * radius * radius * radius) / 3f;
        System.out.println(a);
        return (a);
    }

    public static double calculateAccuracy(double radius){
        double a=volumeBallDouble(6371.2)-volumeBallFloat(6371.2f);
        System.out.println(a);
        return (a);
    }

    public static void main(String[] args) {
        //volumeBallDouble(6371.2) ;
        //volumeBallFloat(6371.2f) ;
        calculateAccuracy(6371.2);
    }
}

package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleInfo {
    public static boolean isTriangle(int a, int b, int c){
        boolean otvet;
        boolean SummaBCkA=false;
        boolean SummaACkB=false;
        boolean SummaABkC=false;
        if(a<(b+c)){
            SummaBCkA=true;
        }
        if(b<(a+c)){
            SummaACkB=true;
        }
        if(c<(a+b)){
            SummaABkC=true;
        }
        if(SummaBCkA&SummaACkB&SummaABkC==true){
            otvet=true;
            System.out.println("Можно)");
            return otvet;

        }
        else {
            otvet=false;
            System.out.println("НЕ Можно)");
            return otvet;

        }
    }
    //***********************************************************************
    public static boolean isRightTriangle(int a, int b, int c){
        boolean ovtetpif=false;
        int akv,bkv,ckv;
        akv=a*a;
        bkv=b*b;
        ckv=c*c;
if(akv+bkv==ckv) {
    ovtetpif = true;
    System.out.print("Является");
    }
if(ckv+bkv==akv) {
            ovtetpif = true;
            System.out.println("Является");
        }
else {
    System.out.print("НЕ Является");
}
return ovtetpif;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c){
        boolean ovtetravnbedr=false;
        if (a==b|b==c|a==c){
            ovtetravnbedr=true;
            System.out.println("Равнобедренный");
        }
        else {
            System.out.println("НЕ Равнобедренный");
        }
        return ovtetravnbedr;
    }

    public static boolean containsDigit(int number, int digit){
        boolean otvet_CD;
        otvet_CD=Integer.toString(number).contains(Integer.toString(digit));
        if (otvet_CD==true){
            System.out.println("Содержит");
        }
        else {
            System.out.println("НЕ Содержит");
        }
        return otvet_CD;
    }
    public static void main(String[] args) {
        isTriangle(2,25,11);
        isRightTriangle(5,3,4);
        isIsoscelesTriangle(4,3,5);
        containsDigit(7569,5);
    }
}

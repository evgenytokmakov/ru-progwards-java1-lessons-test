package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static int maxSide(int a, int b, int c){
        int bolshaya;
if(b-a>=0){
    bolshaya=b;
}
else{
    bolshaya=a;
}
if(c-bolshaya>=0){
    bolshaya=c;
}
        System.out.println("Большая это "+bolshaya);
return bolshaya;
    }
//***********************************************************************
public static int minSide(int a, int b, int c){
    int mensh;
    if(b-a>=0){
        mensh=a;
    }
    else{
        mensh=b;
    }
    if(c-mensh<=0){
        mensh=c;
    }
    System.out.println("Меньшая это "+mensh);
    return mensh;
}
//***********************************************************************
public static boolean isEquilateralTriangle(int a, int b, int c){
        int prom=(a+b)/2;
        boolean otvet = false;
        if(prom==c) {
            otvet = true;
            System.out.println("Равносторонний");
        }
        else {
            otvet = false;
            System.out.println("НЕ Равносторонний");
        }
return otvet;
}



    public static void main(String[] args) {
        maxSide(3,2,1);
        minSide(12,8,7);
        isEquilateralTriangle(12, 12, 12);
    }
}

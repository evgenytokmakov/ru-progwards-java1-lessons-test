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
        System.out.print("Большая это "+bolshaya);
return bolshaya;
    }

    public static void main(String[] args) {
        maxSide(3,2,1);
    }
}

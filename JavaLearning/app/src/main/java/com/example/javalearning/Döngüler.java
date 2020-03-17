package com.example.javalearning;

public class Döngüler {
    public static void main(String[] args) {
        //For Döngüsü(Loop)
        int[] myNumber={12,15,18,21,24};

        for(int i=0;i<myNumber.length;i++){
            myNumber[i]=myNumber[i]/3*5;
            //System.out.println(myNumber[i]);
        }

        for (int number:myNumber){
            //dizi elemanları teker teker numbera eşitlendi
            int z=number/3*5;
            //System.out.println(z);
        }

        for (int a=0;a<10;a++){
            int b=a*10;
            //System.out.println(b);
        }

        //while döngüsü
        int j=0;
        while(j<10){
            int n=j*10;
            System.out.println(n);
            j++;
        }



    }
}

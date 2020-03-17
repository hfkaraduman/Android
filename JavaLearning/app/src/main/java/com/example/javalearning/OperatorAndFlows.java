package com.example.javalearning;

public class OperatorAndFlows {
    public static void main(String[] args) {
        int x=5;
        System.out.println(x);
        x=x+1;
        System.out.println(x);
        x++;
        System.out.println(x);
        x--;
        System.out.println(x);

        int y=4;
        System.out.println(x>y);
        System.out.println(y>x);
        x=4;
        System.out.println(x==y);
        System.out.println(y!=x);

        //and &&
        //or ||

        //if flows
        x=28;
        y=28;

        if(x>y){
            System.out.println("X daha büyük");
        }
        else if (x==y){
            System.out.println("eşitler");
        }
        else{
            System.out.println("Y daha büyük");
        }

        //switch
        int day=1;
        String dayString="";

        switch(day){

            case 1:
                dayString="Pazartesi";
                break;
            case 2:
                dayString="Salı";
                break;
            case 3:
                dayString="Çarşamba";
                break;
            case 4:
                dayString="Perşembe";
                break;
            case 5:
                dayString="Cuma";
                break;
            case 6:
                dayString="Cumartesi";
                break;
            default:
                dayString="Pazar";
                break;

        }

        System.out.println(dayString);


    }
}

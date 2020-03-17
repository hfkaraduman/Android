package com.example.metodsandclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //ilk çalıştırılan metod onCreate
        //Override dediğimiz biz bu metodu kullanıp onu değiştiriyoruz
        setContentView(R.layout.activity_main);
        System.out.println("Uygulamamız çalışıyor");
        test();

        System.out.println(math(3,4));
        makeSimpson();

    }

    public void test(){
        int x=4+4;
        System.out.println("X'in değeri:"+x);

    }
    public int math(int a,int b){
        return a+b;

    }

    public void makeMusicians(){
        Musician james=new Musician("James","Guitar",50);

    }

    public void makeSimpson(){
        Simpsons homer=new Simpsons("Homer",50,"Reactor");
        //homer.age=15; age private oldugundan mainactivity içinden ulaşılamaz
        System.out.println(homer.getName());
        homer.setName("Homer James");
        System.out.println(homer.getName());


    }





}

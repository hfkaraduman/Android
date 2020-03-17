package com.example.javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args) {
        //Array Tanımlama

        String[] myArray=new String[4];
        //Yeni bir myArray adında dizi oluşturduk
        //Ve dizimizin 3 elemanı oldugunu bildirdik
        myArray[0]="Hasan";
        myArray[1]="Mehmet";
        myArray[2]="Ali";
        myArray[3]="Veli";
        System.out.println(myArray[3]);

        //int[] myNumber=new int[5];
        int[] myNumber={1,2,3,4,5};
        System.out.println(myNumber[3]);

        //Listeler - List
        //İlk başta kaç tane elaman olacagını söylemeye gerek yok
        ArrayList<String>myMusician=new ArrayList<>();
        myMusician.add("Hasan");
        myMusician.add("Veli");
        myMusician.add(1,"Mehmet");
        System.out.println(myMusician.get(0));
        System.out.println(myMusician.get(1));
        System.out.println(myMusician.get(2));

        //Set
        //Dizi veya liste vari degişkenleri saklarız
        //Ama set de aynı degişkenden sadece 1 defa ekleriz

        HashSet<String>mySet=new HashSet<String>();
        mySet.add("Hasan");
        mySet.add("Hasan");
        System.out.println(mySet.size());
        //Sonuç 1 çıktı 2 kere eklememize ragmen Hasan'ı
        //Kullanıcı adları 1 kere alınmasını istiyorsak bu kullanışlı

        //Map
        //Bİr deger ve onun karşısında anahtar saklanır
        HashMap<String,String>myHashMap=new HashMap<String, String>();
        myHashMap.put("name","Hasan");
        myHashMap.put("soyad","karaduman");
        System.out.println(myHashMap.get("name"));






    }
}

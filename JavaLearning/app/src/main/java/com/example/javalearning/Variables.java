package com.example.javalearning;

public class Variables {
    //psvm yazarsak ana aktivitemizi kısa yoldan
    //oluşturabiliriz.(Ana metod=Ana aktivite)
    //Ana aktivitemiz;yazacagımız kodları yazıp,çalıştırıp,
    //çıktılarını görmemiz içindir
    public static void main(String[] args) {
        //loga yazdırmak için sout kullanırız
        System.out.println("Merhaba Android Log");
        System.out.println(2*3);

        //DEĞİŞKENLER
        //Integer-integer
        int x=5;
        int y=4;

        int yaş=19;

        int sonuç=yaş*4/3;
        System.out.println(x*y);
        System.out.println(sonuç);
        //Double-Float
        double pi=3.14;
        final double r=5.0;
        //Degişkenin aldıgı degerin degişmesini istemiyorsak
        //başına final yazarız
        System.out.println("r:"+r);
        //r=4.0 yazamayız
        System.out.println("r:"+r);
        System.out.println(2*pi*r);
        double a=19.0;
        System.out.println(a*4/3);
        float z=3.0f;


        //Double daha büyük sayıları hafızasında saklar
        //Float daha küçük sayıları hafızada saklar
        //String
        String isim="Hasan";
        String soyad="Karaduman";
        System.out.println(isim);
        System.out.println(soyad);
        String fulname=isim+" "+soyad;
        System.out.println(fulname);
        //Boolean
        //True veya False degerini alan değişkenler alır
        boolean hayatta=true;
        hayatta=false;
        System.out.println(hayatta);



    }



}

package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    EditText editText2;
    TextView sonuc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText=findViewById(R.id.editText);
        editText2=findViewById(R.id.editText2);
        sonuc=findViewById(R.id.textView);





    }
    public void toplama(View view){
        //Integer.parseInt string degeri integere dönüştürür
        //.toString editrext içindeki degeri Stringe dönüştürür
        if(editText.getText().toString().matches("")){
            //Eger edittext boşsa demek
        }
        else if(editText2.getText().toString().matches("")){

        }
        else{
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());
            int deger=a+b;

            sonuc.setText("Sonuç:"+deger);

        }


    }
    public void cikarma(View view){
        if(editText.getText().toString().matches("")){
            //Eger edittext boşsa demek
        }
        else if(editText2.getText().toString().matches("")){

        }else {
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());
            int deger = a - b;

            sonuc.setText("Sonuç:" + deger);
        }

    }
    public void carpma(View view){
        if(editText.getText().toString().matches("")){
            //Eger edittext boşsa demek
        }
        else if(editText2.getText().toString().matches("")){

        }else {


            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());
            int deger = a * b;

            sonuc.setText("Sonuç:" + deger);
        }

    }
    public void bolme(View view){
        if(editText.getText().toString().matches("")){
            //Eger edittext boşsa demek
        }
        else if(editText2.getText().toString().matches("")){

        }else {
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());
            int deger = a / b;

            sonuc.setText("Sonuç:" + deger);
        }

    }

}

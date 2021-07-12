package com.imran.calendar2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



        public void next1(View view) {
            Intent intent = new Intent(this, com.imran.calendar2021.fev.class);
            startActivity(intent);
        }

        public void next3(View view) {
            Intent intent = new Intent(this, com.imran.calendar2021.mar.class);
            startActivity(intent);
        }

        public void next4(View view) {
            Intent intent = new Intent(this, com.imran.calendar2021.April.class);
            startActivity(intent);
        }

        public void next5(View view) {
            Intent intent = new Intent(this, com.imran.calendar2021.may.class);
            startActivity(intent);
        }


        public void next6(View view) {
            Intent intent = new Intent(this, com.imran.calendar2021.jun.class);
            startActivity(intent);
        }

        public void next7(View view) {
            Intent intent = new Intent(this, com.imran.calendar2021.julay.class);
            startActivity(intent);
        }

        public void next8(View view) {
            Intent intent = new Intent(this, com.imran.calendar2021.aug.class);
            startActivity(intent);
        }

        public void next9(View view) {
            Intent intent = new Intent(this, com.imran.calendar2021.sep.class);
            startActivity(intent);
        }

        public void next10(View view) {
            Intent intent = new Intent(this, com.imran.calendar2021.oct.class);
            startActivity(intent);
        }

        public void next11(View view) {
            Intent intent = new Intent(this, com.imran.calendar2021.nov.class);
            startActivity(intent);
        }

        public void next12(View view) {
            Intent intent = new Intent(this, com.imran.calendar2021.dec.class);
            startActivity(intent);
        }

    public void next(View view) {
        Intent intent = new Intent(this,HomeActivity.class);
        startActivity(intent);
    }


}

package com.arinko.example.sumareji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class registerMaine extends AppCompatActivity {

    private static String shopID;
    private static int shopName;
    private static String memo;
    private static int secNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_maine);

        // 入力された文字列を取得
        shopID = findViewById(R.id.edStoreName).toString();


    }


}

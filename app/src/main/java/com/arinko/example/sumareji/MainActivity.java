package com.arinko.example.sumareji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 画面部品ListViewを取得
        ListView ltShop = findViewById(R.id.shopList);
        // リスト型のAdapterを用意
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);

        // リストに店舗名を登録（仮）
        adapter.add("店舗１");
        adapter.add("店舗２");
        adapter.add("店舗３");
        adapter.add("＋");

        // Adapterにリストを渡す
        ltShop.setAdapter(adapter);
    }

    @Override
    public void onResume(){
        super.onResume();
    }

    @Override
    public void onPause(){
        super.onPause();
    }

    @Override
    public void onStop(){
        super.onStop();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
    }
}

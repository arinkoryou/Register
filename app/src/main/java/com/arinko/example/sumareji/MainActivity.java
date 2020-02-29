package com.arinko.example.sumareji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
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
/*        adapter.add("店舗１");
        adapter.add("店舗２");
        adapter.add("店舗３");*/
        adapter.add("＋");

        // Adapterにリストを渡す
        ltShop.setAdapter(adapter);

        // ボタンクリックリスナを登録
        Button mvRegister = this.findViewById(R.id.btRegi);       // レジボタン
        mvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveRegister();
            }
        });
        Button mvStoreEdit = this.findViewById(R.id.btEdit);      // 編集ボタン
        mvStoreEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                moveStoreEdit();
            }
        });
    }

    /**
     * リストがタップされた時の処理クラス
     */

    /**
     * レジボタンが押下された時の処理
     */
    private void moveRegister(){
        // インテントオブジェクトを生成
        Intent intent = new Intent(this, registerMaine.class);
        // レジ画面の起動
        startActivity(intent);
    }
    /**
     * 編集ボタンが押下された時の処理
     */
    private void moveStoreEdit(){
        // インテントオブジェクトを生成
        Intent intent = new Intent(this, storeEdit.class);
        // レジ画面の起動
        startActivity(intent);
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

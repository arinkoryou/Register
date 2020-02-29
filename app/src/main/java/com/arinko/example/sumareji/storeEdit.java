package com.arinko.example.sumareji;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class storeEdit extends AppCompatActivity {

    // 変数定義
    private static String shopID;
    private static int shopName;
    private static String memo;
    private static int secNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_edit);

        // 入力された文字列を取得
        //shopID = findViewById(R.id.edStoreName).toString();　// ←多分値入れないとNULLぽ！！！

        // ボタンクリックリスナを登録
        Button btnClose = this.findViewById(R.id.btnBack);       // 戻るボタン
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}

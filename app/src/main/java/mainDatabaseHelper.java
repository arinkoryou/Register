import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class mainDatabaseHelper extends SQLiteOpenHelper {
    /**
     * データベース名
     */
    private static final String DBNAME = "sumareji.db";
    /**
     * バージョン情報
     */
    private static final int DB_VERSION = 1;
    /**
     * コンストラクタ
     */
    public mainDatabaseHelper(Context context){
        //親クラスのコンストラクタ呼び出し
        super(context, DBNAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        // テーブル作成用SQL文字列
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE shop ( ");
        sb.append("shopID INTEGER PRIMARY KEY,");
        sb.append("secNo INTEGER PRIMARY KEY,");
        sb.append("shopName TEXT,");
        sb.append("memo TEXT");
        sb.append(");");
        String sql = sb.toString();

        // SQL実行
        db.execSQL(sql);

        // 初期レコード作成
        sql = "";
        sb = new StringBuilder();
        sb.append("INSERT INTO shop ");
        sb.append("(shopID,secNo,shopName,memo) ");
        sb.append("VALUES (99, 99, '＋', null);");

        sql = sb.toString();

        // SQL実行
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
    }
}

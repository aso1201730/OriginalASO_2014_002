package jp.ac.st.asojuku.original2014002;

import jp.ac.st.asojukuoriginal2014002.R;
import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {

	SQLiteDatabase sdb = null;
	MySQLiteOpenHelper helper = null;

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		EditText etv = (EditText)findViewById(R.id.edttxt);
		String inputMsg = etv.getText().toString();
		Intent intent = null;

		switch(v.getId()){

		case R.id.btn_dl:

			if(inputMsg!=null && !inputMsg.isEmpty()){
				helper.insertHitokoto(sdb, inputMsg);
			}
			etv.setText("");
			break;

		case R.id.btn_back:
			intent = new Intent(MainActivity.this, MaintenanceActivity.class);
			startActivity(intent);
			break;

		case R.id.btn_ck:
			String strHitokoto = helper.selectRandomHitokoto(sdb);
			System.out.println(strHitokoto);
			intent = new Intent(MainActivity.this, HitokotoActivity.class);
			intent.putExtra("hitokoto", strHitokoto);

			startActivity(intent);
			break;
		}


	}








	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn = (Button)findViewById(R.id.btn_dl);
		Button btn1 = (Button)findViewById(R.id.btn_ck);
		Button btn2 = (Button)findViewById(R.id.btn_back);
		btn.setOnClickListener(this);
		btn1.setOnClickListener(this);
		btn2.setOnClickListener(this);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();

		Button btnENTRY = (Button)findViewById(R.id.btn_dl);
		btnENTRY.setOnClickListener(this);

		Button btnMAINTE = (Button)findViewById(R.id.btn_back);

		Button btnCHECK = (Button)findViewById(R.id.btn_ck);
		btnENTRY.setOnClickListener(this);

		if(sdb == null) {
				helper = new MySQLiteOpenHelper(getApplicationContext());
		}
		try{
			sdb = helper.getWritableDatabase();
		}catch(SQLiteException e){
			return;

		}
	}








	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

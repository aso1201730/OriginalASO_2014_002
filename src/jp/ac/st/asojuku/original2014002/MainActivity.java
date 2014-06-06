package jp.ac.st.asojuku.original2014002;


import jp.ac.st.asojukuoriginal2014002.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {


	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ
		EditText etv = (EditText)findViewById(R.id.edttxt);
		String inputMsg = etv.getText().toString();
		Intent intent = null;

		switch(v.getId()){

		case R.id.btn_add:
			intent = new Intent(MainActivity.this, AddActivity.class);
			startActivity(intent);
			break;

		case R.id.button1:
			intent = new Intent(MainActivity.this, MaintenanceActivity.class);
			startActivity(intent);
			break;

		case R.id.btn_ck:
			intent = new Intent(MainActivity.this, HitokotoActivity.class);
			startActivity(intent);
			break;
		}


	}









	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn = (Button)findViewById(R.id.btn_add);
		btn.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}

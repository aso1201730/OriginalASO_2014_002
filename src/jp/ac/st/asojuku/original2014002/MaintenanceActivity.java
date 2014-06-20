package jp.ac.st.asojuku.original2014002;

import jp.ac.st.asojukuoriginal2014002.R;
import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

public class MaintenanceActivity extends Activity implements View.OnClickListener, AdapterView.OnItemClickListener {

@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void onClick(View v) {
		// TODO 自動生成されたメソッド・スタブ

	}

	{
	SQLiteDatabase sdb = null;
	MySQLiteOpenHelper helper = null;
int selectedID = -1;
int lastPosition = -1;
	}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maintenanceactivity);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();
		Button btnDelete = (Button)findViewById(R.id.btn_dl);
		Button btnMainte_Back = (Button)findViewById(R.id.btn_back);
		ListView lstHitokoto = (ListView)findViewById(R.id.list_hitokoto);


		btnDelete.setOnClickListener(this);
		btnMainte_Back.setOnClickListener(this);
		lstHitokoto.setOnItemClickListener(this);

		this.setDBValuetoList(lstHitokoto);

	}



}


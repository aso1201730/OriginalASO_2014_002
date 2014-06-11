package jp.ac.st.asojuku.original2014002;

import jp.ac.st.asojukuoriginal2014002.R;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class HitokotoActivity extends MainActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO 自動生成されたメソッド・スタブ
		super.onCreate(savedInstanceState);
		setContentView(R.layout.hitokotoactivity);
	}

	@Override
	protected void onResume() {
		// TODO 自動生成されたメソッド・スタブ
		super.onResume();

		Intent intent = this.getIntent();
		String strHitokoto = intent.getStringExtra("hitokoto");
		TextView txvHITOKOTO = (TextView)findViewById(R.id.txt1);
		txvHITOKOTO.setText(strHitokoto);
	}


}

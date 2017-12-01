package kr.effrot.listview.s;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import kr.effrot.listview.R;

public class DetailActivity extends AppCompatActivity {

    String detailGroupNameText;
    String detailCountText;
    String detailNameText;

    TextView detailGroupName;
    TextView detailCount;
    TextView detailName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();

        init(intent);

    }


    private void init(Intent intent) {
        detailGroupName = (TextView) findViewById(R.id.detailGroupNameText);
        detailCount = (TextView) findViewById(R.id.detailCountText);
        detailName = (TextView) findViewById(R.id.detailNameText);

        detailGroupName.setText(intent.getStringExtra("groupName"));
        detailCount.setText(intent.getStringExtra("count") + "명");
        detailName.setText(intent.getStringExtra("name"));
    }
}

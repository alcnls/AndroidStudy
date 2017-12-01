package kr.effrot.listview.j;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import kr.effrot.listview.R;

public class DisplayActivity extends AppCompatActivity {

    TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();

        displayText = (TextView) findViewById(R.id.displayText);


        displayText.setText(intent.getStringExtra("inputText"));
    }
}

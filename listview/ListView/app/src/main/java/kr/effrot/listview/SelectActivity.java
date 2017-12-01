package kr.effrot.listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import kr.effrot.listview.j.InputActivity;
import kr.effrot.listview.s.MainActivity;

public class SelectActivity extends AppCompatActivity implements View.OnClickListener{

    Button sButton;
    Button jButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        sButton = (Button) findViewById(R.id.sButton);
        jButton = (Button) findViewById(R.id.jButton);


        sButton.setOnClickListener(this);
        jButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.sButton:
                intent = new Intent(SelectActivity.this , MainActivity.class);
                startActivity(intent);
                break;
            case R.id.jButton:
                intent = new Intent(SelectActivity.this , InputActivity.class);
                startActivity(intent);
                break;
        }
    }
}

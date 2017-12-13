package kr.effrot.objecttest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import kr.effrot.objecttest.data.Data;

public class DisplayActivity extends AppCompatActivity {

    final static int REQUEST_CODE = 10;

    TextView name;
    TextView age;
    TextView tel;


    Button modifyButton;

    Intent intent;

    Data myData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        intent = getIntent();

        name = findViewById(R.id.displayName);
        age = findViewById(R.id.displayAge);
        tel = findViewById(R.id.displayTel);
        modifyButton = findViewById(R.id.modifyButton);

        myData = (Data) intent.getSerializableExtra("DataObject");

        Log.d("Display_onCreate", "들어옴");

        addTextData(myData);


        modifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(DisplayActivity.this, ModifyActivity.class);
                intent.putExtra("DataObject", myData);
                startActivityForResult(intent, REQUEST_CODE);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            if (requestCode == REQUEST_CODE) {
                Data myData = (Data) data.getSerializableExtra("DataObject");
                this.myData = myData;

                Log.d("onActivityResult", "들어옴");

                addTextData(myData);
            }
        }
    }


    private void addTextData(Data myData) {
        name.setText(myData.getName());
        age.setText(myData.getAge());
        tel.setText(myData.getTel());
    }

}

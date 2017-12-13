package kr.effrot.objecttest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import kr.effrot.objecttest.data.Data;

public class ModifyActivity extends AppCompatActivity {

    EditText inputName;
    EditText inputAge;
    EditText inputTel;
    Button sendButton;
    Button cancelButton;

    Intent intent;

    Data myData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify);

        intent = getIntent();

        inputName = findViewById(R.id.modify_inputName);
        inputAge = findViewById(R.id.modify_inputAge);
        inputTel = findViewById(R.id.modify_inputTel);
        sendButton = findViewById(R.id.modify_sendButton);
        cancelButton = findViewById(R.id.modify_cancelButton);

        myData = (Data) intent.getSerializableExtra("DataObject");

        inputName.setText(myData.getName());
        inputAge.setText(myData.getAge());
        inputTel.setText(myData.getTel());

        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = inputName.getText().toString();
                String age = inputAge.getText().toString();
                String tel = inputTel.getText().toString();


                if (!name.equals("") && !age.equals("") && !tel.equals("")) {
                    myData.setName(name);
                    myData.setAge(age);
                    myData.setTel(tel);
                    intent.putExtra("DataObject" , myData);
                    setResult(RESULT_OK, intent);
                    finish();
                } else {
                    Toast.makeText(ModifyActivity.this, "모든정보를 입력하세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });


        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}

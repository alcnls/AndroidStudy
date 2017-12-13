package kr.effrot.objecttest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import kr.effrot.objecttest.data.Data;

public class MainActivity extends AppCompatActivity {


    EditText inputName;
    EditText inputAge;
    EditText inputTel;
    Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputName = findViewById(R.id.inputName);
        inputAge = findViewById(R.id.inputAge);
        inputTel = findViewById(R.id.inputTel);
        sendButton = findViewById(R.id.sendButton);


        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameText = inputName.getText().toString();
                String ageText = inputAge.getText().toString();
                String telText = inputTel.getText().toString();

                if (!nameText.equals("") && !ageText.equals("") && !telText.equals("")) {
                    Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
                    Data myData = new Data(nameText , ageText , telText);
                    intent.putExtra("DataObject" , myData);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(MainActivity.this, "모든정보를 입력하세요.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}

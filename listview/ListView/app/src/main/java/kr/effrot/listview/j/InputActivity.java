package kr.effrot.listview.j;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import kr.effrot.listview.R;

public class InputActivity extends AppCompatActivity {

    EditText inputText;
    Button sendButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input);

        inputText = (EditText) findViewById(R.id.inputText);
        sendButton = (Button) findViewById(R.id.sendButton);


        sendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String text = inputText.getText().toString();


                if (!text.equals("")) {
                    Intent intent = new Intent(InputActivity.this, DisplayActivity.class);
                    intent.putExtra("inputText", text);
                    startActivity(intent);
                    inputText.setText("");
                }

            }
        });



    }
}

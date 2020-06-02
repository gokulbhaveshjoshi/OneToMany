package com.example.onetomany;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    Button butn;
    EditText message, number, new_message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butn = (Button) findViewById(R.id.btn);
        message = (EditText) findViewById(R.id.msg);
        number = (EditText) findViewById(R.id.num);
        new_message = (EditText) findViewById(R.id.new_msg);

        butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = message.getText().toString();
                int times = Integer.parseInt(number.getText().toString());
                String output = input;
                for(int i=0; i<(times-1); i++){
                    output = output.concat("\n");
                    output = output.concat(input);
                }
                new_message.setText(output);
            }
        });


    }
}

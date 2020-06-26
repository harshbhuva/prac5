package com.clg.harsh.prac5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etInput;
    TextView tvOutput;
    Button btn1;
    ImageButton imgbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgbtn=(ImageButton)findViewById(R.id.imgbtn);
        imgbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvOutput.setText("Image Button : "+etInput.getText());
            }
        });
    }

    public void textview(View view)
    {
        etInput=(EditText) findViewById(R.id.etInput);
        tvOutput=(TextView)findViewById(R.id.tvOutput);
        tvOutput.setText("Normal Button : "+etInput.getText());
    }
}

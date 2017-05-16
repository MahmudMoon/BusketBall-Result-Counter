package com.example.moonc.courtcount;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Second extends AppCompatActivity {


    Button btn;
    EditText etxt;
    EditText etxt2;
    public String str;
    public String str2;
    TextView txtv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        btn = (Button) findViewById(R.id.btn1);
        etxt = (EditText) findViewById(R.id.editText);

        etxt2 = (EditText) findViewById(R.id.editText2);

        txtv = (TextView) findViewById(R.id.textView2);


    }

    public void Start(View view) {
        str = etxt.getText().toString();
        str2 = etxt2.getText().toString();

        Intent intent = new Intent(Second.this, Third.class);
        intent.putExtra("FirstTeam" ,str);
        intent.putExtra("SecondTeam",str2);
        startActivity(intent);
    }
}

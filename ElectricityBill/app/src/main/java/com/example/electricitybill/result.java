package com.example.electricitybill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class result extends AppCompatActivity {
    private TextView e1,e2,e3,e4,e5,e6,e7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent i=getIntent();
        String data1=i.getStringExtra("cid");
        String data2=i.getStringExtra("cname");
        String data3=i.getStringExtra("pr");
        String data4=i.getStringExtra("nr");
        String data5=i.getStringExtra("rate");
        String data6=i.getStringExtra("amt");
        String data7=i.getStringExtra("cu");
        e1=(TextView)findViewById(R.id.textView15);
        e1.setText(data1);
        e2=(TextView)findViewById(R.id.textView16);
        e2.setText(data2);
        e3=(TextView)findViewById(R.id.textView17);
        e3.setText(data3);
        e4=(TextView)findViewById(R.id.textView18);
        e4.setText(data4);
        e5=(TextView)findViewById(R.id.textView19);
        e5.setText(data5);
        e6=(TextView)findViewById(R.id.textView20);
        e6.setText(data7);
        e7=(TextView)findViewById(R.id.textView21);
        e7.setText(data6);
    }
}

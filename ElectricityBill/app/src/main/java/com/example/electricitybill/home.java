package com.example.electricitybill;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class home extends AppCompatActivity {
    private EditText e1,e2,e3,e4,e5;
    private Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        e1=(EditText)findViewById(R.id.editText1);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
        e4=(EditText)findViewById(R.id.editText4);
        e5=(EditText)findViewById(R.id.editText5);
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(
                new View.OnClickListener()
                {
                    public void onClick(View view)
                    {
                        String data1 =  (e1.getText()).toString();
                        String data2 =  (e2.getText()).toString();
                        int s1 = Integer.parseInt(e3.getText().toString());
                        int s2 = Integer.parseInt(e4.getText().toString());
                        int s3 = Integer.parseInt(e5.getText().toString());
                        int amt = (s1-s2)*s3;
                        String data3= String.valueOf(s1);
                        String data4= String.valueOf(s2);
                        String data5= String.valueOf(s3);
                        String data6= String.valueOf(amt);
                        String data7= String.valueOf(s1-s2);
                        Intent i=new Intent(home.this,result.class);
                        i.putExtra("cid",data1);
                        i.putExtra("cname",data2);
                        i.putExtra("pr",data3);
                        i.putExtra("nr",data4);
                        i.putExtra("rate",data5);
                        i.putExtra("amt",data6);
                        i.putExtra("cu",data7);
                        startActivity(i);

                    }
                });
    }
}

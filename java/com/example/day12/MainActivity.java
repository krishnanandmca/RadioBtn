package com.example.day12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RadioGroup r;
    RadioButton rb;

    CheckBox rct,nxt,ts,exp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        r = findViewById(R.id.rg);

        rct=findViewById(R.id.c1);
        nxt=findViewById(R.id.c2);
        ts=findViewById(R.id.c3);
        exp=findViewById(R.id.c4);
    }

    public void select(View v){
            int bid = r.getCheckedRadioButtonId();
            rb = findViewById(bid);
            Toast.makeText(getApplicationContext(),rb.getText(),Toast.LENGTH_LONG).show();
    }

    public void view(View v) {
        StringBuilder res = new StringBuilder();
        res.append("selected items:");
        if (rct.isChecked()) {
            res.append("\nReact Js");
        }
        if(nxt.isChecked()) {
            res.append("\nNext Js");
        }

        if(ts.isChecked()) {
            res.append("\nTypeScript");
        }

        if(exp.isChecked()) {
            res.append("\nExpress Js");
        }



        Toast.makeText(getApplicationContext(),res,Toast.LENGTH_LONG).show();
    }

}


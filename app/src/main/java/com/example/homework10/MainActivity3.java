package com.example.homework10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    int n1;
    int n2;
    int n3;
    int n4;
    int n5;
    int n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Intent intent = this.getIntent();

        n1 = intent.getIntExtra("n1",0);
        n2 = intent.getIntExtra("n2",0);
        n3 = intent.getIntExtra("n3",0);
        n4 = intent.getIntExtra("n4",0);
        n5 = intent.getIntExtra("n5",0);

        n = intent.getIntExtra("n",0);

        TextView textView = findViewById(R.id.textView4);
        if(n == n1 || n == n2 || n == n3 || n == n4 || n == n5){
            textView.setText("中獎金額: "+(int)(Math.random()*10000));
        }
        else {
            textView.setText("再接再厲!");
        }
    }

    public void r(View view){
        Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
        intent.putExtra("n1", n1);
        intent.putExtra("n2", n2);
        intent.putExtra("n3", n3);
        intent.putExtra("n4", n4);
        intent.putExtra("n5", n5);
        startActivity(intent);
        this.finish();
    }

    public void s(View view){
        Intent intent = new Intent(MainActivity3.this, MainActivity.class);
        startActivity(intent);
        this.finish();
    }
}
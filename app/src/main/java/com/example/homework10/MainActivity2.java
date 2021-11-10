package com.example.homework10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class MainActivity2 extends AppCompatActivity {

    int n1;
    int n2;
    int n3;
    int n4;
    int n5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = this.getIntent();

        n1 = intent.getIntExtra("n1",0);
        n2 = intent.getIntExtra("n2",0);
        n3 = intent.getIntExtra("n3",0);
        n4 = intent.getIntExtra("n4",0);
        n5 = intent.getIntExtra("n5",0);

        TextView textView = findViewById(R.id.textView2);

        textView.setText(""+n1+'\n'+n2+'\n'+n3+'\n'+n4+'\n'+n5);
    }

    public void r(View view){
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        try {
            EditText editText = findViewById(R.id.editTextTextPersonName);
            intent.putExtra("n", Integer.parseInt(editText.getText().toString()));
            intent.putExtra("n1", n1);
            intent.putExtra("n2", n2);
            intent.putExtra("n3", n3);
            intent.putExtra("n4", n4);
            intent.putExtra("n5", n5);
            startActivity(intent);
            this.finish();
        }
        catch (Exception e){
            Toast.makeText(this, "請輸入數字", Toast.LENGTH_LONG).show();
        }

    }

    public void s(View view){
        Intent intent = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(intent);
        this.finish();
    }

}
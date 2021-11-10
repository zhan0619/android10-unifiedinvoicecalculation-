package com.example.homework10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;

    int rn;

    public void r(){
        b1 = findViewById(R.id.button);
        b2 = findViewById(R.id.button2);
        b3 = findViewById(R.id.button3);
        b4 = findViewById(R.id.button4);
        b5 = findViewById(R.id.button5);
        b6 = findViewById(R.id.button6);

        b1.setText("2018 1,2月 發票");
        b2.setText("2018 3,4月 發票");
        b3.setText("2018 5,6月 發票");
        b4.setText("2018 7,8月 發票");
        b5.setText("2018 9,10月 發票");
        b6.setText("2018 11,12月 發票");
    }

    public void r1(View view){
        r();
        b1.setText("✓2018 1,2月 發票");
        rn = 1;
    }

    public void r2(View view){
        r();
        b2.setText("✓2018 3,4月 發票");
        rn = 2;
    }

    public void r3(View view){
        r();
        b3.setText("✓2018 5,6月 發票");
        rn = 3;
    }

    public void r4(View view){
        r();
        b4.setText("✓2018 7,8月 發票");
        rn = 4;
    }

    public void r5(View view){
        r();
        b5.setText("✓2018 9,10月 發票");
        rn = 5;
    }

    public void r6(View view){
        r();
        b6.setText("✓2018 11,12月 發票");
        rn = 6;
    }

    public void r7(View view){
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        switch (rn){
            case 1:
                intent.putExtra("n1", 28113);
                intent.putExtra("n2", 45341);
                intent.putExtra("n3", 32507);
                intent.putExtra("n4", 22324);
                intent.putExtra("n5", 32953);
                break;
            case 2:
                intent.putExtra("n1", 71091);
                intent.putExtra("n2", 21734);
                intent.putExtra("n3", 54639);
                intent.putExtra("n4", 97295);
                intent.putExtra("n5", 78492);
                break;
            case 3:
                intent.putExtra("n1", 78376);
                intent.putExtra("n2", 26684);
                intent.putExtra("n3", 87028);
                intent.putExtra("n4", 95913);
                intent.putExtra("n5", 65879);
                break;
            case 4:
                intent.putExtra("n1", 96689);
                intent.putExtra("n2", 85324);
                intent.putExtra("n3", 38145);
                intent.putExtra("n4", 96348);
                intent.putExtra("n5", 57377);
                break;
            case 5:
                intent.putExtra("n1", 55892);
                intent.putExtra("n2", 46150);
                intent.putExtra("n3", 25808);
                intent.putExtra("n4", 40494);
                intent.putExtra("n5", 50866);
                break;
            case 6:
                intent.putExtra("n1", 62464);
                intent.putExtra("n2", 14047);
                intent.putExtra("n3", 37828);
                intent.putExtra("n4", 81437);
                intent.putExtra("n5", 85583);
                break;
        }

        if(rn == 0)
        {
            Toast.makeText(this, "請先選擇月份", Toast.LENGTH_SHORT).show();
        }
        else {
            startActivity(intent);
            this.finish();
        }

    }
}
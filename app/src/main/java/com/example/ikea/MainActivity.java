package com.example.ikea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button butto;
    Button button;
Button b;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        butto = findViewById(R.id.button7);
butto.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:8003040098"));
        startActivity(intent);
    }
});


b =findViewById(R.id.button8);

b.setOnClickListener(this);




        button = findViewById(R.id.button8);
        button.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this,"Saturday to Friday 09:00 AM - 12:00 AM", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(MainActivity.this, "Click a long press" , Toast.LENGTH_SHORT).show();


        }
public void onClic(View view){
    Intent i = new Intent (this, Activity_sec.class);
startActivity(i);

}
    }



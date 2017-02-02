package com.pesmoce.foss.codefiesta;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sponsors extends AppCompatActivity {

    Button prev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sponsors);

        prev=new Button(this);


        prev=(Button)findViewById(R.id.button);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(sponsors.this,prev_spo.class);
                startActivity(i);
            }
        });

    }
}

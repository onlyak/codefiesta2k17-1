package com.pesmoce.foss.codefiesta;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    ImageView maze,frenzy,allied;
    TextView maze_t,frenzy_t,allied_t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        maze=new ImageView(this);
        frenzy=new ImageView(this);
        allied=new ImageView(this);
        maze_t=new TextView(this);
        frenzy_t=new TextView(this);
        allied_t=new TextView(this);


        maze=(ImageView)findViewById(R.id.maze);
        maze.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main4Activity.this ,maze_coders.class);
                startActivity(i);
            }
        });

        frenzy=(ImageView)findViewById(R.id.frenzy);
        frenzy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main4Activity.this ,frenzy.class);
                startActivity(i);

            }
        });

        allied=(ImageView)findViewById(R.id.allied);
        allied.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main4Activity.this ,allied.class);
                startActivity(i);

            }
        });


        maze_t=(TextView)findViewById(R.id.textView16);
        maze_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main4Activity.this ,maze_coders.class);
                startActivity(i);

            }
        });

        frenzy_t=(TextView)findViewById(R.id.textView10);
        frenzy_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Main4Activity.this ,frenzy.class);
                startActivity(i);

            }
        });

                allied_t=(TextView)findViewById(R.id.textView11);
                allied_t.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(Main4Activity.this,allied.class);
                        startActivity(i);
                    }
                });
            }

    }

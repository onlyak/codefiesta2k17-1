package com.pesmoce.foss.codefiesta;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    TextView college,about,events,contact,sponsors,codefiesta;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



     college=new TextView(this);
     about=new TextView(this);
     events=new TextView(this);
     contact=new TextView(this);
     sponsors=new TextView(this);

        codefiesta=new TextView(this);




     college=(TextView)findViewById(R.id.college_x);
        college.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this , Main3Activity.class);
                startActivity(i);
            }


        });



        codefiesta=(TextView)findViewById(R.id.codefiesta_x);
        Typeface custom_font=Typeface.createFromAsset(getAssets(),"fonts/OLDENGL.TTF");
        codefiesta.setTypeface(custom_font);



        about=(TextView)findViewById(R.id.about_x);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this , Main2Activity.class);
                startActivity(i);

            }
        });

        events=(TextView)findViewById(R.id.events_x);
        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this , Main4Activity.class);
                startActivity(i);
            }
        });


        contact=(TextView)findViewById(R.id.contact_x);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this , Main5Activity.class);
                startActivity(i);
            }
        });

     sponsors=(TextView)findViewById(R.id.sponsors_x);
        sponsors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,sponsors.class);
                startActivity(i);
            }
        });


    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder=new AlertDialog.Builder(MainActivity.this);
        builder.setMessage("Do you want to exit?");
        builder.setCancelable(true);
        builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                finish();
            }
        });

        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();

            }
        });
        AlertDialog alert=builder.create();
        alert.show();
    }


}

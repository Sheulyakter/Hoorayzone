package com.example.purnota.hoorayzone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SundarbanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sundarban);

        Button submit = (Button) findViewById(R.id.submitsundarban);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent email = new Intent(Intent.ACTION_SEND);
                String[] strings = {"nusrata315@gmail.com"};
                email.putExtra(Intent.EXTRA_EMAIL, strings);

                email.putExtra(Intent.EXTRA_SUBJECT,"");
                email.putExtra(Intent.EXTRA_TEXT,"");

                email.setType("message/rfc822");

                startActivity(Intent.createChooser(email, "send email"));


            }
        });


    }
}

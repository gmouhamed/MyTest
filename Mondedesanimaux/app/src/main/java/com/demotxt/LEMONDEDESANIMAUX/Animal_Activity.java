package com.demotxt.LEMONDEDESANIMAUX;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.demotxt.LEMONDEDESANIMAUX.R;

public class Animal_Activity extends AppCompatActivity {

    private TextView tvtitre,tvdescription,tvcat;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_);

        tvtitre = (TextView) findViewById(R.id.txttitre);
        tvdescription = (TextView) findViewById(R.id.txtDesc);
        tvcat = (TextView) findViewById(R.id.txtCat);
        img = (ImageView) findViewById(R.id.animalimage);

        // Recieve data

        Intent intent = getIntent();
        String Titre = intent.getExtras().getString("Titre");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("image");

        // Setting values

        tvtitre.setText(Titre);
        tvdescription.setText(Description);
        img.setImageResource(image);


    }
}

package com.example.vlms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.rey.material.widget.Button;
import com.rey.material.widget.ImageView;

public class AdminCategoryActivity extends AppCompatActivity {

    //private ImageView computing, engineering, business, art;
    //private ImageView maths, bio , physics , chemistry;
    //private ImageView olevel, gten, gnine , geight;

    //private Button computing, engineering, business, art;
    //private Button maths, bio , physics , chemistry;
    //private Button olevel, gten, gnine , geight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);
/*
        computing = (ImageView) findViewById(R.id.computing) ;
         engineering = (ImageView) findViewById(R.id.eng);
        business = (ImageView) findViewById(R.id.bus);
        art = (ImageView) findViewById(R.id.arti);

        maths = (ImageView) findViewById(R.id.mathsx);
        bio = (ImageView) findViewById(R.id.biox);
        physics = (ImageView) findViewById(R.id.phy);
        chemistry = (ImageView) findViewById(R.id.che);

        olevel = (ImageView) findViewById(R.id.olevelx);
        gten = (ImageView) findViewById(R.id.ten);
        gnine = (ImageView) findViewById(R.id.nine);
        geight = (ImageView) findViewById(R.id.eight);

        computing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "computing");
                startActivity(intent);

            }
        });

        engineering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "engineering");
                startActivity(intent);

            }
        });

        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "business");
                startActivity(intent);

            }
        });

        art.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "art");
                startActivity(intent);

            }
        });

        maths.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "maths");
                startActivity(intent);

            }
        });

        bio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "bio");
                startActivity(intent);

            }
        });

        physics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "physics");
                startActivity(intent);

            }
        });

        chemistry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "chemistry");
                startActivity(intent);

            }
        });

        olevel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "olevel");
                startActivity(intent);

            }
        });

        gten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "gten");
                startActivity(intent);

            }
        });


        gnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "gnine");
                startActivity(intent);

            }
        });

        geight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "geight");
                startActivity(intent);

            }
        });

*/
    }
}

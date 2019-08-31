package com.example.vlms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import io.paperdb.Paper;

public class ACategoryActivity extends AppCompatActivity {

    private Button computing123,engineering123,business123,art123;
    private Button maths123, bio123, physics123,chemistry123;
    private Button olevel123,gten123,gnine123,geight123;

    private Button LogoutBtn, CheckOrderBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acategory);

        LogoutBtn  = (Button) findViewById(R.id.admin_logout_btn);
        CheckOrderBtn = (Button) findViewById(R.id.check_orders_btn);

        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ACategoryActivity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });


        CheckOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ACategoryActivity.this,AdminNewOrdersActivity.class);
                startActivity(intent);
                //finish();
            }
        });

        computing123 = (Button) findViewById(R.id.bcomputing);
        engineering123 = (Button) findViewById(R.id.bengineering);
        business123 = (Button) findViewById(R.id.bbusiness);
        art123= (Button) findViewById(R.id.bart);

        maths123 = (Button) findViewById(R.id.bmaths);
        bio123 = (Button) findViewById(R.id.bbio);
        physics123 = (Button) findViewById(R.id.bphysics);
        chemistry123 = (Button) findViewById(R.id.bchemistry);

        olevel123= (Button) findViewById(R.id.bolevel);
        gten123 = (Button) findViewById(R.id.bgten);
        gnine123 = (Button) findViewById(R.id.bnine);
        geight123= (Button) findViewById(R.id.beight);

        computing123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(ACategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "computing");
                startActivity(intent);
            }
        });

        engineering123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(ACategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Engineering");
                startActivity(intent);
            }
        });


        business123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(ACategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Business");
                startActivity(intent);
            }
        });

        art123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(ACategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Art");
                startActivity(intent);
            }
        });

        maths123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(ACategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Maths");
                startActivity(intent);
            }
        });

        bio123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(ACategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Biology");
                startActivity(intent);
            }
        });

        physics123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(ACategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Physics");
                startActivity(intent);
            }
        });


        chemistry123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(ACategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Chemistry");
                startActivity(intent);
            }
        });


        olevel123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(ACategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "O level");
                startActivity(intent);
            }
        });


        gten123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(ACategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Grade Ten");
                startActivity(intent);
            }
        });


        gnine123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(ACategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Grade Nine");
                startActivity(intent);
            }
        });

        geight123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(ACategoryActivity.this, AdminAddNewProductActivity.class);
                intent.putExtra("category", "Grade Eight");
                startActivity(intent);
            }
        });
    }
}

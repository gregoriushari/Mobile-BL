package umn.ac.id.gabungan_3_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import umn.ac.id.gabungan_3_project.Fisika.FisikaActivity;
import umn.ac.id.gabungan_3_project.Properti.PropertiActivity;
import umn.ac.id.gabungan_3_project.Drawable.DrawableActivity;

public class MainActivity extends AppCompatActivity {
    Button btnProperty, btnDrawable, btnPhysics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Gabungan 3 Animasi");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnProperty = findViewById(R.id.btnProp);
        btnDrawable = findViewById(R.id.btnDrawable);
        btnPhysics = findViewById(R.id.btnPhysics);

        btnProperty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PropertiActivity.class));
            }
        });

        btnDrawable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DrawableActivity.class));
            }
        });

        btnPhysics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, FisikaActivity.class));
            }
        });

    }
}
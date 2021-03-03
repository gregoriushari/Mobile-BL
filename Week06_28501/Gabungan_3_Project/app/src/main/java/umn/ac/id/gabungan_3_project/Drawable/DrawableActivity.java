package umn.ac.id.gabungan_3_project.Drawable;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import umn.ac.id.gabungan_3_project.R;

public class DrawableActivity extends AppCompatActivity {

    AnimationDrawable animasiKuda;
    ImageView gambarKuda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTitle("Animasi Drawable");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawable);
        gambarKuda = findViewById(R.id.gambarKuda);
        gambarKuda.setBackgroundResource(R.drawable.kuda_lari);
        animasiKuda = (AnimationDrawable) gambarKuda.getBackground();
        gambarKuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animasiKuda.start();
            }
        });
    }
}
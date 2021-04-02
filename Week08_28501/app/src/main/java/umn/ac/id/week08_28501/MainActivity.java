package umn.ac.id.week08_28501;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import umn.ac.id.week08_28501.TutorialA.TextEditor;
import umn.ac.id.week08_28501.TutorialB.SharedPreference;

public class MainActivity extends AppCompatActivity {
    Button first, second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = findViewById(R.id.btnFirst);
        second = findViewById(R.id.btnSecond);

        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TextEditor.class));
            }
        });

        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SharedPreference.class));
            }
        });
    }
}
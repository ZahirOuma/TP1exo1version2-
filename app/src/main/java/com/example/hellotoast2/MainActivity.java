package com.example.hellotoast2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private TextView countAffiche;
    private Button count;
    private Button texte;
    private int compteur = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        countAffiche = findViewById(R.id.countAffiche);
        count = findViewById(R.id.count);
        texte = findViewById(R.id.Toast);

        texte.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello Toast", Toast.LENGTH_LONG).show();
            }
        });


        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compteur++;
                countAffiche.setText(Integer.toString(compteur));
            }
        });
    }
}

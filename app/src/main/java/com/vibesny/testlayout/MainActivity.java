package com.vibesny.testlayout;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        ImageView imageView6 = findViewById(R.id.imageView6);
        EditText editTextNim = findViewById(R.id.editTextText2);
        EditText editTextNama = findViewById(R.id.editTextText3);
        EditText editTextKelas = findViewById(R.id.editTextText4);
        Button button = findViewById(R.id.button);

        imageView6.setImageResource(R.drawable.logoy);

        button.setOnClickListener(v -> {
            String nim = editTextNim.getText().toString();
            String name = editTextNama.getText().toString();
            String className = editTextKelas.getText().toString();
            String message = "NIM: " + nim + "\nNama: " + name + "\nKelas: " + className;
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_LONG).show();
        });
    }
}

package org.andi.ejercicio32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton = findViewById(R.id.boton);
        boton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Están salados", Toast.LENGTH_SHORT).show();
    }//Para calcular pixeles cuando quieres redimensionarlas, hay una ecuacion que es px=dp*(dpi/160)
}
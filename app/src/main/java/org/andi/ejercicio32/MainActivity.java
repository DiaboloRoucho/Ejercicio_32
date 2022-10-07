package org.andi.ejercicio32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String[] saludos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button boton = findViewById(R.id.boton);
        boton.setOnClickListener(this);
        saludos=getResources().getStringArray(R.array.saludos);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Están salados", Toast.LENGTH_SHORT).show();
    }//Para calcular pixeles cuando quieres redimensionarlas, hay una ecuacion que es px=dp*(dpi/160)

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {//Para crear el menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {//Para dictar lo que dicen las opciones
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.menuitemopcion1:
                Toast.makeText(this, "Era uno", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuitemopcion2:
                Toast.makeText(this, "Pos era otro", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menuitemopcion3:
                Toast.makeText(this, "Parece que habia otro mas", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    public void itemClick(MenuItem item){
        Toast.makeText(this, "hola", Toast.LENGTH_SHORT).show();
    }
}
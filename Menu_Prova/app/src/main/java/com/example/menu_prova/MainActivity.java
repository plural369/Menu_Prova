package com.example.menu_prova;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.op1)
        {
            Toast.makeText(
                    getApplicationContext(),
                    "Clicou em Ajuda",
                    Toast.LENGTH_LONG).show();
            return  true;
        }

        if(id == R.id.op2)
        {
            Toast.makeText(getApplicationContext(),
                    "Clicou em Sair",
                    Toast.LENGTH_LONG).show();
            return  true;
        }


        return  super.onOptionsItemSelected(item);
    }
}
package com.example.t_list;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends ListActivity {

    ArrayList<String> datos;
    ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datos = new ArrayList<>();
        datos.add("Lunes"); datos.add("Martes"); datos.add("Miércoles");
        datos.add("Jueves"); datos.add("Viernes"); datos.add("Sábado");
        datos.add("Domingo");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, datos);
        setListAdapter(adapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        Toast.makeText(this, "Has pulsado " + position, Toast.LENGTH_LONG).show();
    }
}

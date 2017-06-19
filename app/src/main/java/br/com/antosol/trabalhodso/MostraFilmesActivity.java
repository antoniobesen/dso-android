package br.com.antosol.trabalhodso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import Model.Cinema;
import Model.Filme;

public class MostraFilmesActivity extends AppCompatActivity {

    private ListView listaFilmes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostra_filmes);

        Intent intent = getIntent();
        Cinema cinema = (Cinema) intent.getSerializableExtra("cinema");
        listaFilmes = (ListView) findViewById(R.id.lista_filmes);
        ArrayList<Filme> arrayFilmes = cinema.getFilmes();
        ArrayAdapter<Filme> adapter = new ArrayAdapter<Filme>(this, android.R.layout.simple_list_item_1, arrayFilmes);
        listaFilmes.setAdapter(adapter);

        Button botao_voltar = (Button) findViewById(R.id.botao_voltar);
        botao_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        Button localizacao = (Button) findViewById(R.id.localizacao);
        localizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = getIntent();
                Cinema cinema = (Cinema) intent.getSerializableExtra("cinema");
                Intent intentMostraMapa = new Intent(MostraFilmesActivity.this, MapsActivity.class);
                intentMostraMapa.putExtra("cinema", cinema);
                startActivity(intentMostraMapa);
            }
        });

        listaFilmes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> lista, View item, int pos, long l) {
                Filme filme = (Filme) listaFilmes.getItemAtPosition(pos);
                Intent intentVaiPraInfos = new Intent(MostraFilmesActivity.this, VaiPraInfosActivity.class);
                intentVaiPraInfos.putExtra("filme", filme);
                startActivity(intentVaiPraInfos);
            }
        });




    }
}

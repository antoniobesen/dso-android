package br.com.antosol.trabalhodso;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import Model.Filme;

public class VaiPraInfosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vai_pra_infos);

        preencheInfos();




    }

    private void preencheInfos() {
        Intent intent = getIntent();
        Filme filme = (Filme) intent.getSerializableExtra("filme");

        if(filme.getTitulo().equals("Mulher-Maravilha")) {
            ImageView poster = (ImageView) findViewById(R.id.poster);
            poster.setImageResource(R.drawable.mulher);
            Button trailer = (Button) findViewById(R.id.trailer);
            trailer.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String videoId = "VSB4wGIdDwo";
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"+videoId));
                    startActivity(intent);
                }
            });
        } else {
            if(filme.getTitulo().equals("Piratas do Caribe")) {
                ImageView poster = (ImageView) findViewById(R.id.poster);
                poster.setImageResource(R.drawable.piratas);
                Button trailer = (Button) findViewById(R.id.trailer);
                trailer.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        String videoId = "XibzC-e_s5M";
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:"+videoId));
                        startActivity(intent);
                    }
                });
            } else {
                if(filme.getTitulo().equals("BayWatch - SOS Malibu")) {
                    ImageView poster = (ImageView) findViewById(R.id.poster);
                    poster.setImageResource(R.drawable.baywatch);
                    Button trailer = (Button) findViewById(R.id.trailer);
                    trailer.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String videoId = "K8YQGq6wS-I";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + videoId));
                            startActivity(intent);
                        }
                    });
                } else {
                    ImageView poster = (ImageView) findViewById(R.id.poster);
                    poster.setImageResource(R.drawable.mumia);
                    Button trailer = (Button) findViewById(R.id.trailer);
                    trailer.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            String videoId = "IjHgzkQM2Sg";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("vnd.youtube:" + videoId));
                            startActivity(intent);
                        }
                    });
                }
            }
        }

        TextView texto1 = (TextView) findViewById(R.id.texto1);
        texto1.setText("Titulo: "+filme.getTitulo());

        TextView texto2 = (TextView) findViewById(R.id.texto2);
        texto2.setText("Titulo Original: "+filme.getElenco());

        TextView texto3 = (TextView) findViewById(R.id.texto3);
        texto3.setText("Sinopse: "+filme.getSinopse());

        TextView texto4 = (TextView) findViewById(R.id.texto4);
        texto4.setText("Elenco: "+filme.getElenco());

        TextView texto5 = (TextView) findViewById(R.id.texto5);
        texto5.setText("Diretor: "+filme.getNomeDiretor());

        TextView texto6 = (TextView) findViewById(R.id.texto6);
        texto6.setText("Duracao: "+filme.getDuracao());

        TextView texto7 = (TextView) findViewById(R.id.texto7);
        texto7.setText("Sessoes: "+filme.getSessoes());

    }
}

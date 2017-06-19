package br.com.antosol.trabalhodso;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import Model.Cinema;
import Model.Filme;

public class MainActivity extends AppCompatActivity {

    private List<Cinema> cinemas;
    private ListView lista;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista = (ListView) findViewById(R.id.lista_cinemas);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> lista, View item, int pos, long l) {
                Cinema cinema = (Cinema) lista.getItemAtPosition(pos);
                Intent intentMostraFilmes = new Intent(MainActivity.this, MostraFilmesActivity.class);
                intentMostraFilmes.putExtra("cinema", cinema);
                startActivity(intentMostraFilmes);
            }
        });



    }

    @Override
    protected void onResume() {
        super.onResume();
        cinemas = createCinemasEFilmes();

        ArrayAdapter<Cinema> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, cinemas);

        lista.setAdapter(adapter);

    }

    private ArrayList<Cinema> createCinemasEFilmes() {
        String sinopse = "Treinada desde cedo para ser uma guerreira imbatível, Diana Prince (Gal Gadot) nunca saiu da paradisíaca ilha em que é reconhecida como princesa das Amazonas. Quando o piloto Steve Trevor (Chris Pine) se acidenta e cai numa praia do local, ela descobre que uma guerra sem precedentes está se espalhando pelo mundo e decide deixar seu lar certa de que pode parar o conflito. Lutando para acabar com todas as lutas, Diana percebe o alcance de seus poderes e sua verdadeira missão na Terra.";
        String sessoes = "Sala 1: 13:00 dublado, Sala 1: 15:45 dublado, Sala 2: 19:00 legendado, Sala 3: 23:00 legendado";
        Filme filme = new Filme(
                "Wonder Woman", "Mulher-Maravilha", "Chris Patt",
                "Gal Gadot, Robin Wright, Chris Pine, David Thewlis, Elena Anaya, Danny Huston, Lucy Davis, " +
                        "Ewen Bremner, Saïd Taghmaoui. ",sinopse, 144, sessoes);


        String sinopse1 = "Nas profundezas do deserto, uma antiga rainha cujo destino foi injustamente tirado está mumificada. Apesar de estar sepultada em sua cripta, ela desperta nos dias atuais. Com uma maldade acumulada ao longo dos anos, ela espelha terror desde as areais do Oriente Médio até os becos de Londres.";
        String sessoes1 = "Sala 4: 13:45 dublado, Sala 2: 17:00 legendado, Sala 2: 19:00 legendado, Sala 3: 21:30 legendado";
        Filme filme1 = new Filme(
                "The Mummy", "A Mumia", "Oliver Richard Thompson",
                " Tom Cruise, Sofia Boutella, Annabelle Wallis" +
                        "Ewen Bremner, Saïd Taghmaoui. ",sinopse1, 98, sessoes1);

        String sinopse2 = "Em pleno século XVII, o pirata Jack Sparrow (Johnny Depp) tem seu navio saqueado e roubado pelo capitão Barbossa (Geoffrey Rush) e sua tripulação. Com o navio de Sparrow, Barbossa invade e saqueia a cidade de Port Royal, levando consigo Elizabeth Swann (Keira Knightley), a filha do governador (Jonathan Pryce).";
        String sessoes2 = "Sala 5: 13:30 legendado, Sala 4: 17:00 legendado , Sala 2: 21:30 legendado, Sala 3: 20:00 legendado";
        Filme filme2 = new Filme(
                "Caribbean Pirates", "Piratas do Caribe", "July Oldboy",
                "Johnny Depp, Geoffrey Rush, Kevin R. McNally, Stephen Graham " +
                        "Ewen Bremner, Saïd Taghmaoui. ",sinopse2, 101, sessoes2);

        ArrayList<Filme> filmes = new ArrayList<>();
        filmes.add(filme);
        filmes.add(filme1);
        filmes.add(filme2);

        Cinema cinema = new Cinema(filmes, -48.5148548,-27.5903699, "CineSystem-Iguatemi");

        ArrayList<Cinema> cinemas = new ArrayList<>();
        cinemas.add(cinema);

        String sinopse3 = "Em Emerald Bay ninguém se destaca mais do que o lendário salva-vidas Mitch Buchannon (Dwayne \"The Rock\"). Como líder da equipe de Baywatch, Mitch tornou-se uma espécie de herói local. Mas o novo e insubordinado recruta do time Matt Brody (Zac Efron) anda tirando a sua paciência. Apesar das desavenças, os dois se unem quando descobrem uma conspiração criminosa local que ameaça o futuro da baía onde trabalham. ";
        String sessoes3 = "Sala 1: 12:00 dublado, Sala 1: 14:30 legendado , Sala 2: 16:00 legendado, Sala VIP: 20:00 legendado";
        Filme filme3 = new Filme(
                "BayWatch", "BayWatch - SOS Malibu", "John Litchfield",
                "Zac Efron, Alexandra Daddario, Dwayne Johnson, Priyanka Chopra, Kelly Rohrbach, Ilfenesh Hadera, Jon Bass ",sinopse3, 116, sessoes3);

        String sessoes4 = "Sala 1: 12:00 dublado, Sala 1: 15:30 legendado , Sala 2: 13:00 legendado, Sala 2: 18:00 legendado";
        String sessoes5 = "Sala 1: 12:00 dublado, Sala 1: 13:30 legendado , Sala 2: 15:00 legendado, Sala 2: 17:00 legendado, Sala 3: 17:00 dublado, Sala 4: 21:00 legendado, Sala 4: 23:00 legendado";
        String sessoes6 = "Sala 1: 13:15 dublado, Sala 1: 16:35 legendado , Sala 2: 14:25 legendado, Sala 2: 16:30 legendado, Sala 3: 17:00 dublado, Sala 4: 21:00 legendado, Sala 4: 23:00 legendado";
        Filme filme4 = new Filme(
                "Wonder Woman", "Mulher-Maravilha", "Chris Patt",
                "Gal Gadot, Robin Wright, Chris Pine, David Thewlis, Elena Anaya, Danny Huston, Lucy Davis, " +
                        "Ewen Bremner, Saïd Bennetaou. ",sinopse, 144, sessoes4);
        Filme filme5 = new Filme(
                "The Mummy", "A Mumia", "Oliver Richard Thompson",
                " Tom Cruise, Sofia Boutella, Annabelle Wallis" +
                        "Ewen Bremner, Willian Silverstone. ",sinopse1, 98, sessoes5);

        Filme filme6 = new Filme(
                "Caribbean Pirates", "Piratas do Caribe", "July Oldboy",
                "Johnny Depp, Geoffrey Rush, Kevin R. McNally, Stephen Graham " +
                        "Ewen Gonec, Holly Sylvin. ",sinopse2, 101, sessoes6);

        ArrayList<Filme> filmes2 = new ArrayList<>();
        filmes2.add(filme3);
        filmes2.add(filme4);
        filmes2.add(filme5);
        filmes2.add(filme6);

        Cinema cinema2 = new Cinema(filmes2, -48.6461949,-27.6139039, "Cinepolis-Continente");
        cinemas.add(cinema2);
        return cinemas;
    }
}

package com.example.recyclerviewstudies.Activity.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.recyclerviewstudies.Activity.Adapter.Adapter;
import com.example.recyclerviewstudies.Activity.Model.Filme;
import com.example.recyclerviewstudies.Activity.RecyclerItemClickListener;
import com.example.recyclerviewstudies.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public RecyclerView recyclerView;
    private List<Filme> listaFilmes=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);

        //Listagem de filmes
        this.CriarFilmes();

        //Adapter
        Adapter adapter=new Adapter(listaFilmes);

        //RecyclerView
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(
                getApplicationContext()
        );
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);

        //click
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(
                        getApplicationContext(),
                        recyclerView,
                        new RecyclerItemClickListener.OnItemClickListener() {
                            @Override
                            public void onItemClick(View view, int position) {
                                Toast.makeText(
                                        getApplicationContext(),
                                        String.valueOf(position),
                                        Toast.LENGTH_SHORT
                                ).show();

                            }

                            @Override
                            public void onLongItemClick(View view, int position) {
                                Filme filme=listaFilmes.get(position);
                                Toast.makeText(
                                        getApplicationContext(),
                                        filme.getTitulo(),
                                        Toast.LENGTH_LONG
                                ).show();

                            }

                            @Override
                            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                            }
                        })
        );

    }

    public void CriarFilmes(){
        Filme filme=new Filme("homem aranha","aventura","2018");
        this.listaFilmes.add(filme);
        filme=new Filme("parasita","suspense","2019");
        this.listaFilmes.add(filme);
        filme=new Filme("ford vs ferrari","aventura","2019");
        this.listaFilmes.add(filme);
        filme=new Filme("a favorita","drama","2017");
        this.listaFilmes.add(filme);
        filme=new Filme("1917","guerra","2019");
        this.listaFilmes.add(filme);
    }

}

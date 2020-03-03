package com.example.cardviewstudies.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardviewstudies.Adapter.PostagemAdapter;
import com.example.cardviewstudies.Model.Postagem;
import com.example.cardviewstudies.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Postagem> postagens=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerViewPost = findViewById(R.id.recyclerViewPost);

        //Layout
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        //layoutManager.computeVerticalScrollOffset();
        recyclerViewPost.setLayoutManager(layoutManager);

        //Adapter
        this.preparaPost();
        PostagemAdapter adapter=new PostagemAdapter(postagens);
        recyclerViewPost.setAdapter(adapter);


    }

    public void preparaPost(){
        Postagem p=new Postagem("Augusto","#AVidaéBoa",R.drawable.imagem3);
        this.postagens.add(p);
        p=new Postagem("Augusto","#MuitoPepita",R.drawable.imagem2);
        this.postagens.add(p);
        p=new Postagem("Augusto","#tripin'",R.drawable.imagem1);
        this.postagens.add(p);
        p=new Postagem("Augusto","#Salamalenco",R.drawable.imagem4);
        this.postagens.add(p);
    }
}

package com.example.cardviewstudies.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardviewstudies.Model.Postagem;
import com.example.cardviewstudies.R;

import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.MyViewHolder> {

    private List<Postagem> postagens;

    public PostagemAdapter(List<Postagem> p) {
        this.postagens =p;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_datail,parent,false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Postagem post= postagens.get(position);
        holder.nome.setText(post.getNome());
        holder.postagem.setText(post.getPostagem());
        holder.imagem.setImageResource(post.getImagem());


    }

    @Override
    public int getItemCount() {
        return postagens.size();
    }

    public  class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView nome;
        private TextView postagem;
        private ImageView imagem;

        public MyViewHolder(View itemView) {
            super(itemView);
            nome=itemView.findViewById(R.id.textView);
            postagem=itemView.findViewById(R.id.textView2);
            imagem=itemView.findViewById(R.id.textView3);
        }





    }

}

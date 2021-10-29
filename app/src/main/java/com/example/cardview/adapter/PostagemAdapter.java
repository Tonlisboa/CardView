package com.example.cardview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.R;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class PostagemAdapter extends RecyclerView.Adapter<PostagemAdapter.PostagemHolder> {

    //Define a lista para passa para os cards
    private List<Postagem> postagens = new ArrayList<>();
    public PostagemAdapter(List<Postagem> listaPostagens) {
        this.postagens = listaPostagens;
    }

    @NonNull
    @Override
    public PostagemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //Inflar o layout postagem_detalhe em uma View
        View intemLista = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.postagem_detalhe,
                parent,
                false
        );
        //Retorna o Holder com o layout Inflado
        return new PostagemAdapter.PostagemHolder(intemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull PostagemHolder holder, int position) {
        //Exibe o holder aqui
        Postagem postagem = postagens.get(position);
        holder.textNome.setText(postagem.getNome());
        holder.textPostagem.setText(postagem.getPostagem());
        holder.imagePostagem.setImageResource(postagem.getImagem());
    }

    @Override
    public int getItemCount() {
        //Define a quantidade de items do holder
        return postagens.size();
    }

    //Class para o ViewHolder
    public class PostagemHolder extends RecyclerView.ViewHolder {
        private TextView textNome;
        private TextView textPostagem;
        private ImageView imagePostagem;

        public PostagemHolder(@NonNull View itemView) {
            super(itemView);
            textNome = itemView.findViewById(R.id.textNome);
            textPostagem = itemView.findViewById(R.id.textPostagem);
            imagePostagem = itemView.findViewById(R.id.imagePostagem);
        }
    }
}

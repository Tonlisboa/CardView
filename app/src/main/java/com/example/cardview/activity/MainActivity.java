package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;
import com.example.cardview.adapter.PostagemAdapter;
import com.example.cardview.model.Postagem;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerPostagem;
    //Criando uma lista para exibir as postagens a partir de uma classe

    private List<Postagem> postagens;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerPostagem = findViewById(R.id.recyclerPostagem);
        //Definir um Layout para o RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerPostagem.setLayoutManager(layoutManager);

        //Definir um Adapter
        this.preparaPostagens(); //Carrega a list de postagens
        //Agora é necessário criar um Layout XML para o Adapter
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);

    }
    public void preparaPostagens(){
        Postagem p = new Postagem("Antonio Lisboa", "#tbt Viagem Legal",R.drawable.imagem1);
        this.postagens.add(p);
        p = new Postagem("Hotel JM", "Viaje, aproveite nossos descontos!",R.drawable.imagem2);
        this.postagens.add(p);
        p = new Postagem("Maria Luiza", "#Paris",R.drawable.imagem3);
        this.postagens.add(p);
        p = new Postagem("Marcos Paulo", "Que foto linda",R.drawable.imagem4);
        this.postagens.add(p);
    }
}
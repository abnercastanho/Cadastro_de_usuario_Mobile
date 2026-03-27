package com.abner.cadastrousuario;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //Declaração dos componentes visuais e do adaptador da lista
    RecyclerView recyclerView;
    UserAdapter adapter;
    Button btnCadastrar;

    //Atenção: Atributo statico (static) permite que os dados persistam na memoria
    //enauto o app estiver aberto e sejam acessados diretamente por outras telas (activties)
    public static List<String> listaNomes = new ArrayList<>();

    //Metodo de inicialização da Activity (ponto de entrada da tela)
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //Vincula o arquivo de layout XML (Activity_Main.xml) a essa classe java
        setContentView(R.layout.activity_main);

        //Regra de Negocio: insere um texto no topo da lista, caso ela esteja vazia
        if(listaNomes.isEmpty()){
            listaNomes.add("Nomes de cadastro");
        }

        //mapeamento dos componentes do RecycleView do XML para o objeto java
        recyclerView = findViewById(R.id.recycler_view);

        //Define o LayoutManager: Organiza itens da lista numa coluna vetical simples
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //istancia o adaptador passando a nossa lista de nomes
        adapter = new UserAdapter(listaNomes);

        //Connecta o adaptador ao RecyclerView para que os dados sejam desenhados na tela
        recyclerView.setAdapter(adapter);

        //Mapeia o botão de cadastro
        btnCadastrar = findViewById(R.id.btnCadastrar);

        //Configura o envento de clique usando a expressão lambda (java 8+)
        btnCadastrar.setOnClickListener(v -> {
            startActivities(new Intent(MainActivity.this, CreateUser.class));
        });
    }

    //Metodo chamado sempre que a tela volta a ficar visivel para o usuario
    @Override
    protected void onResume(){
        super.onResume();
        //Avisar o adaptador que a fonte de doados (listaNomes) pode ter sifo alterada na outra tela
        // forçando a atualização visual da lista
        adapter.notifyDataSetChanged();
    }
}
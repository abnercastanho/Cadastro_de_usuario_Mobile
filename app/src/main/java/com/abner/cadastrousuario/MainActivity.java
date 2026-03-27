package com.abner.cadastrousuario;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
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

    }
}
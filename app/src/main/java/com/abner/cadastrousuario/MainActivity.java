package com.abner.cadastrousuario;

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


}
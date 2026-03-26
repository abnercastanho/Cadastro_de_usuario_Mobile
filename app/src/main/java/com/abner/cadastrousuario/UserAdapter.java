package com.abner.cadastrousuario;

import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

import java.util.List;

//Classe Adapter: Gerencia a criação e o preenchimento dos itens na RecycleView
public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    //Atributo privado que armazena a referencia dos dados que serao exibidos
    private List<String> ListaUsuarios;

    //Construtor que permite que a MainActivity "entregue" a lista de dados para este  Adapter
    public UserAdapter(List<String> lista){
        this.ListaUsuarios = lista;
    }

    //Metodo 1: Cria "do zero" o visual de uma linha da lista (+ViewMoldel)
    @NotNull
    @Override
    public ViewHolder onCreateViewMoldel (@Override ViewGroup parent, int viewType){

    }
}

package com.abner.cadastrousuario;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.lifecycle.ViewModel;
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

    //Metodo 1: Cria "do zero" o visual de uma linha da lista (+ViewHolder)
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder (@NonNull ViewGroup parent, int viewType){
        //LayoutInflater transforma o arquivo XML em um objeto view java
        //Aqui usamos um layout padrao do android (simple_list_item_1) para facilitar.
        View view = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_list_item_1, parent, false);

        //Retorna uma nova instancia de nossa classe interna ViewMolder com a View Criada
        return new ViewHolder(view);
    }

    //Metodo 2: Vincula os dados de um objeto de lista a uma linha especifica da tela
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position){
        //Recupera os dados de lista de acordo com a posição que o android está desenhando agora.
        Strin nome = ListaUsuarios.get(position);

        //Define o texto no componente visual que esta guardado dentro de 'holder'
        holder.tvNome.setNext(nome);
    }

    //Metodo 3: Informa ao Android quandtos itens a lista possui ao todo
    public int getItemCount(){
        //Se a lista existir, retorna o tamanho, se nao, retorna zero
        return ListaUsuarios != null ? ListaUsuarios.size():0;
    }

    //Classe interna ViewHolder: Servir para "segurar" as referências dos componentes de cada linha
    //Evitar chamadas respectivas ao findViewById, melhorando a performance do RecycleView
    public class ViewHolder extends RecyclerView.ViewHolder{
        //Referencia para o TextView da Linha
        TextView tvNome;

        public ViewHolder(@NonNull View intemView){
            super(itemView);
            //Faz o mapeamento do ID do layout para o objeto JAVA
            //android.R.id.text é o ID padrão do layout 'simple_list_item_1'
            tvNome = itemView.findViewById(android.R.id.text1);
        }
    }
}

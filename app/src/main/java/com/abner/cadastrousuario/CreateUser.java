package com.abner.cadastrousuario;

//Bloco de importações
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class CreateUser extends AppCompatActivity{
    TextInputEditText editNome, editEmail;
    Button btnSalvar;

    //Vincula Variavel com elemento da interface grafica, escrito no arquivo xml
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.creat_user);

        editNome=findViewById(R.id.nome_completo);
        editEmail=findViewById(R.id.email);
        btnSalvar=findViewById(R.id.btnSalvar);

        btnSalvar.setOnClickListener(v -> {
            String nome = editNome.getText().toString();
            String email = editEmail.getText().toString();

            if(nome.isEmpty()){
                MainActivity.listaNomes.add(nome + "(" + email + ")");
                finish();
            }
        });
    }
}


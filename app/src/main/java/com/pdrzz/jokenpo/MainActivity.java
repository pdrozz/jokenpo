package com.pdrzz.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    int app=0;
    int jogador=0;


    public void selecionadoPedra(View view){
        this.opcaoselecionada("pedra");

    }

    public void selecionadoPapel(View view){
        this.opcaoselecionada("papel");
    }

    public void selecionadoTessoura(View view){
        this.opcaoselecionada("tesoura");
    }




    public void opcaoselecionada(String opcao){
        ImageView resultado=findViewById(R.id.imgEscolhaApp);
        ImageView escolhaJogador=findViewById(R.id.imgEscolhaJogador);
        int selecionador = new Random().nextInt(3);
        String[] opcoes = {"papel","pedra","tesoura"};
        String opcaoapp=opcoes[selecionador];

        TextView contadorApp,contadorVoce;
        contadorApp=findViewById(R.id.contadorApp);
        contadorVoce=findViewById(R.id.contadorVoce);



        switch (opcao){
            case "papel":
                escolhaJogador.setImageResource(R.drawable.papel);
                break;
            case "pedra":
                escolhaJogador.setImageResource(R.drawable.pedra);
                break;
            case "tesoura":
                escolhaJogador.setImageResource(R.drawable.tesoura);
                break;

        }



        switch (opcaoapp){
            case "papel":
                resultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                resultado.setImageResource(R.drawable.tesoura);
                break;
            case "pedra":
                resultado.setImageResource(R.drawable.pedra);
                break;
        }
        TextView result = findViewById(R.id.txtresultado);
        if ((opcaoapp=="papel" && opcao=="pedra") || (opcaoapp=="tesoura" && opcao=="papel") || (opcaoapp=="pedra" && opcao=="tesoura")){

            result.setText("O APP ganhou");
            app++;
            contadorApp.setText(app+"");

            }else if((opcao=="papel" && opcaoapp=="pedra") || (opcao=="tesoura" && opcaoapp=="papel") || (opcao=="pedra" && opcaoapp=="tesoura")){
            result.setText("Você ganhou");
            jogador++;
            contadorVoce.setText(jogador+"");
        }else{
            result.setText("Deu empate!!");

        }




    }







}

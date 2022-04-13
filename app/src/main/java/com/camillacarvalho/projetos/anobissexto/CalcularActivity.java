package com.camillacarvalho.projetos.anobissexto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import java.time.Year;


public class CalcularActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular);

        /// campos locais
        TextView textoNome = (TextView)findViewById(R.id.textoNomeTela2);
        TextView textoData = (TextView)findViewById(R.id.textoData);

        // referencias de dados
        TextView textoResposta = (TextView)findViewById(R.id.textoResposta);
        TextView tituloMensagem = (TextView)findViewById(R.id.tituloMensagemFinal);
        TextView textoMensagem = (TextView)findViewById(R.id.textoMensagemFinal);

        tituloMensagem.setVisibility(View.INVISIBLE);
        textoMensagem.setVisibility(View.INVISIBLE);

        Bundle b = getIntent().getExtras();
        CharSequence nome = b.getCharSequence("nome");
        CharSequence data = b.getCharSequence("data");

        int ano = Integer.parseInt(data.toString());
        System.out.println(Year.isLeap(ano)); // true

        boolean anoBissexto = Year.isLeap(ano);
        textoNome.setText(nome);
        textoData.setText(data);
        textoResposta.setText((anoBissexto?"SIM":"NÃO"));

        ///
        Button botaoCompartilhar = findViewById(R.id.buttonCompartilhar);

        botaoCompartilhar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                textoMensagem.setText(nome+", o ano "+data+" "+(anoBissexto?"SIM":"NÃO")+" é um ano bissexto.");
                tituloMensagem.setVisibility(View.VISIBLE);
                textoMensagem.setVisibility(View.VISIBLE);
            }

        });
    }

    public static void calcularAnoBissexto(){

    }
}
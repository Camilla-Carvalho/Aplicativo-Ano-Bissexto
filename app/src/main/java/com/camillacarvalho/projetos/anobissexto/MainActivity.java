package com.camillacarvalho.projetos.anobissexto;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView myAwesomeTextView = (TextView)findViewById(R.id.textIntroNome);
        EditText nome = (EditText)findViewById(R.id.textoNomeTela1);
        EditText data = (EditText)findViewById(R.id.textoData);

        ///
        Button botaoCalcular = findViewById(R.id.buttonCalcular);
        botaoCalcular.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                System.out.println("Button Clicked");

                Intent activity2Intent = new Intent(getApplicationContext(), CalcularActivity.class);
                activity2Intent.putExtra("nome", nome.getText());
                activity2Intent.putExtra("data", data.getText());
                startActivity(activity2Intent);

//                myAwesomeTextView.setText("Nome é "+nome.getText());
            }
        });
    }

}
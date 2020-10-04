package com.example.projetoaposentadoria;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ReportActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_report);
    TextView lblAposentar = (TextView)findViewById(R.id.lblAposentar);
    TextView lblcontribuicao = (TextView)findViewById(R.id.lblcontribuicao);


    String nome = getIntent().getStringExtra("nome");
    String idade = getIntent().getStringExtra("idade");
    String contribuicao = getIntent().getStringExtra("contribuicao");
    String sexoSelecionado = getIntent().getStringExtra("sexoSelecionado");

    int idadeConvertida = Integer.parseInt(idade);
    int contribuicaoConvertida = Integer.parseInt(contribuicao);
    int resultadoContribuicaoMasculina = 20 - contribuicaoConvertida;
    int resultadoContribuicaoFeminina = 15 - contribuicaoConvertida;

    if (sexoSelecionado.equals("Homem") ) {
      if (contribuicaoConvertida >= 20) {
        lblAposentar.setText("você pode se aposentar");
        lblcontribuicao.setText("sua contribuição é " + contribuicaoConvertida + " anos.");
      } else if (idadeConvertida >= 65) {
        lblAposentar.setText("você pode se aposentar");
        lblcontribuicao.setText("");
      } else if(contribuicaoConvertida < 20){
        lblcontribuicao.setText("falta " + resultadoContribuicaoMasculina + " anos de contribuição");
      }
    }

    if (sexoSelecionado.equals("Mulher") ) {
      if (contribuicaoConvertida >= 15) {
        lblAposentar.setText("você pode se aposentar");
        lblcontribuicao.setText("sua contribuição é " + contribuicaoConvertida + " anos.");
      } else if (idadeConvertida >= 62) {
        lblAposentar.setText("você pode se aposentar");
        lblcontribuicao.setText("");
      } else if(contribuicaoConvertida < 15){
        lblcontribuicao.setText("falta " + resultadoContribuicaoFeminina + " anos de contribuição");
      }
    }


    ((TextView)findViewById(R.id.lblNome)).setText(nome);
    ((TextView)findViewById(R.id.lblIdade)).setText(idade);
  }
}
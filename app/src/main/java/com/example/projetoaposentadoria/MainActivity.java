package com.example.projetoaposentadoria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void btnCalcularAposentadoria(View v){
      RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
      int selectSexo = radioGroup.getCheckedRadioButtonId();
      Intent intent = new Intent (getApplicationContext(), ReportActivity.class);

      intent.putExtra("nome", ((EditText)findViewById(R.id.txtNome)).getText().toString());
      intent.putExtra("idade", ((EditText)findViewById(R.id.txtIdade)).getText().toString());
      intent.putExtra("contribuicao", ((EditText)findViewById(R.id.txtContribuicao)).getText().toString());
      intent.putExtra("sexoSelecionado", ((RadioButton)findViewById(selectSexo)).getText().toString());
      intent.putExtra("homem", ((RadioButton)findViewById(R.id.radioButtonHomem)).getText().toString());
      startActivity(intent);
    }
}
package br.com.bossini.projetop1dontpad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Imagens extends AppCompatActivity {

    EditText linkEditText;
    Button botaoTexto;

    String linkEditText2;

    Intent telaInicial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagens);

        botaoTexto = findViewById(R.id.botaoTexto);
        linkEditText = findViewById(R.id.linkEditText);

        Intent telaImagens = getIntent();

        linkEditText.setText(telaImagens.getStringExtra("link"));
    }

    public void textoOnClick (View v) {
        linkEditText2 = linkEditText.getText().toString();

        telaInicial = new Intent(getApplicationContext(), MainActivity.class);
        telaInicial.putExtra("link", linkEditText2);

        startActivity(telaInicial);
    }
}

package br.com.bossini.projetop1dontpad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText linkEditText;
    Button botaoImagens;

    String linkEditText2;

    Intent telaImagens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoImagens = findViewById(R.id.botaoTexto);
        linkEditText = findViewById(R.id.linkEditText);

        Intent telaInicial = getIntent();

        linkEditText.setText(telaInicial.getStringExtra("link"));
    }

    public void imagensOnClick (View v) {
        linkEditText2 = linkEditText.getText().toString();

        telaImagens = new Intent(getApplicationContext(), Imagens.class);
        telaImagens.putExtra("link", linkEditText2);

        startActivity(telaImagens);
    }
}

package com.example.recappsimples;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView nomeUsuario;
    private Button botaoSair;
    private ImageView imagemUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nomeUsuario = findViewById(R.id.nomeUsuario);
        botaoSair = findViewById(R.id.botaoSair);
        imagemUsuario = findViewById(R.id.imagemUsuario);

        String usuario = getIntent().getStringExtra("usuario");
        nomeUsuario.setText(usuario);

        botaoSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

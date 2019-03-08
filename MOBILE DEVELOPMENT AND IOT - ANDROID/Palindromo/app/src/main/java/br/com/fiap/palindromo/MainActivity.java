package br.com.fiap.palindromo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText frase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frase = findViewById(R.id.frase);
    }

    public void verificar(View view) {
        String texto = frase.getText().toString();
        String palindromo = new StringBuilder(texto).reverse().toString();

        if(texto.equals(palindromo)){
            Toast.makeText(this, "É um palindromo", Toast.LENGTH_LONG).show();
        } else{
            Toast.makeText(this, "Não é um palindromo", Toast.LENGTH_LONG).show();
        }
    }
}

package br.com.alura.gamefiap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    int images[] = {
            R.drawable.n1,
            R.drawable.n2,
            R.drawable.n3,
            R.drawable.n4,
            R.drawable.n5,
            R.drawable.n6
    };

    int j1 = 0;
    int j2 = 0;

    Button btnJ1;
    Button btnJ2;

    ImageView diceImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        diceImage = findViewById(R.id.dice);

        btnJ1 = findViewById(R.id.jogador_1);
        btnJ2 = findViewById(R.id.jogador_2);
        btnJ2.setEnabled(false);
    }

    public void cliqueJogador(View view) {
        int number = new Random().nextInt(5) + 1;
        diceImage.setImageResource(images[number]);
        atribuiPontos(view, number);
        passaJogada();
    }

    public void atribuiPontos(View view, int number){
        if(view == btnJ1){
            j1 = number;
        } else if(view == btnJ2){
            j2 = number;
            finaliza();
        }
    }

    public void passaJogada(){
        if(btnJ1.isEnabled()){
            btnJ1.setEnabled(false);
            btnJ2.setEnabled(true);
        } else if(btnJ2.isEnabled()){
            btnJ2.setEnabled(false);
            btnJ1.setEnabled(true);
        }
    }

    public void finaliza(){
        if(j1 > j2) {
            Toast.makeText(this, "Vencedor: Jogador 1", Toast.LENGTH_LONG).show();
        } else if (j1 == j2){
            Toast.makeText(this, "Empate!", Toast.LENGTH_LONG).show();
        } else{
            Toast.makeText(this, "Vencedor: Jogador 2", Toast.LENGTH_SHORT).show();
        }
    }
}

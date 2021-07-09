package frasedodia.estagiariopleno.com.frasedodia;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoFrase;
    private TextView textoFrase;

    String [] frases = {"Por que você ainda persiste em algo que não vale a pena?" ,
                        "Sua vida é um fracasso.",
                        "Chegou a hora de mudar, MUDE!" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoFrase = (Button) findViewById(R.id.BotaoFraseId);
        textoFrase = (TextView) findViewById(R.id.TextoFraseId);

        //Ao clicar no botão, esta função será responsável por gerar a frase aleatória
        botaoFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                textoFrase.setText(frases[random.nextInt(frases.length)]);
            }
        });

    }
}

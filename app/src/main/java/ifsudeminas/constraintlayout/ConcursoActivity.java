package ifsudeminas.constraintlayout;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Random;

public class ConcursoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concurso_de_textos);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        TextView textViewEsquerda = findViewById(R.id.txtEsquerda);
        TextView textViewDireita = findViewById(R.id.txtDireita);

        String[] textos = getResources().getStringArray(R.array.lista_textos);
        Random random = new Random();

        String texto1 = textos[random.nextInt(textos.length)];
        String texto2 = textos[random.nextInt(textos.length)];

        textViewEsquerda.setText(texto1);
        textViewDireita.setText(texto2);
    }
}
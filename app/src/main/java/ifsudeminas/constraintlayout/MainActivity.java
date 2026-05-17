package ifsudeminas.constraintlayout;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnBlog = findViewById(R.id.btnBlog);
        Button btnSerie = findViewById(R.id.btnSerie);
        Button btnConcurso = findViewById(R.id.btnConcurso);

        if (btnBlog != null) {
            btnBlog.setOnClickListener(v -> {
                startActivity(new Intent(this, BlogActivity.class));
            });
        }

        if (btnSerie != null) {
            btnSerie.setOnClickListener(v -> {
                startActivity(new Intent(this, SerieActivity.class));
            });
        }

        if (btnConcurso != null) {
            btnConcurso.setOnClickListener(v -> {
                startActivity(new Intent(this, ConcursoActivity.class));
            });
        }
    }
}
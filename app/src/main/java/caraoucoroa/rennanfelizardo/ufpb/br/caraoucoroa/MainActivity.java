package caraoucoroa.rennanfelizardo.ufpb.br.caraoucoroa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView botaoJogar;
    private String[] opcao = {"cara", "coroa"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (ImageView) findViewById(R.id.botaoJogarId);

        botaoJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random = new Random();
                int numeroAleatorio = random.nextInt(opcao.length);

                Bundle bundle = new Bundle();
                bundle.putString("opcao", opcao[numeroAleatorio]);

                Intent intent = new Intent(MainActivity.this, DetalheActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
                finish();
            }
        });
    }
}

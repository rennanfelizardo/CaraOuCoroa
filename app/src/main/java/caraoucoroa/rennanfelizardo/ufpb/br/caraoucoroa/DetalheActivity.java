package caraoucoroa.rennanfelizardo.ufpb.br.caraoucoroa;

import android.content.Intent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;

public class DetalheActivity extends AppCompatActivity {

    private ImageView botaoVoltar;
    private ImageView resultadoMoeda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe);

        botaoVoltar = (ImageView) findViewById(R.id.botaoVoltarId);
        resultadoMoeda = (ImageView) findViewById(R.id.resultadoMoedaId);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            String opcao = bundle.getString("opcao");
            assert opcao != null;
            if (opcao.equals("cara")){
                resultadoMoeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_cara));
            }else{
                resultadoMoeda.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.moeda_coroa));
            }
        }

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DetalheActivity.this, MainActivity.class));
                finish();
            }
        });
    }
}

package desktop.senac.diziplus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ResultActivity extends Activity{

    protected void onCreat(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String valorUm = intent.getStringExtra(MainActivity.EXTRA_VALOR_UM);
        String valorDois = intent.getStringExtra(MainActivity.EXTRA_VALOR_DOIS);
        TextView resultadoView = findViewById(R.id.ResultTextView);
        double valorUmBack = Double.parseDouble(valorUm);
        double valorDoisBack =Double.parseDouble(valorDois);
        double resultado = valorUmBack + valorDoisBack;

        if(resultado >= 0.7) {
            resultadoView.setText("O melhor combustivel é a gasolina");
        }else{
            resultadoView.setText("O melhor combustivel é o Etanol");
        }
        Button backButton = findViewById(R.id.back_button);
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                ResultActivity.super.onBackPressed();
            }
        });
        }
}



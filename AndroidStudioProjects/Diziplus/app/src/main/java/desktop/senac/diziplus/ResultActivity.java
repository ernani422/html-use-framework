package desktop.senac.diziplus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ResultActivity extends Activity{

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        String valorUm = intent.getStringExtra(MainActivity.EXTRA_VALOR_UM);
        String valorDois = intent.getStringExtra(MainActivity.EXTRA_VALOR_DOIS);
        TextView resultadoView = findViewById(R.id.resultadoView);
        double valorUmBack = Double.parseDouble(valorUm);
        double valorDoisBack =Double.parseDouble(valorDois);
        double resultado = valorDoisBack / valorUmBack;

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



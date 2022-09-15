package desktop.senac.calculadorafinal;

import android.app.Activity;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import desktop.senac.calculadorafinal.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener{

    double num1, num2;
    String sinal;
    Button igual, ponto, soma, limpar, subtracao, divisao, multiplicacao, numerozero, numero_1, numero_2, numero_3, numero_4, numero_5, numero_6, numero_7, numero_8, numero_9;
    EditText resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teclado();

        numerozero = (Button) findViewById(R.id.numerozero);
        numero_1 = (Button) findViewById(R.id.numero_1);
        numero_2 = (Button) findViewById(R.id.numero_2);
        numero_3 = (Button) findViewById(R.id.numero_3);
        numero_4 = (Button) findViewById(R.id.numero_4);
        numero_5 = (Button) findViewById(R.id.numero_5);
        numero_6 = (Button) findViewById(R.id.numero_6);
        numero_7 = (Button) findViewById(R.id.numero_7);
        numero_8 = (Button) findViewById(R.id.numero_8);
        numero_9 = (Button) findViewById(R.id.numero_9);
        igual = (Button) findViewById(R.id.igual);
        ponto = (Button) findViewById(R.id.ponto);
        soma = (Button) findViewById(R.id.soma);
        subtracao = (Button) findViewById(R.id.subtracao);
        divisao = (Button) findViewById(R.id.divisao);
        multiplicacao = (Button) findViewById(R.id.multiplicacao);
        limpar = (Button) findViewById(R.id.limpar);
        resultado = (EditText) findViewById(R.id.resultado);

    }

    private void ponto(String ponto) {
        resultado.setText(resultado.getText().toString() + ponto);
    }

    private void limpar() {
        resultado.setText("");
    }

    private void iniciar(){

    }

    private void teclado(){
        numerozero.setOnClickListener(this);
        numero_1.setOnClickListener(this);
        numero_2.setOnClickListener(this);
        numero_3.setOnClickListener(this);
        numero_4.setOnClickListener(this);
        numero_5.setOnClickListener(this);
        numero_6.setOnClickListener(this);
        numero_7.setOnClickListener(this);
        numero_8.setOnClickListener(this);
        numero_9.setOnClickListener(this);
        igual.setOnClickListener(this);
        ponto.setOnClickListener(this);
        soma.setOnClickListener(this);
        subtracao.setOnClickListener(this);
        divisao.setOnClickListener(this);
        multiplicacao.setOnClickListener(this);
        limpar.setOnClickListener(this);
    }

    private void tela(int num) {

        if (resultado.getText().toString().trim().equals("")) {
            limpar();
            resultado.setText(resultado.getText().toString() + String.valueOf(num));
        } else {
            resultado.setText(resultado.getText().toString() + String.valueOf(num));
        }

        private void operacoes(String sinal) {

            this.sinal = sinal;

            if (sinal == "+") {
                num1 = Double.parseDouble(resultado.getText().toString().trim());
                limpar();
            } else if (sinal == "-") {
                num1 = Double.parseDouble(resultado.getText().toString().trim());
                limpar();
            } else if (sinal == "*") {
                num1 = Double.parseDouble(resultado.getText().toString().trim());
                limpar();
            } else if (sinal == "/") {
                num1 = Double.parseDouble(resultado.getText().toString().trim());
                limpar();
            }

        }

        private void resultado() {
            if(!resultado.getText().toString().trim().equals("")){

                if (sinal == "+") {
                    num2 = (num1 + Double.parseDouble(resultado.getText().toString().trim()));
                } else if (sinal == "-") {
                    num2 = (num1 - Double.parseDouble(resultado.getText().toString().trim()));
                } if (sinal == "*") {
                    num2 = (num1 * Double.parseDouble(resultado.getText().toString().trim()));
                } else if (sinal == "/") {
                    if(num1 == 0) {
                        num2 = 0;
                    } else {
                        num2 = (num1 / Double.parseDouble(resultado.getText().toString().trim()));
                    }
                }

            } else {
                num2 = 0;
            }

            editTextVisor.setText(String.valueOf(num2));

        }

    }



    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.numerozero:
                tela(0);
                break;

            case R.id.numero_1:
                tela(1);
                break;

            case R.id.numero_2:
                tela(2);
                break;

            case R.id.numero_3:
                tela(3);
                break;

            case R.id.numero_4:
                tela(4);
                break;

            case R.id.numero_5:
                tela(5);
                break;

            case R.id.numero_6:
                tela(6);
                break;

            case R.id.numero_7:
                tela(7);
                break;

            case R.id.numero_8:
                tela(8);
                break;

            case R.id.numero_9:
                tela(9);
                break;

            case R.id.soma:
                resultado("+");
                break;

            case R.id.subtracao:
                resultado("-");
                break;

            case R.id.divisao:
                resultado("/");
                break;

            case R.id.multiplicacao:
                resultado("*");
                break;

            case R.id.igual:
                resultado();
                break;

            case R.id.ponto:
                ponto(".");
                break;

            case R.id.limpar:
                limpar();
                break;
        }
}
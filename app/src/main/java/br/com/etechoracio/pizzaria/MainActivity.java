package br.com.etechoracio.pizzaria;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextChopp;
    EditText editTextPizzas;
    EditText editTextRecheios;
    EditText editTextPessoas;
    TextView lblConsumo2;
    TextView lblServicos2;
    TextView lblTotal2;
    TextView lblPorPesssoa2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextChopp = findViewById(R.id.editTextChopp);
        editTextPizzas = findViewById(R.id.editTextPizzas);
        editTextRecheios = findViewById(R.id.editTextRecheios);
        editTextPessoas = findViewById(R.id.editTextPessoas);
        lblConsumo2 = findViewById(R.id.lblConsumo2);
        lblServicos2 = findViewById(R.id.lblServicos2);
        lblTotal2 = findViewById(R.id.lblTotal2);
        lblPorPesssoa2 = findViewById(R.id.lblPorPessoa2);


    }
    public void onCalcular(View view){
        double chopp = Double.parseDouble(editTextChopp.getText().toString());
        double pizzas = Double.parseDouble(editTextPizzas.getText().toString());
        double recheios = Double.parseDouble(editTextRecheios.getText().toString());
        double pessoas = Double.parseDouble(editTextPessoas.getText().toString());

        double valorChopp = chopp * 7.30;
        double valorPizza = pizzas * 31.50;
        double valorRecheios = recheios * 5.90;



        double consumo2  = valorChopp + valorPizza + valorRecheios;
        lblConsumo2.setText(String.valueOf(consumo2));

        double servicos = consumo2 * 0.1;
        lblServicos2.setText(String.valueOf(servicos));

        double total = consumo2 + servicos;
        lblTotal2.setText(String.valueOf(total));

        double porpessoa = total / pessoas;
        lblPorPesssoa2.setText(String.valueOf(porpessoa));







    }
}

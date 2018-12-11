package com.example.alvaro.mvpmodel;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class AlCuadradoView extends AppCompatActivity implements AlCuadrado.view {

    private TextView resultadoAlCuadrado;
    private EditText numeroAlCuadrado;


    private AlCuadrado.presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultadoAlCuadrado = findViewById(R.id.tvResultado);
        numeroAlCuadrado = findViewById(R.id.edit_text);
        presenter = new AlCuadradoPresenter(this);


    }


    public void calcular(View view) {
        presenter.alCuadrado(numeroAlCuadrado.getText().toString());

    }

    @Override
    public void mostrarResultado(String resultado) {
        resultadoAlCuadrado.setText(resultado);
    }

    @Override
    public void error(String error) {
        resultadoAlCuadrado.setText(error);
    }

    @Override
    public void reset(String reset) {
        numeroAlCuadrado.setText(reset);
    }
}

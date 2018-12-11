package com.example.alvaro.mvpmodel;



public class AlCuadradoModel implements AlCuadrado.model {

    private AlCuadrado.presenter presenter;
    private Double resultado;

    public AlCuadradoModel(AlCuadrado.presenter presenter) {
        this.presenter = presenter;
    }


    @Override
    public void alCuadrado(String datos) {
        if (!datos.isEmpty()){
            resultado = Double.valueOf(datos) * Double.valueOf(datos);
            presenter.mostrarResultado(String.valueOf(resultado));
            presenter.reset("");
        }
        else {
            presenter.error("El campo no puede estar vacio!");
        }



    }
}

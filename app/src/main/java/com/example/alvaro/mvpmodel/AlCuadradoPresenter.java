package com.example.alvaro.mvpmodel;


public class AlCuadradoPresenter implements AlCuadrado.presenter {
   private AlCuadrado.view view;
   private AlCuadrado.model model;

   public AlCuadradoPresenter (AlCuadrado.view view){
       this.view = view;
       this.model = new AlCuadradoModel(this);
   }

    @Override
    public void mostrarResultado(String resultado) {
       if (view != null){
           view.mostrarResultado(resultado);
       }

    }

    @Override
    public void alCuadrado(String datos) {
        if (view != null){
            model.alCuadrado(datos);
        }

    }

    @Override
    public void error(String error) {
        if (view != null){
            view.error(error);
        }
    }

    @Override
    public void reset(String reset) {
        if (view != null){
            view.reset(reset);
        }
    }
}

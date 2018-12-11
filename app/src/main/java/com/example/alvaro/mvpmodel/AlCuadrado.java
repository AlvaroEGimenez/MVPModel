package com.example.alvaro.mvpmodel;

public interface AlCuadrado {

    interface view {
        void mostrarResultado(String resultado);
        void error(String error);
        void reset(String reset);
    }

    interface presenter {
        void mostrarResultado(String resultado);
        void alCuadrado(String datos);
        void error(String error);
        void reset(String reset);
    }

    interface model {

        void alCuadrado(String datos);
    }
}

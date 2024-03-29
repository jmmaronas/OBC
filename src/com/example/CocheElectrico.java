package com.example;

public class CocheElectrico extends Coche{

    String motorElectrico;

    public CocheElectrico(){

    }

     public CocheElectrico (String motorElectrico){
        this.motorElectrico = motorElectrico;
     }

     public  CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico){
        super(color,fabricante, modelo, peso,largo);
        this.motorElectrico = motorElectrico;
     }

    @Override
    public void acelerar(Integer cantidad) {
        Integer cantidadAjuastada= cantidad * 2;
        super.acelerar(cantidadAjuastada);
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}

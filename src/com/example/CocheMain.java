package com.example;

public class CocheMain {
    public static void main(String[] args) {

        String coche = "Alfa Romeo";
        Coche cocheObj = new Coche();

        Coche cocheObj2 = new Coche("Rojo", "Honda",  "Civic", 1430.4,5.4);

        System.out.println(cocheObj2.color);
        cocheObj2.acelerar(50);

        System.out.println(cocheObj2.toString());

        cocheObj2.peso = 1350.8;

        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Ejemplo motor electrico";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("azul", "alfa", "romeo", 1500.2, 4.99, "TXZ");

        cocheElectrico2.acelerar(50);
        System.out.println(cocheElectrico2);

    }
}

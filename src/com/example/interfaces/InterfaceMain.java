package com.example.interfaces;

public class InterfaceMain {

    public static void main(String[] args) {
        CocheCRUD cocheCrud = new CocheCRUDImpl();

        System.out.println(cocheCrud.setCoche());
        System.out.println(cocheCrud.getCocheById());
        System.out.println(cocheCrud.getCocheAll());
        System.out.println(cocheCrud.updateCoche());
        System.out.println(cocheCrud.deleteCocheById());
    }
}

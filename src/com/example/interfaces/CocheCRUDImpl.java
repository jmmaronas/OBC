package com.example.interfaces;

public class CocheCRUDImpl implements CocheCRUD {
    @Override
    public String setCoche() {
        return "Coche  creado";
    }

    @Override
    public String getCocheById() {
        return "Coche seleccionado por id";
    }

    @Override
    public String getCocheAll() {
        return "Lista de coches";
    }

    @Override
    public String updateCoche() {
        return "Coche actualizado";
    }

    @Override
    public String deleteCocheById() {
        return "Coche eliminado";
    }
}

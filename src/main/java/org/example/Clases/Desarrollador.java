package org.example.Clases;

import java.util.ArrayList;

public class Desarrollador extends Empleado{
    private ArrayList<String> listaLenguajes;

    public Desarrollador(int id, String nombre, String departamento, double salario, ArrayList<String> listaLenguajes) {
        super(id, nombre, departamento, salario);
        this.listaLenguajes = listaLenguajes;
    }

    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Lista de lenguajes");
        System.out.println("==================");
        for(int i = 0; i < listaLenguajes.size(); i++) {
            System.out.println(listaLenguajes.get(i));
        }
    }

    @Override
    public void calcularBono() {

    }


    @Override
    public String evaluarDesempeno(String desempeno) {
        return desempeno;
    }
}

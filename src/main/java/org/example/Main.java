package org.example;

import org.example.Clases.Desarrollador;
import org.example.Clases.Empleado;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<String> listaLenguajes = new ArrayList<>();
        listaLenguajes.add("a");
        listaLenguajes.add("b");
        listaLenguajes.add("c");
        listaLenguajes.add("d");
        listaLenguajes.add("e");

        Desarrollador empl = new Desarrollador(1,"angel","ti",2000,listaLenguajes);

        empl.mostrarDetalles();
    }
}
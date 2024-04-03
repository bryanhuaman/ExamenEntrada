package org.example.Clases;

import java.util.ArrayList;

public class Gerente extends Empleado{
    private ArrayList<String> listaEmpleados;

    public Gerente(int id, String nombre, String departamento, double salario, ArrayList<String> listaEmpleados) {
        super(id, nombre, departamento, salario);
        this.listaEmpleados = listaEmpleados;
    }

    public void mostrarDetalles(){
        super.mostrarDetalles();
        System.out.println("Lista de empleados");
        System.out.println("==================");
        for(int i = 0; i < listaEmpleados.size(); i++) {
            System.out.println(listaEmpleados.get(i));
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

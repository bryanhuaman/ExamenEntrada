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
    public String calcularBono(String desempeno) {
        double bono = 0.0;

        if(desempeno.equalsIgnoreCase("bueno")){
            bono = super.salario * listaEmpleados.size();
        }else if(desempeno.equalsIgnoreCase("regular")){
            bono = (super.salario * listaEmpleados.size()) * 0.5;
        }else{
            bono = 0.0;
        }

        return  this.nombre + " tu bono de fin de año es: S/." + bono;
    }


    @Override
    public String evaluarDesempeno() {
        if(listaEmpleados.size() >=4){
            return "bueno";
        }else if(listaEmpleados.size() >=2 && listaEmpleados.size() <=3){
            return "regular";
        }else{
            return "malo";
        }
    }
}

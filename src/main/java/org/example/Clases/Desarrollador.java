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
    public String calcularBono(String desempeno) {
        double bono = 0.0;

        if(desempeno.equalsIgnoreCase("bueno")){
            bono = super.salario * listaLenguajes.size();
        }else if(desempeno.equalsIgnoreCase("regular")){
            bono = (super.salario * listaLenguajes.size()) * 0.5;
        }else{
            bono = 0.0;
        }

        return this.nombre + " tu bono de fin de año es: S/." + bono;

    }


    @Override
    public String evaluarDesempeno() {
        if(listaLenguajes.size() >=4){
            return "bueno";
        }else if(listaLenguajes.size() >=2 && listaLenguajes.size() <=3){
            return "regular";
        }else{
            return "malo";
        }
    }
}

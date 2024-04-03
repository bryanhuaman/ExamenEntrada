package org.example;

import org.example.Clases.Desarrollador;
import org.example.Clases.Empleado;
import org.example.Clases.Gerente;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Creando Desarrolladores
        ArrayList<String> listaLenguajes1 = new ArrayList<>();
        listaLenguajes1.add("Phyton");
        listaLenguajes1.add("C#");
        listaLenguajes1.add("Java");
        Desarrollador empl1 = new Desarrollador(1,"Angel","soporte tecnico",2000,listaLenguajes1);
        ArrayList<String> listaLenguajes2 = new ArrayList<>();
        listaLenguajes2.add("Phyton");
        listaLenguajes2.add("C#");
        listaLenguajes2.add("Java");
        listaLenguajes2.add("R");
        Desarrollador empl2 = new Desarrollador(2,"Maria","QA",2500,listaLenguajes2);
        ArrayList<String> listaLenguajes3 = new ArrayList<>();
        listaLenguajes3.add("Ruby");
        listaLenguajes3.add("Java");
        Desarrollador empl3 = new Desarrollador(3,"Jessica","gestion de proyectos",3500,listaLenguajes3);
        ArrayList<String> listaLenguajes4 = new ArrayList<>();
        listaLenguajes4.add("Phyton");
        listaLenguajes4.add("C#");
        listaLenguajes4.add("Java");
        listaLenguajes2.add("C++");
        listaLenguajes2.add("Kotlin");
        Desarrollador empl4 = new Desarrollador(4,"Roberto","desarrollador de software",4000,listaLenguajes4);
        ArrayList<String> listaLenguajes5 = new ArrayList<>();
        listaLenguajes5.add("Kotlin");
        listaLenguajes5.add("PHP");
        listaLenguajes5.add("Swift");
        Desarrollador empl5 = new Desarrollador(5,"Alan","diseñador UX",3150,listaLenguajes5);

        //Creando Gerentes
        ArrayList<String> listaEmpleados1 = new ArrayList<>();
        listaEmpleados1.add("Juan");
        listaEmpleados1.add("Patricia");
        listaEmpleados1.add("Daniel");
        listaEmpleados1.add("Jose");
        Gerente empl6 = new Gerente(6,"Ruben","gerencia operaciones",3410,listaEmpleados1);
        ArrayList<String> listaEmpleados2 = new ArrayList<>();
        listaEmpleados2.add("Andres");
        listaEmpleados2.add("Carlos");
        listaEmpleados2.add("Alejandro");
        Gerente empl7 = new Gerente(7,"Angelica","gerencia de desarrollo de negocios",5430,listaEmpleados2);
        ArrayList<String> listaEmpleados3 = new ArrayList<>();
        listaEmpleados3.add("Diego");
        listaEmpleados3.add("Laura");
        Gerente empl8 = new Gerente(8,"Valeria","gerencia de ventas",5420,listaEmpleados3);
        ArrayList<String> listaEmpleados4 = new ArrayList<>();
        listaEmpleados4.add("Carmen");
        listaEmpleados4.add("Paola");
        listaEmpleados4.add("Natalia");
        listaEmpleados4.add("Manuel");
        listaEmpleados4.add("Jose");
        Gerente empl9 = new Gerente(9,"Rosa","gerencia de recursos humanos",3700,listaEmpleados4);
        ArrayList<String> listaEmpleados5 = new ArrayList<>();
        listaEmpleados5.add("Sofia");
        Gerente empl10 = new Gerente(10,"Dina","gerencia TI",4200,listaEmpleados5);


        //Añadiendo empleados a la lista
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(empl1);
        empleados.add(empl2);
        empleados.add(empl3);
        empleados.add(empl4);
        empleados.add(empl5);
        empleados.add(empl6);
        empleados.add(empl7);
        empleados.add(empl8);
        empleados.add(empl9);
        empleados.add(empl10);

        //Mostrando detalle de cada empleado de la lista
        System.out.println("Detallle de empleado:");
        System.out.println("=====================");
        for(Empleado empl: empleados){
            empl.mostrarDetalles();
        }

        //Calculando Bono de empleados
        System.out.println("Calculando Bonos Empleados:");
        System.out.println("=====================");
        for(Empleado empl: empleados){
            String desempeno = "";
            desempeno = empl.evaluarDesempeno();
            System.out.println(empl.calcularBono(desempeno));
        }

        //Evaluacion desempeño
        System.out.println("Evaluacion desempeño:");
        System.out.println("=====================");
        System.out.println(empl1.evaluarDesempeno());

        System.out.println(empl10.evaluarDesempeno());

    }
}
/*
 * Lección 6 - Programación Orientada a Objetos
 * Programa: Registro de estudiantes con arreglo de objetos
 *
 * Este programa registra los datos de varios estudiantes usando una clase
 * (Estudiante) y los almacena en un arreglo de objetos para luego mostrarlos.
 */

import java.util.Scanner;

class Estudiante {
    private String nombre;
    private int edad;
    private double promedio;

    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre   = nombre;
        this.edad     = edad;
        this.promedio = promedio;
    }

    public String getNombre()   { return nombre; }
    public int    getEdad()     { return edad; }
    public double getPromedio() { return promedio; }

    public void mostrarDatos() {
        System.out.println("------------------------------");
        System.out.println("Nombre:   " + nombre);
        System.out.println("Edad:     " + edad + " años");
        System.out.println("Promedio: " + promedio);
        System.out.println("Estado:   " + (promedio >= 11.0 ? "Aprobado" : "Desaprobado"));
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc       = new Scanner(System.in);
        int     cantidad = 3;
        Estudiante[] aula = new Estudiante[cantidad];

        for (int i = 0; i < cantidad; i++) {
            System.out.println("\n=== Estudiante " + (i + 1) + " ===");
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            System.out.print("Promedio: ");
            double promedio = sc.nextDouble();
            sc.nextLine();
            aula[i] = new Estudiante(nombre, edad, promedio);
        }

        System.out.println("\n====== LISTA DE ESTUDIANTES ======");
        for (Estudiante e : aula) {
            e.mostrarDatos();
        }
    }
}
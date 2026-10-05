/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unida.tarea8;

public class Estudiante extends Persona {
    private final String matricula;
    private final String carrera;
    private final String materia;
    
    public Estudiante(String nombre, String cedula, String matricula, String carrera,String materia,String cel,String email){
       super (nombre, cedula,cel,email);
       this.matricula = matricula;
       this.carrera= carrera;
       this.materia= materia;
    }
    @Override
    public String toString(){
    return super.toString()+ " Matricula: " + matricula + "Carrera: " + carrera +  "materia: " + materia;
    
}   
    public static void main (String [] args){
    Estudiante e = new Estudiante ("Derlis", "41333266","2010110120","Informatica", "0981","d@gmail","500-1");
        System.out.print(e);
    }
    
}   
    
    
    
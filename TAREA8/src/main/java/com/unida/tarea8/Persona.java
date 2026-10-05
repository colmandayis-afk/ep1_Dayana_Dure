/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unida.tarea8;


public class Persona {
    
    protected String nombre;
    protected String cedula;
    protected String cel;
    protected String email;
            
public Persona (String nombre, String cedula, String cel, String email) {
   this.nombre = nombre;
   this.cedula= cedula;
   this.cel= cel;
   this.email= email;
   }  

@Override
public String toString(){
   return "Nombre: "+nombre+" Cedula: "+cedula+"cel: "+cel+ "email: "+email;

}

}
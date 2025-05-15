/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author walte
 */
public class Nodo {
    int dato;
    String nombre;
    Nodo hijoIzq;
    Nodo hijoDer;
    public Nodo(int d, String nom){
    this.dato=d;
    this.nombre=nom;
    this.hijoDer=null;
    this.hijoIzq=null;
    
    }
    //Permitir ver el valor de los valores de las clases
    @Override
    public String toString(){
    return nombre + "Su datos es " +dato;
    
    }
}

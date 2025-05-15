/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

//Aqui estan los metodo de los Arboles binarios
public class Arboles {
    Nodo raiz;
    public Arboles(){
    raiz=null;
    
    }
    //Metodo para incertar un nodo el arbol
    public void agregar_nodo(int dato, String nombre){
    Nodo nuevo = new Nodo(dato, nombre);
    if(raiz==null){
        //Cuando esta vacio
    raiz = nuevo;
    
    }else
    {
        Nodo Auxiliar= raiz;
        Nodo padre;
        while(true)
        {
        padre= Auxiliar;
        if(dato<Auxiliar.dato)//Cuando es menor
        {
            Auxiliar = Auxiliar.hijoIzq;
            if(Auxiliar==null)
            {
            padre.hijoIzq=nuevo;
            return;//Sirve para final el metodo.
            }
        }else //Cuando es mayor
        {
        Auxiliar= Auxiliar.hijoDer;
            if (Auxiliar==null) {
                padre.hijoDer=nuevo;
             return;
            }
        }
        }
    }
    
    }
}

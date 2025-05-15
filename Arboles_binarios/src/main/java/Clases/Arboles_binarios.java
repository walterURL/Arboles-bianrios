
package Clases;

import javax.swing.JOptionPane;


public class Arboles_binarios {

    public static void main(String[] args) {
      int opc=0, elemento;
      String nombre;
      Arboles arbolito= new Arboles();
      do{
      try{
      opc= Integer.parseInt(JOptionPane.showInputDialog(null,
              "1. Agregar nodo\n"+
             "2. Salir\n"+
             "3. Elija una opcion",
              JOptionPane.QUESTION_MESSAGE
      ));
      switch(opc){
          case 1:{
          elemento= Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el numero del nodo"
                  ,JOptionPane.QUESTION_MESSAGE));
          nombre= JOptionPane.showInputDialog(null,"Ingresa el nombre del nodo",
                  JOptionPane.QUESTION_MESSAGE);
          arbolito.agregar_nodo(elemento, nombre);
          }
              break;
          case 2:
          {
              System.out.println("Cerradndo programa...");
          }break;
          default:
          {
              System.out.println("Opcion ");
          }break;
      }
      }catch(NumberFormatException n){
      JOptionPane.showMessageDialog(null,"Error"+n.getMessage());
      }
      }
      
          while(opc!=2);
    }
}

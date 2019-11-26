/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplostring;

/**
 *
 * @author rcarreraamoedo
 */
public class Metodos {
   private final String cadea1="Daniel Castelao";
   private final String cadea2="impega";
  
    public Metodos() {
           
    }
   //1º tamaño cadea1
    public void tamaño1(){
        System.out.println("Tamaño de cadea1: "+cadea1.length());
    }
   //2º son iguales o non son iguales cadea1 e cadea2
    public void tamaño2(){
        System.out.println("son iguales o distintos cadea1 e cadea2: "+cadea1.equalsIgnoreCase(cadea2));
    }
   //3º caracter, posición 5, por parte do usuario, de cadea2
    public void tamaño3(){
        System.out.println("Contido de cadea2, mostrar a posición 5: "+cadea2.charAt(4));
    }
   //4º concatena cadea1 e cadea2
    public void tamaño4(){
        System.out.println("Concatenar cadea1 e cadea2: "+cadea1.concat(cadea2));
    }
   //5º pasa cadea1 a minúscula
    public void tamaño5(){
        System.out.println("cadea1 en minúscula: "+cadea1.toLowerCase());
    }
   //6º pasa cadea2 a MAYÚSCULAS
    public void tamaño6(){
        System.out.println("cadea2 en mayúscula: "+cadea2.toUpperCase());
    }

}

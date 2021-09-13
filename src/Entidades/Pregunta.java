/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author yeidy
 */
public class Pregunta {

    private String pregunta;


    public Pregunta(String pregunta) {
        this.pregunta = pregunta;
       
    }

    public Pregunta() {
    }
    
      public void imprimir() {
          System.out.println(this.pregunta);
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }


    
   
    
}

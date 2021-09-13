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
public class Respuestas {


    private String respuesta;
    private boolean  correcta;
    private int puntaje;
    

    public Respuestas(String respuesta, boolean correcta,
            int puntaje) {
        this.respuesta = respuesta;
        this.correcta = correcta;
        this.puntaje = puntaje;
    }

    public Respuestas() {
    }
    
    

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }


    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public boolean isCorrecta() {
        return correcta;
    }

    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }
    
       public void imprimir() {
               System.out.println(this.respuesta);
        
    }


    
}

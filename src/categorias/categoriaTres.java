/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package categorias;

import Entidades.Pregunta;
import Entidades.Respuestas;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author yeidy
 */
public class categoriaTres {

    Respuestas[] res1 = new Respuestas[4];
    Respuestas[] res2 = new Respuestas[4];
    Respuestas[] res3 = new Respuestas[4];
    Respuestas[] res4 = new Respuestas[4];
    Respuestas[] res5 = new Respuestas[4];

    ArrayList<Pregunta> pre = new ArrayList<Pregunta>();

    int puntajeCategoria = 30;

    //metodos
    public void agregarPregunta() {
//        crear y agregar la cuestion de la pregunta uno
        Pregunta preguntaUno = new Pregunta("Disponemos de los siguientes elementos químicos:\n"
                + "\n"
                + "Oxígeno\n"
                + "Oxígeno\n"
                + "Tántalo\n"
                + "Silicio\n"
                + "Fósforo\n"
                + "\n"
                + "A partir de sus símbolos, debemos formar el nombre de otro elemento de la tabla periódica.");
        Pregunta preguntaDos = new Pregunta(" ¿Cuál es la fórmula química del plátano? ");
        Pregunta preguntaTres = new Pregunta("En qué país estamos si encontramos Carbono, Hidrógeno, Yodo y Sodio");
        Pregunta preguntaCuatro = new Pregunta(" ¿Qué ácido es el más responsable de la lluvia ácida?");
        Pregunta preguntaCinco = new Pregunta("¿Cuál de estos compuestos es ácido?");

        pre.add(preguntaUno);
        pre.add(preguntaDos);
        pre.add(preguntaTres);
        pre.add(preguntaCuatro);
        pre.add(preguntaCinco);

    }

    public void agregarRespuesta() {
//        creas las respuesta de la pregunta uno
        Respuestas respuestaUnoPreguntaUno = new Respuestas("1.Potasio", true, 20);

        res1[0] = (respuestaUnoPreguntaUno);
        res1[1] = (new Respuestas("2.Helio", false, 0));
        res1[2] = (new Respuestas("3.Oro", false, 0));
        res1[3] = (new Respuestas("4.Oxigeno", false, 0));

        //Crea las respuesta de la pregunta dos 
        res2[0] = new Respuestas("1.H2O", false, 0);
        res2[1] = new Respuestas("2.NaCl", false, 0);
        res2[2] = new Respuestas("3.Ba(Na)2", true, 20);
        res2[3] = new Respuestas("4.CaO", false, 0);

        //crea las respuesta de la pregunta 3 
        res3[0] = new Respuestas("1.Colombia", false, 0);
        res3[1] = new Respuestas("2.Ecuador", false, 0);
        res3[2] = new Respuestas("3.China", true, 20);
        res3[3] = new Respuestas("4.Peru", false, 0);

        //crea las respuesta de la pregunta 4
        res4[0] = new Respuestas("1.ácido clorhídrico", false, 0);
        res4[1] = new Respuestas("2.ácido nítrico", false, 0);
        res4[2] = new Respuestas("3.ácido sulfúrico", true, 20);
        res4[3] = new Respuestas("4.ácido cítrico", false, 0);

        //crea las respuesta de la pregun 5
        res5[0] = new Respuestas("1.H2O", false, 0);
        res5[1] = new Respuestas("2.NaBr", false, 0);
        res5[2] = new Respuestas("3.CaO", false, 0);
        res5[3] = new Respuestas("4.HCOOH", true, 20);

    }

    public boolean unirPreguntYRespuesta() {

        int randon = aleatorio();

        Pregunta preguntaAMostrar = pre.get(randon);
        preguntaAMostrar.imprimir();
        String respuesta = "res" + (randon + 1);

        return respuestaCorrecta(imprimirRespuestas(respuesta));

    }

    private Respuestas[] imprimirRespuestas(String respuesta) {
        switch (respuesta) {
            case "res1":

                for (int i = 0; i < this.res1.length; i++) {
                    System.out.println(this.res1[i].getRespuesta());
                }
                return res1;

            case "res2":
                for (int i = 0; i < this.res2.length; i++) {
                    System.out.println(this.res2[i].getRespuesta());
                }
                return res2;

            case "res3":
                for (int i = 0; i < this.res3.length; i++) {
                    System.out.println(this.res3[i].getRespuesta());
                }
                return res3;

            case "res4":
                for (int i = 0; i < this.res4.length; i++) {
                    System.out.println(this.res4[i].getRespuesta());
                }
                return res4;

            case "res5":
                for (int i = 0; i < this.res5.length; i++) {
                    System.out.println(this.res5[i].getRespuesta());
                }
                return res5;

        }
        return null;

    }

    private int aleatorio() {

        Random aleatorio = new Random();
        int x = aleatorio.nextInt(4);
        System.out.println("*****TERCERA CATEGORÍA*****");
        System.out.println("*PREGUNTA");

        return aleatorio.nextInt(4);
    }

    public boolean respuestaCorrecta(Respuestas[] respuestas) {
        System.out.println("Ingrese el número de la opción de la respuesta ");
        Scanner sc = new Scanner(System.in);

        int x;
        x = sc.nextInt();
        if (x > 4) {
            while (x > 4) {
                System.out.println("La opción de respuesta tiene que ser menor o igual a 4.\n"
                        + "Por favor vuelve y escriba la opción de respuesta");
                x = sc.nextInt();
            }
        }
        return respuestas[(x - 1)].isCorrecta();

    }

    public int getpuntajeCategoria() {

        return this.puntajeCategoria;
    }

}

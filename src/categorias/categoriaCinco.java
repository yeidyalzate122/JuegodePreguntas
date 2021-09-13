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
public class categoriaCinco {

    Respuestas[] res1 = new Respuestas[4];
    Respuestas[] res2 = new Respuestas[4];
    Respuestas[] res3 = new Respuestas[4];
    Respuestas[] res4 = new Respuestas[4];
    Respuestas[] res5 = new Respuestas[4];

    ArrayList<Pregunta> pre = new ArrayList<Pregunta>();
    int puntajeCategoria = 25;

    //metodos
    public void agregarPregunta() {
//        crear y agregar la cuestion de la pregunta uno
        Pregunta preguntaUno = new Pregunta("Soy bella, soy muy fuerte;\n"
                + "cuando hablo todos me oyen\n"
                + "y tengo un solo diente\n"
                + "que muevo constantemente.");
        Pregunta preguntaDos = new Pregunta("Instrumento musical,\n"
                + "jaranero y redondico,\n"
                + "que todos saben tocar\n"
                + "del virtuoso al borrico\n"
                + "y que resulta esencial\n"
                + "si cantas un villancico.\n");
        Pregunta preguntaTres = new Pregunta("Soy una caja adornada\n"
                + "con dos palos para sonar,\n"
                + "y en la banda de la escuela,\n"
                + "me puedes encontrar.\n"
                + "¿Qué soy?");
        Pregunta preguntaCuatro = new Pregunta(" Me rascan continuamente\n"
                + "de forma muy placentera,\n"
                + "mi voz es muy bien timbrada\n"
                + "y mi cuerpo de madera.");
        Pregunta preguntaCinco = new Pregunta("Con tan sólo cuatro cuerdas,\n"
                + "que un arco pone en acción,\n"
                + "esta caja melodiosa\n"
                + "te alegrará el corazón.");

        pre.add(preguntaUno);
        pre.add(preguntaDos);
        pre.add(preguntaTres);
        pre.add(preguntaCuatro);
        pre.add(preguntaCinco);

    }

    public void agregarRespuesta() {
//        creas las respuesta de la pregunta uno
        Respuestas respuestaUnoPreguntaUno = new Respuestas("1. Campana", true, 20);

        res1[0] = (respuestaUnoPreguntaUno);
        res1[1] = (new Respuestas("2.Pandereta", false, 0));
        res1[2] = (new Respuestas("3.Tambor", false, 0));
        res1[3] = (new Respuestas("4.Violín", false, 0));

        //Crea las respuesta de la pregunta dos 
        res2[0] = new Respuestas("1.Piano", false, 0);
        res2[1] = new Respuestas("2.Arpa", false, 0);
        res2[2] = new Respuestas("3.Pandereta", true, 20);
        res2[3] = new Respuestas("4.Guitarra", false, 0);

        //crea las respuesta de la pregunta 3 
        res3[0] = new Respuestas("1.Teclas del piano", false, 0);
        res3[1] = new Respuestas("2.Violín", false, 0);
        res3[2] = new Respuestas("3.Tambor", true, 20);
        res3[3] = new Respuestas("4.Zambomba", false, 0);

        //crea las respuesta de la pregunta 4
        res4[0] = new Respuestas("1.Violín", false, 0);
        res4[1] = new Respuestas("2.Voz", false, 0);
        res4[2] = new Respuestas("3.Guitarra", true, 20);
        res4[3] = new Respuestas("4.Piano", false, 0);

        //crea las respuesta de la pregun 5
        res5[0] = new Respuestas("1.Campana", false, 0);
        res5[1] = new Respuestas("2.Panderetao", false, 0);
        res5[2] = new Respuestas("3.Tambor", false, 0);
        res5[3] = new Respuestas("4.Violín", true, 20);

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
        System.out.println("*****CINCO CATEGORÍA*****");
        System.out.println("*PREGUNTA");

        return aleatorio.nextInt(4);
    }

    public boolean respuestaCorrecta(Respuestas[] respuestas) {
        System.out.println("ingrese la posicion de la respuesta correcta");
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

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
public class categoriaDos {

    Respuestas[] res1 = new Respuestas[4];
    Respuestas[] res2 = new Respuestas[4];
    Respuestas[] res3 = new Respuestas[4];
    Respuestas[] res4 = new Respuestas[4];
    Respuestas[] res5 = new Respuestas[4];

    ArrayList<Pregunta> pre = new ArrayList<Pregunta>();
    int puntajeCategoria = 20;

    //metodos
    public void agregarPregunta() {
//        crear y agregar la cuestion de la pregunta uno
        Pregunta preguntaUno = new Pregunta("Cuatro gatos en un cuarto, cada gato en un rincón, cada gato ve tres gatos, adivina cuántos gatos son.");
        Pregunta preguntaDos = new Pregunta("¿Cuál es el número que le sigue?: 1 – 2 – 4 – 7 – 11 – 16 - ?? ");
        Pregunta preguntaTres = new Pregunta("¿Cuál es el número que le sigue?: 2,4,16,??");
        Pregunta preguntaCuatro = new Pregunta("Hay 70 plumones en una caja: 20 son rojos, 20 son verdes, 20 son amarillos y de los restantes algunos son negros y los otros blancos. "
                + "\n¿Cuántos plumones como mínimo debemos extraer de la caja, sin mirarlos, para tener la seguridad de que entre ellos habrá 10 plumones del mismo color?");
        Pregunta preguntaCinco = new Pregunta("Ayer tenía 16 años y el próximo año tendré 17 años. Si el día de mañana cumplo años. ¿En qué día y mes nací?");

        pre.add(preguntaUno);
        pre.add(preguntaDos);
        pre.add(preguntaTres);
        pre.add(preguntaCuatro);
        pre.add(preguntaCinco);

    }

    public void agregarRespuesta() {
//        creas las respuesta de la pregunta uno
        Respuestas respuestaUnoPreguntaUno = new Respuestas("1.Cuatro gatos", true, 20);

        res1[0] = (respuestaUnoPreguntaUno);
        res1[1] = (new Respuestas("2.Cinco gatos", false, 0));
        res1[2] = (new Respuestas("3.Dos gatos", false, 0));
        res1[3] = (new Respuestas("4.Ocho gatos", false, 0));

        //Crea las respuesta de la pregunta dos 
        res2[0] = new Respuestas("1.8", false, 0);
        res2[1] = new Respuestas("2.63", false, 0);
        res2[2] = new Respuestas("3.22", true, 5);
        res2[3] = new Respuestas("4.74", false, 0);

        //crea las respuesta de la pregunta 3 
        res3[0] = new Respuestas("1.742", false, 0);
        res3[1] = new Respuestas("2.200", false, 0);
        res3[2] = new Respuestas("3.256", true, 20);
        res3[3] = new Respuestas("4.222", false, 0);

        //crea las respuesta de la pregunta 4
        res4[0] = new Respuestas("1.37", false, 0);
        res4[1] = new Respuestas("2.36", false, 0);
        res4[2] = new Respuestas("3.38", true, 20);
        res4[3] = new Respuestas("4.39", false, 0);

        //crea las respuesta de la pregun 5
        res5[0] = new Respuestas("1.31 de diciembre", false, 0);
        res5[1] = new Respuestas("2.1 marzo", false, 0);
        res5[2] = new Respuestas("3.28 de febrero", false, 0);
        res5[3] = new Respuestas("4.1 de enero", true, 20);

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
        System.out.println("*****SEGUNDA CATEGORÍA*****");
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

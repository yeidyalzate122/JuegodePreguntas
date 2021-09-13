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
public class categoriaCuatro {

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
        Pregunta preguntaUno = new Pregunta("Siempre mirando al sol\n"
                + "y no soy un caracol.\n"
                + "Giro y giro sin fin\n"
                + "y no soy un bailarín");
        Pregunta preguntaDos = new Pregunta("En la tierra te sembraron,\n"
                + "las aves te desearon,\n"
                + "cuando estuviste dorado\n"
                + "los hombres te segaron.");
        Pregunta preguntaTres = new Pregunta("Mi nombre es de peregrino\n"
                + "y tengo virtud notable,\n"
                + "me encuentras en los caminos\n"
                + "y mi olor es agradable.");
        Pregunta preguntaCuatro = new Pregunta("Es un árbol muy alto de estrecha copa,\n"
                + "en el cementerio es donde mora.");
        Pregunta preguntaCinco = new Pregunta("Como cuerda yo amarro,\n"
                + "como cadenas sujeto,\n"
                + "tengo un brazo y muchos dedos,\n"
                + "enterrados por el suelo.");

        pre.add(preguntaUno);
        pre.add(preguntaDos);
        pre.add(preguntaTres);
        pre.add(preguntaCuatro);
        pre.add(preguntaCinco);

    }

    public void agregarRespuesta() {
//        creas las respuesta de la pregunta uno
        Respuestas respuestaUnoPreguntaUno = new Respuestas("1.El girasol", true, 20);

        res1[0] = (respuestaUnoPreguntaUno);
        res1[1] = (new Respuestas("2.las rosas", false, 0));
        res1[2] = (new Respuestas("3.El pino", false, 0));
        res1[3] = (new Respuestas("4.El romero", false, 0));

        //Crea las respuesta de la pregunta dos 
        res2[0] = new Respuestas("1.La empanada", false, 0);
        res2[1] = new Respuestas("2.La Manzana", false, 0);
        res2[2] = new Respuestas("3.El trigo", true, 20);
        res2[3] = new Respuestas("4.El coco ", false, 0);

        //crea las respuesta de la pregunta 3 
        res3[0] = new Respuestas("1.La tierra", false, 0);
        res3[1] = new Respuestas("2.Las flores", false, 0);
        res3[2] = new Respuestas("3.El romero", true, 20);
        res3[3] = new Respuestas("4.El loro", false, 0);

        //crea las respuesta de la pregunta 4
        res4[0] = new Respuestas("1.La tierra", false, 0);
        res4[1] = new Respuestas("2.El pino", false, 0);
        res4[2] = new Respuestas("3.EL ciprés", true, 20);
        res4[3] = new Respuestas("4.La palma", false, 0);

        //crea las respuesta de la pregun 5
        res5[0] = new Respuestas("1.La correa", false, 0);
        res5[1] = new Respuestas("2.La cuerda", false, 0);
        res5[2] = new Respuestas("3.Los dedos", false, 0);
        res5[3] = new Respuestas("4.la raíz del árbol", true, 20);

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
        System.out.println("*****CUARTA CATEGORÍA*****");
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

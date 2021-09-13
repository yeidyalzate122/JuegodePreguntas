/*DESCRIPCIÓN DE LA CATEGORÍA
nombre de la categoría “ADIVINANZAS DE ANIMALES”
En la categoría uno vamos a hacer preguntas relacionadas con “ADIVINANZAS DE ANIMALES”, 
aquí pondremos a prueba tus conocimientos sobre este tema.

 */
package categorias;

import java.util.ArrayList;
import java.util.Random;
import Entidades.Pregunta;
import Entidades.Respuestas;
import java.util.Scanner;

/**
 *
 * @author yeidy
 */
public class categoriaUno {

    Respuestas[] res1 = new Respuestas[4];
    Respuestas[] res2 = new Respuestas[4];
    Respuestas[] res3 = new Respuestas[4];
    Respuestas[] res4 = new Respuestas[4];
    Respuestas[] res5 = new Respuestas[4];

    ArrayList<Pregunta> pre = new ArrayList<Pregunta>();

    int puntajeCategoria = 10;

//metodos
    public void agregarPregunta() {
//        crear y agregar la cuestion de la pregunta uno
        Pregunta preguntaUno = new Pregunta("De cierto animal di el nombre: es quien vigila la casa, quien avisa si alguien pasa y es fiel amigo del hombre, ¿Quién soy?");
        Pregunta preguntaDos = new Pregunta("Soy chiquito, puedo nadar, vivo en los ríos y en alta mar. ¿Quién soy ?");
        Pregunta preguntaTres = new Pregunta("Un animal que tiene ojos de gato, orejas de gato, patas de gato, rabo de gato y no es un gato. ¿Quién es?");
        Pregunta preguntaCuatro = new Pregunta("Amarillo es el sol, amarillo el limón, amarillo es el girasol y amarillo soy yo. ¿Quién soy?");
        Pregunta preguntaCinco = new Pregunta("salta y no es un conejo, tiene bolsa y no es de compras, tiene orejas largas y no es un burro quien es. ¿quien es?");

        pre.add(preguntaUno);
        pre.add(preguntaDos);
        pre.add(preguntaTres);
        pre.add(preguntaCuatro);
        pre.add(preguntaCinco);

    }

    public void agregarRespuesta() {
//        creas las respuesta de la pregunta uno
        Respuestas respuestaUnoPreguntaUno = new Respuestas("1.perro", true, 20);

        res1[0] = (respuestaUnoPreguntaUno);
        res1[1] = (new Respuestas("2.gato", false, 0));
        res1[2] = (new Respuestas("3.perico", false, 0));
        res1[3] = (new Respuestas("4.lobo", false, 0));

        //Crea las respuesta de la pregunta dos 
        res2[0] = new Respuestas("1.El tiburón", false, 0);
        res2[1] = new Respuestas("2.La Mantarraya", false, 0);
        res2[2] = new Respuestas("3.EL pez", true, 20);
        res2[3] = new Respuestas("4.El pulpo", false, 0);

        //crea las respuesta de la pregunta 3 
        res3[0] = new Respuestas("1.El gato", false, 0);
        res3[1] = new Respuestas("2.El perro", false, 0);
        res3[2] = new Respuestas("3.La gata", true, 20);
        res3[3] = new Respuestas("4.El loro", false, 0);

        //crea las respuesta de la pregunta 4
        res4[0] = new Respuestas("1.El Gallo", false, 0);
        res4[1] = new Respuestas("2.La gallina", false, 0);
        res4[2] = new Respuestas("3.El pollito", true, 20);
        res4[3] = new Respuestas("4.El pajarito", false, 0);

        //crea las respuesta de la pregun 5
        res5[0] = new Respuestas("1.El perro", false, 0);
        res5[1] = new Respuestas("2.El sapo", false, 0);
        res5[2] = new Respuestas("3.El conejo", false, 0);
        res5[3] = new Respuestas("4.El canguro hembra", true, 20);

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
        System.out.println("*****PRIMERA CATEGORÍA*****");
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

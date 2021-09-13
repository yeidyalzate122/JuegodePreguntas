/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Scanner;
import categorias.categoriaCinco;
import categorias.categoriaCuatro;
import categorias.categoriaDos;
import categorias.categoriaTres;
import categorias.categoriaUno;

import java.util.ArrayList;


/**
 *
 * @author yeidy
 */
public class juego {

    Scanner sc = new Scanner(System.in);

    String nombreJugador = "";
    String salir;
    boolean salida = false;
    int opcion;
    int puntaje ;
    ArrayList lista = new ArrayList(5);

    
    
    
    
    public void bienvenidaJuego() {
        System.out.println("******BIENVENIDO AL JUEGO DE PREGUNTAS Y RESPUESTAS ****** ");
        System.out.println("Por favor escribe tu nombre:");
        nombreJugador = sc.nextLine();
        getnombreJugador();
        System.out.println("Bienvenido(a) " + nombreJugador);
        System.out.println("Elije una opción por favor.");

        empezarJuego();

    }

    public String getnombreJugador() {
        return this.nombreJugador;
    }

    public ArrayList getpuntaje() {
        lista.add("ffff");
        lista.add(puntaje);
        return lista;
    }

    public void empezarJuego() {

        while (!salida) {
            System.out.println("");
            System.out.println("MENÚ");
            System.out.println("1.Empieza el juego de preguntas y respuestas");
            System.out.println("2.Historial de puntos ");
            System.out.println("3.Salir del juego ");

            try {
                System.out.println("Escribe el número de la opción que necesites.");
                opcion = sc.nextInt();
                System.out.println("");
                switch (opcion) {
                    case 1:
                         puntaje = 0;
                        System.out.println("----INICIANDO EL JUEGO----");
                        boolean siguiente = false;

                        //primera ronda   
                        categoriaUno primeraRonda = new categoriaUno();
                        primeraRonda.agregarPregunta();
                        primeraRonda.agregarRespuesta();

                        siguiente = primeraRonda.unirPreguntYRespuesta();

                        if (siguiente == true) {
                            System.out.println("****CORRECTO*****");
                            System.out.println("-------------------------------------");
                            puntaje = puntaje + primeraRonda.getpuntajeCategoria();
                        } else {
                            System.out.println("****INCORRECTO*****");
                            System.out.println("tu puntaje es " + puntaje);
                            System.out.println("-------------------------------------");

                        }

                        //segunda ronda
                        if (siguiente == true) {

                            categoriaDos segundaRonda = new categoriaDos();
                            segundaRonda.agregarPregunta();
                            segundaRonda.agregarRespuesta();

                            siguiente = segundaRonda.unirPreguntYRespuesta();

                            if (siguiente == true) {
                                System.out.println("****CORRECTO*****");
                                System.out.println("-------------------------------------");
                                puntaje = puntaje + segundaRonda.getpuntajeCategoria();

                            } else {
                                System.out.println("****INCORRECTO*****");
                                System.out.println("tu puntaje es " + puntaje);
                                System.out.println("-------------------------------------");
                            }

                        }
                        //tercera ronda
                        if (siguiente == true) {
                            
                            categoriaTres terceraRonda = new categoriaTres();
                            terceraRonda.agregarPregunta();
                            terceraRonda.agregarRespuesta();
                          siguiente = terceraRonda.unirPreguntYRespuesta();
                            if (siguiente == true) {
                                System.out.println("****CORRECTO*****");
                                System.out.println("-------------------------------------");
                                puntaje = puntaje + terceraRonda.getpuntajeCategoria();
                            } else {
                                System.out.println("****INCORRECTO*****");
                                System.out.println("tu puntaje es " + puntaje);
                                System.out.println("-------------------------------------");
                            }

                        }

                        //cuarta ronda
                        if (siguiente == true) {
                            categoriaCuatro cuartaRonda = new categoriaCuatro();
                            cuartaRonda.agregarPregunta();
                            cuartaRonda.agregarRespuesta();
                          siguiente = cuartaRonda.unirPreguntYRespuesta();
                            if (siguiente == true) {
                                System.out.println("****CORRECTO*****");
                                System.out.println("-------------------------------------");
                                puntaje = puntaje + cuartaRonda.getpuntajeCategoria();
                            } else {
                                System.out.println("****INCORRECTO*****");
                                System.out.println("tu puntaje es " + puntaje);
                                System.out.println("-------------------------------------");
                            }

                        }

                        //quinta ronda
                        if (siguiente == true) {
                            categoriaCinco quintaRonda = new categoriaCinco();
                            quintaRonda.agregarPregunta();
                            quintaRonda.agregarRespuesta();
                            siguiente = quintaRonda.unirPreguntYRespuesta();
                            if (siguiente == true) {
                                System.out.println("****CORRECTO*****");
                                System.out.println("-------------------------------------");
                                puntaje = puntaje + quintaRonda.getpuntajeCategoria();
                            } else {
                                System.out.println("****INCORRECTO*****");
                                System.out.println("tu puntaje es " + puntaje);
                                System.out.println("-------------------------------------");
                            }

                        }

                        System.out.println("Tu final puntaje es: " + puntaje);
                       
                        System.out.println("-------------------------------------");
                        
                      
                      break;

                    case 2:
                        System.out.println("-------------------------------------");
                
                        lista.add(nombreJugador);
                        lista.add(puntaje);
                        
                        System.out.println("Historial de juegos");
                        System.out.println(lista);
                        
                        
                        
                        System.out.println("-------------------------------------");
                        break;

                    case 3:
                        salida = true;
                        break;
                    default:
                        System.out.println("-------------------------------------");
                        System.out.println("** Opción incorrecta el menú ira de 1 a 3**");
                        System.out.println("-------------------------------------");
                }

            } catch (Exception e) {
                System.out.println("*No colocaste la opción correcta, vuelve y ingresa la opción correcta**");
                sc.next();
            }

        }

    }

}

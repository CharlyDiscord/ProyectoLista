/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectolista;
/**
 *
 * @author UTS2025
 */
import java.util.Scanner;

public class ProyectoLista 
{

    public static void main(String[] args) 
    {

        Scanner entrada = new Scanner(System.in);
        Lista lista = new Lista();

        int opcion;
        int numero;
        int posicion;
        int nuevoValor;
        int resultado;

        do 
        {
            System.out.println("MENU LISTA");
            System.out.println("1. Insertar Nodo");
            System.out.println("2. Encontrar Nodo");
            System.out.println("3. Cambiar Nodo");
            System.out.println("4. Encontrar Valor de Nodo");
            System.out.println("5. Borrar Nodo");
            System.out.println("6. Imprimir tamano de lista");
            System.out.println("7. Imprimir Lista");
            System.out.println("8. Salir");
            System.out.print("Selecciona una opcion: ");

            opcion = entrada.nextInt();

            switch (opcion) 
            {

                case 1:
                    System.out.print("Ingresa el valor: ");
                    numero = entrada.nextInt();

                    lista.Add(numero);
                    System.out.println("Nodo insertado :D");
                    break;

                case 2:
                    System.out.print("Ingresa la posicion del nodo: ");
                    posicion = entrada.nextInt();

                    resultado = lista.Find(posicion);

                    if (resultado == -1) 
                    {
                        System.out.println("Null");
                    } 
                    else 
                    {
                        System.out.println("El valor del nodo es: " + resultado);
                    }
                    break;

                case 3:
                    System.out.print("Ingresa la posicion del nodo: ");
                    posicion = entrada.nextInt();

                    System.out.print("Ingresa el nuevo valor: ");
                    nuevoValor = entrada.nextInt();

                    if (lista.Change(posicion, nuevoValor)) 
                    {
                        System.out.println("El nodo fue cambiado :)");
                    } 
                    else 
                    {
                        System.out.println("Null");
                    }
                    break;

                case 4:
                    System.out.print("Ingresa el valor que buscas: ");
                    numero = entrada.nextInt();

                    resultado = lista.FindValue(numero);

                    if (resultado == -1) 
                    {
                        System.out.println("Null");
                    } 
                    else 
                    {
                        System.out.println("El valor esta en la posicion: " + resultado);
                    }
                    break;

                case 5:
                    System.out.print("Ingresa la posicion que deseas borrar: ");
                    posicion = entrada.nextInt();

                    if (lista.Delete(posicion)) 
                    {
                        System.out.println("Se elimino el nodo correctamente");
                    } 
                    else 
                    {
                        System.out.println("Null");
                    }
                    break;

                case 6:
                    resultado = lista.Count();

                    if (resultado == -1) 
                    {
                        System.out.println("Null");
                    } 
                    else 
                    {
                        System.out.println("Tamano de la lista: " + resultado);
                    }
                    break;

                case 7:
                    lista.Print();
                    break;

                case 8:
                    break;
                default:System.out.println("Incorrecto");
                    System.out.println("Selecciona una opcion del menu >:(");
               break;
            }

        } while (opcion != 8);
           entrada.close();
    }
}

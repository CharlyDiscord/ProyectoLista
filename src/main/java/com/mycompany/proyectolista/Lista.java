/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectolista;
/**
 *
 * @author UTS2025
 */
public class Lista 
{

    private Nodo inicio;

    public Lista() 
    {
        inicio = null;
    }

    public void Add(int num) 
    {
        Nodo nuevo = new Nodo(num);

        if (inicio == null) 
        {
            inicio = nuevo;
        } 
        else 
        {
            Nodo act = inicio;

            while (act.getSig() != null) {
                act = act.getSig();
            }

            act.setSig(nuevo);
        }
    }

    public void Print() 
    {
        if (inicio == null) 
        {
            System.out.println("la lista esta vacia");
            return;
        }

        Nodo act = inicio;

        while (act != null) 
        {
            System.out.print(act.getValor() + " >>> ");
            act = act.getSig();
        }

        System.out.println("|||");
    }

    public int Count() 
    {
        if (inicio == null) 
        {
            return -1;
        }

        int contador = 0;
        Nodo act = inicio;

        while (act != null) 
        {
            contador++;
            act = act.getSig();
        }

        return contador;
    }

    public int Find(int posicion) 
    {
        if (posicion < 0) 
        {
            return -1;
        }

        Nodo act = inicio;
        int contador = 0;

        while (act != null) 
        {
            if (contador == posicion) 
            {
                return act.getValor();
            }

            act = act.getSig();
            contador++;
        }

        return -1;
    }

    public int FindValue(int v) 
    {
        Nodo act = inicio;
        int posicion = 0;

        while (act != null) {
            if (act.getValor() == v) 
            {
                return posicion;
            }

            act = act.getSig();
            posicion++;
        }

        return -1;
    }

    public boolean Change(int posicion, int newValue) 
    {
        if (posicion < 0) 
        {
            return false;
        }

        Nodo act = inicio;
        int contador = 0;

        while (act != null) 
        {
            if (contador == posicion) 
            {
                act.setValor(newValue);
                return true;
            }

            act = act.getSig();
            contador++;
        }

        return false;
    }

    public boolean Delete(int posicion) 
    {
        if (inicio == null || posicion < 0) 
        {
            return false;
        }

        if (posicion == 0) 
        {
            inicio = inicio.getSig();
            return true;
        }

        Nodo act = inicio;
        int contador = 0;

        while (act.getSig() != null) 
        {
            if (contador + 1 == posicion) 
            {
                Nodo borrar = act.getSig();
                act.setSig(borrar.getSig());
                return true;
            }

            act = act.getSig();
            contador++;
        }

        return false;
    }
}

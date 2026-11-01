/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectolista;

/**
 *
 * @author UTS2025
 */
public class Nodo 
{
    private int valor;
    private Nodo sig;
    
    public Nodo (int v)
    {
     valor= v;
     sig=null;
    }

    public int getValor() 
    {
        return valor;
    }

    public void setValor(int valor) 
    {
        this.valor = valor;
    }

    public Nodo getSig() 
    {
        return sig;
    }

    public void setSig(Nodo sig) 
    {
        this.sig = sig;
    }
}

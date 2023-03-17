/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio4polimorfismo;

/**
 *
 * @author WORKING
 */
public class CalculadoraEspecial implements InterfazCalculadora{
@Override
    public int sumarEnteros(int numero1, int numero2) {
        return (numero1 + numero2)/2;
    }

    @Override
    public int restarEnteros(int numero1, int numero2) {
        return (numero1 - numero2)/2;
    }

    @Override
    public int multiplicarEnteros(int numero1, int numero2) {
        return (numero1 * numero2)/2;
    }

    @Override
    public int dividirEnteros(int numero1, int numero2) {
        return (numero1 / numero2)/2;
    }

    @Override
    public double calcularRaizCuadrada(int numero1) {
        return Math.sqrt(numero1)/2;
    }    
}

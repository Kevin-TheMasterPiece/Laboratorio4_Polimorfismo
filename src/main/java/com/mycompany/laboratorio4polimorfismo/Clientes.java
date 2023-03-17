/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio4polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author WORKING
 */
public class Clientes {
    
    public static void main(String[] args) {
        
        CalculadoraNormal ClienteCalculadoraNormal = new CalculadoraNormal();
        CalculadoraEspecial ClienteCalculadoraEspecial = new CalculadoraEspecial();
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero a probar: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero a probar: "));
        int opcion = 0; 
         do{
             opcion = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para usar la calculadora normal, 2 para la calculadora especial y 3 para salir: "));
             switch(opcion){
                 case 1: 
                    JOptionPane.showMessageDialog(null, "suma: "+ClienteCalculadoraNormal.sumarEnteros(num1, num2));
                    JOptionPane.showMessageDialog(null, "Resta: "+ClienteCalculadoraNormal.restarEnteros(num1, num2));
                    JOptionPane.showMessageDialog(null, "Multiplicacion: "+ClienteCalculadoraNormal.multiplicarEnteros(num1, num2));
                    JOptionPane.showMessageDialog(null, "Division: "+ClienteCalculadoraNormal.dividirEnteros(num1, num2));
                    JOptionPane.showMessageDialog(null, "Raiz Cuadrada: "+ClienteCalculadoraNormal.calcularRaizCuadrada(num1));
                    break;
                 case 2: 
                    JOptionPane.showMessageDialog(null, "suma: "+ClienteCalculadoraEspecial.sumarEnteros(num1, num2));
                    JOptionPane.showMessageDialog(null, "Resta: "+ClienteCalculadoraEspecial.restarEnteros(num1, num2));
                    JOptionPane.showMessageDialog(null, "Multiplicacion: "+ClienteCalculadoraEspecial.multiplicarEnteros(num1, num2));
                    JOptionPane.showMessageDialog(null, "Division: "+ClienteCalculadoraEspecial.dividirEnteros(num1, num2));
                    JOptionPane.showMessageDialog(null, "Raiz Cuadrada: "+ClienteCalculadoraEspecial.calcularRaizCuadrada(num1));
                    break;
                 case 3: JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
                 default: JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
                     
             }
         }while(opcion <= 1 || opcion == 2 || opcion > 3);
    }
}

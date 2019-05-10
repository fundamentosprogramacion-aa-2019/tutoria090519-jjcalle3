/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquetelaboratorio;

import java.util.Scanner;

/**
 *
 * @author COMPUMARS
 */
public class EjemploSwitch1 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String placa;  
        System.out.println("ingrese la matricula");
        placa = entrada.nextLine(); 
        char inicial = placa.charAt(0);

        switch (inicial) {
            case 'o':
            case 'O':
                System.out.printf("Su placa %s es de la provincia "
                        + "de El Oro\n", 
                        placa.toUpperCase());
                break;
                
            case 'e':
            case 'E':
                System.out.printf("Su placa %s es de la provincia "
                        + "de Esmeraldas\n", 
                        placa.toUpperCase());
                break;
                
            case 'g':
            case 'G':
                System.out.printf("Su placa %s es de la provincia "
                        + "de Guayas\n", 
                        placa.toUpperCase());
                break;
                
            case 's':
            case 'S':
                System.out.printf("Su placa %s es de la provincia "
                        + "de Santa Elena\n", 
                        placa.toUpperCase());
                break;    
            
            case 't':
            case 'T':
                System.out.printf("Su placa %s es de la provincia "
                        + "de Santo Domingo de los Tsáchilas\n", 
                        placa.toUpperCase()); 
                break; 
            
            case 'm':
            case 'M':
                System.out.printf("Su placa %s es de la provincia "
                        + "de Manabí\n", 
                        placa.toUpperCase()); 
                break; 
            
            case 'r':
            case 'R':
                System.out.printf("Su placa %s es de la provincia "
                        + "de Los Ríos\n", 
                        placa.toUpperCase()); 
                break;    
                
            default:
                System.out.printf("La placa %s no pertenece a la "
                        + "regiòn de la Costa\n", 
                        placa.toUpperCase ());
                }
            }
        }


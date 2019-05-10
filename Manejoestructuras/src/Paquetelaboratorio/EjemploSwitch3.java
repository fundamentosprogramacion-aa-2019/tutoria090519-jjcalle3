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
public class EjemploSwitch3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String placa;  
        System.out.println("ingrese la matricula");
        placa = entrada.nextLine(); 
        char inicial = placa.charAt(0);

        switch (inicial) {
            case 'z':
            case 'Z':
                System.out.printf("Su placa %s es de la provincia "
                        + "de Zamora\n", 
                        placa.toUpperCase());
                break;
                
            case 'v':
            case 'V':
                System.out.printf("Su placa %s es de la provincia "
                        + "de Morona Santiago\n", 
                        placa.toUpperCase());
                break;
                
            case 's':
            case 'S':
                System.out.printf("Su placa %s es de la provincia "
                        + "de Pastaza\n", 
                        placa.toUpperCase());
                break;
                
            case 'n':
            case 'N':
                System.out.printf("Su placa %s es de la provincia "
                        + "de Napo\n", 
                        placa.toUpperCase());
                break;    
            
            case 'q':
            case 'Q':
                System.out.printf("Su placa %s es de la provincia "
                        + "de Orellana\n", 
                        placa.toUpperCase()); 
                break; 
            
            case 'k':
            case 'K':
                System.out.printf("Su placa %s es de la provincia "
                        + "de Sucumbíos\n", 
                        placa.toUpperCase()); 
                break; 
            
            default:
                System.out.printf("La placa %s no pertenece a la "
                        + "regiòn de la Amazonía\n", 
                        placa.toUpperCase ());
                }
            }
        }


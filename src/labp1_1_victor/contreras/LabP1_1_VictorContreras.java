/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labp1_1_victor.contreras;
import java.util.Scanner;
/**
 *
 * @author victo
 */
public class LabP1_1_VictorContreras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int respuesta = -1;
        Scanner read = new Scanner(System.in);
        
        while(respuesta != 0){
            System.out.println("Menu principal"); 
            System.out.println("Opcion 1. Mensaje");
            System.out.println("Opcion 2. Calculadora");
            System.out.println("Opcion 3. Edades");
            
            respuesta = read.nextInt();
            
            if(respuesta == 1){
                System.out.println("Hola soy yo");
            // Opcion dos calculadora    
            }else if(respuesta == 2){
                System.out.println("Ingrese un numero uno: ");
                int num1 = read.nextInt();
                System.out.println("Ingrese el segundo numero");
                int num2 = read.nextInt();
                
                int resultado = num1 * num2;
                System.out.println("Resultado: "+resultado);
                
                
                
                
            }else if(respuesta ==3){
                System.out.println("Ingrese su edad: ");
                int edad = read.nextInt();
                
                if ( edad >= 18){
                    System.out.println("Usted es mayor de edad!");
                    
                }else{
                    System.out.println("Usted es menor de edad!");
                }
            }
            
            
            
                
        }
        
        
        
    }
    
}

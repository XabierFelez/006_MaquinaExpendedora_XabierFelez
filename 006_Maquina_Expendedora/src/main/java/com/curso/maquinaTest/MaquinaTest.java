package com.curso.maquinaTest;
import java.util.Scanner;


import com.curso.maquina.*;

public class MaquinaTest {

	private static final Scanner teclado = new Scanner (System.in);
	private static Bebidas b= new Bebidas();
	private static Maquina p= new Maquina();

	
	
	
	public static void main(String[] args) 
	{
		final int PRECIO = p.precios ;
		int centimos;
		
		
		int Cantidad;
		
		do {
			System.out.println("BIENVENIDO. ELIJA LA CANTIDAD DE BEBIDAS:");
            Cantidad = teclado.nextInt();
            if(Cantidad>b.getCantidad()){
                System.out.println("No kedan sosio");
            }
        } while (Cantidad>b.getCantidad());
		
		
		
		do {
            System.out.print("\nMete las monedas: ");
            centimos = teclado.nextInt();
            if(centimos<PRECIO){
                System.out.println("Cantidad insuficiente.");
            }
        } while (centimos<PRECIO);
         
        if(centimos==PRECIO){
            System.out.println("Has metido justo.");
        } else {
            centimos -= PRECIO;
            System.out.printf("%nEl cambio es:");
            if(centimos/200>0){
                System.out.printf("%nMonedas de 2 euros: %d", centimos/200);
                centimos %= 200;
            }
            if(centimos/100>0){
                System.out.printf("%nMonedas de 1 euro: %d", centimos/100);
                centimos %= 100;
            }
            if(centimos/50>0){
                System.out.printf("%nMonedas de 50 céntimos: %d", centimos/50);
                centimos %= 50;
            }
            if(centimos/20>0){
                System.out.printf("%nMonedas de 20 céntimos: %d", centimos/20);
                centimos %= 20;
            }
            if(centimos/10>0){
                System.out.printf("%nMonedas de 10 céntimos: %d", centimos/10);
                centimos %= 10;
            }
            if(centimos/5>0){
                System.out.printf("%nMonedas de 5 céntimos: %d", centimos/5);
                centimos %= 5;
            }
            if(centimos/2>0){
                System.out.printf("%nMonedas de 2 céntimos: %d", centimos/2);
                centimos %= 2;
            }
            if(centimos>0){
                System.out.printf("%nMonedas de 1 céntimo: %d", centimos);
            }
            
            
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

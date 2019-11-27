package es.Studium.Tema3Tablas;

import java.util.Scanner;
import java.util.Vector;

public class Suma2 {

	public static void main(String[] args) {
		// Varibles
		Vector<Integer> tabla = new Vector <Integer>(10, 1);
		Scanner teclado = new Scanner(System.in);
		int numero;
		// rellenar el vector llamado tabla 
		do 
		{
			System.out.println("Introduce un número entero (0 para salir)");
			numero = teclado.nextInt();
			if (numero!=0)
			{
				tabla.addElement(numero);
			}
			
		}
		while(numero!=0);
		
		System.out.println("Suma de Valores:" + sumar(tabla));
		teclado.close();
			
	}
	public static int sumar(Vector<Integer>v)
	{
		int suma = 0;
		//Recorer
		for(int i=0; i<v.size();i++)
		{
			suma = suma + v.elementAt(i);
		}
		return suma; 
	}

	
}

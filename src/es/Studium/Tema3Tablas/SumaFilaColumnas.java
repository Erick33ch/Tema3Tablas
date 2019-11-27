package es.Studium.Tema3Tablas;

import java.util.Scanner;

public class SumaFilaColumnas {

	public static void main(String[] args)
	{	Scanner teclado = new Scanner (System.in);
		// VARIANTES
		int tabla[][] = new int [3][3];
		int i, j , suma1, suma2, suma3, suma4, suma5, suma6;
	
		//INICIO
		for (i=0;i<3;i++)
			{
				for(j=0;j<3;j++) 
				{
				 System.out.println("Escribe un numero"+ i +"-"+ j+ ":");
				 tabla[i][j] = teclado.nextInt();
				}
			}
		suma1 = tabla[0][0] + tabla[0][1] + tabla[0][2];
		suma2 = tabla[1][0] + tabla[1][1] + tabla[1][2];
		suma3 = tabla[2][0] + tabla[2][1] + tabla[2][2];
		suma4 = tabla[0][0] + tabla[1][0] + tabla[2][0];
		suma5 = tabla[0][1] + tabla[1][1] + tabla[2][1];
		suma6 = tabla[0][2] + tabla[1][2] + tabla[2][2];
		teclado.close();
		System.out.println(suma1);
		System.out.println(suma2);
		System.out.println(suma3);
		System.out.println(suma4);
		System.out.println(suma5);
		System.out.println(suma6);
		teclado.close();
	}

}

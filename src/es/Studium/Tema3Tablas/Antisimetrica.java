package es.Studium.Tema3Tablas;

import java.util.Scanner;

public class Antisimetrica {

	public static void main(String[] args) {
		//Varibles
		boolean antisimetrica = true;
		int tabla[][] = new int [3][3];
		int i,j;
		Scanner teclado = new Scanner (System.in);
		//Inicio
		for (i=0; (i<3)&&(antisimetrica); i++)
		{
			for (j=0; (j<3)&&(antisimetrica); j++)
			{
				System.out.println("Dame numeros");
				tabla[i][j] = teclado.nextInt();
			}
		}

		for (i=0; (i<3)&&(antisimetrica); i++)
		{
			for (j=0; (j<3)&&(antisimetrica); j++)
			{
				if (tabla [i][j]!=-tabla[j][i]) {
					antisimetrica = false;
				}
			}
		}
		if (antisimetrica)
		{
			System.out.println("Es antisimentrica");
		}
		else
		{
			System.out.println("No es asimétrica");
		}
		teclado.close();

	}

}

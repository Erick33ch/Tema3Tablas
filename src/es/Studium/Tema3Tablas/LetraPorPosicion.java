package es.Studium.Tema3Tablas;

import java.util.Scanner;

public class LetraPorPosicion 
{

	public static void main(String[] args) 
	{	
		char tabla [][] = new char [3][3];
		int resultado [][] = new int [3][3];
		Scanner teclado = new Scanner (System.in);
		for (int i=0;i<3;i++) 
		{
			for (int j=0;j<3;j++)
			{
				System.out.println("Valor de "+i+"-"+j);
				tabla[i][j]= teclado.next().charAt(0);
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				resultado[i][j]= tabla [i][j]-45;
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(resultado[i][j] + " ");
			}
			System.out.println();
		}
		teclado.close();
	}
}

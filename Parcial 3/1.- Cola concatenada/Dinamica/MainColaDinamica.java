package Dinamica;
import java.util.Scanner;

public class MainColaDinamica 
{
	public static void main(String[] args)
	{
		ColaDinamica cola1 = new ColaDinamica();
		ColaDinamica cola2 = new ColaDinamica();
		ColaDinamica cola3 = new ColaDinamica();
		Scanner scan = new Scanner(System.in);

		cola1.Inicializar();
		cola2.Inicializar();
		cola3.Inicializar();

		//lleno la cola 1
		for (int i = 0; i < 15; i++)
		{
			cola1.Acolar((int) (Math.random() * 100));
		}
		System.out.println("Cola 1");
		MostrarCola(cola1);

		//lleno la cola 2
		for (int i = 0; i < 15; i++)
		{
			cola2.Acolar((int) (Math.random() * 100));
		}
		System.out.println("Cola 2");
		MostrarCola(cola2);

		//concateno cola 1 y cola 2 en cola cola 3
		while (!cola1.ColaVacia())
		{
			cola3.Acolar(cola1.Primero());
			cola1.Desacolar();
		}
		while (!cola2.ColaVacia())
		{
			cola3.Acolar(cola2.Primero());
			cola2.Desacolar();
		}

		System.out.println("Cola 3");
		MostrarCola(cola3);

		
		
	
	}


	public static void PasarCola(ColaDinamica origen, ColaDinamica destino)               
	{
		while (!origen.ColaVacia())
		{
			destino.Acolar(origen.Primero());
			origen.Desacolar();
		}
	}
	
	public static void CopiarCola(ColaDinamica origen, ColaDinamica destino)
	{
		ColaDinamica auxCola = new ColaDinamica();
		auxCola.Inicializar();
		
		PasarCola(origen, auxCola);
		
		while (!auxCola.ColaVacia())
		{
			destino.Acolar(auxCola.Primero());
			origen.Acolar(auxCola.Primero());
			auxCola.Desacolar();
		}
	}
	
	public static void MostrarCola(ColaDinamica origen)
	{
		ColaDinamica auxCola = new ColaDinamica();
		auxCola.Inicializar();
		
		CopiarCola(origen, auxCola);
		
		while (!auxCola.ColaVacia())
		{
			System.out.print(auxCola.Primero() + ", ");
			auxCola.Desacolar();
		}
		
		System.out.println();
	}
}
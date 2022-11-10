package Dinamica;
import java.util.Scanner;

public class MainColaDinamicaDos 
{
	public static void main(String[] args)
	{
		ColaDinamicaDos cola1 = new ColaDinamicaDos();
		ColaDinamicaDos cola2 = new ColaDinamicaDos();
		ColaDinamicaDos cola3 = new ColaDinamicaDos();
		Scanner scan = new Scanner(System.in);

		cola1.Inicializar();
		cola2.Inicializar();
		cola3.Inicializar();

		//lleno el la cola 1
		for (int i = 0; i < 15; i++)
		{
			cola1.Acolar((int) (Math.random() * 100) );
		}

		//lleno el la cola 2
		for (int i = 0; i < 15; i++)
		{
			cola2.Acolar((int) (Math.random() * 100) );
		}

		//concateno las colas 1 y 2 en la cola 3
		cola3 = ConcatenarColas(cola1, cola2);

		//muestro las colas
		System.out.println("Cola 1: ");
		MostrarCola(cola3);
		System.out.println("Cola 2: ");
		MostrarCola(cola2);
		System.out.println("Cola 3: ");
		MostrarCola(cola3);
		
	}


	public static void PasarCola(ColaDinamicaDos origen, ColaDinamicaDos destino)               
	{
		while (!origen.ColaVacia())
		{
			destino.Acolar(origen.Primero());
			origen.Desacolar();
		}
	}
	
	public static void CopiarCola(ColaDinamicaDos origen, ColaDinamicaDos destino)
	{
		ColaDinamicaDos auxCola = new ColaDinamicaDos();
		auxCola.Inicializar();
		
		PasarCola(origen, auxCola);
		
		while (!auxCola.ColaVacia())
		{
			destino.Acolar(auxCola.Primero());
			origen.Acolar(auxCola.Primero());
			auxCola.Desacolar();
		}
	}
	
	public static void MostrarCola(ColaDinamicaDos origen)
	{
		ColaDinamicaDos auxCola = new ColaDinamicaDos();
		auxCola.Inicializar();
		
		CopiarCola(origen, auxCola);
		
		while (!auxCola.ColaVacia())
		{
			System.out.print(auxCola.Primero() + ", ");
			auxCola.Desacolar();
		}
		
		System.out.println();
	}

	//metodo para concatenar dos colas cola 1 y cola 2
	public static ColaDinamicaDos ConcatenarColas(ColaDinamicaDos cola1, ColaDinamicaDos cola2)
	{
		ColaDinamicaDos cola3 = new ColaDinamicaDos();
		cola3.Inicializar();

		CopiarCola(cola1, cola3);
		CopiarCola(cola2, cola3);

		return cola3;
	}

}
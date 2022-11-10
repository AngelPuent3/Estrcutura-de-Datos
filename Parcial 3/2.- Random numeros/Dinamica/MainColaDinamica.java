package Dinamica;
import java.util.Scanner;

public class MainColaDinamica 
{
	public static void main(String[] args)
	{
		ColaDinamicaDos cola1 = new ColaDinamicaDos();
		ColaDinamicaDos cola2 = new ColaDinamicaDos();
		Scanner scan = new Scanner(System.in);

		cola1.Inicializar();
		cola2.Inicializar();

		//lleno el array de numeros aleatorios de -25 a 25
		for (int i = 0; i < 101; i++)
		{
			cola1.Acolar((int) (Math.random() * 51) - 25);
		}
		System.out.println("Cola generada:");
	    MostrarCola(cola1);

		System.out.println("Desea crear una nueva cola con los numeros negativos de la cola generada? (s/n)");
		char opcion = scan.next().charAt(0);
		if (opcion == 's')
		{
			while (!cola1.ColaVacia())
			{
				if (cola1.Primero() < 0)
				{
					cola2.Acolar(cola1.Primero());
				}
				cola1.Desacolar();
			}
			System.out.println("Cola con numeros negativos:");
			MostrarCola(cola2);
		}else 
		System.out.println("Fin del programa.");
		
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

}
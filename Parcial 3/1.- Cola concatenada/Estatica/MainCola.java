package Estatica;
import java.util.Scanner;
public class MainCola 
{
	public static void PasarCola(Cola origen, Cola destino)
	{
		while (!origen.ColaVacia())
		{
			destino.Acolar(origen.Primero());
			origen.Desacolar();
		}
	}
	
	public static void CopiarCola(Cola origen, Cola destino)
	{
		Cola auxCola = new Cola();
		auxCola.Inicializar();
		
		PasarCola(origen, auxCola);
		
		while (!auxCola.ColaVacia())
		{
			destino.Acolar(auxCola.Primero());
			origen.Acolar(auxCola.Primero());
			auxCola.Desacolar();
		}
	}
	
	
	
	public static void MostrarCola(Cola origen)
	{
		Cola auxCola = new Cola();
		auxCola.Inicializar();
		
		CopiarCola(origen, auxCola);
		
		while (!auxCola.ColaVacia())
		{
			System.out.print(auxCola.Primero() + ", ");
			auxCola.Desacolar();
		}
		
		System.out.println();
	}
	
	
	
	

	public static void main(String[] args)
	{
		Cola cola1 = new Cola();
		Cola cola2 = new Cola();
		Cola cola3 = new Cola();
		
		cola2.Inicializar();
		cola1.Inicializar();
		cola3.Inicializar();

        //lleno el array con 100 numeros aleatorios del -25 al 25
        for (int i = 0; i < 15; ++i)
        {
            int num = (int)(Math.random() * 100);
            cola1.Acolar(num);
        }
		
		System.out.println("Cola 1: ");
        MostrarCola(cola1);

		//llenar cola 2
		for (int i = 0; i < 15; i++)
		{
			int num = (int)(Math.random() * 100);
			cola2.Acolar(num);
		}
		System.out.println("Cola 2: ");
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


		System.out.println("Cola 3: ");
		MostrarCola(cola3);
	}
}
//libreria scanner
import java.util.Scanner;

//main para llamar a los metodos del archivo Ejercicios.java

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Ejercicios ejercicios = new Ejercicios();
        int opcion;
        do{
            System.out.println("    MENU DE OPCIONES"); 
            System.out.println("1. Palindromo");
            System.out.println("2. Potencia");
            System.out.println("3. Antecesor");
            System.out.println("4. Llenar Arreglo");
            System.out.println("5. Salir");
            System.out.println("Ingrese una opcion: ");
            opcion = entrada.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Ingrese una cadena: ");
                    String cadena = entrada.next();
                    if(ejercicios.palindromo(cadena)){
                        System.out.println("La cadena es palindromo");
                    }else{
                        System.out.println("La cadena no es palindromo");
                    }
                    break;
                case 2:
                    System.out.println("Ingrese la base: ");
                    int base = entrada.nextInt();
                    System.out.println("Ingrese el exponente: ");
                    int exponente = entrada.nextInt();
                    System.out.println("La potencia es: "+ejercicios.potencia(base, exponente));
                    break;
                case 3:
                    System.out.println("Ingrese un numero: ");
                    int n = entrada.nextInt();
                    System.out.println("El antecesor es: "+ejercicios.antecesor(n));
                    break;
                case 4:
                    System.out.println("Ingrese el tamaño del arreglo: ");
                    int tam = entrada.nextInt();
                    int arreglo[] = new int[tam];
                    ejercicios.llenarArreglo(arreglo, tam);
                    System.out.println("El arreglo es: ");
                    for(int i=0;i<tam;i++){
                        System.out.print(arreglo[i]+" ");
                    }
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        }while(opcion!=5);
    }
}


import java.util.Scanner;

public class Ejercicios {
//funcion para un palindromo de cadena con recursivida d
    public static boolean palindromo(String cadena){
        if(cadena.length()==0 || cadena.length()==1){
            return true;
        }else if(cadena.charAt(0)==cadena.charAt(cadena.length()-1)){
            return palindromo(cadena.substring(1,cadena.length()-1));
        }else{
            return false;
        }
    }

    //metodo juego de cifras 
    //6 números un número lo mas cercano posible a un número de 3 cifras realizando operaciones aritmética con los 6 numeros



    //función que permita obtener la potencia de un determinado número de forma recursiva
    public static int potencia(int base, int exponente){
        if(exponente==0){
            return 1;
        }else{
            return base*potencia(base,exponente-1);
        }
    }

    //metodo número antecesor de forma recursiva
    public static int antecesor(int n){
        if(n==0){
            return 0;
        }else{
            return n-1;
        }
    }

    //metodo para llenar un arreglo de forma recursiva
    public static void llenarArreglo(int arreglo[], int n){
        if(n==0){
            return;
        }else{
            arreglo[n-1]=n;
            llenarArreglo(arreglo,n-1);
        }
    }
}




//TDA para representar un numero natural con operaciones de 0, sucesor, igual, suma, antecesor y diferencia
public class natural{
    int numero;
    public natural(int numero){
        this.numero = numero;
    }   
    public natural(){
        this.numero = 0;
    }
    public natural sucesor(){
        return new natural(this.numero+1);
    }
    public natural antecesor(){
        return new natural(this.numero-1);
    }
    public natural suma(natural n){
        return new natural(this.numero+n.numero);
    }
    public natural diferencia(natural n){
        return new natural(this.numero-n.numero);
    }
    public boolean igual(natural n){
        return this.numero == n.numero;
    }
    public String toString(){
        return String.valueOf(this.numero);
    }
    //main
    public static void main(String[] args){
        natural n1 = new natural(5);
        natural n2 = new natural(3);
        System.out.println("n1: "+n1);
        System.out.println("n2: "+n2);
        System.out.println("n1 + n2: "+n1.suma(n2));
        System.out.println("n1 - n2: "+n1.diferencia(n2));
        System.out.println("n1 == n2: "+n1.igual(n2));
        System.out.println("n1 + 1: "+n1.sucesor());
        System.out.println("n2 - 1: "+n2.antecesor());
    }
}

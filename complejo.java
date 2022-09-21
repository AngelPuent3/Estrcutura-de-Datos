//TDA para representar un numero complejo 
public class complejo{
    double real;
    double imaginario;
    public complejo(double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }
    public complejo(){
        this.real = 0;
        this.imaginario = 0;
    }
    public complejo suma(complejo c){
        return new complejo(this.real+c.real, this.imaginario+c.imaginario);
    }
    public complejo resta(complejo c){
        return new complejo(this.real-c.real, this.imaginario-c.imaginario);
    }
    public complejo producto(complejo c){
        return new complejo(this.real*c.real-this.imaginario*c.imaginario, this.real*c.imaginario+this.imaginario*c.real);
    }
    public complejo division(complejo c){
        return new complejo((this.real*c.real+this.imaginario*c.imaginario)/(c.real*c.real+c.imaginario*c.imaginario), (this.imaginario*c.real-this.real*c.imaginario)/(c.real*c.real+c.imaginario*c.imaginario));
    }
    public boolean igual(complejo c){
        return this.real == c.real && this.imaginario == c.imaginario;
    }
    public String toString(){
        return String.valueOf(this.real)+" + "+String.valueOf(this.imaginario)+"i";
    }
    //main
    public static void main(String[] args){
        complejo c1 = new complejo(2,3);
        complejo c2 = new complejo(1,2);
        System.out.println("c1: "+c1);
        System.out.println("c2: "+c2);
        System.out.println("c1 + c2: "+c1.suma(c2));
        System.out.println("c1 - c2: "+c1.resta(c2));
        System.out.println("c1 * c2: "+c1.producto(c2));
        System.out.println("c1 / c2: "+c1.division(c2));
        System.out.println("c1 == c2: "+c1.igual(c2));
    }
}

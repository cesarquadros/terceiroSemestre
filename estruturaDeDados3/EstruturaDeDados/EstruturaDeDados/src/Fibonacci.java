
public class Fibonacci {

    static int fibonnaci(int numero) {
        if (numero < 2) {
            return numero;
        } else {
            return fibonnaci(numero - 1) + fibonnaci(numero - 2);
        }
    }
	
	public static void main(String[] args){
		
		System.out.println(fibonnaci(6));
	}	

}
package sumardosnumeros;
import java.util.*;

public class SumarDosNumeros {

        public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int numero1, numero2, resultado;
        System.out.println("Introduce el primer número: ");
        numero1 = teclado.nextInt();
        System.out.println("Introduce el segundo número: ");
        numero2= teclado.nextInt();
        resultado = sumar(numero1,numero2);
        System.out.println("Suma: " + resultado);
                
    }
    public static int sumar(int a, int b){
        int c;
        c = a + b;
        return c;
    }
    
    
        
}

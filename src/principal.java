import java.util.Scanner;

public class principal {
    public static int cociente( int numerador, int denominador )
    {
        return numerador / denominador; // posible división entre cero
    } // fin del método cociente

    public static void main( String args[] )
    {
        Scanner explorador = new Scanner( System.in ); // objeto Scanner para entrada
        System.out.print( "Introduzca un numerador entero: " );
        int numerador = explorador.nextInt();
        System.out.print( "Introduzca un denominador entero: " );
        int denominador = explorador.nextInt();
        int resultado = cociente( numerador, denominador );
        System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado );
    } // fin de main
}

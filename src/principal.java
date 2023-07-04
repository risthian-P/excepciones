import java.util.Scanner;
//Clase de exceppcioes para manejo de errorres
public class principal {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);//no existen 10 posiciones en el arreglo
            System.out.println(myNumbers[2]);//es la ultima posicion del arreglo asi que si se imprimirá, siempe que no aparesca primero el error
        } catch ( Exception e){
            //caso contrario, si no se cumple
            //Exception es obligatorio, e solo es una variable
            //exception captura el mensaje erroneo y lo almacena en la variable
            System.out.println("Something sent wrong");
            System.out.println(e);
        }
        finally {
            System.out.println("De todas formas voy a mostrar este mensaje");
        }
    }
}

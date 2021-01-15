package operaciones;

/**
 *
 * @author sebas
 */
import java.util.Scanner;
public class Operaciones {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        String nombre1 = "";
        String nombre2 = "";
        Scanner Entrada = new Scanner(System.in);
        
        System.out.println("Porfavor Ingrese el primer nombre");
        nombre1 = Entrada.nextLine();
        
        System.out.println("Porfavor Ingrese el segundo nombre");
        nombre2 = Entrada.nextLine();
        
        if (nombre1.equals(nombre2)){ 
        System.out.println(nombre1 +" Es igual a: " + nombre2);
        } else{ 
        System.out.println(nombre1 + " no es igual a: " + nombre2);
        }


        


    }
}

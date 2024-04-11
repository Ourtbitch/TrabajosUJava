package javasemana1;
import java.util.Scanner;

public class JavaSemana1{
    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        String name;
        
        System.out.println("Ingresar nombre");
        name =lector.next();
        
        System.out.println("\nHola"+name+"!");
    }
}

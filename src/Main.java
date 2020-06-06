
import unac.edu.co.poo2.Vehiculo;

import java.util.Scanner;
public class Main  {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresar kilometros a por recorrer el primer vehiculo");

        int a = scanner.nextInt();
        System.out.println("Ingresar kilometros a por recorrer el segundo vehiculo");

        int b = scanner.nextInt();
        System.out.println("Ingresar kilometros a por recorrer el tercer vehiculo");

        int c = scanner.nextInt();

        Vehiculo thread = new Vehiculo(a,1);
        Vehiculo thread2 = new Vehiculo(b,2);
        Vehiculo thread3 = new Vehiculo(c,3);
        thread.run();
        thread2.run();
        thread3.run();
    }
}
 
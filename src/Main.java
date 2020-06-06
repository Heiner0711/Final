
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

        Vehiculo hilo = new Vehiculo(a,1);
        Vehiculo hilo2 = new Vehiculo(b,2);
        Vehiculo hilo3 = new Vehiculo(c,3);
        hilo.run();
        hilo2.run();
        hilo3.run();
    }
}
 
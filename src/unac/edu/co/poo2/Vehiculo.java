package unac.edu.co.poo2;

public class Vehiculo {
    private int h;
    private int CarNum;
    public Vehiculo(int h, int CarNum) {
        super();
        this.h = h;
        this.CarNum = CarNum;
    }
    public void run()
    {
        for(int i =1;i<=h;i++)
        {
            System.out.println("El carro "+ CarNum +"  "+ i +" km");
        }
        System.out.println("El carro " + CarNum + " termino el recorrido");
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a tu programa para saber si tu divison es exacta o no");
        System.out.println("Ingresa el dividendo");
        int dividendo = sc.nextInt();
        System.out.println("Ingresa el divisor");
        int divisor = sc.nextInt();
        double cociente = dividendo/divisor;
        int modulo = dividendo%divisor;
        if (modulo==0){
            System.out.println("La division es exacta\nSu cociente es "+cociente);
            System.out.println("Y su resiudo es "+modulo);
        }
        else{
            System.out.println("La division NO es exacta\nSu cociente es "+cociente);
            System.out.println("Y su resiudo es "+modulo);
        }

    }
}
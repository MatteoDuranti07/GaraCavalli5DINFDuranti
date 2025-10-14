import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int lentezza;

        System.out.println("Inserisci lentezza di Fulmine:");
        Cavalli fulmine  = new Cavalli("Fulmine",scanner.nextInt());
        System.out.println("Inserisci lentezza di Fulmine:");
        Cavalli lampo = new Cavalli("Lampo",scanner.nextInt());
        System.out.println("Inserisci lentezza di Rose:");
        Cavalli rose = new Cavalli("Rose",scanner.nextInt());
        System.out.println("Inserisci lentezza di Margherita:");
        Cavalli margherita = new Cavalli("Margherita",scanner.nextInt());
        System.out.println("Inserisci lentezza di Rambo:");
        Cavalli rambo = new Cavalli("Rambo",scanner.nextInt());

//        rose.setPriority(Thread.MAX_PRIORITY);
//        margherita.setPriority(Thread.MIN_PRIORITY);

        fulmine.start();
        lampo.start();
        rose.start();
        margherita.start();
        rambo.start();

    }
}
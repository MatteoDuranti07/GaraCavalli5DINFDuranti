import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String nome;
        int lentezza;

        ArrayList<Cavalli> listaCavalli = new ArrayList<Cavalli>();
        for(int i=0; i <= 4; i++){
            System.out.println("Inserisci nome cavallo: ");
            nome = scanner.nextLine();
            System.out.println("Inserisci la lentezza: ");
            lentezza = scanner.nextInt();
            scanner.nextLine();
            Cavalli c = new Cavalli(nome,lentezza);
            listaCavalli.add(c);
        }

        for(Cavalli c:listaCavalli){
           c.start();
        }

        for(Cavalli c:listaCavalli){
            try{
                c.join();

            }
        }


    }
}
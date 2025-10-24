import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static String first;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean x = true;
        ArrayList<Cavallo> horses = new ArrayList<>();
        int condition;

        while (x) {
            System.out.println("__________________________________________________________________________");
            System.out.println("1.Inserisci un cavallo\n2.Inserisci sleepTime\n3.Inizia la gara\n4.Azzoppa un cavallo\n5.Esci");
            System.out.println("Inserisci un opzione:");
            condition = scanner.nextInt();
            scanner.nextLine();

            switch (condition) {
                case 1:
                    System.out.println("Inserisci il nome del cavallo:");
                    String horseName = scanner.nextLine();
                    horses.add(new Cavallo(horseName));
                    break;

                case 2:
                    int i = 1;
                    System.out.println("Lista cavalli:");
                    for (Cavallo c : horses) {
                        System.out.println(i++ + " " + c.getHorseName());
                    }
                    System.out.println("Inserisci nome cavallo:");
                    String name = scanner.nextLine();
                    System.out.println("Inserisci sleepTime:");
                    int sleepTime = scanner.nextInt();
                    scanner.nextLine();

                    boolean found = false;
                    for (Cavallo c : horses) {
                        if (c.getHorseName().equals(name)) {
                            c.setSleepTime(sleepTime);
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Cavallo non trovato.");
                    }
                    break;

                case 3:
                    for (Cavallo c : horses) {
                        c.start();
                    }
                    ////
                    for (Cavallo c : horses) {
                        try {
                            c.join();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("Il vincitore è: " + first);
                    break;

                case 4:
                    if (!horses.isEmpty()) {
                        int rand = (int) (Math.random() * horses.size());
                        horses.get(rand).setInterrupt();
                        System.out.println(horses.get(rand).getHorseName() + " è stato azzoppato!");
                    }
                    break;


                case 5:
                    x = false;
                    break;

                default:
                    System.out.println("Funzione non valida!");
                    break;
            }
        }

        scanner.close();
    }

    public static synchronized void setFirst(String t) {
        first = t;
    }

    public static synchronized String getFirst() {
        return first;
    }
}

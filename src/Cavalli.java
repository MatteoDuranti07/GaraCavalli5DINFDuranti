/*Questa classe è il nostro primo thread e consisterà la simulazione di un cavallo
in corsa, parallelamente con altri dellla stessa specie
@author Duranti
@vesion 1.0
*/

public class Cavalli extends Thread{

    private final String name;
    private int lentezza;

    public Cavalli(String name, int lentezza){
        super();
        this.name = name;
        this.lentezza = lentezza;
    }

    @Override
    public void run() {
        System.out.println("Cavallo:" + name + "comincia il suo galoppo");
        for(int i = 1; i <= 10; i++){

            try {
                sleep(lentezza);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(name + " cavalca - passo:" +i);
        }
    }

    public int getLentezza() {
        return lentezza;
    }

    public void setLentezza(int lentezza){
        this.lentezza = lentezza;
    }
}

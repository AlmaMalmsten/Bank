import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Bank {

    ArrayList<Kund> kunder = new ArrayList<Kund>();
    ArrayList<Konto> konton = new ArrayList<Konto>();


    public void creatKund(String name, int personNummer, int kontoNummer){
        kunder.add(new Kund(name, personNummer, kontoNummer));
    }
    public void creatKonto(Kund owner){
        konton.add(new Konto(owner));
    }

    public void allKund(){
        int numberOf = kunder.size();
        kunder.forEach(kund -> {
            System.out.println(kund.getNamn());
            System.out.println(kund.getKontoNummer());
            System.out.println(kund.getPersonNummer());
            System.out.println("Number of costumers is: " + numberOf);
        });
    }

    public void allBalans(){
        int allTheMoney = 0;
        for (Konto konto : konton){
            allTheMoney += konto.getSaldo();
        }
    }

}

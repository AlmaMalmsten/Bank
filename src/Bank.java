import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Bank {

    ArrayList<Kund> kunder = new ArrayList<Kund>();//arraylist av kundklassen
    ArrayList<Konto> konton = new ArrayList<Konto>(); //både vanliga och spar


    public void creatKund(String name, int personNummer, int kontoNummer){ //fyller arraylist
        kunder.add(new Kund(name, personNummer));
    }
    public void creatKonto(Kund owner){ //vanliga
        konton.add(new Konto(owner));
    }
    public void creatSparKonto(Kund owner, float intrest){//sparkonto också i kontoarrayn
        konton.add(new Sparkonto(owner, intrest));
    }

    public void allKund(){//beräknar antal kunder + slriver ut dem
        int numberOf = kunder.size();
        kunder.forEach(kund -> {
            System.out.println(kund.getNamn());
            System.out.println(kund.getPersonNummer());
            System.out.println("Number of costumers is: " + numberOf);
        });
    }

    public void allBalans(){ //same but balans
        int allTheMoney = 0;
        for (Konto konto : konton){
            allTheMoney += konto.getSaldo();
        }
    }

}
